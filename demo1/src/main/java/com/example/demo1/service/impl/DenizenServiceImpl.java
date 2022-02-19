package com.example.demo1.service.impl;

import com.example.demo1.mapper.DenizenMapper;
import com.example.demo1.mapper.HouseMapper;
import com.example.demo1.model.Denizen;
import com.example.demo1.model.DenizenExample;
import com.example.demo1.model.House;
import com.example.demo1.model.pageinfo.DePage;
import com.example.demo1.service.DenizenService;
import com.fasterxml.uuid.EthernetAddress;
import com.fasterxml.uuid.Generators;
import com.fasterxml.uuid.impl.TimeBasedGenerator;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.UUID;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhangsan
 * @since 2022-01-16
 */
@Service
public class DenizenServiceImpl implements DenizenService {
 @Resource
 private DenizenMapper denizenMapper;

 @Resource
 private HouseMapper houseMapper;



@Override
public PageInfo<Denizen> selectDenizenByExample(DePage dePage, int pageSize) {
 DenizenExample example = new DenizenExample();
 DenizenExample.Criteria criteria = example.createCriteria();

 //切记切记：在取集合之前，使用分页工具设置当前页和每页的记录数
 PageHelper.startPage(dePage.getPage(),pageSize);

 String name = dePage.getName();
 if (name != null & name != "") {
  criteria.andDenizenNameEqualTo(name);
 }
 String status = dePage.getStatus();
 if (status != null & status != "") {
  criteria.andDenizenMoneystatusEqualTo(status);
 }

 List<Denizen> denizenList = denizenMapper.selectByExample(example);
 System.out.println("sql:"+denizenList.size());
 PageInfo<Denizen> pageInfo=new PageInfo<>(denizenList);
 System.out.println("PageInfo:"+pageInfo);
 return pageInfo;
 }

 @Override
 public String insertDenizen(Denizen denizen) {
  TimeBasedGenerator generator = Generators.timeBasedGenerator(EthernetAddress.fromInterface());
  UUID uuid = generator.generate();
// 通过计算当前时间戳、随机数和机器MAC地址得到，由于使用了MAC地址，因此这个版本的随机数能够保证全球唯一
  System.out.println(uuid.toString().replaceAll("-", ""));
//  uuid.version();
  String uuid1 = String.valueOf(uuid);
  uuid1.replace("-","");
  String uuid2 = uuid1.substring(0, 7) + uuid1.substring(9, 13) + uuid1.substring(15, 18) + uuid1.substring(20, 23) + uuid1.substring(25);
  denizen.setDenizenId(uuid2);

  int status = denizenMapper.insert(denizen);
  System.out.println("添加状态"+status);
//对住房信息进行修改
  System.out.println(denizen);
  House house = new House();
  house.setHouseId(denizen.getDenizenHhouseid());
  house.setHouseUName(denizen.getDenizenName());
  house.setHouseUTel(denizen.getDenizenTel());

  int status1 = houseMapper.updateByPrimaryKeySelective(house);
  System.out.println("修改状态："+status1);
  if (status==1){
   return "添加成功";
  }else{
   return "添加失败";
  }



 }

 @Override
 public String deleteDenizen(String id) {
  int status = denizenMapper.deleteByPrimaryKey(id);
  if (status==1){
   return "删除成功";
  }else{
   return "删除失败";
  }
 }

 @Override
 public String updateDenizen(Denizen denizen) {
  int status = denizenMapper.updateByPrimaryKeySelective(denizen);
  if (status==1){
   return "修改成功";
  }else{
   return "修改失败";
  }
 }

}

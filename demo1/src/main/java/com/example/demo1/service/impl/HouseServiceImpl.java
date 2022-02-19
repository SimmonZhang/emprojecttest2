package com.example.demo1.service.impl;

import com.example.demo1.mapper.HouseMapper;
import com.example.demo1.model.House;
import com.example.demo1.model.HouseExample;
import com.example.demo1.model.pageinfo.HoPage;
import com.example.demo1.service.HouseService;
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
 * @since 2022-01-17
 */
@Service
public class HouseServiceImpl implements HouseService {
 @Resource
 private HouseMapper houseMapper;

@Override
public PageInfo<House> selectHouseByExample(HoPage hoPage,int pageSize) {
 HouseExample example = new HouseExample();
 HouseExample.Criteria criteria = example.createCriteria();

 PageHelper.startPage(hoPage.getPage(),pageSize);

 String hId = hoPage.getHouseHId();
 if (hId != null & hId != "") {
  criteria.andHouseHIdEqualTo(hId);
 }
 String rId = hoPage.getHouseRId();
 if (rId != null & rId != "") {
  criteria.andHouseRIdEqualTo(rId);
 }
 String hA = hoPage.getHouseArea();
 if (hA != null & hA != "") {
  criteria.andHouseAreaEqualTo(hA);
 }

 List<House> houseList = houseMapper.selectByExample(example);
 PageInfo<House> pageInfo=new PageInfo<>(houseList);
 return pageInfo;
 }

 @Override
 public String insertHouse(House house) {
  TimeBasedGenerator generator = Generators.timeBasedGenerator(EthernetAddress.fromInterface());
  UUID uuid = generator.generate();
// 通过计算当前时间戳、随机数和机器MAC地址得到，由于使用了MAC地址，因此这个版本的随机数能够保证全球唯一
  System.out.println(uuid.toString().replaceAll("-", ""));
//  uuid.version();
  String uuid1 = String.valueOf(uuid);
  uuid1.replace("-","");
  String uuid2 = uuid1.substring(0, 7) + uuid1.substring(9, 13) + uuid1.substring(15, 18) + uuid1.substring(20, 23) + uuid1.substring(25);
  house.setHouseId(uuid2);
 int status = houseMapper.insert(house);
 if (status==1){
 return "添加成功";
 }else{
 return "添加失败";
 }
 }

 @Override
 public String deleteHouse(String id) {
 int status = houseMapper.deleteByPrimaryKey(id);
 if (status==1){
 return "删除成功";
 }else{
 return "删除失败";
 }
 }

 @Override
 public String updateHouse(House house) {
 int status = houseMapper.updateByPrimaryKeySelective(house);
 if (status==1){
 return "修改成功";
 }else{
 return "修改失败";
 }
 }

}

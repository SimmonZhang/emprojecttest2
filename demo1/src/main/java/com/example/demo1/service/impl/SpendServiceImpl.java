package com.example.demo1.service.impl;


import com.example.demo1.mapper.DenizenMapper;
import com.example.demo1.mapper.SpendMapper;
import com.example.demo1.model.Denizen;
import com.example.demo1.model.Spend;
import com.example.demo1.model.SpendExample;
import com.example.demo1.model.pageinfo.SpendPage;
import com.example.demo1.service.SpendService;
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
public class SpendServiceImpl implements SpendService {
 @Resource
 private SpendMapper spendMapper;

 @Resource
 private DenizenMapper denizenMapper;

@Override
public PageInfo<Spend> selectSpendByExample(SpendPage spendPage, int pageSize) {
 SpendExample example = new SpendExample();
 SpendExample.Criteria criteria = example.createCriteria();

 PageHelper.startPage(spendPage.getPage(),pageSize);

 String name = spendPage.getName();
 if (name != null & name != "") {
  criteria.andSpendUserNameEqualTo(name);
 }
 String hId = spendPage.getHId();
 if (hId != null & hId != "") {
  criteria.andSpendHouseidEqualTo(hId);
 }
 String rId = spendPage.getRId();
 if (rId != null & rId != "") {
  criteria.andSpendRoomidEqualTo(rId);
 }
 String year = spendPage.getYear();
 if (year != null & year != "") {
  criteria.andSpendYearEqualTo(year);
 }

 List<Spend> spendList = spendMapper.selectByExample(example);

 PageInfo<Spend> pageInfo = new PageInfo<>(spendList);
 return pageInfo;
 }

 @Override
 public String insertSpend(Spend spend) {
  TimeBasedGenerator generator = Generators.timeBasedGenerator(EthernetAddress.fromInterface());
  UUID uuid = generator.generate();
// 通过计算当前时间戳、随机数和机器MAC地址得到，由于使用了MAC地址，因此这个版本的随机数能够保证全球唯一
  System.out.println(uuid.toString().replaceAll("-", ""));
//  uuid.version();
  String uuid1 = String.valueOf(uuid);
  uuid1.replace("-","");
  String uuid2 = uuid1.substring(0, 7) + uuid1.substring(9, 13) + uuid1.substring(15, 18) + uuid1.substring(20, 23) + uuid1.substring(25);
  spend.setSpendId(uuid2);

  Denizen denizen = new Denizen();
  denizen.setDenizenId(spend.getSpendUserId());
  denizen.setDenizenMoneystatus("2");

 int status = spendMapper.insert(spend);
 if (status==1){
  denizenMapper.updateByPrimaryKeySelective(denizen);
 return "添加成功";
 }else{
 return "添加失败";
 }
 }

 @Override
 public String deleteSpend(String id) {
 int status = spendMapper.deleteByPrimaryKey(id);
 if (status==1){
 return "删除成功";
 }else{
 return "删除失败";
 }
 }

 @Override
 public String updateSpend(Spend spend) {
 int status = spendMapper.updateByPrimaryKeySelective(spend);
 if (status==1){
 return "修改成功";
 }else{
 return "修改失败";
 }
 }

}

package com.example.demo1.service.impl;

import com.example.demo1.model.House;
import com.example.demo1.model.Parking;
import com.example.demo1.model.ParkingExample;
import com.example.demo1.mapper.ParkingMapper;
import com.example.demo1.model.pageinfo.ParkingPage;
import com.example.demo1.service.ParkingService;
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
public class ParkingServiceImpl implements ParkingService {
 @Resource
 private ParkingMapper parkingMapper;

@Override
public PageInfo<Parking> selectParkingByExample(ParkingPage parkingPage, int pageSize) {
 ParkingExample example = new ParkingExample();
 ParkingExample.Criteria criteria = example.createCriteria();

 PageHelper.startPage(parkingPage.getPage(),pageSize);

  String uId = parkingPage.getParkingUId();
 if (uId != null & uId != "") {
  criteria.andParkingUIdEqualTo(uId);
 }
 String uName = parkingPage.getParkingUName();
 if (uName != null & uName != "") {
  criteria.andParkingUNameEqualTo(uName);
 }
 String aId = parkingPage.getParkingAId();
 if (aId != null & aId != "") {
  criteria.andParkingAIdEqualTo(aId);
 }
 String cId = parkingPage.getParkingCId();
 if (cId != null & cId != "") {
  criteria.andParkingCIdEqualTo(cId);
 }

 List<Parking> parkingList = parkingMapper.selectByExample(example);

 PageInfo<Parking> pageInfo=new PageInfo<>(parkingList);

 return pageInfo;
 }

 @Override
 public String insertParking(Parking parking) {

  TimeBasedGenerator generator = Generators.timeBasedGenerator(EthernetAddress.fromInterface());
  UUID uuid = generator.generate();
// 通过计算当前时间戳、随机数和机器MAC地址得到，由于使用了MAC地址，因此这个版本的随机数能够保证全球唯一
  System.out.println(uuid.toString().replaceAll("-", ""));
//  uuid.version();
  String uuid1 = String.valueOf(uuid);
  uuid1.replace("-","");
  String uuid2 = uuid1.substring(0, 7) + uuid1.substring(9, 13) + uuid1.substring(15, 18) + uuid1.substring(20, 23) + uuid1.substring(25);
  parking.setParkingId(uuid2);

 int status = parkingMapper.insert(parking);
 if (status==1){
 return "添加成功";
 }else{
 return "添加失败";
 }
 }

 @Override
 public String deleteParking(String id) {
 int status = parkingMapper.deleteByPrimaryKey(id);
 if (status==1){
 return "删除成功";
 }else{
 return "删除失败";
 }
 }

 @Override
 public String updateParking(Parking parking) {
 int status = parkingMapper.updateByPrimaryKeySelective(parking);
 if (status==1){
 return "修改成功";
 }else{
 return "修改失败";
 }
 }

}

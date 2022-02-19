package com.example.demo1.service.impl;

import com.example.demo1.model.Staff;
import com.example.demo1.model.StaffExample;
import com.example.demo1.mapper.StaffMapper;
import com.example.demo1.service.StaffService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhangsan
 * @since 2022-01-17
 */
@Service
public class StaffServiceImpl implements StaffService {
 @Resource
 private StaffMapper staffMapper;

@Override
public List<Staff> selectStaffByExample(Staff staff) {
 StaffExample example = new StaffExample();
 StaffExample.Criteria criteria = example.createCriteria();

 int limit = 5;
 int offset = 0;
 example.setOffset(offset);
 example.setLimit(limit);

// String name = ck.getName();
 //if (name != null & name != "") {
 // criteria.andNameEqualTo(name);
 //}
 return staffMapper.selectByExample(example);
 }

 @Override
 public String insertStaff(Staff staff) {
 int status = staffMapper.insert(staff);
 if (status==1){
 return "添加成功";
 }else{
 return "添加失败";
 }
 }

 @Override
 public String deleteStaff(String id) {
 int status = staffMapper.deleteByPrimaryKey(id);
 if (status==1){
 return "删除成功";
 }else{
 return "删除失败";
 }
 }

 @Override
 public String updateStaff(Staff staff) {
 int status = staffMapper.updateByPrimaryKeySelective(staff);
 if (status==1){
 return "修改成功";
 }else{
 return "修改失败";
 }
 }

}

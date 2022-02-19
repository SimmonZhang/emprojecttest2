package com.example.demo1.mapper;

import com.example.demo1.model.Staff;
import com.example.demo1.model.StaffExample;
import java.util.List;

public interface StaffMapper {
    int deleteByPrimaryKey(String staffId);

    int insert(Staff record);

    int insertSelective(Staff record);

    List<Staff> selectByExample(StaffExample example);

    Staff selectByPrimaryKey(String staffId);

    int updateByPrimaryKeySelective(Staff record);

    int updateByPrimaryKey(Staff record);
}
package com.example.demo1.service;

import com.example.demo1.model.Staff;
import java.util.List;
/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zhangsan
 * @since 2022-01-17
 */
public interface StaffService {

 List<Staff> selectStaffByExample(Staff staff);

 String insertStaff(Staff staff);

 String deleteStaff(String id);

 String updateStaff(Staff staff);

}

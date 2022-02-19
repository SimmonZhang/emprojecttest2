package com.example.demo1.controller;


import com.example.demo1.model.Staff;
import com.example.demo1.service.StaffService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;

import org.springframework.stereotype.Controller;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zhangsan
 * @since 2022-01-17
 */
@Controller
@RequestMapping("/staff")
public class StaffController {
 @Autowired
 public StaffService staffService;

 @RequestMapping("/selectStaff")
 public String selectStaff(Staff staff,Model model){
     List<Staff> staffList = staffService.selectStaffByExample(staff);
     return null;
 }

 @RequestMapping("/insertStaff")
 @ResponseBody
 public String insertStaff(Staff staff){
 String status = staffService.insertStaff(staff);
 return status;
 }

 @RequestMapping("/deleteStaff")
 @ResponseBody
 public String deleteStaff(Staff staff){
 String status = staffService.deleteStaff(staff.getStaffId());
 return status;
 }

 @RequestMapping("/updateStaff")
 @ResponseBody
 public String updateStaff(Staff staff){
 String status = staffService.updateStaff(staff);
 return status;
 }
}

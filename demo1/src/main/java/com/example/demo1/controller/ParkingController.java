package com.example.demo1.controller;


import com.example.demo1.model.Denizen;
import com.example.demo1.model.Parking;
import com.example.demo1.model.pageinfo.DePage;
import com.example.demo1.model.pageinfo.ParkingPage;
import com.example.demo1.service.DenizenService;
import com.example.demo1.service.ParkingService;

import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zhangsan
 * @since 2022-01-17
 */
@Controller
@RequestMapping("/parking")
public class ParkingController {
 @Autowired
 public ParkingService parkingService;

 @Autowired
 public DenizenService denizenService;

 public static final int PAGE_SIZE = 5;

 @RequestMapping("/selectParking")
 public String selectParking(ParkingPage parkingPage, Model model){
  PageInfo<Parking> parkingList = parkingService.selectParkingByExample(parkingPage,PAGE_SIZE);
  model.addAttribute("parkingPage",parkingPage);
  model.addAttribute("parkingList",parkingList);
     return "html/parking";
 }

 @RequestMapping("/selectParkingU")
 public String selectParkingU(ParkingPage parkingPage, Model model){
  PageInfo<Parking> parkingList = parkingService.selectParkingByExample(parkingPage,PAGE_SIZE);
  model.addAttribute("parkingPage",parkingPage);
  model.addAttribute("parkingList",parkingList);
  return "html/parking_update";
 }

 //ajax查询车位信息
 @RequestMapping("/selectParkingAjax")
 @ResponseBody
 public List<Parking> selectParkingAjax(ParkingPage parkingPage){
  PageInfo<Parking> parkingList = parkingService.selectParkingByExample(parkingPage,parkingPage.getPage());
  System.out.println("------------------------------");
  System.out.println(parkingPage);
  System.out.println(parkingList.getList());
  return parkingList.getList();
 }
 //出售页面
 //返回视图parking_update.html



 //出售页面
 //返回视图parking_update.html

 @RequestMapping("/showDenizenPage")
 public String denizenShowTosA(DePage dePage, Model model){
  PageInfo<Denizen> denizenList = denizenService.selectDenizenByExample(dePage,PAGE_SIZE);
  model.addAttribute("dePage",dePage);
  model.addAttribute("denizenList",denizenList);
  return "html/parking_update";
 }

 @RequestMapping("/insertParking")
 @ResponseBody
 public String insertParking(Parking parking){
 String status = parkingService.insertParking(parking);
 return status;
 }

 @RequestMapping("/deleteParking")
 @ResponseBody
 public String deleteParking(Parking parking){
 String status = parkingService.deleteParking(parking.getParkingId());
 return status;
 }

 @RequestMapping("/updateParking")
 @ResponseBody
 public String updateParking(Parking parking){
 String status = parkingService.updateParking(parking);
 return status;
 }
}

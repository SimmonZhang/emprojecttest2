package com.example.demo1.controller;


import com.example.demo1.model.House;
import com.example.demo1.model.pageinfo.HoPage;
import com.example.demo1.service.HouseService;
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
@RequestMapping("/house")
public class HouseController {
 @Autowired
 public HouseService houseService;

 public static final int PAGE_SIZE = 5;

 @RequestMapping("/selectHouse")
 public String selectHouse(HoPage hoPage ,Model model){
  PageInfo<House> houseList = houseService.selectHouseByExample(hoPage,PAGE_SIZE);
  System.out.println(houseList);
  model.addAttribute("hoPage",hoPage);
  model.addAttribute("houseList",houseList);
  return "html/house";
 }

 //返回视图denizen_add.html

 @RequestMapping("/showPage")
 public String houseShowTodA(){

  return "html/denizen_add";
 }

 //使用ajax交互
 @RequestMapping("/selectHouse1")
 @ResponseBody
 public PageInfo<House> selectHouse1(HoPage hoPage){
  System.out.println(hoPage);
  PageInfo<House> houseList = houseService.selectHouseByExample(hoPage,PAGE_SIZE);
  System.out.println(houseList);
     return houseList;
 }

 //使用ajax交互
 @RequestMapping("/selectHouse2")
 @ResponseBody
 public List<House> selectHouse2(HoPage hoPage){
  PageInfo<House> houseList = houseService.selectHouseByExample(hoPage,PAGE_SIZE);
  System.out.println(houseList.getList());
  return houseList.getList();
 }

 @RequestMapping("/insertHouse")
 @ResponseBody
 public String insertHouse(House house){
 String status = houseService.insertHouse(house);
 return status;
 }

 @RequestMapping("/deleteHouse")
 @ResponseBody
 public String deleteHouse(House house){
 String status = houseService.deleteHouse(house.getHouseId());
 return status;
 }

 @RequestMapping("/updateHouse")
 @ResponseBody
 public String updateHouse(House house){
 String status = houseService.updateHouse(house);
 return status;
 }
}

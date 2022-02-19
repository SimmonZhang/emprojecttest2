package com.example.demo1.controller;


import com.example.demo1.model.Denizen;
import com.example.demo1.model.House;
import com.example.demo1.model.pageinfo.DePage;
import com.example.demo1.model.pageinfo.HoPage;
import com.example.demo1.service.DenizenService;
import com.example.demo1.service.HouseService;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zhangsan
 * @since 2022-01-16
 */
@Api(tags = "住户操作模块API")
@Controller
@RequestMapping("/denizen")
public class DenizenController {
 public static final int PAGE_SIZE = 5;

 @Autowired
 public DenizenService denizenService;

 @Autowired
 public HouseService houseService;

 @ApiOperation("查询住户接口")
 @RequestMapping("/selectDenizen")
 public String selectDenizen(DePage dePage, Model model){
  System.out.println("depage"+dePage);
     PageInfo<Denizen> denizenList = denizenService.selectDenizenByExample(dePage,PAGE_SIZE);
  System.out.println(denizenList);
  model.addAttribute("dePage",dePage);
     model.addAttribute("denizenList",denizenList);
     return "html/denizen";

 }

 //住户信息页面查询住房信息1
 //返回视图denizen_add.html

 @RequestMapping("/showHousePage")
 public String houseShowTodA(){

  return "html/denizen_add";
 }

 //住户信息页面查询住房信息2
 //使用ajax交互
 @RequestMapping("/showHousePageAjax")
 @ResponseBody
 public PageInfo<House> selectHouse1(HoPage hoPage){
  System.out.println(hoPage);
  PageInfo<House> houseList = houseService.selectHouseByExample(hoPage,PAGE_SIZE);
  System.out.println(houseList);
  return houseList;
 }

 //查询住户信息ajax
 @RequestMapping("/showDenizenPageAjax")
 @ResponseBody
 public List<Denizen> selectDenizenAjax(DePage dePage){
  System.out.println(dePage);
  PageInfo<Denizen> denizenList = denizenService.selectDenizenByExample(dePage,PAGE_SIZE);
List<Denizen> denizenList1 = denizenList.getList();
  return denizenList1;
 }

 //分页查询HttpSession
 @RequestMapping("/selectDenizenPage")
 @ResponseBody
 public void selectDenizenPage(DePage dePage, HttpSession session){
  System.out.println("depage:"+dePage);
  PageInfo<Denizen> denizenList = denizenService.selectDenizenByExample(dePage,PAGE_SIZE);
  System.out.println(denizenList);
  session.setAttribute("denizenList",denizenList);
  return ;
 }

// @ApiOperation("查询住户接口")
// @RequestMapping("/selectDenizen1")
// @ResponseBody
// public List<Denizen> selectDenizen1(DePage dePage){
//  List<Denizen> denizenList = denizenService.selectDenizenByExample(dePage);
//
//  return denizenList;
// }

 @ApiOperation("添加住户接口")
 @RequestMapping("/insertDenizen")
 @ResponseBody
 public String insertDenizen(Denizen denizen){
  System.out.println("传入数据："+denizen);
 String status = denizenService.insertDenizen(denizen);
 return status;
 }

 @ApiOperation("删除住户接口")
 @ResponseBody
 @RequestMapping("/deleteDenizen")
 public String deleteDenizen(Denizen denizen){
 String status = denizenService.deleteDenizen(denizen.getDenizenId()) ;
  return status;
 }

 @ApiOperation("修改住户接口")
 @RequestMapping("/updateDenizen")
 @ResponseBody
 public String updateDenizen(Denizen denizen){
 String status = denizenService.updateDenizen(denizen);
 return status;
 }
}

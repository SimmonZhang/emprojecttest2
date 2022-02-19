package com.example.demo1.controller;


import com.example.demo1.model.Denizen;
import com.example.demo1.model.Spend;
import com.example.demo1.model.pageinfo.DePage;
import com.example.demo1.model.pageinfo.SpendPage;
import com.example.demo1.service.DenizenService;
import com.example.demo1.service.SpendService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zhangsan
 * @since 2022-01-17
 */
@Controller
@RequestMapping("/spend")
public class SpendController {
 @Autowired
 public SpendService spendService;

 @Autowired
 public DenizenService denizenService;

 public static final int PAGE_SIZE = 5;

 //缴费信息管理页面
 @RequestMapping("/selectSpend")
 public String selectSpend(SpendPage spendPage, Model model){
  PageInfo<Spend> spendList = spendService.selectSpendByExample(spendPage,PAGE_SIZE);
  model.addAttribute("spendPage",spendPage);
  model.addAttribute("spendList",spendList);
     return "html/spend";
 }

 //添加页面
 //返回视图spend_add.html

 @RequestMapping("/showDenizenPage")
 public String denizenShowTosA(DePage dePage, Model model){
  PageInfo<Denizen> denizenList = denizenService.selectDenizenByExample(dePage,PAGE_SIZE);
  model.addAttribute("dePage",dePage);
  model.addAttribute("denizenList",denizenList);
  return "html/spend_add";
 }

 @RequestMapping("/showDenizenPageAjax")
 @ResponseBody
 public PageInfo<Denizen> denizenShowPageAjax(DePage dePage){
  PageInfo<Denizen> denizenList = denizenService.selectDenizenByExample(dePage,PAGE_SIZE);

  return denizenList;
 }


 @RequestMapping("/insertSpend")
 @ResponseBody
 public String insertSpend(Spend spend){
  System.out.println(spend);
 String status = spendService.insertSpend(spend);
 return status;
 }

 @RequestMapping("/deleteSpend")
 @ResponseBody
 public String deleteSpend(Spend spend){
 String status = spendService.deleteSpend(spend.getSpendId());
 return status;
 }

 @RequestMapping("/updateSpend")
 @ResponseBody
 public String updateSpend(Spend spend){
 String status = spendService.updateSpend(spend);
 return status;
 }
}

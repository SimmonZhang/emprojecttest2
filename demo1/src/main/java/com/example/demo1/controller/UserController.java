package com.example.demo1.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.demo1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/showuserTest")
    public String RoleList(){

        return "html/role";
    }

    @RequestMapping("/userTest")
    @ResponseBody
    public JSONObject RoleList1(){
        JSONObject jsonObject =  userService.listRole();
        return jsonObject;
    }


    @RequestMapping("/updateRole")
    @ResponseBody
    public int updateRole(@RequestBody JSONObject requestJson){
        System.out.println(requestJson.toString());
        int status = userService.uRemoveOldPermission(requestJson);
        return status;
    }

    @RequestMapping("/deleteRole")
    @ResponseBody
    public int deleteRole(@RequestBody JSONObject requestJson){
        System.out.println(requestJson.toString());
        int status = userService.deleteRole(requestJson);
        return status;
    }

    @RequestMapping("/insertRole")
    @ResponseBody
    public int insertRole(@RequestBody JSONObject requestJson){
        System.out.println(requestJson.toString());
        int status = userService.addRole(requestJson);
        return status;
    }

    @RequestMapping("/getUserTest")
    public void getUserTest(){
        userService.listUser();
    }

    @RequestMapping("/addUserTest")
    public void addUserTest(@RequestBody JSONObject requestJson){
        userService.addUser(requestJson);
    }
}

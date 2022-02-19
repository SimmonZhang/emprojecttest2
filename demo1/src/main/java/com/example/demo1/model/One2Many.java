package com.example.demo1.model;

import com.alibaba.fastjson.JSONObject;

import java.util.List;
import java.util.Set;

public class One2Many extends JSONObject{
    private Integer roleId;
    private String roleName;

    private Set<String> roleList;
    private Set<String> menuList;
    private Set<String> permissionList;
    private Set<Integer> permissionIds;
    private List<JSONObject> picList;
    private List<JSONObject> menus;
    private List<JSONObject> users;
    private List<JSONObject> permissions;
    private List<JSONObject> roles;
}

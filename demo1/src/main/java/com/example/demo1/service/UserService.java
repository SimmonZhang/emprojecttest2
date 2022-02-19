package com.example.demo1.service;

import com.alibaba.fastjson.JSONObject;
import com.example.demo1.model.Denizen;
import com.example.demo1.model.User;
import com.example.demo1.model.pageinfo.DePage;
import com.example.demo1.model.pageinfo.UserPage;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface UserService {
    JSONObject listRole();

    int uRemoveOldPermission(JSONObject jsonObject);

    int deleteRole(JSONObject jsonObject);

    int addRole(JSONObject jsonObject);

//    传入分页信息
//    JSONObject listUser(JSONObject jsonObject);
    JSONObject listUser();

    List<JSONObject> getAllRoles();

    int queryExistUsername(JSONObject jsonObject);

    /**
     * 新增用户
     */
    int addUser(JSONObject jsonObject);

    /**
     * 修改用户
     */
    int updateUser(JSONObject jsonObject);

    int batchAddUserRole(JSONObject jsonObject);

    int removeUserAllRole(int userId);


    String selectUserByName(User user);

}

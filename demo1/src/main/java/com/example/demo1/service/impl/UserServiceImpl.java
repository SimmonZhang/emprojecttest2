package com.example.demo1.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.example.demo1.mapper.UserMapper;
import com.example.demo1.model.*;
import com.example.demo1.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;


    @Override
    public JSONObject listRole() {
        System.out.println("获取role信息："+ userMapper.listRole());
        List<JSONObject> list = userMapper.listRole();
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("list",list);
        return jsonObject;
    }

    @Override
    public int uRemoveOldPermission(JSONObject jsonObject) {
        String roleId = jsonObject.getString("roleId");
        List<Integer> newPerms = (List<Integer>)jsonObject.get("permissions");
        JSONObject roleInfo = userMapper.getRoleAllInfo(jsonObject);
        Set<Integer> oldPerms = (Set<Integer>) roleInfo.get("permissionIds");
        //修改角色名称
        dealRoleName(jsonObject, roleInfo);
        //添加新权限
        saveNewPermission(roleId, newPerms, oldPerms);
        //移除旧的不再拥有的权限
        removeOldPermission(roleId, newPerms, oldPerms);

        return 200;
    }

    /**
     * 修改角色名称
     */
    private void dealRoleName(JSONObject paramJson, JSONObject roleInfo) {
        String roleName = paramJson.getString("roleName");
        System.out.println(roleName);
        if (!roleName.equals(roleInfo.getString("roleName"))) {
            System.out.println(userMapper.updateRoleName(paramJson));
        }
    }

    /**
     * 删除角色 旧的 不再拥有的权限//状态修改为2
     */
    private void removeOldPermission(String roleId, Collection<Integer> newPerms, Collection<Integer> oldPerms) {
        List<Integer> waitRemove = new ArrayList<>();
        for (Integer oldPerm : oldPerms) {
            if (!newPerms.contains(oldPerm)) {
                waitRemove.add(oldPerm);
            }
        }
        if (waitRemove.size() > 0) {
            userMapper.uRemoveOldPermission(roleId, waitRemove);
        }
    }
    /**
     * 为角色添加新权限//状态修改为1
     */
    private void saveNewPermission(String roleId, Collection<Integer> newPerms, Collection<Integer> oldPerms) {
        List<Integer> waitInsert = new ArrayList<>();
        for (Integer newPerm : newPerms) {
            if (!oldPerms.contains(newPerm)) {
                waitInsert.add(newPerm);
            }
        }
        if (waitInsert.size() > 0) {
            userMapper.uInsertNewPermission(roleId, waitInsert);
        }
    }
    @Override
    public int deleteRole(JSONObject jsonObject) {
        userMapper.removeRole(jsonObject);
        userMapper.removeRoleAllPermission(jsonObject);
        return 200;
    }

    @Override
    public int addRole(JSONObject jsonObject) {
        userMapper.insertRole(jsonObject);
        userMapper.insertRolePermission(jsonObject.getString("roleId"), (List<Integer>) jsonObject.get("permissions"));
        return 200;
    }

    @Override
//    public JSONObject listUser(JSONObject jsonObject) {
        public JSONObject listUser() {

        List<JSONObject> list = userMapper.listUser();
        System.out.println(list);

        return null;
    }

//    获取用户所有角色
    @Override
    public List<JSONObject> getAllRoles() {
        return userMapper.getAllRoles();
    }


//    验证用户唯一名称
    @Override
    public int queryExistUsername(JSONObject jsonObject) {
        return 0;
    }

    @Override
    public int addUser(JSONObject jsonObject) {
        int i = userMapper.addUser(jsonObject);
        System.out.println("addUser:"+i);
        return 0;
    }

    //    修改用户
    @Override
    public int updateUser(JSONObject jsonObject) {
        return 0;
    }

    @Override
    public int batchAddUserRole(JSONObject jsonObject) {
        return 0;
    }

    @Override
    public int removeUserAllRole(int userId) {
        return 0;
    }


    //    根据账户名称查询用户信息
    @Override
    public String selectUserByName(User user) {
        User user1= userMapper.selectByName(user.getUserName());
        if (user1==null){
            return "error";
        }
        if (!user.getUserPwd().equals(user1.getUserPwd())){
            return "error";
        }

        return "success";
    }

}

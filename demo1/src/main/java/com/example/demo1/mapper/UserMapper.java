package com.example.demo1.mapper;

import com.alibaba.fastjson.JSONObject;
import com.example.demo1.model.User;
import com.example.demo1.model.UserExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    /**
     * 角色列表
     */
    List<JSONObject> listRole();

    /**
     * 修改角色名称
     */
    int updateRoleName(JSONObject jsonObject);

    /**
     * 查询某角色的全部数据
     * 在删除和修改角色时调用
     */
    JSONObject getRoleAllInfo(JSONObject jsonObject);

    /**
     * 修改角色
     */
    int uRemoveOldPermission(@Param("roleId")String roleId, @Param("permissions")List<Integer> permissions);

    int uInsertNewPermission(@Param("roleId")String roleId, @Param("permissions")List<Integer> permissions);

    /**
     * 删除角色
     */
    int removeRole(JSONObject jsonObject);

    /**
     * 删除本角色全部权限
     */
    int removeRoleAllPermission(JSONObject jsonObject);

    /**
     * 新增角色
     */
    int insertRole(JSONObject jsonObject);

    /**
     * 批量插入角色的权限
     *
     * @param roleId      角色ID
     * @param permissions 权限
     */
    int insertRolePermission(@Param("roleId") String roleId, @Param("permissions") List<Integer> permissions);


    /**
     * 查询用户列表
     */
//    List<JSONObject> listUser(JSONObject jsonObject);
    List<JSONObject> listUser();

    /**
     * 查询所有的角色
     * 在添加/修改用户的时候要使用此方法
     */
    List<JSONObject> getAllRoles();

    /**
     * 校验用户名是否已存在
     */
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


    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByName(String uname);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}
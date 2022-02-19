package com.example.demo1.dto.session;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;


public class SessionUserInfo {
    private int userId;
    private String username;
    private String nickname;
    private List<Integer> roleIds;
    private Set<String> menuList;
    private Set<String> permissionList;

    public SessionUserInfo() {
    }

    public SessionUserInfo(int userId, String username, String nickname, List<Integer> roleIds, Set<String> menuList, Set<String> permissionList) {
        this.userId = userId;
        this.username = username;
        this.nickname = nickname;
        this.roleIds = roleIds;
        this.menuList = menuList;
        this.permissionList = permissionList;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public List<Integer> getRoleIds() {
        return roleIds;
    }

    public void setRoleIds(List<Integer> roleIds) {
        this.roleIds = roleIds;
    }

    public Set<String> getMenuList() {
        return menuList;
    }

    public void setMenuList(Set<String> menuList) {
        this.menuList = menuList;
    }

    public Set<String> getPermissionList() {
        return permissionList;
    }

    public void setPermissionList(Set<String> permissionList) {
        this.permissionList = permissionList;
    }

    @Override
    public String toString() {
        return "SessionUserInfo{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", nickname='" + nickname + '\'' +
                ", roleIds=" + roleIds +
                ", menuList=" + menuList +
                ", permissionList=" + permissionList +
                '}';
    }
}
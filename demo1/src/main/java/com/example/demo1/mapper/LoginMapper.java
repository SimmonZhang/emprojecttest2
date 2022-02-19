package com.example.demo1.mapper;

import com.example.demo1.dto.session.SessionUserInfo;

import java.util.List;

public interface LoginMapper {
    SessionUserInfo getUserInfo(String username);
}

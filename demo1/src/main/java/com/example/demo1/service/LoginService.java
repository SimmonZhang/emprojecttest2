package com.example.demo1.service;

import com.example.demo1.dto.session.SessionUserInfo;

import java.util.List;

public interface LoginService {
SessionUserInfo selectIserInfo(String username);
}

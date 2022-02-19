package com.example.demo1.service.impl;

import com.example.demo1.dto.session.SessionUserInfo;
import com.example.demo1.mapper.LoginMapper;
import com.example.demo1.service.LoginService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class LoginServiceImpl implements LoginService {
    @Resource
    private LoginMapper loginMapper;


    @Override
    public SessionUserInfo selectIserInfo(String username) {
//        return null;
        return loginMapper.getUserInfo(username);
    }
}

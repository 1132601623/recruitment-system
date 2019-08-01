package com.xcy.recruitmentsystem.service.impl;

import com.xcy.recruitmentsystem.mapper.LoginMapper;
import com.xcy.recruitmentsystem.pojo.User;
import com.xcy.recruitmentsystem.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    LoginMapper loginMapper;
    @Override
    public int validateUserName(User user) {
        int count = loginMapper.validateUserName(user);
        return count;
    }
}

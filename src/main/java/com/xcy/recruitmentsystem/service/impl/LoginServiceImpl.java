package com.xcy.recruitmentsystem.service.impl;

import com.xcy.recruitmentsystem.mapper.LoginMapper;
import com.xcy.recruitmentsystem.pojo.User;
import com.xcy.recruitmentsystem.pojo.ValidateCode;
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

    @Override
    public void insertIntoValidateCode(ValidateCode validatecode) {
        loginMapper.insertIntoValidateCode(validatecode);
    }

    @Override
    public int validateCode(ValidateCode validateCode) {
        int count = loginMapper.validateCode(validateCode);
        return count;
    }

    @Override
    public int RegisterUser(User user) {
        int count = loginMapper.RegisterUser(user);
        return count;
    }

    @Override
    public User userLogin(User user) {
        User user01 = loginMapper.userLogin(user);
        return user01;
    }

    @Override
    public int validateUserAndEmail(User user) {
        int count = loginMapper.validateUserAndEmail(user);
        return count;
    }

    @Override
    public int validateEmailIsReg(User user) {
        int count = loginMapper.validateEmailIsReg(user);
        return count;
    }

    @Override
    public int updatePassword(User user) {
        int count = loginMapper.updatePassword(user);
        return count;
    }
}

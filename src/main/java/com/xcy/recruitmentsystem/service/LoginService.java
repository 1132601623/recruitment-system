package com.xcy.recruitmentsystem.service;

import com.xcy.recruitmentsystem.pojo.User;
import com.xcy.recruitmentsystem.pojo.ValidateCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


public interface LoginService {

    int validateUserName(User user);

    void insertIntoValidateCode(ValidateCode validatecode);

    int validateCode(ValidateCode validateCode);

    int RegisterUser(User user);

    User userLogin(User user);

    int validateUserAndEmail(User user);

    int validateEmailIsReg(User user);

    int updatePassword(User user);
}

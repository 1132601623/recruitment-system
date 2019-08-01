package com.xcy.recruitmentsystem.controller;

import com.xcy.recruitmentsystem.pojo.User;
import com.xcy.recruitmentsystem.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @Autowired
    LoginService loginService;

    @RequestMapping("/validateUserName")
    public int validateUserName(User user){
        int count = loginService.validateUserName(user);
        System.out.println(count);
        return count > 0 ? 1: 0;
    }
}

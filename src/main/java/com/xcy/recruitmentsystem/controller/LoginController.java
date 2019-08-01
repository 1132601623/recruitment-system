package com.xcy.recruitmentsystem.controller;

import com.xcy.recruitmentsystem.pojo.User;
import com.xcy.recruitmentsystem.pojo.ValidateCode;
import com.xcy.recruitmentsystem.service.LoginService;
import com.xcy.recruitmentsystem.utils.MailUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LoginController {
    @Autowired
    LoginService loginService;
    //验证用户名
    @RequestMapping("/validateUserName")
    public int validateUserName(User user){
        int count = loginService.validateUserName(user);
        return count > 0 ? 1: 0;
    }
    //校验邮箱是否注册过
    @RequestMapping("/validateEmailIsReg")
    public int validateEmailIsReg(User user){
        int count = loginService.validateEmailIsReg(user);
        return count;
    }
    //发送邮件
    @RequestMapping("/validateEmail")
    public String validateEmail(String email){
        System.out.println(email);
        //发送邮件
        String validateCode = MailUtils.getValidateCode(6);
        MailUtils.sendMail(email,"您好:<br/>您本次的验证码是"+validateCode+",请于两小时内输入，否则失效。","优才中国行");
        //保存验证到数据库，用于校验
        ValidateCode validatecode = new ValidateCode();
        validatecode.setValidatecode(validateCode);
        loginService.insertIntoValidateCode(validatecode);
        return "success";
    }
    //校验验证码
    @RequestMapping("/validateCode")
    public  int validateCode(String validatecode){
        ValidateCode validateCode = new ValidateCode();
        validateCode.setValidatecode(validatecode);
        int count = loginService.validateCode(validateCode);
        return count > 0 ? 1: 0;
    }
    //注册
    @RequestMapping("/Regist")
    public String Regist(User user){
        System.out.println(user);
        int count = loginService.RegisterUser(user);
        return count > 0 ? "success" : "fail";
    }
    //登录
    @RequestMapping("/userLogin")
    public User userLogin(User user){
        User user01 = loginService.userLogin(user);
        return user01;
    }

    //修改密码时验证用户名密码是否匹配
    @RequestMapping("/validateUserAndEmail")
    public int validateUserAndEmail(String username,String email){
        User user = new User();
        user.setUsername(username);
        user.setEmail(email);
        System.out.println(user);
        int count = loginService.validateUserAndEmail(user);
        System.out.println(count);
        return count;
    }
    @RequestMapping("/updatePassword")
    public String updatePassword(User user){
        int index = loginService.updatePassword(user);
        return index > 0 ? "success" : "fail";
    }
}

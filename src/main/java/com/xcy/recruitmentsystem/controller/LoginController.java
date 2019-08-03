package com.xcy.recruitmentsystem.controller;

import com.xcy.recruitmentsystem.pojo.User;
import com.xcy.recruitmentsystem.pojo.ValidateCode;
import com.xcy.recruitmentsystem.service.LoginService;
import com.xcy.recruitmentsystem.utils.MailUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
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
        int count = loginService.RegisterUser(user);
        return count > 0 ? "success" : "fail";
    }

    //登录
    @RequestMapping("/userLogin")
    public User userLogin(User user, HttpSession session){
        User user01 = loginService.userLogin(user);
        if (user01 != null){
            String autoLogin = user.getAutoLogin();
            if (autoLogin != null){
                session.setAttribute("username",user01.getUsername());
                session.setAttribute("password",user01.getPassword());
                session.setAttribute("role_id",user01.getRole_id());
                session.setAttribute("email",user01.getEmail());
                session.setMaxInactiveInterval(60*60*24*7);
            } else {
                session.setAttribute("username",user01.getUsername());
                session.setAttribute("password",user01.getPassword());
                session.setAttribute("role_id",user01.getRole_id());
                session.setAttribute("email",user01.getEmail());
                session.setMaxInactiveInterval(60*30);
            }
        }
        user01.setPassword("saodhfsajasjdfljkzhfasdfhsddjf");
        return user01;
    }
    @RequestMapping("/autoLogin")
    public User autoLogin(HttpSession session,HttpServletRequest request){
        String username = (String) session.getAttribute("username");
        String password = (String) session.getAttribute("password");
        String role_id = (String) session.getAttribute("role_id");
        String email = (String) session.getAttribute("email");
        User user = new User();
        if (username != null){
            user.setUsername(username);
            user.setPassword(password);
            user.setRole_id(role_id);
            user.setEmail(email);
            user.setPassword("ygugfhqbuyegdhbfgyyweblkdjfydsfjsdd");
        } else {
            Cookie[] cookies = request.getCookies();
            for (int i = 0; i < cookies.length ; i++){
                if (cookies[i].getValue() == "username"){
                    user.setUsername(cookies[i].getValue());
                } else if (cookies[i].getValue() == "role_id"){
                    user.setRole_id(cookies[i].getValue());
                }
            }
        }
        return user;
    }
    @RequestMapping("/loginOut")
    public String loginOut(HttpSession session){
        session.removeAttribute("username");
        session.removeAttribute("password");
        session.removeAttribute("role_id");
        session.removeAttribute("email");
        return "success";
    }
    //修改密码时验证用户名密码是否匹配
    @RequestMapping("/validateUserAndEmail")
    public int validateUserAndEmail(String username,String email){
        User user = new User();
        user.setUsername(username);
        user.setEmail(email);
        int count = loginService.validateUserAndEmail(user);
        return count;
    }
    //修改密码
    @RequestMapping("/updatePassword")
    public String updatePassword(User user){
        int index = loginService.updatePassword(user);
        return index > 0 ? "success" : "fail";
    }
}

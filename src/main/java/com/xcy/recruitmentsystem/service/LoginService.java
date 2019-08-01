package com.xcy.recruitmentsystem.service;

import com.xcy.recruitmentsystem.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


public interface LoginService {

    int validateUserName(User user);
}

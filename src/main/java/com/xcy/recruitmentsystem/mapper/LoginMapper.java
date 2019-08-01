package com.xcy.recruitmentsystem.mapper;

import com.xcy.recruitmentsystem.pojo.User;
import com.xcy.recruitmentsystem.pojo.ValidateCode;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LoginMapper {

    int validateUserName(User user);

    void insertIntoValidateCode(ValidateCode validatecode);

    int validateCode(ValidateCode validateCode);

    int RegisterUser(User user);
}

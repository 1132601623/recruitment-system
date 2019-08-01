package com.xcy.recruitmentsystem.mapper;

import com.xcy.recruitmentsystem.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LoginMapper {

    int validateUserName(User user);
}

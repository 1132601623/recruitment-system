package com.xcy.recruitmentsystem.mapper;

import com.xcy.recruitmentsystem.pojo.Work;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BusinessMapper {
    void JobPosted(Work work);
}

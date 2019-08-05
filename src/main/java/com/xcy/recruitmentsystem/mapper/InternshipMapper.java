package com.xcy.recruitmentsystem.mapper;

import com.xcy.recruitmentsystem.pojo.Work;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface InternshipMapper {


    List<Work> blurrySelectInternship();

    List<Work> getBusiness();
}

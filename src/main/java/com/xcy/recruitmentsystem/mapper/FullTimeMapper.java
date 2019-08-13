package com.xcy.recruitmentsystem.mapper;

import com.xcy.recruitmentsystem.pojo.Work;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FullTimeMapper {


    List<Work> blurrySelectFullTime(Work work);

    List<Work> getMessage();

    List<Work> getMessages(int id);
}

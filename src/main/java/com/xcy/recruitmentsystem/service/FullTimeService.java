package com.xcy.recruitmentsystem.service;

import com.xcy.recruitmentsystem.pojo.Work;

import java.util.List;

public interface FullTimeService {
    List<Work> blurrySelectFullTime(Work work);

    List<Work> getMessage();

    List<Work> getMessages(int id);
}

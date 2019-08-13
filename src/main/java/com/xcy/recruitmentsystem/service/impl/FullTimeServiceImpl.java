package com.xcy.recruitmentsystem.service.impl;

import com.xcy.recruitmentsystem.mapper.FullTimeMapper;
import com.xcy.recruitmentsystem.pojo.Work;
import com.xcy.recruitmentsystem.service.FullTimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FullTimeServiceImpl implements FullTimeService {

    @Autowired
    FullTimeMapper fullTimeMapper;

    @Override
    public List<Work> blurrySelectFullTime(Work work) {

        List<Work> workList= fullTimeMapper.blurrySelectFullTime(work);
        return workList;
    }

    @Override
    public List<Work> getMessage() {
        List<Work> message = fullTimeMapper.getMessage();
        return message;
    }

    @Override
    public List<Work> getMessages(int id) {
        List<Work> messages = fullTimeMapper.getMessages(id);
        return messages;
    }
}

package com.xcy.recruitmentsystem.service.impl;

import com.xcy.recruitmentsystem.mapper.BusinessMapper;
import com.xcy.recruitmentsystem.pojo.Work;
import com.xcy.recruitmentsystem.service.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BusinessServiceImpl implements BusinessService {

    @Autowired
    BusinessMapper businessMapper;

    @Override
    public void JobPosted(Work work) {
        businessMapper.JobPosted(work);
    }
}

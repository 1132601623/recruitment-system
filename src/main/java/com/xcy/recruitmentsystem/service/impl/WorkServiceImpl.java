package com.xcy.recruitmentsystem.service.impl;

import com.xcy.recruitmentsystem.mapper.WorkMapper;
import com.xcy.recruitmentsystem.pojo.Work;
import com.xcy.recruitmentsystem.service.WorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkServiceImpl implements WorkService {
    @Autowired
    WorkMapper workMapper;

    @Override
    public List<Work> findWorkByState() {
        return workMapper.findWorkByState();
    }

    @Override
    public List<Work> selectWork() {
        return workMapper.selectWork();
    }
}

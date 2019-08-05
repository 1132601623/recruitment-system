package com.xcy.recruitmentsystem.service.impl;

import com.xcy.recruitmentsystem.mapper.InternshipMapper;
import com.xcy.recruitmentsystem.pojo.Work;
import com.xcy.recruitmentsystem.service.InternshipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InternshipServiceImpl implements InternshipService {
    @Autowired
    InternshipMapper internshipMapper;

    @Override
    public List<Work> blurrySelectInternship() {
        return internshipMapper.blurrySelectInternship();
    }

    @Override
    public List<Work> getBusiness() {
        return internshipMapper.getBusiness();
    }
}

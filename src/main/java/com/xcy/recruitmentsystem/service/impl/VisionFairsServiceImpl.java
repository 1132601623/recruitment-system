package com.xcy.recruitmentsystem.service.impl;

import com.xcy.recruitmentsystem.mapper.VisionFairsMapper;
import com.xcy.recruitmentsystem.pojo.Work;
import com.xcy.recruitmentsystem.service.VisionFairsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VisionFairsServiceImpl implements VisionFairsService {

    @Autowired
    VisionFairsMapper visionFairsMapper;

    @Override
    public List<Work> blurrySelectVisionFairs(Work work) {
        return visionFairsMapper.blurrySelectVisionFairs(work);
    }

    @Override
    public List<Work> getMessage() {
        List<Work> message = visionFairsMapper.getMessage();
        return message;
    }

}

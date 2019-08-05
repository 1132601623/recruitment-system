package com.xcy.recruitmentsystem.controller;

import com.xcy.recruitmentsystem.pojo.Work;
import com.xcy.recruitmentsystem.service.VisionFairsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/visionFairs")
public class VisionFairsController {

    @Autowired
    VisionFairsService visionFairsService;

    @RequestMapping("/blurrySelectVisionFairs")
    public List<Work> blurrySelectVisionFairs() {
        List<Work> works = visionFairsService.blurrySelectVisionFairs();
        return works;
    }
}

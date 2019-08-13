package com.xcy.recruitmentsystem.controller;

import com.xcy.recruitmentsystem.pojo.Work;
import com.xcy.recruitmentsystem.service.FullTimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/fullTime")
@RestController
public class FullTimeController {

    @Autowired
    FullTimeService fullTimeService;

    @RequestMapping("/blurrySelectFullTime")
    public List<Work> blurrySelectFullTime(Work work) {
        List<Work> works= fullTimeService.blurrySelectFullTime(work);
        return works;
    }

    @RequestMapping("/getMessage")
    public List<Work> getMessage() {
        List<Work> works= fullTimeService.getMessage();
        return works;
    }


    @RequestMapping("/getMessages")
    public List<Work> getMessages(int id) {
        List<Work> works= fullTimeService.getMessages(id);
        return works;
    }
}

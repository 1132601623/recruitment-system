package com.xcy.recruitmentsystem.controller;

import com.xcy.recruitmentsystem.pojo.Work;
import com.xcy.recruitmentsystem.service.WorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class WorkController {
    @Autowired
    WorkService workService;

    // 查询已投递岗位
    @RequestMapping("/findWorkByState")
    public List<Work> workList() {
        List<Work> workList = workService.findWorkByState();
        return workList;
    }
}

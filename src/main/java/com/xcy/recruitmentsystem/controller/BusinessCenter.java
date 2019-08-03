package com.xcy.recruitmentsystem.controller;

import com.xcy.recruitmentsystem.pojo.Work;
import com.xcy.recruitmentsystem.service.BusinessService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BusinessCenter {

    @Autowired
    BusinessService businessService;


    @ApiOperation("公司上传招聘信息")
    @RequestMapping("/jobPosting")
    public String jobPosting(Work work){

        businessService.JobPosted(work);
        return "success";
    }

}

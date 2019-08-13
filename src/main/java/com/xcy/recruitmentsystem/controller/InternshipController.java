package com.xcy.recruitmentsystem.controller;

import com.xcy.recruitmentsystem.pojo.Work;
import com.xcy.recruitmentsystem.service.InternshipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/internship")
public class InternshipController {

    @Autowired
    InternshipService internshipService;

    @RequestMapping("/blurrySelectInternship")
    public List<Work> blurrySelectInternship(Work work) {
        List<Work> works = internshipService.blurrySelectInternship(work);
        return works;
    }

    @RequestMapping("/getBusiness")
    public List<Work> getBusiness() {
        List<Work> works = internshipService.getBusiness();
        return works;
    }

}

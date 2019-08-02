package com.xcy.recruitmentsystem.controller;

import com.xcy.recruitmentsystem.pojo.Resume;
import com.xcy.recruitmentsystem.pojo.Work;
import com.xcy.recruitmentsystem.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ResumeController {
  @Autowired ResumeService resumeService;

  // 添加简历信息
  @RequestMapping("/addResume")
  public String addResume(Resume resume) {
    resumeService.addResume(resume);
    return "success";
  }

  // 模糊查询工作信息
  @RequestMapping("/findJobByMessage")
  @ResponseBody
  public List<Resume> person(Work work) {
    System.out.println("123");
    List<Resume> resumeList = resumeService.findJobByMessage(work);
    System.out.println(resumeList);
    return resumeList;
  }
}

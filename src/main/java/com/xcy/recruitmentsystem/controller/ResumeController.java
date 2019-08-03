package com.xcy.recruitmentsystem.controller;

import com.xcy.recruitmentsystem.pojo.Resume;
import com.xcy.recruitmentsystem.pojo.Work;
import com.xcy.recruitmentsystem.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
public class ResumeController {
    @Autowired
    ResumeService resumeService;

    // 添加简历信息
    @RequestMapping("/addResume")
    public String addResume(Resume resume) {
        System.out.println(resume);
        resumeService.addResume(resume);
        return "success";
    }

    // 查询出所有的工作
    @RequestMapping("/findJob")
    public List<Work> person() {
        List<Work> workList = resumeService.findJob();
        return workList;
    }

    // 模糊查询工作信息
    @RequestMapping("/findJobByMessage")
    public List<Work> findWork(Work work) {
        List<Work> works = resumeService.findJobByMessage(work);
        return works;
    }

    // 查询出个人简历
    @RequestMapping("/findResumeByEmail")
    public Resume findResume(HttpSession session) {

        String email = (String) session.getAttribute("email");
        Resume resume = resumeService.findResumeByEmail(email);
        return resume;
    }

    // 投递简历
    @RequestMapping("/addJob")
    public String addJob(Resume resume) {
        boolean count = resumeService.addJob(resume);
        if (count){
            return "success";
        } else {
            return "fail";
        }
    }

    // 查询所有简历
    @RequestMapping("/findAllResume")
    public List<Resume> findResume() {
        List<Resume> resumeList = resumeService.findAllResume();
        return resumeList;
    }
}

package com.xcy.recruitmentsystem.controller;

import com.xcy.recruitmentsystem.pojo.Resume;
import com.xcy.recruitmentsystem.pojo.Work;
import com.xcy.recruitmentsystem.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;
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
    @RequestMapping("/sendResume")
    public String sendResume(Resume resume) {
        System.out.println(resume);
        boolean count = resumeService.sendResume(resume);
        if (count) {
            return "success";
        } else {
            return "fail";
        }
    }

    // 查询所有简历
    @RequestMapping("/findAllResume")
    public List<Resume> findResume(Resume resume) {
        //resume.setTime(new Date());
        List<Resume> resumeList = resumeService.findAllResume(resume);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        for (Resume re : resumeList) {
            re.setTime(simpleDateFormat.format(new Date()));
        }
        return resumeList;
    }

    @RequestMapping("/findResumeByMessage")
    public List<Resume> findResumeByMessage(Resume resume) {
        //resume.setTime(new Date());

        List<Resume> resumeList = resumeService.findResumeByMessage(resume);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        for (Resume re : resumeList) {
            re.setTime(simpleDateFormat.format(new Date()));
        }
        return resumeList;
    }

    // 查看简历
    @RequestMapping("/findResumeById")
    public Resume findResumeById(int id) {
        Resume resume = resumeService.findResumeById(id);
        return resume;
    }

    //查询已投递的简历
    @RequestMapping("/findResumeByState")
    public List<Resume> findResumeByState() {
        String pState = "已投递";

        List<Resume> resumeList = resumeService.findResumeByState(pState);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        for (Resume re : resumeList) {
            re.setTime(simpleDateFormat.format(new Date()));
        }
        System.out.println(resumeList);
        return resumeList;
    }
}

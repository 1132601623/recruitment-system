package com.xcy.recruitmentsystem.service.impl;

import com.xcy.recruitmentsystem.mapper.ResumeMapper;
import com.xcy.recruitmentsystem.pojo.Resume;
import com.xcy.recruitmentsystem.pojo.Work;
import com.xcy.recruitmentsystem.service.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResumeServiceImpl implements ResumeService {
    @Autowired
    ResumeMapper resumeMapper;

    @Override
    public void addResume(Resume resume) {
        resumeMapper.addResume(resume);
    }

    @Override
    public List<Work> findJobByMessage(Work work) {
        return resumeMapper.findJobByMessage(work);
    }

    @Override
    public List<Work> findJob() {
        return resumeMapper.findJob();
    }

    @Override
    public Resume findResumeByEmail(String email) {
        return resumeMapper.findResumeByEmail(email);
    }

    @Override
    public boolean sendResume(Resume resume) {
        resume.setPState("已投递");
        int result = resumeMapper.sendResume(resume);
        return result > 0 ? true : false;
    }

    @Override
    public List<Resume> findAllResume(Resume resume) {
        return resumeMapper.findAllResume(resume);
    }
}

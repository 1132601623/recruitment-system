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
  @Autowired ResumeMapper resumeMapper;

  @Override
  public void addResume(Resume resume) {
    resumeMapper.addResume(resume);
  }

  @Override
  public List<Resume> findJobByMessage(Work work) {
    return resumeMapper.findJobByMessage(work);
  }
}

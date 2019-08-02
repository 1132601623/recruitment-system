package com.xcy.recruitmentsystem.service;

import com.xcy.recruitmentsystem.pojo.Resume;
import com.xcy.recruitmentsystem.pojo.Work;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ResumeService {
  void addResume(Resume resume);

  List<Resume> findJobByMessage(Work work);
}

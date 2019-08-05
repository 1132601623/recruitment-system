package com.xcy.recruitmentsystem.service;

import com.xcy.recruitmentsystem.pojo.Resume;
import com.xcy.recruitmentsystem.pojo.Work;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ResumeService {
    void addResume(Resume resume);

    List<Work> findJobByMessage(Work work);

    List<Work> findJob();

    Resume findResumeByEmail(String email);

    List<Resume> findAllResume(Resume resume);

    boolean sendResume(Resume resume);

    Resume findResumeById(int id);
}

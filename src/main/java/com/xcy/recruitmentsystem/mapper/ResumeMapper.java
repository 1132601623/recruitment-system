package com.xcy.recruitmentsystem.mapper;

import com.xcy.recruitmentsystem.pojo.Resume;
import com.xcy.recruitmentsystem.pojo.Work;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ResumeMapper {
  void addResume(Resume resume);

  List<Work> findJobByMessage(Work work);

  List<Work> findJob();

  Resume findResumeByEmail(String email);

  int addJob(Resume resume);

    List<Resume> findAllResume();
}

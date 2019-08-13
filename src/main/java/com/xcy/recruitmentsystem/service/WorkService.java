package com.xcy.recruitmentsystem.service;

import com.xcy.recruitmentsystem.pojo.Work;

import java.util.List;

public interface WorkService {
    List<Work> findWorkByState();

    List<Work> selectWork();
}

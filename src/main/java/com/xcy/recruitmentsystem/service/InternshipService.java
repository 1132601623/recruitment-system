package com.xcy.recruitmentsystem.service;

import com.xcy.recruitmentsystem.pojo.Work;

import java.util.List;

public interface InternshipService {

    List<Work> blurrySelectInternship(Work work);

    List<Work> getBusiness();

}

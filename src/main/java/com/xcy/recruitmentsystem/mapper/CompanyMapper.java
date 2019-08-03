package com.xcy.recruitmentsystem.mapper;

import com.xcy.recruitmentsystem.controller.CompanyController;
import com.xcy.recruitmentsystem.pojo.Company;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CompanyMapper {
    void insertCompany(Company company);
}

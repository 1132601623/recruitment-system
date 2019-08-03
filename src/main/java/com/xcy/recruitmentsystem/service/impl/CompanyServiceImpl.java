package com.xcy.recruitmentsystem.service.impl;

import com.xcy.recruitmentsystem.controller.CompanyController;
import com.xcy.recruitmentsystem.mapper.CompanyMapper;
import com.xcy.recruitmentsystem.pojo.Company;
import com.xcy.recruitmentsystem.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    CompanyMapper companyMapper;

    @Override
    public void insertCompany(Company company) {
        companyMapper.insertCompany(company);

    }
}

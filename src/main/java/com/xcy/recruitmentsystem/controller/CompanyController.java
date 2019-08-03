package com.xcy.recruitmentsystem.controller;


import com.xcy.recruitmentsystem.pojo.Company;
import com.xcy.recruitmentsystem.service.CompanyService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;


@Controller
public class CompanyController {

    //@Value("${IMAGE_DIR}")
    String imageDir;

    //@Value("${IMAGE_URL}")
    String imageURL;

    @Autowired
    CompanyService companyService;


    @ApiOperation("添加公司简介")
    @RequestMapping("/insertCompany")
    public String company(Company company,
                         @RequestParam("file") MultipartFile image_OneUrl,
                         @RequestParam("file") MultipartFile image_TwoUrl,
                         @RequestParam("file") MultipartFile image_ThreeUrl) throws IOException {

        String oldFilename1 = image_OneUrl.getOriginalFilename();
        String suffixName1 = oldFilename1.substring(oldFilename1.lastIndexOf("."));
        String newFileName1 = UUID.randomUUID().toString().replace("-", "") + suffixName1;
        //为了将图片进行归类，我们可以以时间的形式进行文件夹的创建
        Date date1 = new Date();
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyy-MM-dd");
        String dirName1 = simpleDateFormat1.format(date1);
        //E\\imgs\
        String targetName1 = imageDir + dirName1;
        File file1 = new File(targetName1);
        if (!file1.exists()) {
            file1.mkdirs();
        }
        //使用 MulitpartFile 接口中方法，把上传的文件写到指定位置
        image_OneUrl.transferTo(new File(targetName1, newFileName1));
        String Clogo = imageURL + dirName1 + "/" + newFileName1;
        company.setCLogo(Clogo);

        String oldFilename2 = image_TwoUrl.getOriginalFilename();
        String suffixName2 = oldFilename2.substring(oldFilename2.lastIndexOf("."));
        String newFileName2 = UUID.randomUUID().toString().replace("-", "") + suffixName2;
        //为了将图片进行归类，我们可以以时间的形式进行文件夹的创建
        Date date2 = new Date();
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyy-MM-dd");
        String dirName2 = simpleDateFormat2.format(date2);
        //E\\imgs\
        String targetName2 = imageDir + dirName2;
        File file2 = new File(targetName2);
        if (!file2.exists()) {
            file2.mkdirs();
        }
        //使用 MulitpartFile 接口中方法，把上传的文件写到指定位置
        image_TwoUrl.transferTo(new File(targetName2, newFileName2));
        String Cprcture = imageURL + dirName2 + "/" + newFileName2;
        company.setCPicture(Cprcture);

        String oldFilename3 = image_ThreeUrl.getOriginalFilename();
        String suffixName3 = oldFilename3.substring(oldFilename3.lastIndexOf("."));
        String newFileName3 = UUID.randomUUID().toString().replace("-", "") + suffixName3;
        //为了将图片进行归类，我们可以以时间的形式进行文件夹的创建
        Date date3 = new Date();
        SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat("yyy-MM-dd");
        String dirName3 = simpleDateFormat3.format(date3);
        //E\\imgs\
        String targetName3 = imageDir + dirName3;
        File file3 = new File(targetName3);
        if (!file3.exists()) {
            file3.mkdirs();
        }
        //使用 MulitpartFile 接口中方法，把上传的文件写到指定位置
        image_TwoUrl.transferTo(new File(targetName3, newFileName3));
        String CWechat = imageURL + dirName3 + "/" + newFileName3;
        company.setCWechat(CWechat);

        /*String email = (String) session.getAttribute("email");*/

        /*company.setCEmail(email);*/
        companyService.insertCompany(company);
        return "success";
    }
}

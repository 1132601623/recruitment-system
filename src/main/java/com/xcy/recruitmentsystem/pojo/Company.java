package com.xcy.recruitmentsystem.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Company {
    private int id;

    private String cName;

    private String cLogo;

    private String cJob;

    private String cDesc;

    private String cPicture;

    private String cWeibo;

    private String cWechat;

    private String cAddress;

    private String cEmail;
}
package com.xcy.recruitmentsystem.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Work {
  private int id;

  private String wName;

  private String wBusiness;

  private String wSkill;

  private String wAddress;

  private String wRequest;

  private int wPeople;

  private String wEdu;

  private String wYear;

  private String wWorkNature;

  private String wDate;

  private String wDesc;
}

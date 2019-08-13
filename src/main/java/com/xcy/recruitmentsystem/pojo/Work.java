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

  private String wBeginTime;

  private String wEndTime;

  private int wAge;

  private int cId;

  private String cName;

  private String uEmail;

  /*public String getwName() {
    return wName;
  }

  public void setwName(String wName) {
    this.wName = wName;
  }

  public String getwBusiness() {
    return wBusiness;
  }

  public void setwBusiness(String wBusiness) {
    this.wBusiness = wBusiness;
  }

  public String getwSkill() {
    return wSkill;
  }

  public void setwSkill(String wSkill) {
    this.wSkill = wSkill;
  }

  public String getwAddress() {
    return wAddress;
  }

  public void setwAddress(String wAddress) {
    this.wAddress = wAddress;
  }*/
}

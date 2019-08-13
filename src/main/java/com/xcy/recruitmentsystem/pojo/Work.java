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

  private String time;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getwName() {
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
  }

  public String getwRequest() {
    return wRequest;
  }

  public void setwRequest(String wRequest) {
    this.wRequest = wRequest;
  }

  public int getwPeople() {
    return wPeople;
  }

  public void setwPeople(int wPeople) {
    this.wPeople = wPeople;
  }

  public String getwEdu() {
    return wEdu;
  }

  public void setwEdu(String wEdu) {
    this.wEdu = wEdu;
  }

  public String getwYear() {
    return wYear;
  }

  public void setwYear(String wYear) {
    this.wYear = wYear;
  }

  public String getwWorkNature() {
    return wWorkNature;
  }

  public void setwWorkNature(String wWorkNature) {
    this.wWorkNature = wWorkNature;
  }

  public String getwDate() {
    return wDate;
  }

  public void setwDate(String wDate) {
    this.wDate = wDate;
  }

  public String getwDesc() {
    return wDesc;
  }

  public void setwDesc(String wDesc) {
    this.wDesc = wDesc;
  }

  public String getwBeginTime() {
    return wBeginTime;
  }

  public void setwBeginTime(String wBeginTime) {
    this.wBeginTime = wBeginTime;
  }

  public String getwEndTime() {
    return wEndTime;
  }

  public void setwEndTime(String wEndTime) {
    this.wEndTime = wEndTime;
  }

  public int getwAge() {
    return wAge;
  }

  public void setwAge(int wAge) {
    this.wAge = wAge;
  }

  public int getcId() {
    return cId;
  }

  public void setcId(int cId) {
    this.cId = cId;
  }

  public String getcName() {
    return cName;
  }

  public void setcName(String cName) {
    this.cName = cName;
  }

  public String getuEmail() {
    return uEmail;
  }

  public void setuEmail(String uEmail) {
    this.uEmail = uEmail;
  }

  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }
}

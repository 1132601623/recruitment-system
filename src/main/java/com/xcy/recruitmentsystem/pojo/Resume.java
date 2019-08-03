package com.xcy.recruitmentsystem.pojo;

public class Resume {
    private Integer id;

    private String pName;

    private String pBirthday;

    private String pEdu;

    private String pGradute;

    private String pSkill;

    private String pPhone;

    private String pWork;

    private String pEmail;

    private String pAddress;

    private String pWanted;

    private String pLanguage;

    private String pOpen;

    private String pExpe;

    private String pEduErpe;

    private String pStudyExpe;

    private String uEmail;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName == null ? null : pName.trim();
    }

    public String getpBirthday() {
        return pBirthday;
    }

    public void setpBirthday(String pBirthday) {
        this.pBirthday = pBirthday == null ? null : pBirthday.trim();
    }

    public String getpEdu() {
        return pEdu;
    }

    public void setpEdu(String pEdu) {
        this.pEdu = pEdu == null ? null : pEdu.trim();
    }

    public String getpGradute() {
        return pGradute;
    }

    public void setpGradute(String pGradute) {
        this.pGradute = pGradute == null ? null : pGradute.trim();
    }

    public String getpSkill() {
        return pSkill;
    }

    public void setpSkill(String pSkill) {
        this.pSkill = pSkill == null ? null : pSkill.trim();
    }

    public String getpPhone() {
        return pPhone;
    }

    public void setpPhone(String pPhone) {
        this.pPhone = pPhone == null ? null : pPhone.trim();
    }

    public String getpWork() {
        return pWork;
    }

    public void setpWork(String pWork) {
        this.pWork = pWork == null ? null : pWork.trim();
    }

    public String getpEmail() {
        return pEmail;
    }

    public void setpEmail(String pEmail) {
        this.pEmail = pEmail == null ? null : pEmail.trim();
    }

    public String getpAddress() {
        return pAddress;
    }

    public void setpAddress(String pAddress) {
        this.pAddress = pAddress == null ? null : pAddress.trim();
    }

    public String getpWanted() {
        return pWanted;
    }

    public void setpWanted(String pWanted) {
        this.pWanted = pWanted == null ? null : pWanted.trim();
    }

    public String getpLanguage() {
        return pLanguage;
    }

    public void setpLanguage(String pLanguage) {
        this.pLanguage = pLanguage == null ? null : pLanguage.trim();
    }

    public String getpOpen() {
        return pOpen;
    }

    public void setpOpen(String pOpen) {
        this.pOpen = pOpen == null ? null : pOpen.trim();
    }

    public String getpExpe() {
        return pExpe;
    }

    public void setpExpe(String pExpe) {
        this.pExpe = pExpe == null ? null : pExpe.trim();
    }

    public String getpEduErpe() {
        return pEduErpe;
    }

    public void setpEduErpe(String pEduErpe) {
        this.pEduErpe = pEduErpe == null ? null : pEduErpe.trim();
    }

    public String getpStudyExpe() {
        return pStudyExpe;
    }

    public void setpStudyExpe(String pStudyExpe) {
        this.pStudyExpe = pStudyExpe == null ? null : pStudyExpe.trim();
    }

    public String getuEmail() {
        return uEmail;
    }

    public void setuEmail(String uEmail) {
        this.uEmail = uEmail == null ? null : uEmail.trim();
    }
}
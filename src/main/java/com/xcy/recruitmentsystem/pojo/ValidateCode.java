package com.xcy.recruitmentsystem.pojo;

public class ValidateCode {
    private int id;
    private String validatecode;

    public ValidateCode() {
    }

    public ValidateCode(int id, String validatecode) {
        this.id = id;
        this.validatecode = validatecode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getValidatecode() {
        return validatecode;
    }

    public void setValidatecode(String validatecode) {
        this.validatecode = validatecode;
    }

    @Override
    public String toString() {
        return "ValidateCode{" +
                "id=" + id +
                ", validatecode='" + validatecode + '\'' +
                '}';
    }
}

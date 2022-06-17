package com.example.demoinii.po;

public class Doctor {
    private int docId;
    private String docCode;//医生编码
    private String realName;
    private String password;
    private int sex;
    private int deptno;//所属科室




    public int getDocId() {
        return docId;
    }

    public void setDocId(int docId) {
        this.docId = docId;
    }

    public String getDocCode() {
        return docCode;
    }

    public void setDocCode(String docCode) {
        this.docCode = docCode;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getDeptno() {
        return deptno;
    }

    public void setDeptno(int deptno) {
        this.deptno = deptno;
    }

    @Override
    public String toString() {
        return "Doctor [docId=" + docId +
                ", docCode=" + docCode + ", " +
                "realName" + realName +
                ", password=" + password +
                ", sex=" + sex +
                ", deptno=" + deptno +
                "]";
    }
}
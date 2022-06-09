package com.example.demoinii.dto;

public class User {
    String userId;
    String password;

    public String getUserId(String userId) {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public void setUserType(int userType) {
        this.userType = userType;
    }

    public String getPassword() {
        return password;
    }

    public String getRealName() {
        return realName;
    }

    public String getSex() {
        return sex;
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public User() {
    }

    public String getCreateTime() {
        return createTime;
    }

    public int getUserType() {
        return userType;
    }

    public String getUserId() {
        return userId;
    }

    public User(String userId, String password, String realName, String sex, String identityCard, String createTime, int userType) {
        this.userId = userId;
        this.password = password;
        this.realName = realName;
        this.sex = sex;
        this.identityCard = identityCard;
        this.createTime = createTime;
        this.userType = userType;
    }

    String realName;
    String sex;
    String identityCard;
    private String createTime;
    int userType;

}

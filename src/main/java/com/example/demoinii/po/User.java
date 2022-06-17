package com.example.demoinii.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {
    String userId;
    String password;
    String realName;
    Integer sex;
    String identityCard;

    public String getUserId() {
        return userId;
    }

    public String getPassword() {
        return password;
    }

    public String getRealName() {
        return realName;
    }

    public Integer getSex() {
        return sex;
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public Date getBirthday() {
        return birthday;
    }

    public int getUserType() {
        return userType;
    }

    private Date birthday;
    int userType;

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void setUserType(int userType) {
        this.userType = userType;
    }
}


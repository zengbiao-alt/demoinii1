package com.example.demoinii.po;

/**
 * @author Sen_Zhang
 * @createTime 2022/6/9 9:26
 */
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
import java.util.List;

@ToString
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Users {
    // 属性名和数据库表的字段对应
    private String userId;
    private String realName;//真正的名字
    private  String password;//密码
    private String sex;// 性别
    private Date birthday;// 生日
    private String address;// 地址
    private String identityCard;//标识
    private String userType;
    private List<Orders> list;//一个用户可以对应的多个order

    public Users(String userId, String realName, String password, String sex, Date birthday, String address, String identityCard, String userType) {
        this.userId = userId;
        this.realName = realName;
        this.password = password;
        this.sex = sex;
        this.birthday = birthday;
        this.address = address;
        this.identityCard = identityCard;
        this.userType = userType;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public List<Orders> getList() {
        return list;
    }

    public void setList(List<Orders> list) {
        this.list = list;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}


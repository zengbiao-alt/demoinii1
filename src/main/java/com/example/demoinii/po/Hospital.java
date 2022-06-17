package com.example.demoinii.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@ToString
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Hospital {
    private int  hpId;
    private String name;
    private String picture;
    private String telephone;
    private String address;
    private String businessHours;
    private String deadlines;
    private String rule;

    public String getDeadlines() {
        return deadlines;
    }

    public void setDeadlines(String deadlines) {
        this.deadlines = deadlines;
    }

    private  int  state;

    public Hospital(int hpId, String name, String picture, String telephone, String address, String businessHours, String deadlines, String rule, int state) {
        this.hpId = hpId;
        this.name = name;
        this.picture = picture;
        this.telephone = telephone;
        this.address = address;
        this.businessHours = businessHours;
        this.deadlines = deadlines;
        this.rule = rule;
        this.state = state;
    }

    private List<Orders> orders;

}

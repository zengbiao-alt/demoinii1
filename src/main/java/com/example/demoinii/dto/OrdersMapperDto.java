package com.example.demoinii.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

/**
 * @Auther:某位不知名魔法少年
 * @ClassName:OrdersMapperDto
 * @Date:2022/6/21 14:40
 * @功能描述:
 * @Version:1.0
 */
public class OrdersMapperDto {
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private String Date;
    private int HpId;

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public int getHpId() {
        return HpId;
    }

    public void setHpId(int hpId) {
        HpId = hpId;
    }

    public OrdersMapperDto() {
    }

    public OrdersMapperDto(String date, int hpId) {
        Date = date;
        HpId = hpId;
    }
}

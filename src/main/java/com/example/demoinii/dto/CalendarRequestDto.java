package com.example.demoinii.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * @Auther:某位不知名魔法少年
 * @ClassName:CalendarRequestDto
 * @Date:2022/6/21 14:35
 * @功能描述:
 * @Version:1.0
 */
public class CalendarRequestDto {
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private int HpId;
    private int Year;
    private int Month;
    private int Day;

    public CalendarRequestDto(int year, int month, int day) {
        Year = year;
        Month = month;
        Day = day;
    }

    public CalendarRequestDto() {
    }

    public int getHpId() {
        return HpId;
    }

    public void setHpId(int hpId) {
        HpId = hpId;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        Year = year;
    }

    public int getMonth() {
        return Month;
    }

    public void setMonth(int month) {
        Month = month;
    }

    public int getDay() {
        return Day;
    }

    public void setDay(int day) {
        Day = day;
    }
}
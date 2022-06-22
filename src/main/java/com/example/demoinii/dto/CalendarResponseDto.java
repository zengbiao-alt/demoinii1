package com.example.demoinii.dto;

import com.example.demoinii.po.Hospital;
import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * @author 72373
 */
public class CalendarResponseDto {
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private String Ymd;
    private int Total;
    private int Existing;
    private int Remainder;
    private Hospital HpId;
    private String Year;



    public CalendarResponseDto(String year) {
        Year = year;
    }

    public String getYmd() {
        return Ymd;
    }

    public void setYmd(String ymd) {
        Ymd = ymd;
    }

    public int getTotal() {
        return Total;
    }

    public void setTotal(int total) {
        Total = total;
    }

    public int getExisting() {
        return Existing;
    }

    public void setExisting(int existing) {
        Existing = existing;
    }

    public int getRemainder() {
        return Remainder;
    }

    public void setRemainder(int remainder) {
        Remainder = remainder;
    }

    public Hospital getHpId() {
        return HpId;
    }

    public void setHpId(Hospital hpId) {
        HpId = hpId;
    }

    public String getYear() {
        return Year;
    }

    public void setYear(String year) {
      Year = year;
   }

    public CalendarResponseDto() {
    }

}
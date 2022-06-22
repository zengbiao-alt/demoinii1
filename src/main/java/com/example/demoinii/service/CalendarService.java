package com.example.demoinii.service;

import com.example.demoinii.dto.CalendarRequestDto;
import com.example.demoinii.dto.CalendarResponseDto;

import java.text.ParseException;
import java.util.List;

public  interface   CalendarService {
    public List<CalendarResponseDto> listAppointmentCalendar(CalendarRequestDto calendarRequestDto ) throws ParseException;
    public List<CalendarResponseDto> getCurrentCalendarList(Integer year,Integer month);

    List<CalendarResponseDto> getCalendarList30(Integer hpId) throws ParseException;
}
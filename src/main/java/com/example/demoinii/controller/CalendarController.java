package com.example.demoinii.controller;

import com.example.demoinii.common.Result;
import com.example.demoinii.dto.CalendarRequestDto;
import com.example.demoinii.dto.CalendarResponseDto;
import com.example.demoinii.service.CalendarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;

/**
 * @author 72373
 * @Auther:某位不知名魔法少年
 * @ClassName:CalendarController
 * @Date:2022/6/21 15:24
 * @功能描述:日历
 * @Version:1.0
 */
@RestController
@RequestMapping("/Calendar")
public class CalendarController {
    @Autowired
    private CalendarService calendarService;
    @PostMapping("/select")
    public Result listAppointmentCalendar(@RequestParam("Year") Integer year, @RequestParam("Month") Integer month) throws ParseException {
        List<CalendarResponseDto> status=calendarService. getCurrentCalendarList(year,month);
//        List<CalendarResponseDto> status1=calendarService. getCalendarList30(hpId);
//        List<CalendarResponseDto> status2=calendarService. listAppointmentCalendar(calendarRequestDto);
        return Result.success(status);

    }
}
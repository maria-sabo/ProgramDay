package com.msh.prday;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProgramDayController {

    private final String getDate(int year) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yy");
        Calendar calendar;
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            calendar = new GregorianCalendar(year, Calendar.SEPTEMBER, 12);
        } else calendar = new GregorianCalendar(year, Calendar.SEPTEMBER, 13);
        return String.format(dateFormat.format(calendar.getTime()));
    }

    @RequestMapping("/")
    public ProgramDay greeting(@RequestParam(value = "year") int year) {
        if (year <= 0) {
            return new ProgramDay(HttpStatus.BAD_REQUEST.value(),
                    "Incorrect input");
        } else return new ProgramDay(HttpStatus.OK.value(),
                getDate(year));
    }
}

package com.itheima.a04test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class Test5 {
    public static void main(String[] args) throws ParseException {
        /*
            判断任意的一年是闰年还是平年
         */

        //jdk7
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        String beginTime = "2000/01/01";
        String endTime = "2000/12/31";
        long yearDays = (Math.abs(sdf.parse(beginTime).getTime() - sdf.parse(endTime).getTime()) / 1000 / 60 / 60 / 24) + 1;
        System.out.println(yearDays);


        //jdk8
        LocalDate time1 = LocalDate.of(2006, 2, 1);
        LocalDate time2 = LocalDate.of(2006, 3, 1);
        System.out.println(ChronoUnit.DAYS.between(time1, time2));
        System.out.println(time1.isLeapYear());

    }
}

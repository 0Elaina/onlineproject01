package com.itheima.a04test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class Test4 {
    public static void main(String[] args) throws ParseException {
        /*
            请用代码计算你活了多少天
         */
        SimpleDateFormat sdf = new SimpleDateFormat();
        System.out.println(sdf.format(new Date()));
        String birth = "2006/1/1 上午1:00";
        Date now = new Date();
        Date birthDate = sdf.parse(birth);
        System.out.println(birthDate.getTime());
        System.out.println( (now.getTime() - birthDate.getTime()) / 1000 / 60 / 60 / 24);


        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(2006, 1, 1);

        ChronoUnit chronoUnit = ChronoUnit.DAYS;
        System.out.println(chronoUnit.between(birthday, today));

    }
}

package com.itheima.a02jdk8datedemo;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class A10_ChronoUnitDemo {
    public static void main(String[] args) {
        LocalDateTime day1 = LocalDateTime.now();
        LocalDateTime day2 = day1.plusDays(1);


        System.out.println(ChronoUnit.DAYS.between(day1, day2));
        System.out.println(ChronoUnit.NANOS.between(day1, day2));
        System.out.println(ChronoUnit.ERAS.between(day1, day2));
    }
}

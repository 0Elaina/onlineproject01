package com.itheima.a02jdk8datedemo;

import java.time.LocalDate;
import java.time.Period;

public class A08_PeriodDemo {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate day1 = LocalDate.of(2000, 1, 1);

        Period period = Period.between(day1, today);
        System.out.println(period);
        System.out.println("--------------");

        System.out.println("year = " + period.getYears());

        System.out.println(period.toTotalMonths());
    }
}

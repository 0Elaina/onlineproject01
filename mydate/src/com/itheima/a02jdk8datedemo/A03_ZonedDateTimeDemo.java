package com.itheima.a02jdk8datedemo;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class A03_ZonedDateTimeDemo {
    public static void main(String[] args) {
        /*
        static ZonedDateTime now()                      获取当前时间的ZonedDateTime对象
        static ZonedDateTime ofXxxx(。。。)             获取指定时间的ZonedDateTime对象
        ZonedDateTime withXxx(时间)                     修改时间系列方法
        ZonedDateTime minusXxx(时间)                    减少时间系列方法
        ZonedDateTime plusXxx(时间)                     增加时间系列方法
         */

        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now);

        Instant instant = Instant.ofEpochSecond(0L);
        System.out.println(ZonedDateTime.ofInstant(instant, ZoneId.systemDefault()));
        ZonedDateTime zdt1 = ZonedDateTime.of(2025, 2, 12, 16, 40, 20, 0, ZoneId.systemDefault());
        System.out.println(zdt1);

        System.out.println(now.withYear(2020));
        System.out.println(now.minusYears(2));
        System.out.println(now.plusYears(2));
    }
}

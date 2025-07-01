package com.itheima.a02jdk8datedemo;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class A02_InstantDemo {
    public static void main(String[] args) {
        /*
        static Instant now()                    获取当前时间的Instant对象（标准时间）
        static Instant ofXxxx(long epochMilli)  根据（秒/毫秒/纳秒）获取Instant对象
        ZonedDateTime atZone(ZoneId zone)        指定时区
        boolean isXxx(Instant otherInstant)     判断系列的方法
        Instant minusXxx(long millisToSubtract) 减少时间系列的方法
        Instant plusXxx(long millisToSubtract)  增加时间系列的方法
         */

        Instant now = Instant.now();
        System.out.println(now);

        Instant instant1 = Instant.ofEpochMilli(0L);//毫秒
        System.out.println(instant1);
        Instant instant2 = Instant.ofEpochSecond(1L);//秒
        System.out.println(instant2);
        Instant instant3 = Instant.ofEpochSecond(1L, 1000000000L);//第二个参数为纳秒
        System.out.println(instant3);

        ZonedDateTime zone = now.atZone(ZoneId.systemDefault());
        System.out.println(zone);

        System.out.println("------------------------------");
        Instant instant4 = Instant.ofEpochMilli(0L);
        Instant instant5 = Instant.ofEpochMilli(1000L);

        System.out.println(instant4.isBefore(instant5));
        System.out.println(instant4.isAfter(instant5));

        Instant instant6 = instant4.plusMillis(5000L);
        System.out.println(instant6);
        Instant instant7 = instant6.minusMillis(10L);
        System.out.println(instant7);
        System.out.println(instant7.plusMillis(20L));
    }
}

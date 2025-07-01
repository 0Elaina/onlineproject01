package com.itheima.a02jdk8datedemo;

import java.time.Instant;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class A04_DateTimeFormatterDemo {
    public static void main(String[] args) {
        /*
        static DateTimeFormatter ofPattern(格式)      获取格式对象
        String format(时间对象)                       按照指定方式格式化
         */

        ZonedDateTime now = ZonedDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss EE a");
        System.out.println(formatter.format(now));
    }
}

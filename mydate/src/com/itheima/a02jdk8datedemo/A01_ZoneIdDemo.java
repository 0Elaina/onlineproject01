package com.itheima.a02jdk8datedemo;

import java.time.ZoneId;
import java.util.Set;

public class A01_ZoneIdDemo {
    public static void main(String[] args) {
        /*
        static Set<String> getAvailableZoneIds()            获取Java中支持的所有时区
        static ZoneId systemDefault()                       获取系统默认时区
        static ZoneId of(String zoneId)                     获取一个指定时区
         */

        //Set<String> zoneIds = getAvailableZoneIds();
        Set<String> zoneIds = ZoneId.getAvailableZoneIds();
        System.out.println(zoneIds);

        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);

        ZoneId zi = ZoneId.of("America/Los_Angeles");
        System.out.println(zi);
    }
}

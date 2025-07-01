package com.itheima.a02jdk8datedemo;

import java.time.Duration;
import java.time.LocalDateTime;

import static java.lang.Math.abs;

public class A09_DurationDemo {
    public static void main(String[] args) {
        LocalDateTime day1 = LocalDateTime.now();
        LocalDateTime day2 = LocalDateTime.of(2000, 1, 1, 0, 0, 0);


        Duration duration = Duration.between(day2, day1);
        System.out.println(duration);

        System.out.println("-----------------------");
        System.out.println(duration.toDays());
        System.out.println(duration.toNanos());
    }
}

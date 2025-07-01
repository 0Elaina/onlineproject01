package com.itheima.a01jdk7datedemo;
import java.sql.Time;
import java.util.Date;
import java.util.Random;

public class DateDemo2 {
    public static void main(String[] args) {
        /*
        1:      打印时间原点开始一年之后的时间
        2:      定义任意两个Date对象，比较一下哪个时间在前，哪个时间在后
         */

        Date d = new Date(0L);
        long time = d.getTime();
        time = time + 1000L * 60 * 60 * 24 * 365;
        d.setTime(time);
        System.out.println(d);
        System.out.println("--------------------------");

        Random r = new Random();
        Date d1 = new Date(r.nextInt());
        Date d2 = new Date(r.nextInt());
        long time1 = d1.getTime();
        long time2 = d2.getTime();
        System.out.println("d1 = " + d1);
        System.out.println("d2 = " + d2);
        if(time1 < time2){
            System.out.println("d1在前，d2在后");
        }else if(time1 > time2){
            System.out.println("d2在前，d1在后");
        }else{
            System.out.println("两个时间一致");
        }
    }
}

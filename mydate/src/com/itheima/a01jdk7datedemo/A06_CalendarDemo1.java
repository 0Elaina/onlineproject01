package com.itheima.a01jdk7datedemo;

import java.util.Calendar;
import java.util.Date;

public class A06_CalendarDemo1 {
    public static void main(String[] args) {
        /*
        public static Calendar getInstance()                获取当前时间的日历对象

        public final Date getTime()                         获取日期对象
        public final setTime(Date date)                     给日历设置日期对象

        public long getTimeInMillis()                       拿到时间毫秒值
        public void setTimeInMillis(long millis)            给日历设置时间毫秒值

        public int get(int field)                           取日期中的某个字段信息
        public void set(int field,int value)                修改日历的某个字段信息
        public void add(int field,int amount)               为某个字段增加/减少指定的值
         */

        //1.获取日历对象
        //细节1：Calendar是一个抽象类，不能直接new，而是通过一个静态方法获取到子类对象
        //底层原理
        //会根据系统的不同时区来获取不同的日历对象，默认表示当前时间
        //会把时间中的纪元，年，月，日，时，分，秒，星期，等等的都放到一个数组当中
        //数组中   0   ： 纪元
        // 1：   年
        // 2：   月
        // 3：   一年中的第几周
        // 4：   一个月中的第几周
        // 5：   一个月中的第几天（日期）
        //...       16
        //细节2：
        //月份： 0~11  0对应1月
        //星期：  1对应周日
        Calendar c = Calendar.getInstance();
        System.out.println(c);

        //2.修改一下日历代表的时间
        Date d = new Date(0L);
        c.setTime(d);
        System.out.println(c);
        System.out.println("-------------------------");

        c.set(Calendar.YEAR, 2000);
        c.set(Calendar.MONTH, Calendar.JULY);
        c.set(Calendar.MONTH, 999);
        c.set(Calendar.MONTH, 0);

        c.set(Calendar.YEAR, 2023);
        c.set(Calendar.MONTH, Calendar.AUGUST);
        c.set(Calendar.DAY_OF_MONTH, 10);

        c.add(Calendar.MONTH, 1);
        c.add(Calendar.MONTH, -2);


        int year = c.get(1);    int month = c.get(2) + 1;   int date = c.get(3);
        int week = c.get(Calendar.DAY_OF_WEEK);
        System.out.println(year + ", " + month + ", " + date + ", " + week);
        System.out.println(year + ", " + month + ", " + date + ", " + getWeek(week));
    }

    public static String getWeek(int index)
    {
        String[] arr = {"", "星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"};
        return arr[index];
    }
}

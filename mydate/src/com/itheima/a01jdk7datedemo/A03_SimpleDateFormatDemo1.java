package com.itheima.a01jdk7datedemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class A03_SimpleDateFormatDemo1 {
    public static void main(String[] args) throws ParseException {
        /*
    public SimpleDateFormat()                       默认格式
    public SimpleDateFormat(String pattern)         指定格式
    public final String format(Date date)           格式化（日期对象->字符串）
    public Date parse(String source)                解析（字符串->日期对象)
         */

        //默认格式
        SimpleDateFormat sdf1 = new SimpleDateFormat();
        Date d1 = new Date(0L);
        String str1 = sdf1.format(d1);
        System.out.println("sdf1 = " + str1);

        //指定格式
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String str2 = sdf2.format(d1);
        System.out.println("sdf2 = " + str2);

        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss E");
        String str3 = sdf3.format(d1);
        System.out.println("sdf3 = " + str3);

        //解析字符串
        String str = "2023-11-11 11:11:11";
        SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = sdf4.parse(str);
        System.out.println("date = " + date);
    }
}

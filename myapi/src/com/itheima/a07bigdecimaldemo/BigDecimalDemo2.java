package com.itheima.a07bigdecimaldemo;

import java.math.BigDecimal;

public class BigDecimalDemo2 {
    public static void main(String[] args) {
        //1.通过传递double类型的小数来创建对象
        //可能不精确
        System.out.println(new BigDecimal(0.01));

        //2.通过传递字符串表示的小数来创建对象
        System.out.println(new BigDecimal("0.01"));

        //3.通过静态方法获取对象
        System.out.println(BigDecimal.valueOf(10.1));

        //传递[0,10]的整数，那么方法会返回已经创建好的对象，不会重新new
        BigDecimal bd1 = BigDecimal.valueOf(10);
        BigDecimal bd2 = BigDecimal.valueOf(10);
        BigDecimal bd3 = BigDecimal.valueOf(10.0);
        BigDecimal bd4 = BigDecimal.valueOf(10.0);
        System.out.println(bd1 == bd2);//true
        System.out.println(bd1 == bd3);//false
        System.out.println(bd3 == bd4);//false
    }
}

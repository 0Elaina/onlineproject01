package com.itheima.a06bigIntegerdemo;

import java.math.BigInteger;
import java.util.Random;

public class BigIntegerDemo1 {
    public static void main(String[] args) {
        //1.获取一个随机的大整数
/*        Random r = new Random();
        BigInteger bd = new BigInteger(7,r);*/
        BigInteger bd = new BigInteger(5,new Random());
        System.out.println("随机大整数" + bd);

        //2.获取一个指定的大整数
        //给出的参数必须是字符串类型的
        BigInteger bd1 = new BigInteger("10000");
        System.out.println("指定大整数" + bd1);

        //3.获取指定进制的大整数
        //细节：
        //字符串中的数字要与进制相对应
        BigInteger bd2 = new BigInteger("0001110",2);
        System.out.println("指定进制的大整数" + bd2);

        //4.静态方法获取BigInteger对象
        //对-16~+16进行了优化
        //创建该范围内的对象时不会创建多个新的对象
        //填入的数据是Long类型
        BigInteger bd3 = BigInteger.valueOf(999999999L);
        System.out.println("静态大整数" + bd3);
        BigInteger bd4 = BigInteger.valueOf(16);
        BigInteger bd5 = BigInteger.valueOf(16);
        BigInteger bd6 = BigInteger.valueOf(17);
        BigInteger bd7 = BigInteger.valueOf(17);
        System.out.println(bd4 == bd5);//true
        System.out.println(bd6 == bd7);//false
    }
}

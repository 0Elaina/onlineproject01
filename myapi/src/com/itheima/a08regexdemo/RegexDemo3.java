package com.itheima.a08regexdemo;

public class RegexDemo3 {
    public static void main(String[] args) {
        //.表示任意一个字符
        System.out.println("你".matches("."));//true

        //  \\d任意一个数字
        System.out.println("--------------------");
        System.out.println("9".matches("\\d"));//true
        System.out.println("y".matches("\\d"));//false

        //  \\w任意一位单词字符
        System.out.println("--------------------");
        System.out.println("i".matches("\\w"));//true
        System.out.println("(".matches("\\w"));//false
        System.out.println("9".matches("\\w"));//true
        System.out.println("_".matches("\\w"));//true

        //  \\W任意一个非单词字符
        System.out.println("-----------------------");
        System.out.println("你".matches("\\W"));//true
        System.out.println("_".matches("\\W"));//false



        //匹配多个字符
        System.out.println("-----------------------");
        //至少三位
        System.out.println("i2_W".matches("\\w{3,}"));//true
        System.out.println("i2".matches("\\w{3,}"));//false

        //正好四位
        System.out.println("--------------------------------");
        System.out.println("1234".matches("\\d{4}"));//true
        System.out.println("12345".matches("\\d{4}"));//false
        System.out.println("12".matches("\\d{4}"));//false
    }
}

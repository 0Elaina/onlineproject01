package com.itheima.a08regexdemo;

public class RegexDemo13 {
    public static void main(String[] args) {
        //将字符串：我要学学编编编编程程程程程程
        //替换为：我要学编程
        String str = "我要学学编编编编程程程程程程";
        System.out.println(str.replaceAll("(.)\\1+", "$1"));
        //(.)   表示把重复内容的第一个字符看作一组
        // \\1  表示第一组字符再次出现
        //+     至少一次
        //$1    表示把正则表达式中第一组的内容，再拿出来用
    }
}

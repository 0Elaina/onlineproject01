package com.itheima.a08regexdemo;

public class RegexDemo14 {
    public static void main(String[] args) {
        //身份证号码的简易正则表达式
        //非捕获分组：仅仅是把数据括起来，不占用组号
        String regex = "[1-9]\\d{16}(?:\\d|X|x)\\1";//error
    }
}

package com.itheima.stringdemo;

public class StringDemo10 {
    public static void main(String[] args) {
        //1.获取一个手机号码
        String phoneNumber = "13334339753";

        //2.截取手机号码前面三位
        String start = phoneNumber.substring(0,3);

        //3.截取手机号码后面四位
        String end = phoneNumber.substring(7);

        //4.拼接
        String result = start + "****" + end;

        //5.打印
        System.out.println(result);
    }
}

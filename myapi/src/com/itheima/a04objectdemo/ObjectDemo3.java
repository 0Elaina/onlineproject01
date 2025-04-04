package com.itheima.a04objectdemo;

public class ObjectDemo3 {
    public static void main(String[] args) {
        String s = "abc";
        StringBuilder sb = new StringBuilder("abc");

        System.out.println(s.equals(sb));
        //因为equals方法是被s调用的，而s是字符串
        //所有equals要看String类中的
        //字符串中的equals方法，先判断参数是否为字符串
        //如果是字符串，再比较内部的属性
        //不是字符串，直接返回false


        System.out.println(sb.equals(s));
        //StringBuilder调用
        //StringBuilder中没有重写equals方法，用Object中的
        //Object中默认比较两个对象的地址值


    }
}

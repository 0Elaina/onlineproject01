package com.itheima.test;

public class Test6 {
    public static void main(String[] args) {
        String s = "Hello Java World";
        String[] strs = s.split(" ");
        System.out.println(strs[strs.length - 1].length());
    }
}

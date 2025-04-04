package com.itheima.stringdemo;

public class StringDemo8 {
    public static void main(String[] args) {
        String str = "abc";
        String result = reserve(str);
        System.out.println(result);
    }


    public static String reserve(String str){
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            char c = str.charAt(i);
            result = result + c;
        }
        return result;
    }
}

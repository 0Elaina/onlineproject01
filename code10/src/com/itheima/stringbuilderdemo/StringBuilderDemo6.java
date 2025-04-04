package com.itheima.stringbuilderdemo;

import java.util.Scanner;

public class StringBuilderDemo6 {
    public static void main(String[] args) {
/*        String str = getString();
        boolean result = getBoolean(str);
        if(result){
            System.out.println(str + "是对称字符串");
        }else{
            System.out.println(str + "是非对称字符串");
        }

    }

    //键盘录入一个字符串
    public static String getString(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = sc.next();
        return str;
    }

    //判断字符串是否对称
    public static boolean getBoolean(String str){
        for(int i= 0 ; i < str.length(); i++){
            char c = str.charAt(i);
            if(c != str.charAt(str.length() - 1)){
                return false;
            }
        }return true;*/


        //1.键盘录入一个字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = sc.next();

        //2.反转键盘录入的字符串（链式编程）
        String result = new StringBuilder().append(str).reverse().toString();

        //3.比较
        if(str.equals(result)){
            System.out.println(str + "是对称字符串");
        }else{
            System.out.println(str + "是非对称字符串");
        }
    }
}

package com.itheima.test;

import java.util.Scanner;

public class Test1Case1 {
    public static void main(String[] args) {
        //转换罗马数字
        Scanner sc = new Scanner(System.in);
        String num;

        while(true) {
            System.out.println("请输入一串不超过9位的数字：");
            num = sc.next();
            boolean flag = checkStr(num);
            if(flag){
                break;
            }else{
                System.out.println("无效的数字，请重新输入");
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < num.length();i++){
            char c = num.charAt(i);
            sb.append(changeLuoMa(c - 48));
        }
        System.out.println(sb.toString());

    }
    public static String changeLuoMa(int number){
        String[] arr = {"","Ⅰ","Ⅱ","Ⅲ","Ⅳ","Ⅴ","Ⅵ","Ⅶ","Ⅷ","Ⅸ"};
        return arr[number];
    }

    public static boolean checkStr(String str){
        if(str.length() > 9){
            return false;
        }

        for(int i = 0; i < str.length();i++){
            char c = str.charAt(i);
            int n = c - 48;
            if(n > 9 || n < 0){
                return false;
            }
        }

        return true;
    }
}

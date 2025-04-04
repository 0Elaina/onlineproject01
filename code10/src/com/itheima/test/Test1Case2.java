package com.itheima.test;

import java.util.Scanner;

public class Test1Case2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        while (true) {
            System.out.println("请输入不超过9位的数字");
            str = sc.next();
            boolean flag = checkStr(str);
            if(flag){
                break;
            }else{
                System.out.println("无效的数字，请重新输入");
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i =0;i < str.length();i++){
            char c = str.charAt(i);
            String s = changeLuoMa(c);
            sb.append(s);
        }
        System.out.println(sb.toString());
    }

    public static String changeLuoMa(char c){
            String str = switch(c){
                case '0' -> "";
                case '1' -> "Ⅰ";
                case '2' -> "Ⅱ";
                case '3' -> "Ⅲ";
                case '4' -> "Ⅳ";
                case '5' -> "Ⅴ";
                case '6' -> "Ⅵ";
                case '7' -> "Ⅶ";
                case '8' -> "Ⅷ";
                case '9' -> "Ⅸ";
                default -> "";
            };
            return str;
    }

    public static boolean checkStr(String str){
        if(str.length() > 9){
            return false;
        }

        for(int i = 0; i < str.length();i++){
            char c = str.charAt(i);
            int n = c - 48;
            if(n < 0 || n > 9){
                return false;
            }
        }

        return true;
    }
}

package com.itheima.test;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = sc.nextLine();

        StringBuilder sb = new StringBuilder();
        Random r = new Random();
        int len = str.length();
        char[] chars = str.toCharArray();
        for (int i = 0; i < len; i++) {
            int randomIndex = r.nextInt(len);
            char temp = chars[i];
            chars[i] = chars[randomIndex];
            chars[randomIndex] = temp;
        }

        for(char c : chars){
            sb.append(c);
        }

        System.out.println(sb.toString());

    }
}

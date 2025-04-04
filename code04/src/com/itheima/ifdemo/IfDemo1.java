package com.itheima.ifdemo;

import java.util.Scanner;

public class IfDemo1 {
    public static void main(String[] args) {
        //需求：键盘录入女婿的酒量，如果大于2斤，老丈人给出回应，反之不回应

        //if 格式：
        //if(关系表达式){
            //语句体；
        // }
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入女婿的酒量：");
        int wine = sc.nextInt();
        System.out.println(wine);

        if(wine>2){
            System.out.println("豪");
        }
    }
}

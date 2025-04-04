package com.inheima.test;

import java.util.Scanner;

public class LoopTest2 {
    public static void main(String[] args) {
        //需求：键盘录入一个大于等于2的整数x，计算并返回x的平方根，结果只保留整数部分，小数部分舍去
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个正整数");
        int num = sc.nextInt();


        if (num >= 2){
            for (int i =1; i<=num; i++){
                if (i * i == num){
                    System.out.println(i + "是" + num + "的平方根");
                    break;
                }else if (i * i > num){
                    System.out.println((i-1) + "是" + num + "的平方根的整数部分");
                    break;
                }
            }
        }else{
            System.out.println("无效的数字");
        }
    }
}

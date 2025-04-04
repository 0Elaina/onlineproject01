package com.inheima.test;

import java.util.Scanner;

public class LoopTest3 {
    public static void main(String[] args) {
        //需求：键盘录入一个正整数x,判断该整数是否为一个质数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int x = sc.nextInt();
        int count = 0;


        for(int i = 1 ; i<= x; i++){
            if (x % i == 0){
                count++;
            }
        }if (count == 2 || count ==1){
            System.out.println(x + "是质数");
        }else {
            System.out.println(x + "不是质数");
        }
    }
}

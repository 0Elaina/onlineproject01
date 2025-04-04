package com.inheima.test;

public class LoopTest1 {
    public static void main(String[] args) {
        //需求：使用程序在控制台打印出1~100之间的满足逢七过规则的数据

        int number1 = 1;
        int number2 = 100;
        int min = number1 < number2 ? number1 : number2;
        int max = number1 > number2 ? number1 : number2;

        for (int i = min; i <= max; i++){
            if (i % 7 == 0 || i % 10 == 7 || i / 10 % 10 == 7){
                System.out.println(i + "过");
                continue;
            }
            System.out.println(i);
        }
    }
}

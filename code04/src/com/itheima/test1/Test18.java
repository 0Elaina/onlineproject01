package com.itheima.test1;

import java.util.Scanner;

public class Test18 {
    public static void main(String[] args) {
        /*需求：给定两个整数，被除数和除数（都是正数，且不超过int的范围）。
        将两数相除，要求不使用乘法，除法和 % 运算符。
        得到商和余数。
         */

        Scanner sc=new Scanner(System.in);
        System.out.println("请输入被除数：");
        int dividend = sc.nextInt();
        System.out.println("请输入除数：");
        int diviser = sc.nextInt();


        int count = 0;
        //在循环中，不断使用被除数-除数
        //只要被除数是大于等于除数的，那么就一直循环
        while (dividend >= diviser) {
            dividend = dividend - diviser;
            count++;
        }
        System.out.println("商为" + count);
        System.out.println("余数为" + dividend);
    }
}

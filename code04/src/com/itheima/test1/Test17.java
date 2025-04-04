package com.itheima.test1;

import java.util.Scanner;

public class Test17 {
    public static void main(String[] args) {
        /*需求：给你一个整数 x 。
        如果 x 是一个回文整数，打印 true ，否则，返回 false。
        解释：回文数是指正序（从左到右）和倒序（从右向左）读都是一样的整数。
         */
        //1.定义数字
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数:");
        int number = sc.nextInt();
        //定义一个临时变量用于记录x原来的值
        int temp = number;

        int newNumber = 0;

        //2.利用循环开始
        while (number % 10 !=0){
            //从右往左获取每一位数字
            int num = number % 10;
            //修改number记录的值
            number = number / 10;
            //把当前获取到的数字拼接到最右边
            newNumber =newNumber*10 + num;
        }
        System.out.println(newNumber);
        number = temp;
        System.out.println(number);
        System.out.println(number == newNumber);
        }
    }

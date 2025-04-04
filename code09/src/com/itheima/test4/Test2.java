package com.itheima.test4;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        //键盘录入的两套体系不能混用
        //弊端：先用nextInt，再用nextLine会导致下面的nextLine接收不到数据
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数：");//输入123 + 回车
        int num = sc.nextInt();//接收123后停止
        System.out.println(num);
        System.out.println("请输入一个字符串:");
        String line = sc.nextLine();//接收到回车
        System.out.println(line);
    }
}

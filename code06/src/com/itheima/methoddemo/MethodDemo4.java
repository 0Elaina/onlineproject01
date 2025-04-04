package com.itheima.methoddemo;

import java.util.Scanner;

public class MethodDemo4 {
    //目标：掌握带参数方法定义的格式和调用的格式
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入第一个加数：");
        int add1 = sc.nextInt();
        System.out.println();
        System.out.print("请输入第二个加数：");
        int add2 = sc.nextInt();
        System.out.println();
        getSum(add1, add2);

    }


    public static void getSum(int num1,int num2){
        int result = num1 + num2;
        System.out.println("结果为：" + result);
    }
}

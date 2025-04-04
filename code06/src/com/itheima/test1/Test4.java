package com.itheima.test1;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        System.out.println("比较两个整数的大小");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数：");
        int num1 = sc.nextInt();
        System.out.println("请输入第二个整数：");
        int num2 = sc.nextInt();
        compare(num1,num2);
    }


    public static void compare(byte num1, byte num2) {
        if (num1 == num2){
            System.out.println("equal");
        }else{
            System.out.println("not equal");
        }
    }

    public static void compare(short num1, short num2) {
        if (num1 == num2){
            System.out.println("equal");
        }else{
            System.out.println("not equal");
        }
    }

    public static void compare(int num1, int num2) {
        if (num1 == num2){
            System.out.println("equal");
        }else{
            System.out.println("not equal");
        }
    }

    public static void compare(long num1, long num2) {
        if (num1 == num2){
            System.out.println("equal");
        }else{
            System.out.println("not equal");
        }
    }

    public static void compare(double num1, double num2) {
        if (num1 == num2){
            System.out.println("equal");
        }else{
            System.out.println("not equal");
        }
    }
}

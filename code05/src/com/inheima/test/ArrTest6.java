package com.inheima.test;

public class ArrTest6 {
    public static void main(String[] args) {
        //需求：定义两个变量，交换两个变量记录的值

        int a = 10;
        int b = 20;
        int temp = a;
        a=b;
        b = temp;
        System.out.print(a + "\t" + b);
    }
}

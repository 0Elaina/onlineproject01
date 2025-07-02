package com.itheima.mysort;

public class A04_RecursionDemo3 {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
    public static int factorial(int num) {
        if(num == 1)
            return 1;

        return num * factorial(num - 1);
    }
}

package com.itheima.mysort;

public class A04_RecursionDemo2 {
    public static void main(String[] args) {
        int num = 5;
        System.out.println(getSum(num));
    }
    public static int getSum(int num){
        if(num == 1)
            return 1;

        return num + getSum(num - 1);
    }
}

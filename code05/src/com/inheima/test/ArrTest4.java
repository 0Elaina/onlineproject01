package com.inheima.test;

public class ArrTest4 {
    public static void main(String[] args) {
        //定义数组求最大值：33，5，22，44，55
        int arr[] = {33,5,22,44,55};
        int max = arr[0];//max的初始化值一定要是数组中的值
        for (int i = 1; i < arr.length; i++) {
            if (arr [i] > max){
                max = arr [i];
            }else{
                max =max;
            }
        }
        System.out.println(max);
    }
}

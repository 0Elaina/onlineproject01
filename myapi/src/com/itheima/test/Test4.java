package com.itheima.test;

import java.util.Arrays;

public class Test4 {
    /*
    可爱的小明特别喜欢爬楼梯，他有的时候一次爬一个台阶，有的时候一次爬两个台阶。
    如果这个楼梯有20个台阶，小明一共有多少种爬法呢？
     */
    public static void main(String[] args) {
        int[] arr = new int[21];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;
        for(int i = 3; i < arr.length; i++){
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        System.out.println(Arrays.toString(arr));
    }
}

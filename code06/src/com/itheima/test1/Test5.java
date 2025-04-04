package com.itheima.test1;

import java.util.Random;

public class Test5 {
    public static void main(String[] args){
        //1.定义数组
        int[] arr = new int[10];
        //2.调用方法遍历数组
        printArr(arr);
    }


    //定义方法用于数组的遍历
    public static void printArr(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            Random r = new Random();
            int num = r.nextInt(100);
            arr[i] = num;
            if (i == arr.length - 1){
                System.out.print(arr[i]);
            }else{
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.println("]");
    }
}

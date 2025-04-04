package com.itheima.test1;

import java.util.Random;

public class Test6 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        printArr(arr);
        max(arr);
    }


    public static void printArr(int[] arr){
        Random r = new Random();
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            int num = r.nextInt(100);
            arr[i] = num;
            if (i == arr.length - 1) {
                System.out.print(num);
            }else{
                System.out.print(num + ",");
            }
        }
        System.out.println("]");
    }


    public static int max (int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[0] > arr[i]){
                arr[0] = arr[0];
            }else {
                arr[0] = arr[i];
            }
        }
        int max = arr[0];
        System.out.println(max);
        return max;
    }
}

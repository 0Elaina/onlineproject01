package com.inheima.test;

public class ArrTest8 {
    public static void main(String[] args) {
        //数组交换前：1，2，3，4，5
        //交换后：5,4,3,2,1


        int[] arr = {1,2,3,4,5};
        for(int i = 0,j = 4; i < j;i++, j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}

package com.inheima.test;

public class ArrTest3 {
    public static void main(String[] args) {
        /*定义一个数组，存储1，2，3，4，5，6，7，8，9，10
        遍历数组得到每一个元素
        要求：
        1.如果是奇数，则将当前数字扩大两倍
        2.如果是偶数，则将当前数字变成二分之一
         */


        //int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10};
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
/*        for (int i = 0; i < arr.length; i++) {

        }*/
        for (int i = 0; i < arr.length; i++){
            if (arr[i] % 2 == 0){
                arr[i] = arr[i] / 2;
            }else{
                arr[i] = arr[i] * 2;
            }
            System.out.println(arr[i]);
        }
    }
}

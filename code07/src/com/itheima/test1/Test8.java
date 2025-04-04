package com.itheima.test1;

import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {
        /*
        某系统的数字密码（大于0），采用加密方式进行传输
        规则如下：
                每位数加上5
                再对10求余
                最后将所有数字反转
                得到一串新数

                按照以上规则进行解密
         */

        //1.录入一个正整数作为需要解密的密码
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个正整数作为需要解密的密码(每一位数字属于[5,9])：");
        int num = sc.nextInt();
        int temp = num;

        //2.将录入的数据放入数组中
        int count = 0;
        while(num != 0){
            num = num / 10;
            count++;
        }
        int[] arr = new int[count];
        int index = arr.length - 1;
        while(temp != 0){
            arr[index] = temp % 10;
            temp = temp / 10;
            index--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();


        //3.解密
        for (int i = 0 , j = arr.length - 1; i < j; i++ , j--) {
            int temp1 = arr[i];
            arr[i] = arr[j];
            arr[j] = temp1;
        }//反转
        for (int i  = 0;  i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        //反对10求余
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] >= 0 && arr[i] <= 4){
                arr[i] = arr[i] + 10;
            }else{
                arr[i] = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();


        //减5
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] - 5;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();


        //4.将解密后的数组拼接并打印
        String result = "";
        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
        }
        System.out.println("密码解密后的结果为：");
        System.out.println(result);
    }
}

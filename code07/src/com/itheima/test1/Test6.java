package com.itheima.test1;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        /*

        某系统的数字密码（大于0），采用加密方式进行传输
        规则如下：
                每位数加上5
                再对10求余
                最后将所有数字反转
                得到一串新数
         */



        //分析：
        //1.把整数里面的每一位放到数组当中
/*        int num = 2395;
        int[] arr = new int[4];
        for (int i = 0; i < arr.length; i++) {
            switch(i){
                case 0: arr[i] = num / 1000;break;
                case 1: arr[i] = num / 100 % 10;break;
                case 2: arr[i] = num / 10 % 10;break;
                case 3: arr[i] = num % 10;break;
            }
            System.out.print(arr[i]);
        }
        System.out.println();*/


        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个正整数用于加密：");
        int number = sc.nextInt();
        int temp = number;
        int count = 0;
        while (number != 0){
            number = number / 10;
            count++;
        }
        System.out.println(count + "位数");

        int[] arr = new int[count];
        int index = arr.length - 1;
        while(temp != 0){
            arr[index] = temp % 10;
            temp = temp / 10;
            index--;
        }

        System.out.println("原数组为：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        //2.加密
        int[] newArr = new int[arr.length];
        for (int i = 0 , j = arr.length - 1; i < arr.length; i++ , j--) {
            arr[i] = arr[i] + 5;
            arr[i] = arr[i] % 10;
            newArr[j] = arr[i];
            //反转方法2
            /*
            for (int i = 0 , j = arr.length - 1; i < j; i++ , j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            }
             */
            System.out.print(arr[i]);
        }
        //3.把数组里面的每一个数字进行拼接，变成加密之后的结果
        System.out.println();
        System.out.println("最终密码为：");
        String result = "";
        for (int i = 0; i < arr.length; i++) {
                result = result + newArr[i];
        }

        System.out.println(result);
    }
}

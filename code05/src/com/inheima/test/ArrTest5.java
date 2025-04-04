package com.inheima.test;

import java.util.Random;

public class ArrTest5 {
    public static void main(String[] args) {
        /*需求：生成10个1~100之间的随机数存入数组
        1）求出所有数据的和
        2）求出所有数据的平均数
        3）统计有多少个数据比平均数小
         */


        //分析：
        //1.定义数组
        int[] arr = new int[10];
        //2.把随机数存入数组当中
        Random r = new Random();

        for (int i = 0; i < arr.length; i++) {
            //每循环一次，就会生成一个新的随机数
            int number = r.nextInt(100) + 1;
            //把生成的随机数添加到数组当中
            //数组名[索引] = 数据;
            arr [i] = number;
        }


        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


        //1)求出所有数据的和
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("数组中所有数据求和的结果为" + sum);


        //2)求所有数据的平均数
        int average = sum / arr.length;
        System.out.println("数组中所有数据的平均数为" + average);


        //3)统计有多少个数据比平均数小
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < average){
                count++;
            }
        }
        System.out.println("有" + count + "个数据比平均值小");


        //遍历数组，验证答案
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}

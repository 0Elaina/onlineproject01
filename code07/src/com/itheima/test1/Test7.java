package com.itheima.test1;

import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        /*
        需求：
        把整数上的每一位都添加到数组当中
         */

        //1.定义一个整数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数用于录入数组：");
        int number = sc.nextInt();
        int temp = number;//定义一个临时变量用于记录number的值
        int count = 0;//定义计数器用于统计整数的位数
        while(number != 0){
            number = number / 10;
            count++;
        }
        System.out.println(count);
        //2.定义数组
        //动态初始化
        int[] arr = new int[count];
        int index = arr.length - 1;
        //3.把整数上的每一位都添加到数组当中
        while(temp != 0){
            //获取temp里的每一位数
            arr[index] = temp % 10;
            //再去掉右边的数字
            temp = temp / 10;
            index--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}

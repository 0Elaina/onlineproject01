package com.itheima.test1;

import java.util.Random;
import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        //1.定义数组
        Random r = new Random();
        int[] arr = new int[10];
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            int num =r.nextInt(100);
            arr[i] = num;
            //System.out.print(+ arr[i] + "\t");
        }
        System.out.println("]");

        //2.判断一个数组是否存在
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要查询的数字：");
        int num = sc.nextInt();
        boolean flag = contains(arr,num);
        System.out.println(flag);
    }


    public static boolean contains(int[] arr, int number){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number){
                return true;
            }
        }
        return false;
    }
}

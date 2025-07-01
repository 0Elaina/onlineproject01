package com.itheima.seach;

import java.util.Scanner;

public class A01_BasicSearchDemo1 {
    public static void main(String[] args) {
        //定义一个方法利用基本查找，查询某个元素是否存在
        //{131, 127, 147, 81, 103, 23, 7, 79}
        int[] arr = {131, 127, 147, 81, 103, 23, 7, 79};
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要查找的数字：");
        num = sc.nextInt();
        System.out.println(basicSearch(arr, num));

    }

    public static boolean basicSearch(int[] arr, int num){
        boolean flag = false;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == num){
                flag = true;
            }
        }
        return flag;
    }
}

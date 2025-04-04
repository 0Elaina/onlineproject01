package com.itheima.test1;

import java.util.Scanner;

public class Test15 {
    public static void main(String[] args) {
        /*需求：键盘录入两个数字，表示一个范围
        统计这个范围中
        既能被3整除，又能被5整除的数字有多少个
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("请录入一个数字表示范围的开始：");
        int start = sc.nextInt();
        System.out.println("请录入一个数字表示范围的结束");
        int end = sc.nextInt();

        int count = 0 ;

        for (int i = start; i <= end; i++){
            if(i % 3 ==0 && i % 5 == 0){
                count ++;
            }
        }
        System.out.println(count);
    }
}

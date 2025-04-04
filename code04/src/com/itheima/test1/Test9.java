package com.itheima.test1;

import java.util.Scanner;

public class Test9 {
    public static void main(String[] args) {
        /*需求：键盘录入星期数，输出工作日，休息日
         */


        Scanner sc = new Scanner (System.in);
        System.out.println("请输入星期数：");
        int day = sc.nextInt();

/*        if (day >0 && day <7){
            if (day > 0 && day <= 5){
                System.out.println("工作");
            }else{
                System.out.println("休息");
            }
        }else{
            System.out.println("无效的值");
        }*/


        switch (day){
            case 1,2,3,4,5 -> System.out.println("工作");
            case 6,7 -> System.out.println("休息");
            default -> System.out.println("无效的值");
        }
    }
}

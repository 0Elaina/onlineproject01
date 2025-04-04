package com.itheima.test1;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        //小红：如果你这次考试全班第一，我就做你女朋友

        //分析：
        //1.键盘录入小明的名次
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入小明的名次：");
        int ranking = sc.nextInt();
        //2.对小明的名次进行判断
        if(ranking == 1){
            System.out.println("小红成为小明的女朋友");
        }
    }
}

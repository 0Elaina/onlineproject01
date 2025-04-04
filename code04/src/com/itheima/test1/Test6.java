package com.itheima.test1;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        /*
        根据不同的分数送不同的礼物
        如果是95~100分，送自行车一辆
        如果是90~94分，游乐场玩一天
        如果是80~89分，送变形金刚一个
        如果是80以下，揍一顿。
         */


        Scanner sc = new Scanner(System.in);
        System.out.println("请输入分数:");
        int grade = sc.nextInt();

        //对异常数据判断校验
        if(grade >0 && grade <= 100) {

            if (grade >= 95 && grade <= 100) {
                System.out.println("自行车一辆");
            } else if (grade >= 90 && grade <= 94) {
                System.out.println("游乐场玩一天");
            } else if (grade >= 80 && grade <= 89) {
                System.out.println("变形金刚一个");
            } else {
                System.out.println("揍一顿");
            }
        }else{
            System.out.println("无效的成绩");
        }
    }
}

package com.itheima.test1;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        /*机票价格按照淡季旺季，头等舱和经济舱收费、输入机票原价、月份和头等舱或经济舱。
        按照如下规则计算机票价格：旺季（5-10月）头等舱9折，经济舱8.5折，淡季（11月到来年4月）头等舱7折，经济舱6.5折
         */
        System.out.println("欢迎使用机票购买服务");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入购买机票的月份：");
        int time = sc.nextInt();
        System.out.println("请输入购买经济舱或头等舱（头等舱：1，经济舱：2）：");
        int type = sc.nextInt();


        if(type == 1) {
            double finalMoney = bestCalc(time);
            System.out.println("请支付" + finalMoney + "元");
        }else if (type == 2){
            double finalMoney = ecoCalc(time);
            System.out.println("请支付" + finalMoney + "元");
        }
    }


    public static double bestCalc(int time) {
        double money = 1000;
        if (time >= 5 && time <= 10) {
            money = money * 0.9;
        } else if ((time >= 11 && time <= 12) || (time >= 1 && time <= 4)) {
            money = money * 0.7;
        }
        return money;
    }

    public static double ecoCalc(int time){
            double money = 700;
            if (time >= 5 && time <= 10) {
                money = money * 0.85;
            } else if ((time >= 11 && time <= 12) || (time >= 1 && time <= 4)) {
                money = money * 0.65;
            }return money;
    }
}

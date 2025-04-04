package com.itheima.test1;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        /*假设某影院卖了100张票，票的序号为1~100。
        其中奇数票号坐左侧，偶数票号坐右侧。
        键盘录入一个整数表示电影票的票号。
        根据不同情况，给出不同的提示：
        如果票号为奇数，那么打印坐左边
        如果票号为偶数，那么打印坐右边。
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数票号:");
        int number = sc.nextInt();

        //只有当票号在1~100之间时，才是有效的票号
        if(number > 0 && number <= 100 ) {
            if (number % 2 == 0) {
                System.out.println("坐右侧");
            } else {
                System.out.println("坐左侧");
            }
        }else{
            System.out.println("无效的票号");
        }
    }
}

package com.itheima.test1;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        /*在实际开发中，如果要根据两种不同的情况来执行不同的代码，就需要用到if的第二种格式
        需求：
        假设，用户在超市实际购买，商品总价为：660元。
        键盘录入一个整数表示用户实际支付的钱。
        如果付款大于等于600，表示付款成功。否则付款失败。
         */


        int AllMoney = 660;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户实际支付的钱:");
        int money = sc.nextInt();
        if(money >= 600){
            System.out.println("付款成功");
        }else{
            System.out.println("付款失败");
        }
    }
}

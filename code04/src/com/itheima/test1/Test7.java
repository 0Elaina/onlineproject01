package com.itheima.test1;

import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        /*需求：
            商场都会有VIP的会员制，根据不同的会员会有不同的折扣。
            假设商品总价为1000.
            键盘录入会员级别，并计算出实际支付的钱。
            会员1级：打9折。
            会员2级：打8折。
            会员3级：打7折。
            非会员：不打折。
         */

        int price = 1000;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入会员级别：");
        int vipLevel = sc.nextInt();
        if (vipLevel >= 0 && vipLevel <= 3){
            if (vipLevel == 1){
                System.out.println("请支付" + (price * 0.9) + "元");
            }else if (vipLevel == 2){
                System.out.println("请支付" + (price * 0.8) + "元");
            }else if (vipLevel == 3){
                System.out.println("请支付" + (price * 0.7) + "元");
            }else{
                System.out.println("请支付" + price + "元");
            }
        }else{
            System.out.println("无效的会员等级");
        }
    }
}

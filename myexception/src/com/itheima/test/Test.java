package com.itheima.test;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //1.创建键盘录入的对象
        Scanner sc = new Scanner(System.in);
        //2.创建女朋友的对象
        GirlFriend gf = new GirlFriend();
        //3.接收女朋友的姓名
        while (true) {
            try {
                System.out.println("请输入你心仪的女朋友的名字：");
                String name = sc.nextLine();
                gf.setName(name);
                //4.接收女朋友的年龄
                System.out.println("请输入你心仪的女朋友的年龄：");
                String ageStr = sc.nextLine();
                int age = Integer.parseInt(ageStr);
                gf.setAge(age);
                //如果所有的数据都是正确的，那么跳出循环
                break;
            } catch (NumberFormatException e) {
                System.out.println("年龄的格式有误，请输入数字");
                continue;//可省略，因为循环下面没有其他代码
            } catch (RuntimeException e) {
                System.out.println("姓名的长度或年龄的范围有误");
                continue;//可省略，因为循环下面没有其他代码
            }
        }
        //5.打印
        System.out.println(gf);
    }
}

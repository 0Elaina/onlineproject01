package com.itheima.a04test;

import java.util.ArrayList;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        /*
        键盘录入一些 1 ~ 100 之间的整数，并添加到集合种。
        直到集合中所有数据和超过200为止
         */


        int sum = 0;
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("请输入要录入的数据：");
            String str = sc.nextLine();
            int num = Integer.parseInt(str);
            if(num < 1 || num > 100){
                System.out.println("输入的数据超出范围，请重新输入");
                continue;
            }
            list.add(num);
            sum = sum + num;
            if(sum > 200){
                System.out.println("数据和达到超过200，结束录入" + " sum = " + sum);
                break;
            }
        }

        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + "     ");
        }
    }
}

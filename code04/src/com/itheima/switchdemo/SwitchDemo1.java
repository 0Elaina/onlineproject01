package com.itheima.switchdemo;

import java.util.Scanner;

public class SwitchDemo1 {
    public static void main(String[] args) {
        //兰州拉面，武汉热干面，北京炸酱面，陕西油泼面

        Scanner sc = new Scanner(System.in);
        System.out.println("在兰州拉面，武汉热干面，北京炸酱面，陕西油泼面中选择一项：");
        String noodles = sc.nextLine();

        switch (noodles) {
            case "兰州拉面":
                System.out.println("吃兰州拉面");
                break;

            case "武汉热干面":
                System.out.println("吃武汉热干面");
                break;

            case "北京炸酱面":
                System.out.println("吃北京炸酱面");
                break;

            case "陕西油泼面":
                System.out.println("吃陕西油泼面");
                break;

                default:
                    System.out.println("吃泡面");
                    break;

        }
    }
}

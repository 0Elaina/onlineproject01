package com.itheima.test;

import java.util.ArrayList;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        /*
        有一个很有名的数学逻辑题叫做不死神免问题，有一对兔子，从出生后第三个月起每个月都生一对兔子，
        小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问第十二个月的兔子对数为多少？
         */

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(getRabbit(n));
    }

    public static int getRabbit(int n){
        int result = 0;
        if(n >= 0 && n <= 2) result = 1;

        if(n >= 3){
            result = getRabbit(n - 1) + getRabbit(n - 2);
        }

        return result;
    }
}

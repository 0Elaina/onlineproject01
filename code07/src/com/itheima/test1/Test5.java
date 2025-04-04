package com.itheima.test1;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        //在歌唱比赛中，有6名评委给选手打分，分数范围【0~100】之间的整数
        //选手最后的得分为：去掉最高分、最低分后的四个评委的平均分，请完成上述过程并计算出选手的得分

        //分析：
        //1.定义一个数组，用来存储6名评委的打分[0~100]
        int[] arr = new int[6];
        int[] score = getScore(arr);
        for (int i = 0; i < score.length; i++) {
            System.out.print("第" + (i + 1) + "位评委的打分为" + score[i] + "\t");
        }
        System.out.println();
        //2.求出数组中的最大值
        int max = getMax(score);
        System.out.println("评委打的最高分为" + max);
        //3.求出数组中的最小值
        int min = getMin(score);
        System.out.println("评委打的最低分为" + min);
        //4.求出数组中6个分数的总和
        int sum = getSum(score);
        System.out.println(sum);
        //5.求出最终得分
        int finish = (sum - max - min)/4;
        System.out.println("最终得分为" + finish);
    }


    public static int[] getScore(int[] arr){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length;) {
            System.out.println("请输入第" + (i + 1) + "个评委的打分");
            int score = sc.nextInt();
            if (score >= 0 && score <= 100){
                arr[i] = score;
                i++;
            }else{
                System.out.println("录入的值超出范围，请重新输入，当前录入的值为" + 0);
            }
        }return arr;
    }


    public static int getMax(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }


    public static int getMin(int[] arr){
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min){
                min = arr[i];
            }
        }return min;
    }


    public static int getSum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }return sum;
    }
}

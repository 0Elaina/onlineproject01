package com.inheima.test;
import java.util.Random;
import java.util.Scanner;

public class LoopTest4 {
    public static void main(String[] args) {
        //先获取一个随机数
        //范围：1~100

        //2.创建对象
        Random r = new Random();

        //3.生成随机数
        //判断技巧：
        //在小括号中，书写的是生成随机数的范围
        //这个范围从0开始到这个数-1结束
        //口诀：包头不包尾，包左不包右
        int num = r.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("请输入你要猜的数字：");
            int guessNumber = sc.nextInt();


            if (guessNumber > num){
                System.out.println("false且随机数在" + 0 + "~" + guessNumber + "之间");
            }else if (guessNumber < num){
                System.out.println("false且随机数在" + guessNumber + "~" + 100 + "之间");
            }else if (guessNumber == num) {
                System.out.println("随机数为" + guessNumber);
            }
        }
    }
}

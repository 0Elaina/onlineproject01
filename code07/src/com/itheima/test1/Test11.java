package com.itheima.test1;

import java.util.Random;
import java.util.Scanner;

public class Test11 {
    public static void main(String[] args) {
        //1.生成中奖号码
        int[] arr = creatNumber();
        System.out.println();
        System.out.println("=================");

        System.out.println("中奖号码为：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        System.out.println("====================");

        //2.用户输入彩票号码(红球 + 蓝球)
        int[] userInputArr = userInputNumber();


        //3.判断用户的中奖情况
        int redCount = 0;
        int blueCount = 0;


        //判断红球
        for (int i = 0; i < userInputArr.length - 1; i++) {
            int redNumber = userInputArr[i];
            for (int j = 0; j < arr.length; j++) {
                if (redNumber == arr[j]){
                    redCount++;
                    //如果找到了，就那么后面的数字就没有必要继续比较了
                    //跳出内循环，继续判断下一个红球号码是否中奖
                    break;
                }
            }
        }

        //判断蓝球
        int blueNumber = userInputArr[userInputArr.length - 1];
        if(blueNumber == arr[arr.length - 1]){
            blueCount++;
        }

        //根据红球的个数以及蓝球的个数来判断中奖情况
        if(redCount == 6 && blueCount == 1){
            System.out.println("恭喜你，中奖1000万");
        }else if (redCount == 6 && blueCount == 0){
            System.out.println("恭喜你，中奖500万");
        }else if (redCount == 5 && blueCount == 1){
            System.out.println("恭喜你，中奖3000元");
        }else if ((redCount == 5 && blueCount == 0) || (redCount == 4 && blueCount == 1)){
            System.out.println("恭喜你，中奖200元");
        }else if ((redCount == 4 && blueCount == 0) || (redCount == 3 && blueCount == 1)){
            System.out.println("恭喜你，中奖10元");
        }else if ((redCount == 2 && blueCount == 1) || (redCount == 1 && blueCount == 1) || (redCount == 0 && blueCount == 1)){
            System.out.println("恭喜你，中奖5元");
        }else {
            System.out.println("谢谢参与");
        }
    }

    public static int[] userInputNumber(){
        //1.创建数组用于添加用户购买的彩票号码
        int[] arr = new int[7];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; ) {
            if(i <= 5) {
                System.out.println("请输入第" + (i + 1) + "个红球号码");
                int redNumber = sc.nextInt();
                //redNumber 在1~33 唯一不重复
                if (redNumber >= 1 && redNumber <= 33) {
                    boolean flag = contains(arr, redNumber);
                    if (!flag) {
                        arr[i] = redNumber;
                        i++;
                    } else {
                        System.out.println("当前数字已输入过，请重新输入");
                    }
                } else {
                    System.out.println("无效的号码，请重新输入");
                }
            }
            else{
                System.out.println("请输入蓝球号码");
                int blueNum = sc.nextInt();
                if(blueNum >= 1 && blueNum <= 16){
                    arr[i] = blueNum;
                    i++;
                }else{
                    System.out.println("无效的号码，请重新输入");
                }
            }
        }return arr;
    }




    public static int[] creatNumber(){
        //1.创建数组用于添加中奖号码
        int[] arr = new int[7];

        //2.随机生成号码并添加到数组当中
        //红球：不能重复的 1 2 3 4 5 6
        //蓝球：可以跟红球号码重复 5

        //生成红球号码并添加到数组当中
        Random r = new Random();
        for (int i = 0; i < 6;) {
            int redNumber = r.nextInt(33) + 1;
            int blueNumber = r.nextInt(16) + 1;
            boolean flag = contains(arr,redNumber);
            if(!flag){
                arr[i] = redNumber;
                i++;
            }
            arr[arr.length - 1] = blueNumber;

        }return arr;

    }

    //用于判断数据在数组中是否存在
    public static boolean contains(int[] arr , int number){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == number){
                return true;
            }
        }return false;
    }
}

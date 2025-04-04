package com.itheima.test1;

public class Test2 {
    public static void main(String[] args) {
        //判断 101~200 之间有多少个素数，并输出所有素数

        int from = 101, to = 200;
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = from;
            from++;
        }

        System.out.println("素数有：");
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean flag = true;
            for (int j = 2;j < i; j++){
                if (arr[i] % j == 0){
                    flag = false;
                    break;
                }
            }
            if (flag){
                System.out.print(arr[i] + "\t");
                count++;
            }
        }
        System.out.println();
        System.out.println("共计" + count + "个");

    }
}

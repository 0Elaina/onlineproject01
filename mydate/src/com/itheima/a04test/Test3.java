package com.itheima.a04test;

public class Test3 {
    public static void main(String[] args) {
        /*
            定义一个方法自己实现toBinaryString方法的效果，将一个十进制整数转成字符串表示的二进制
         */

        System.out.println(toBinaryString(123));
        System.out.println(Integer.toBinaryString(123));

    }

    private static String toBinaryString(int num){
        StringBuilder sb = new StringBuilder();
        while(true){
            if(num == 0){
                break;
            }
            sb.insert(0, num % 2);
            num = num / 2;
        }
        return sb.toString();
    };
}

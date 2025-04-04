package com.itheima.a01mathdemo1;

public class MathDemo2 {
    public static void main(String[] args) {
        //判断一个数是否为质数
        System.out.println(isPrime(19));
        System.out.println(isPrime(200));

    }

    public static boolean isPrime(int number){
        // for(int i = 2; i < number; i++){
        //改进，缩小遍历的范围
        for(int i = 2 ; i <= Math.sqrt(number); i++){
            //Math.sqrt()求出平方根
            //一个数可拆分的两个因子必然有一个小于等于其平方根
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
}

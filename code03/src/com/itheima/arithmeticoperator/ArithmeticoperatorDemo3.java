package com.itheima.arithmeticoperator;

public class ArithmeticoperatorDemo3 {
    public static void main(String[] args) {
        byte b1 = 100;
        byte b2 = 100;
        byte result = (byte)(b1 + b2);
        System.out.println(result);//强制转换的数据过大，发生错误
    }
}

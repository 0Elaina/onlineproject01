package com.itheima.test1;

public class Test2 {
    //需求：定义一个方法，求圆的面积，将结果在方法中进行打印

    public static void main(String[] args) {
        getArea(20);
    }
    public static void getArea(double radius){
        double result = (radius * radius) * 3.14;
        System.out.println(result);
    }
}

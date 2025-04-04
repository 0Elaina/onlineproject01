package com.itheima.test1;

public class Test1 {
    //需求:定义一个方法，求长方形的周长，将结果在方法中进行打印

    //目标：根据不同的需求，选择定义无参的方法，还是带参数的方法
    public static void main(String[] args) {
        getLength(3,99);
    }
    public static void getLength(int len, int width){
        int result = (len + width) * 2;
        System.out.println(result);
    }
}

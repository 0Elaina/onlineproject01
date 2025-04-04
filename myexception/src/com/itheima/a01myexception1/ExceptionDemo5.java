package com.itheima.a01myexception1;

public class ExceptionDemo5 {
    public static void main(String[] args) {
        /*
        JVM默认处理异常的方式：
            1.把异常的名称，异常原因以及异常出现位置等信息输出在控制台
            2.程序停止运行，异常下面的代码不会再执行
         */


        System.out.println("1111");
        System.out.println(2/0);//算数异常 ArithmeticException
        System.out.println("2222");
    }
}

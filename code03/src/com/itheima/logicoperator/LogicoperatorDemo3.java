package com.itheima.logicoperator;

public class LogicoperatorDemo3 {
    public static void main(String[] args) {
        //1.&&
        System.out.println(true && true);//true
        System.out.println(false && false);//false
        System.out.println(true && false);//false
        System.out.println(false && true);//false


        //2.||
        System.out.println(true || true);//true
        System.out.println(false || false);//false
        System.out.println(true || false);//true
        System.out.println(false || true);//true


        //3.短路逻辑运算符具有短路效果
        //简单理解：当左边的表达式能确定最终的结果，那么右边就不会参与运行了
        int a = 10;
        int b = 10;
        boolean result = ++a < 5 && ++b<5;
        System.out.println(result);//false
        System.out.println(a);//11
        System.out.println(b);//10
    }
}

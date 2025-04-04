package com.itheima.logicoperator;

public class LogicoperatorDemo2 {
    public static void main(String[] args) {
        // ^ 异或
        //相同为false，不同为true
        System.out.println(true ^ true);//false
        System.out.println(false ^ false);//false
        System.out.println(true ^ false);//true
        System.out.println(false ^ true);//true


        //! 逻辑非 取反
        System.out.println(!false);//true
        System.out.println(!true);//false
    }
}

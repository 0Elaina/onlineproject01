package com.itheima.a03integerdemo;

public class A01_IntegerDemo1 {
    public static void main(String[] args) {
        /*
        JDK5以前获取Integer的方式
        public Integer(int value)                                       根据传递的整数创建一个Integer对象
        public Integer(String s)                                        根据传递的字符串创建一个Integer对象
        public static Integer valueOf(int i)
        public static Integer valueOf(String s)
        public static Integer valueOf(String s, int radix)              根据传递的字符串和指定的进制创建一个Integer对象
         */
        System.out.println("----------------- new Integer -------------------------");
        Integer i1 = new Integer(1);
        Integer i2 = new Integer("1");
        System.out.println(i1);
        System.out.println(i2);


        System.out.println();
        System.out.println("-------------------- valueOf ---------------------------");
        Integer i3 = Integer.valueOf(123);
        Integer i4 = Integer.valueOf("123");
        Integer i5 = Integer.valueOf("123", 8);//123是八进制数字
        System.out.println(i3);
        System.out.println(i4);
        System.out.println(i5);//打印的结果是将输入的数字转换为十进制的结果
        System.out.println();


        Integer i6 = Integer.valueOf(127);
        Integer i7 = Integer.valueOf(127);
        System.out.println(i6 == i7);//true

        Integer i8 = Integer.valueOf(128);
        Integer i9 = Integer.valueOf(128);
        System.out.println(i9 == i8);//false
        /*
        Java中用valueOf创建Integer对象时
        底层优先创建了一个数组，存放了创建好的Integer类型的 -128 ~ 127的数字
        创建该范围内的对象时，会直接从数组中取
        若超出范围，则会新创建一个Integer对象
         */
    }
}

package com.itheima.a03integerdemo;

public class A04_IntegerDemo4 {
    public static void main(String[] args) {
        /*
        public static String toBinaryString(int i)                      得到二进制
        public static String toOctalString(int i)                       得到八进制
        public static String toHexString(int i)                         得到十六进制
        public static int parseInt(String s)                            将字符串类型的整数转换为int类型
         */
        String str1 = Integer.toBinaryString(100);
        String str2 = Integer.toOctalString(100);
        String str3 = Integer.toHexString(100);


        int i = Integer.parseInt(str1, 2);//指定字符串对应数字本身的进制
        System.out.println(i);//100
        System.out.println(Integer.parseInt(str1, 10));//1100100
        System.out.println(Integer.parseInt(str1));//1100100


        //在8种包装类当中，除了Character，都有对应的parseXxx方法，进行类型转换
        System.out.println(Boolean.parseBoolean("true"));
    }
}

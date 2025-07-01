package com.itheima.a08regexdemo;

public class RegexDemo12 {
    public static void main(String[] args) {
        //需求1：判断一个字符串的开始字符和结束字符是否一致，只考虑一个字符
        String regex1 = "(.).+(\\1)";//     \\组号：表示把第X组的内容再拿出来用一次
        System.out.println("a123a".matches(regex1));//true
        System.out.println("a123b".matches(regex1));//false
        System.out.println("------------------------");

        //需求2：判断一个字符串的开始部分和结束部分是否一致，可以有多个字符
        String regex2 = "(.+).+(\\1)";
        System.out.println("abc123abc".matches(regex2));//true
        System.out.println("abc123abd".matches(regex2));//false
        System.out.println("---------------------------");

        //需求1：判断一个字符串的开始字符和结束字符是否一致，开始部分内部每个字符也需要一致
        //(.):把首字母看作一组
        // \\2把首字母拿出来再次使用
        // *:作用于\\2，表示后面重复的内容出现0次或多次
        String regex3 = "((.)\\2*).+(\\1)";
        System.out.println("aaa123aaa".matches(regex3));//true
        System.out.println("bbb456bbb".matches(regex3));//true
        System.out.println("111789111".matches(regex3));//true
        System.out.println("&&abc&1".matches(regex3));//false


    }
}

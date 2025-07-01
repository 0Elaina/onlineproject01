package com.itheima.a08regexdemo;

public class RegexDemo11 {
    public static void main(String[] args) {
        String s = "小诗诗dqwefqwfqwfwq12312小丹丹dqwefqwfqwfwq12312小惠惠";

        //要求1：把字符串中三个姓名之间的字母替换为vs
        //要求2：把字符串中的三个姓名切割出来

        String result1 = s.replaceAll("[\\w&&[^_]]+", "vs");
        System.out.println(result1);

        String[] result2 = s.split("[\\w&&[^_]]+");
        for(String result : result2){
            System.out.print(result + "    ");
        }
    }
}

package com.itheima.com.a05myset;

import java.util.Comparator;
import java.util.TreeSet;

public class A06_TreeSetDemo3 {
    /*
    需求：请自行选择比较器排序和自然排序两种方式；
    要求：存入四个字符串，“c”，“ab”，“df”，“qwer”
    按照长度排序，如果一样长则按照首字母排序
     */
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>((o1, o2) -> {
                int result = o1.length() - o2.length();
                result = result == 0 ? o1.compareTo(o2) : result;
                return result;
        });

        ts.add("c");
        ts.add("ab");
        ts.add("df");
        ts.add("qwer");

        System.out.println(ts);
    }
}

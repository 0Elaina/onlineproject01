package com.itheima.com.a05myset;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class A05_TreeSetDemo2 {
    /*
    需求：创建TreeSet集合，并添加3个学生对象
    学生对象属性：
    姓名，年龄。
    要求按照学生的年龄进行排序
    同年龄按照姓名字母排列（暂不考虑中文）
    同姓名，同年龄认为是同一个人
     */
    public static void main(String[] args) {
        Student s1 = new Student("zhangsan", 18);
        Student s2 = new Student("lisi", 20);
        Student s3 = new Student("wangwu", 20);
        Student s4 = new Student("zhaoli", 21);

        TreeSet<Student> ts = new TreeSet<>();
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);

        System.out.println(ts);

    }
}

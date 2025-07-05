package com.itheima.com.a05myset;

import java.util.TreeSet;

public class A07_TreeSetDemo4 {
    public static void main(String[] args) {
        /*
        需求：创建5个学生对象
        属性：（姓名，年龄，语文成绩，数学成绩，英语成绩），
        按照总分从高到低输出到控制台
        如果总分一样，按照语文成绩排
        如果语文一样，按照数学成绩排
        如果数学成绩一样，按照英语成绩排
        如果英文成绩一样，按照年龄排
        如果年龄一样，按照姓名的字母顺序排
        如果都一样，认为是同一个学生，不存。
         */

        Student s1 = new Student("zhangsan", 18, 90, 80, 70);
        Student s2 = new Student("lisi", 21, 99, 80, 90);
        Student s3 = new Student("wangwu", 22, 100, 50, 90);
        Student s4 = new Student("zhaoliu", 21, 40, 88, 92);
        Student s5 = new Student("qianqi", 18, 60, 60, 60);

        TreeSet<Student> ts = new TreeSet<Student>();

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);

        System.out.println(ts);

    }
}

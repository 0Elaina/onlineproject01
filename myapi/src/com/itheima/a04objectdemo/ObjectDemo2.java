package com.itheima.a04objectdemo;

public class ObjectDemo2 {
    public static void main(String[] args) {
        /*
        public boolean equals(Object obj)       比较两个对象是否相等
         */

        Student s1 = new Student("zhangsan",20);
        Student s2 = new Student("zhangsan",20);

        boolean result = s1.equals(s2);
        System.out.println(result);

        //结论：
        //1.如果没有重写equals方法，那么默认使用Object中的方法进行比较，比较的是地址值是否相等
        //2.一般来讲地址值意义不大，重写之后比较的就是对象内部的属性值
    }
}

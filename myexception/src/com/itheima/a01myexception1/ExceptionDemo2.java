package com.itheima.a01myexception1;

public class ExceptionDemo2 {
    public static void main(String[] args) {
        /*
        异常作用一： 异常用来查询bug的关键参考信息
        异常作用二：异常可以作为方法内部的一种特殊返回值，以便通知调用者底层的执行情况
         */

        Student[] arr = new Student[3];

        String name = arr[0].getName();//"arr[0]" is null
        System.out.println(name);
    }
}

package com.itheima.com.a04mygenerics;

public class GenericsDemo2 {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();

        list.add("aaaa");
        list.add("bbbb");
        list.add("cccc");

        System.out.println(list);
        System.out.println(list.get(0));
    }
}

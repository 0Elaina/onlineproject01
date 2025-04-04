package com.itheima.com.a04mygenerics;

import java.util.ArrayList;

public class ListUtil {
    private ListUtil(){}

    public static<T> ArrayList<T> addAll(ArrayList<T> list , T t1, T t2, T t3 ){
        list.add(t1);
        list.add(t2);
        list.add(t3);
        return list;
    }
}

package com.itheima.com.a04mygenerics;

import java.util.Arrays;


//编写一个类时，如果不确定类型，就可以定义为泛型类

public class MyArrayList<E> {
    Object[] obj = new Object[10];
    int size;

    public boolean add(E e){
        /*
        E:表示不确定的类型，在类名处定义
        e:形参的名字
         */
        obj[size] = e;
        size++;
        return true;
    }

    public E get(int index){return (E)obj[index];}

    @Override
    public String toString(){
        return Arrays.toString(obj);
    }
}

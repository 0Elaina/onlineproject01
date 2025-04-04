package com.itheima.com.a04mygenerics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;

public class GenericsDemo1 {
    public static void main(String[] args) {
        //没有泛型的时候，集合会将传入的所有元素记录为Object
        //可以添加任意的数据类型
        //但是获取数据的时候，无法使用它的特有行为

        //泛型可以再添加数据的时候把类型统一
        //不把在调用方法时先强转
        //避免很多问题

        ArrayList list = new ArrayList();

        list.add(123);
        list.add("aaa");
        list.add(2.0);

        //遍历
/*        for(Object o : list){
            System.out.print(o + "  ");
        }
        System.out.println();

        list.forEach(new Consumer(){
            @Override
            public void accept(Object o ){
                System.out.print(o + " ");
            }
        });
        System.out.println();

        list.forEach(o -> System.out.print(o + "  "));
        System.out.println();*/

        Iterator it = list.iterator();
        while(it.hasNext()){
            //以Object记录元素
            //不能调用子类特有的方法
            System.out.print(it.next() + "  ");
        }
        System.out.println();
    }
}

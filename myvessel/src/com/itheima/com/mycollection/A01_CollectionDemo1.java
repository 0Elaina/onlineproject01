package com.itheima.com.mycollection;

import java.util.ArrayList;
import java.util.Collection;

public class A01_CollectionDemo1 {
    /*注意点：
        Collection是一个接口，我们不能直接创建它的对象。
        所以，现在我们学习他的方法时，只能创建他实现类的对象
        实现类：ArrayList
     */

    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        //以多态的方式创建Collection的实现对象


        coll.add("bbb");
        //判断元素是否包含
    }
}

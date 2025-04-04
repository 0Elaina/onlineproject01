package com.itheima.a02interfacedemo2;


/*

    成员变量
            只能是常量，默认修饰符： public static final
     构造方法
            没有
     成员方法
            只能是抽象方法，默认修饰符：public abstract

 */

public interface Inter {
    //public static final
    //如果没写，java会默认添加
    int a = 0;

    //public abstract
    void method();
}

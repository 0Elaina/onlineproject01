package com.itheima.a06interfacedemo6;

public interface Inter {
    /*接口中默认方法的定义格式：
                public default 返回值类型 方法名（参数列表）{}

       接口中默认方法的注意事项
            1.默认方法不是抽象方法，所以不强制被重写。但是如果被重写，重写的时候要去掉default关键字
            2.public可以省略，default不能省略
            3.如果实现了多个接口，多个接口中存在相同名字的默认方法，子类就必须对该方法进行重写
     */


    public default void show(){
        System.out.println("Inter1接口中的默认方法 --- show");
    }
}

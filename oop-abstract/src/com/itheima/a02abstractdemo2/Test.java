package com.itheima.a02abstractdemo2;

public class Test {
    public static void main(String[] args) {
        Frog f = new Frog("青蛙" , 1);
        Dog d = new Dog("狗" , 2);
        Sheep s = new Sheep("山羊" , 3);

        f.drink();
        f.eat();

        d.drink();
        d.eat();

        s.drink();
        s.eat();
    }
}

package com.itheima.a01interfacedemo1;

public class Test {
    public static void main(String[] args) {
        Frog f = new Frog("青蛙",1);
        Dog d = new Dog();
        d.setName("狗");
        d.setAge(2);
        Rabbit r = new Rabbit();
        r.setName("兔子");
        r.setAge(3);
        
        f.eat();
        f.swim();

        d.eat();
        d.swim();

        r.eat();
    }
}

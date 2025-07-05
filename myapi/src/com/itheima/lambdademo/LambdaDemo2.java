package com.itheima.lambdademo;

public class LambdaDemo2 {
    public static void main(String[] args) {
        method(() -> {
                System.out.println("swim");
            });
    }

    public static void method(Swim s){
        s.swim();
    }
}

@FunctionalInterface
interface Swim{
    public abstract void swim();
}

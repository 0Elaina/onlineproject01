package com.itheima.Test;

public class Tutor extends Teacher {
    public Tutor() {
    }

    public Tutor(String id, String name) {
        super(id, name);
    }

    @Override
    public void work(){
        System.out.println("助教正在协助讲师");
    }
}

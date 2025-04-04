package com.itheima.a02innerclassdemo2;

public class Outer1 {
    String name;

    private class Inner1 {
        int age;

    }



    public Inner1 gerInstance(){
        return new Inner1();
    }
}

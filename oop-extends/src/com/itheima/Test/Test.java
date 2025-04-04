package com.itheima.Test;

public class Test {
    public static void main(String[] args) {
        Lecturer l = new Lecturer("heima001","zhangsan");
        Tutor t = new Tutor("heima002","lisi");
        Maintainer m = new Maintainer();
        m.setId("heima003");
        m.setName("wangwu");
        Buyer b = new Buyer();
        b.setId("heima004");
        b.setName("zhaolin");

        l.work();
        t.work();
        m.work();
        b.work();
    }
}

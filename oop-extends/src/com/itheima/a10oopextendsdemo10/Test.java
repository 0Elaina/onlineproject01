package com.itheima.a10oopextendsdemo10;

public class Test {
    public static void main(String[] args) {
        Manager m = new Manager("heima001","张三",15000,8000);
        Cook c = new Cook();
        c.setId("heima002");
        c.setName("李四");
        c.setSalary(8000);

        System.out.println(m.getId() + ", " + m.getName() + ", " + m.getSalary() + ", " + m.getBonus());
        m.work();
        m.eat();

        System.out.println(c.getId() + ", " + c.getName() + ", " + c.getSalary());
        c.work();
        c.eat();
    }
}

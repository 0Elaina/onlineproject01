package com.itheima.a05interfacedemo5;

public class Test {
    public static void main(String[] args) {
        BasketballCoach bc = new BasketballCoach("red" , 30);
        BasketballPlayer bp = new BasketballPlayer();
        bp.setName("blue");
        bp.setAge(21);

        bc.teach();
        bc.speak();
        bp.learn();


        PingpongCoach pc = new PingpongCoach("yellow" , 43);
        PingpongPlayer pp = new PingpongPlayer("green" , 22);

        pc.speak();
        pc.teach();
        pp.learn();
    }
}

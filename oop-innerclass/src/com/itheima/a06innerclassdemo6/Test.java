package com.itheima.a06innerclassdemo6;

public class Test {

    public static void main(String[] args) {


        /*
                匿名内部类的格式：
                new 类名或接口名（）{
                    重写方法;
                }
         */


        //编写匿名内部类的代码
        new Swim() {

            @Override
            public void swim() {
                System.out.println("重写了游泳的代码");
            }
        };


        new Animal(){
            @Override
            public void eat(){
                System.out.println("重写了eat方法");
            }
        };

        //在测试类中调用下面的method方法？
        //以前的方法如何调用？
        //要自己写一个子类继承Animal类
        //再创建子类的对象，传递给method方法

/*        Animal a = new Animal(){
            @Override
            public void eat(){
                System.out.println();
            }
        };*/


        method(
                new Animal(){
                    @Override
                    public void eat(){
                        System.out.println("狗吃骨头");
                    }
                }
        );




    }


    public static void method(Animal a){
        a.eat();
    }
}

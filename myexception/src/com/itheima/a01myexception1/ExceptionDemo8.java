package com.itheima.a01myexception1;

public class ExceptionDemo8 {
    public static void main(String[] args) {
        /*
        捕获异常灵魂二问：如果try可能会遇到多个问题，怎么执行？
                         会写多个catch与之对应
                         细节：
                                如果我们要捕获多个异常，这些异常中如果存在父子关系的话，那么父类一定要写在下面
                                catch语句是从上往下执行的
                                父类囊括了多种异常
                                如果在开始执行catch的父类异常
                                下面的子类异常语句不再执行，报错

                         了解性：
                                在JDK7之后，我们可以在catch中同时捕获多个异常，中间用 | 隔开
                                表示如果出现了异常A和异常B的话，就采用同一种解决方案


         */


        int[] arr = {1,2,4,5,6};

        try{
            System.out.println(arr[10]);//执行到这里发现异常，直接跳转到catch语句，不执行剩下的try
            System.out.println(2/0);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("索引越界了");
        }

        System.out.println("看看我执行了吗？");



        try{
            System.out.println(arr[10]);
            System.out.println(2/0);
            String s = null;
            System.out.println(s.equals("abc"));
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("索引越界了");
        }catch(ArithmeticException e){
            System.out.println("除数不能为0");
        }catch(NullPointerException e){
            System.out.println("空指针异常");
        }

        System.out.println("看看我执行了吗？");





        try{
            System.out.println(arr[0]);
            System.out.println(2/0);
        }catch(ArrayIndexOutOfBoundsException | ArithmeticException e){
            System.out.println("exception");
        }

        System.out.println("看看我执行了吗？");
    }
}

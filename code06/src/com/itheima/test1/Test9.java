package com.itheima.test1;

public class Test9 {
    public static void main(String[] args) {
        int number = 100;
        System.out.println("调用change方法前" + number);
        //传递基本数据类型时，传递的是真实的数据，形参的改变，不影响实际参数的值

        System.out.println(number);//100
        number = change(number);//*****
        System.out.println("调用change方法后" + number);//200
    }


    public static int change (int number){
        number = 200;
        return number;
    }
}

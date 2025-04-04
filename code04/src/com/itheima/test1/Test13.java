package com.itheima.test1;

public class Test13 {
    public static void main(String[] args) {
        /*需求：在实际开发中，如果要获取一个范围中的每一个数据时，也会用到循环
        比如：求1-5之间的和
         */

        int sum = 0;
        for (int i = 1; i <= 5; i++){
            System.out.println(i);
            sum = sum + i;
        }
        System.out.println(sum);
    }
}

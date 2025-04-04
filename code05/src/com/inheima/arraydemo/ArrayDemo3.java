package com.inheima.arraydemo;

public class ArrayDemo3 {
    public static void main(String[] args) {
        //1.定义数组
        int[] arr = {1,2,3,4,5};
        //2.获取数组里的所有元素
/*        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i]);
            }*/

        //在java当中，关于数组的一个长度属性，length
        //调用方式：数组名.length
        System.out.println(arr.length);
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        //扩展：
        //自动的快速生成数组的遍历方式
        //idea提供的
        //数组名.fori
/*        for (int i = 0; i < arr.length; i++) {

        }*/
    }
}

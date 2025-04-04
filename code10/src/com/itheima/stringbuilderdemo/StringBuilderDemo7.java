package com.itheima.stringbuilderdemo;

public class StringBuilderDemo7 {
    public static void main(String[] args) {
        //定义一个数组
        int[] arr = {1,2,3};

        //调用方法并打印结果
        System.out.println(getString(arr));

    }


    //把数组拼接成字符串
    public static String getString(int[] arr){
        StringBuilder str = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            if( i == arr.length - 1){
                str.append(arr[i]).append("]");
            }else{
                str.append(arr[i]).append(",");
            }
        }return str.toString();
    }
}

package com.itheima.test1;

public class Test4 {
    public static void main(String[] args) {
        /*需求：
        把一个数组中的元素复制到另一个新数组中去
         */


        char[] arr = new char[52];
        for(int i = 0;i < arr.length;i++){
            if (i <= 25) {
                arr[i] = (char) (i + 97);
                System.out.print(arr[i] + "\t");
            }else if (i >= 26){
                arr[i] = (char)(i - 26 + 65);
                System.out.print(arr[i] + "\t");
            }
        }
        System.out.println();
        char[] newArr = new char[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(newArr[i]);
        }
    }
}

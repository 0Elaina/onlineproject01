package com.itheima.arraysdemo;

import java.util.Arrays;
import java.util.Random;

public class MyArraysDemo1 {
    public static void main(String[] args) {
        /*
        public static String toString(数组)                       把数组拼接成一个字符串
        public static int binarySearch(数组，查找的元素)             二分查找法查找元素
        public static int[] copyOf(原数组，新数组长度)                拷贝数组
        public static int[] copyOfRange(原数组，起始索引，结束索引)     拷贝数组（指定范围）
        public static void fill(数组,元素)                           填充数组
        public static void sort(数组)                              按照默认方式进行数组排序
        public static void sort(数组，排序规则)                      按照指定的规则排序
*/

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println(" ------------------- toString ----------------------");
        System.out.println(Arrays.toString(arr));

        System.out.println(" -------------------- binarySearch ---------------------");
        //细节1：二分查找的前提：数组中的元素必须是有序，数组中的元素必须是升序的
        // 细节2：如果要查找的元素是存在的，那么返回的是真实的索引
        // 但是，如果要查找的元素是不存在的，返回的是 (-插入点) - 1
        // 疑问：为什么要减1呢？
        // 解释：如果此时，我现在要查找数字0，那么如果返回的值是-插入点，就会出现问题了。
        // 如果要查找数字0，此时0是不存在的，但是按照上面的规则-插入点，应该就是-0
        // 为了避免这样的情况，Java在这个基础上又减一。
        System.out.println(Arrays.binarySearch(arr, 6));

        System.out.println("--------------------- copy ------------------------------");
        int[] copyArr1 = Arrays.copyOf(arr, arr.length);


        int[] copyArr2 = Arrays.copyOfRange(arr, 0, 4);
        //细节：包头不包尾，包左不包右
        System.out.println(Arrays.toString(copyArr1));
        System.out.println(Arrays.toString(copyArr2));

        System.out.println("---------------------- fill ------------------------------");
        int[] newArr = new int[3];
        Arrays.fill(newArr, 4);
        System.out.println(Arrays.toString(newArr));

        System.out.println(" -------------------- sort ------------------------- ");
        //默认给基本数据类型进行升序排列，底层用的是快速排序
        int[] arr1 = new int[15];
        for (int i = 0; i < arr1.length; i++) {
            Random r = new Random();
            arr1[i] = r.nextInt(100) % 10 + 1;
        }
        System.out.println("arr1: " + Arrays.toString(arr1));
        Arrays.sort(arr1);
        System.out.println("arr1: " + Arrays.toString(arr1));
    }
}

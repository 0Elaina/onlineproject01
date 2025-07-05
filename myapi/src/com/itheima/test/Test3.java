package com.itheima.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

public class Test3 {
    public static void main(String[] args) {
        /*
        有一堆桃子，猴子第一天吃了其中的一半，并多吃了一个！
        以后每天猴子都吃当前剩下来的一半，然后再多吃一个，
        第10天的时候（还没吃），发现只剩下一个桃子了，请问，最初总共多少个桃子？
         */
        int[] arr = new int[11];
        arr[0] = 0;
        arr[10] = 1;
        for(int i = arr.length - 2; i > 0; i--) {
            arr[i] = (arr[i + 1] + 1) * 2;
        }
        System.out.println(Arrays.toString(arr));
    }
}

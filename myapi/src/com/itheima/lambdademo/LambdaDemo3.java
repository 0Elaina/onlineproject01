package com.itheima.lambdademo;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaDemo3 {
    public static void main(String[] args) {
        Integer[] arr = {2, 3, 1, 5, 6, 7, 8, 4, 9};

        Arrays.sort(arr, (o1, o2) -> o1 - o2);

        System.out.println(Arrays.toString(arr));
    }
}

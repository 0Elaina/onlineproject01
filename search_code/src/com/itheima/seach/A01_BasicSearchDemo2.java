package com.itheima.seach;

import java.util.*;

public class A01_BasicSearchDemo2 {
    public static void main(String[] args) {
        int[] arr = {131, 127, 147, 81, 103, 23, 7, 79};
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(basicSearchIndex(arr, num));
    }

    public static int basicSearchIndex(int[] arr, int num){
        int index = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == num){
                break;
            }
            index++;
        }
        return index;
    }
}
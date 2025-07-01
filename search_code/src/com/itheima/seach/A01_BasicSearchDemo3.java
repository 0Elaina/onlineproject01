package com.itheima.seach;

import java.util.ArrayList;

public class A01_BasicSearchDemo3 {
    public static void main(String[] args) {
        int[] arr = {131, 127, 147, 81, 103, 23, 7, 79, 23, 23, 23};
        ArrayList<Integer> result = basicSearchIndexRepeat(arr, 23);
        int count = result.size();
        System.out.println("指定元素出现的索引分别为: ");
        for(int i = 0; i < count; i++){
            System.out.print(result.get(i) + " ");
        }
        System.out.println();
        System.out.println("出现的次数为: " + count);
    }

    public static ArrayList<Integer> basicSearchIndexRepeat(int[] arr, int num){
        ArrayList<Integer> result = new ArrayList<>();
        int index = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == num){
                result.add(i);
            }
        }
        return result;
    }
}

package com.itheima.mysort;

import java.util.BitSet;

public class QuickSortDemo {
    public static void main(String[] args) {
        int[] arr = {6, 1, 2, 7, 9, 3, 4, 5, 10, 8};
        quickSort(arr, 0, arr.length - 1);
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
    public static void quickSort(int[] arr, int start, int end){
        int startIndex = start;
        int endIndex = end;

        int baseNumber = arr[startIndex];

        if(startIndex >= endIndex){
            return;
        }

        while(startIndex != endIndex){
            while(true){
                if(endIndex <= startIndex || arr[endIndex] < baseNumber){
                    break;
                }
                endIndex--;
            }
            while(true){
                if(endIndex <= startIndex || arr[startIndex] > baseNumber){
                    break;
                }
                startIndex++;
            }

            int temp = arr[startIndex];
            arr[startIndex] = arr[endIndex];
            arr[endIndex] = temp;
        }

        int temp = arr[start];
        arr[start] = arr[startIndex];
        arr[startIndex] = temp;

        quickSort(arr, start, startIndex - 1);
        quickSort(arr, startIndex + 1, end);
    }
}

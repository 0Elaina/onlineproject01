package com.itheima.mysort;

public class A02_SelectionDemo {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 3, 1};
        arr = selectionSort(arr);
        for(int num: arr){
            System.out.print(num + " ");
        }
    }
    public static int[] selectionSort(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}

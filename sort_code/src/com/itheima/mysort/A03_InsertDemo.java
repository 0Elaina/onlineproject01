package com.itheima.mysort;

public class A03_InsertDemo {
    public static void main(String[] args) {
        int[] arr = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        arr = insertSort(arr);
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
    public static int[] insertSort(int[] arr){
        int startIndex = -1;
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] > arr[i + 1]){
                startIndex = i + 1;
                break;
            }
        }

        for(int i = startIndex; i < arr.length; i++){
            int j = i;
            while(j > 0 && arr[j] < arr[j - 1]){
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }
        return arr;
    }
}

package com.itheima.seach;

public class A02_BinarySearchDemo1 {
    public static void main(String[] args) {
        int[] arr = {131, 127, 147, 81, 103, 23, 7, 79};
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length - 1; j++) {
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(binarySearch(arr, 7));
    }
    public static boolean binarySearch(int[] arr, int target){
        boolean flag = false;
        int min = 0;
        int max = arr.length - 1;
        int mid = 0;
        while(min <= max){
            mid = (min + max) / 2;
            if(arr[mid] == target){
                flag = true;
                break;
            }else if(arr[mid] < target){
                min = mid + 1;
            }else if(arr[mid] > target){
                max = mid - 1;
            }
        }
        return flag;
    }
}

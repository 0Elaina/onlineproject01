package com.itheima.twodimensionarr;

public class TwoDimensionDemo2 {
    public static void main(String[] args) {
        //二维数组的动态初始化

        int[][] arr = new int[3][5];
        arr[0][0] = 10;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

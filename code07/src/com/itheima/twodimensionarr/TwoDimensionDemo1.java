package com.itheima.twodimensionarr;

import java.sql.SQLOutput;

public class TwoDimensionDemo1 {
    public static void main(String[] args) {

    /*
    二维数组的静态初始化格式：
                    数据类型[][] 数组名 = new 数据类型[][] {{元素1，元素2}，{元素1，元素2}}；
     简化格式：
                    数据类型[][] 数组名 = {{元素1，元素2}，{元素1，元素2}}；

        元素访问：
                    数组名[索引][索引];

        二维数组遍历：
                    先得到一维数组，再遍历一维数组获取元素
     */

        //二维数组的静态初始化格式：
        //数据类型[][] 数组名 = new 数据类型[][] {{元素1，元素2}，{元素1，元素2}}；
        int[][] arr1 = new int[][]{{1, 2, 3}, {4, 5, 6, 7, 8}};
        int[][] arr2 = {{1, 2, 3}, {4, 5, 6, 7, 8}};
        //以后建议这样定义，把每一个一维数组，单独写成一行
        int[][] arr3 = {
                {1, 2, 3},
                {4, 5, 6, 7, 8}
        };

        //2.获取元素
        //arr[i][j]
        //arr:二维数组
        //i:二维数组的索引，获取出来的是里面的一维数组
        //j:表示一维数组中的索引，获取出来的就是真正的元素
        //System.out.println(arr3[0]);//表示获取二维数组中的第一个一维数组

        //arr3[0]:二维数组中的第一个一位数组
        //arr3[0][0]:获取第一个一维数组中0索引对应的元素
        System.out.println(arr3[0][0]);
        System.out.println(arr3[1][4]);//打印数字8

        //3.二维数组遍历
        //外循环：遍历二维数组，得到里面的每一个一维数组
        for (int i = 0; i < arr3.length; i++) {
            //i:表示二维数组中的每一个索引
            //arr3[i]：表示二维数组中的每一个元素（一维数组）
            //内循环：遍历一维数组，得到里面的每一个元素
            for (int j = 0; j < arr3[i].length; j++) {
                //j:表示一维数组中的每一个元素
                System.out.print(arr3[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

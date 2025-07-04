package com.itheima.twodimensionarr;

public class TwoDimensionDemo3 {
    public static void main(String[] args) {
        /*某商城每个季度的营业额如下：单位（万元）
        第一季度： 22，66，44      一维数组
        第二季度： 77，33，88      一维数组
        第三季度： 25，45，65      一维数组
        第四季度： 11，66，99      一维数组

        要求计算出每个季度的总营业额和全年的总营业额
         */


        //1.创建二维数组并存储数据
        int[][] yearArrArr = {
                {22,66,44},
                {77,33,88},
                {25,45,65},
                {11,66,99}
        };


        int yearSum = 0;
        //2.遍历二维数组，得到每一个一维数组并求和
        for (int i = 0; i < yearArrArr.length; i++) {
            int quarterSum = getSum(yearArrArr[i]);
            System.out.print("第" + (i + 1) + "个季度的总营业额为" + quarterSum + "\t");
            yearSum += quarterSum;
        }
        System.out.println();
        System.out.println("全年的总营业额为" + yearSum);


    }


    //定义一个方法，计算每一个季度的营业额
    public static int getSum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }return sum;
    }
}

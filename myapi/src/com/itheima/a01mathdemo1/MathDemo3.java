package com.itheima.a01mathdemo1;

public class MathDemo3 {
    public static void main(String[] args) {
        //自幂数：一个n位自然数等于自身各个数位上数字的n次幂之和
        //统计一共有多少水仙花数（三位自幂数）
        getNarcissusCount();

        //证明没有两位的自幂数
        proveTwoSelfpower();

        //统计有多少个四叶玫瑰数（四位自幂数）
        getFourleafRoseCount();

        //统计有多少个五角星数（五位自幂数）
        getPentagramCount();
    }

    //统计有多少个五角星数（五位自幂数）
    private static void getPentagramCount() {
        int pentagramCount = 0;
        System.out.println("五角星数有：");
        for(int i = 10000; i <= 99999;i++){
            int temp = i;
            int singleDigit = temp % 10;
            temp /= 10;
            int tensDigit = temp % 10;
            temp /= 10;
            int threeDigit = temp % 10;
            temp /= 10;
            int fourDigit = temp % 10;
            temp /= 10;
            int fiveDigit = temp % 10;
            if(i == Math.pow(singleDigit,5) + Math.pow(tensDigit,5) + Math.pow(threeDigit,5) + Math.pow(fourDigit,5) + Math.pow(fiveDigit,5)){
                pentagramCount++;
                System.out.print(i + "\t");
            }
        }
        System.out.println();
        System.out.println("一共有" + pentagramCount + "个五角星数");
    }

    //统计有多少个四叶玫瑰数（四位自幂数）
    private static void getFourleafRoseCount() {
        int fourleafRoseCount = 0;
        System.out.println("四叶玫瑰数有：");
        for(int i = 1000; i <= 9999;i++){
            int temp = i;
            int singleDigit = temp % 10;
            temp /= 10;
            int tensDigit = temp % 10;
            temp /= 10;
            int threeDigit = temp % 10;
            temp /= 10;
            int fourDigit = temp % 10;
            if(i == Math.pow(singleDigit,4) + Math.pow(tensDigit,4) + Math.pow(threeDigit,4) + Math.pow(fourDigit,4)){
                fourleafRoseCount++;
                System.out.print(i + "\t");
            }
        }
        System.out.println();
        System.out.println("一共有" + fourleafRoseCount + "个四叶玫瑰数");
    }

    //证明没有两位的自幂数
    private static void proveTwoSelfpower() {
        int twoSelfpowerCount = 0;
        boolean result = true;
        for(int i = 10; i <= 99; i++){
            int temp = i;
            int singleDigit = temp % 10;
            temp /= 10;
            int tensDigit = temp % 10;
            if(i == Math.pow(singleDigit,2) + Math.pow(tensDigit, 2)){
                result = false;
            }
        }

        if(!result){
            System.out.println("有二位自幂数");
        }else{
            System.out.println("不存在二位自幂数");
        }
    }

    //统计一共有多少水仙花数（三位自幂数）
    private static void getNarcissusCount() {
        int narcissusCount = 0;
        System.out.println("水仙花数有：");
        for(int i = 100; i <=999;i++){
            int temp = i;
            int singleDigit = temp % 10;
            temp = temp / 10;
            int tensDigit = temp % 10;
            temp = temp / 10;
            int threeDigit = temp % 10;
            if(i == Math.pow(singleDigit,3) + Math.pow(tensDigit,3) + Math.pow(threeDigit,3)){
                narcissusCount++;
                System.out.print(i + "\t");
            }
        }
        System.out.println();
        System.out.println("一共有" + narcissusCount + "个水仙花数");
    }
}

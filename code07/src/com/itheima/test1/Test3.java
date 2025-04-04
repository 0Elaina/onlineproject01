package com.itheima.test1;

import java.util.Random;

public class Test3 {
    public static void main(String[] args) {
        /*  需求：
                定义方法实现随机产生一个五位的验证码
                验证码格式：
                长度为5
                前四位是大写字母或者是小写字母
                最后一位是数字
         */

        //分析：
        //1.大写字母和小写字母都放在数组中
        char[] chs = new char[52];
        for (int i = 0; i < chs.length; i++) {
            //ASCII码表   97 -> a
            //添加小写字母
            if (i <= 25) {
                chs[i] = (char) (97 + i);
            }else if (i >= 26){
                //添加大写字母       65 -> A
                chs[i] =(char) (65 -26 + i);
            }
        }

        for (int i = 0; i < chs.length; i++) {
            System.out.print(chs[i] + "\t");
        }
        System.out.println();

        //2.随机抽取四次
        Random r = new Random();
        for (int i = 0; i <4;i++){
            char ma = chs[r.nextInt(chs.length)];//52  <=>  0 ~ 51
            System.out.print(ma);
        }
        //3.随机抽取一个数字0~9
        int num = r.nextInt(9);
        System.out.print(num);
    }
}

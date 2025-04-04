package com.itheima.test1;

import java.util.Random;

public class Test9 {
    public static void main(String[] args) {
        //抽奖
        /*一个大V直播抽奖，奖品是现金红包，分别有{2,588,888,1000,10000}五个奖金。
        请使用代码模拟抽奖，打印出每个奖项，
        奖项的出现顺序要随机且不重复。打印效果如下：（随机顺序，不一定是下面的顺序）

```
        888元的奖金被抽出
        588元的奖金被抽出
        10000元的奖金被抽出
        1000元的奖金被抽出
        2元的奖金被抽出
```
         */



        //1.定义数组表示奖池
        int[] prize = {888,588,10000,1000,2};

        //2.定义数组用于存储抽过的奖
        int[] arr = new int[prize.length];

        //3.抽奖
        Random r = new Random();
        for (int i = 0; i < prize.length;) {
            int index = r.nextInt(prize.length);
            boolean flag = false;
            for (int i1 = 0; i1 < arr.length; i1++) {
                if (arr[i1] == prize[index]){
                    flag = true;
                }
            }
            if(!flag){
                arr[i] = prize[index];
                i++;
            }
        }


        //4.打印抽奖的结果
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "元的奖金被抽出");
        }
    }
}

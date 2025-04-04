package com.itheima.test1;

import java.util.Random;

public class Test10 {
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


        //1.把奖池里面的所有奖项打乱顺序
        int[] prize ={888,588,10000,1000,2};
        Random r = new Random();
        for (int i = 0; i < prize.length; i++) {
            //获取随机索引
            int randomIndex = r.nextInt(prize.length);
            //拿着i跟随机索引randomIndex上的值进行交换
            int temp = prize[i];
            prize[i] = prize[randomIndex];
            prize[randomIndex] = temp;

        }

        //2.遍历奖池

        for (int i = 0; i < prize.length; i++) {
            System.out.println(prize[i]);
        }
    }
}

package com.itheima.test3;

public class GoodsTest {
    public static void main(String[] args) {
        Goods goods1 = new Goods("001", "华为p40", 5999.0, 100);
        Goods goods3 = new Goods("002", "保温杯", 227.0, 50);
        Goods goods2 = new Goods("003", "枸杞", 12.7, 70);

        Goods[] goodsArr = {goods1, goods2, goods3};
        for (int i = 0; i < goodsArr.length; i++) {
            System.out.println(goodsArr[i].getId() + ", " + goodsArr[i].getName() + ", " + goodsArr[i].getPrice() + ", " + goodsArr[i].getCount());
        }
    }
}

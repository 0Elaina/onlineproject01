package com.itheima.a01jdk7datedemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class A05_SimpleDateFormatDemo3 {
    public static void main(String[] args) throws ParseException {
        /* 需求:
            秒杀活动：2023年11月11日0:0:0
            开始时间：2023年11月11日0:10:0
            小贾下单并付款的时间为：2023年11月11日0:01:00
            小皮下单并付款的时间为：2023年11月11日0:11:0
            用代码说明这两位同学有没有参加上秒杀活动？
         */
        String str1 = "2023年11月11日 0:0:0";
        String str2 = "2023年11月11日 0:10:0";
        String str3 = "2023年11月11日 0:01:00";
        String str4 = "2023年11月11日 0:11:0";

        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date beginDate = sdf1.parse(str1);
        Date endDate = sdf1.parse(str2);
        Date jDate = sdf1.parse(str3);
        Date pDate = sdf1.parse(str4);

        long beginTime = beginDate.getTime();
        long endTime = endDate.getTime();
        long jTime = jDate.getTime();
        long pTime = pDate.getTime();

        if(jTime >= beginTime && jTime <= endTime){
            System.out.println("小贾成功");
        }else{
            System.out.println("小贾失败");
        }

        if(pTime >= beginTime && pTime <= endTime){
            System.out.println("小皮成功");
        }else{
            System.out.println("小皮失败");
        }
    }
}

package com.itheima.a04test;

public class Test2 {
    public static void main(String[] args) {
        /*
        将字符串形式的数据转成整数
        要求：
            字符串中只能是数字不能有其他字符
            最少一位，最多10位
            0不能开头
         */

        String str = "492577";
/*        long result = str.charAt(0) - '0';
        boolean flag = true;
        // 1 = 49
        int size = str.length();
        if(size > 1 && result != 0) {
            for (int i = 1; i < size; i++) {
                if (size < 1 || size > 10) {
                    System.out.println("传入数据超出范围");
                    flag = false;
                    break;
                }
                if (str.charAt(i) > '9' || str.charAt(i) < '0') {
                    System.out.println("不规范的数据");
                    flag = false;
                    break;
                }
                result = result * 10 + (str.charAt(i) - '0');
            }
        }
        else{
            flag = false;
            System.out.println("数据不规范");
        }

        if(flag){
            System.out.println(result);
        }*/


        String regex = "[1-9]\\d{0,9}";
        boolean flag = str.matches(regex);
        if(!flag){
            System.out.println("数据格式错误");
        }else{
            System.out.println("数据格式正确， 结果为：");
        }

        if(flag){
            int result = 0;
            for(int i = 0; i < str.length(); i++){
                result = result * 10 + (str.charAt(i) - '0');
            }
            System.out.println(result);
        }
    }
}

package com.itheima.test;

public class Test5 {
    public static void main(String[] args) {
        String num1 = "4354";
        String num2 = "238";
        int num3 = toInt(num1) * toInt(num2);
        StringBuilder sb = new StringBuilder();
        sb.append(num3);
        System.out.println(sb.toString());

    }
    public static int toInt(String str){
        int[] arr = {0,1,2,3,4,5,6,7,8,9};
        int result = 0;
        for(int i = 0 ; i < str.length(); i++){
            result = result * 10;
            int num = str.charAt(i) - 48;
            result = result + num;
        }
        return result;
    }
}

package com.itheima.a01myexception1;

public class ExceptionDemo9 {
    public static void main(String[] args) {
        /*
        捕获异常灵魂三问：
                    如果try中遇到的问题没有捕获，怎么执行？
                    相当与try...catch语句白写，最终交给虚拟机处理
         */




        int[] arr = {1,2,4,5,6};

        try{
            System.out.println(arr[10]);
        }catch(NullPointerException e){
            System.out.println("索引越界了");
        }

        System.out.println("看看我执行了吗？");



    }
}

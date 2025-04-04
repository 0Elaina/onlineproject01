package com.itheima.a01myexception1;

public class ExceptionDemo7 {
    public static void main(String[] args) {
        /*捕获异常灵魂四问：
            灵魂一问：如果try中没有遇到问题，怎么执行？
                        会把try里面所有的代码全部执行完毕，不会执行catch里面的代码
                        注意：
                            只有当出现了异常才会执行catch里面的代码


         */



        int[] arr = {1,2,4,5,6};

        try{
            System.out.println(arr[0]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("索引越界了");
        }

        System.out.println("看看我执行了吗？");
    }
}

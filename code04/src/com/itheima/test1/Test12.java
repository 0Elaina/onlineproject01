package com.itheima.test1;

public class Test12 {
    public static void main(String[] args) {
        /*假设现在公司要求，断线重连的业务逻辑最多只写五次。
        请用代码实现。
         */

        for (int i = 1; i <= 5 ; i++){
            System.out.println("第" + i + "次" + "断线重连中");
        }
    }
}

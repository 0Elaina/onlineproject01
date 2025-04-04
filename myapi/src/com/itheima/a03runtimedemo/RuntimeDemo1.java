package com.itheima.a03runtimedemo;

import java.io.IOException;

public class RuntimeDemo1 {
    public static void main(String[] args) throws IOException {
        //创建runtime的对象
        Runtime runtime = Runtime.getRuntime();
        Runtime runtime1 = Runtime.getRuntime();
        System.out.println(runtime == runtime1);

        //停止虚拟机
        //runtime.exit(0);

        //获取cpu的线程数
        System.out.println(runtime.availableProcessors());

        //jvm能从系统中获取的总内存大小(byte)
        System.out.println((double)runtime.maxMemory()/1024/1024/1024);//8g

        //jvm已经获取的内存大小
        System.out.println((double)runtime.totalMemory()/1024/1024/1024);//0.5g

        //jvm剩余内存大小
        System.out.println((double)runtime.freeMemory()/1024/1024/1024);//0.5g

        //执行cmd命令
        runtime.exec("notepad");
    }
}

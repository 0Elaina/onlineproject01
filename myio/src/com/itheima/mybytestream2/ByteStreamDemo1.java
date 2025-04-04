package com.itheima.mybytestream2;

import java.io.FileInputStream;
import java.io.IOException;

public class ByteStreamDemo1 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("myio\\a.txt");
        int b1 = fis.read();
        System.out.println((char)b1);
        fis.close();

        //读到空索引，返回-1
    }
}

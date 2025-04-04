package com.itheima.mybytestream1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class ByteStreamDemo4 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("myio\\a.txt",true);

        String str1 = "kalabiqiu";
        byte[] bytes1 = str1.getBytes();
        System.out.println(Arrays.toString(bytes1));
        fos.write(bytes1);

        String str2 = "\r\t";
        byte[] bytes2 = str2.getBytes();
        System.out.println(Arrays.toString(bytes2));
        fos.write(bytes2);

        String str3 = "666";
        byte[] bytes3 = str3.getBytes();
        System.out.println(bytes3.toString());
        fos.write(bytes3);

        fos.close();
    }
}

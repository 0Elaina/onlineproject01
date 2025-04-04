package com.itheima.mybytestream1;

import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo3 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("myio\\a.txt");

        byte[] bytes = {99,100,101};
        fos.write(bytes,1,2);
        fos.close();
    }
}

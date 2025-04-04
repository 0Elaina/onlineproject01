package com.itheima.test;

import java.util.Arrays;
import java.util.Random;

public class Test4 {
    public static void main(String[] args) {
        char[] chars = new char[52];
        for (int i = 65; i <= 90; i++) {
            chars[i - 65] = (char) i;
            chars[i - 65 + 26] = (char) (i + 32);
        }

        //System.out.println(Arrays.toString(chars));

        Random r = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= 3; i++) {
            sb.append(chars[r.nextInt(chars.length)]);
        }
        sb.insert(r.nextInt(4),r.nextInt(10));
        System.out.println(sb.toString());
    }
}

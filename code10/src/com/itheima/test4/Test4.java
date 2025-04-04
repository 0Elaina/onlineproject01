package com.itheima.test4;

public class Test4 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("abcc");

        System.out.println(sb.length());//4
        System.out.println(sb.capacity());//16

        StringBuilder sb1 = new StringBuilder();
        sb1.append("ssssssffafeasfjsofjs");
        System.out.println(sb1.length());//20
        System.out.println(sb1.capacity());//34

        StringBuilder sb2 = new StringBuilder();
        sb2.append("josafjasifaosfsfasfaesffasfaifhaoefjaw");
        System.out.println(sb2.length());//38
        System.out.println(sb2.capacity());//38
    }
}

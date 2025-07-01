package com.itheima.a08regexdemo;

public class RegexDemo2 {
    public static void main(String[] args)
    {
        //只能出现a，b，c
        /*System.out.println("j".matches("[abc]"))//false;
        System.out.println("a".matches("[abc]"));//true
        System.out.println("aa".matches("[abc]"));//false*/
        //只匹配一个字符

        //不能出现a，b，c
        /*System.out.println("i".matches("[^abc]"));//true
        System.out.println("a".matches("[^abc]"));//false
        System.out.println("ab".matches("[^abc][^abc]"));//false
        System.out.println("oe".matches("[^abc][^abc]"));//true
        System.out.println("ae".matches("[^abc][^abc]"));//false*/


        //a到z，A到Z（包括头尾）
        /*System.out.println("1".matches("[a-zA-Z]"));//false
        System.out.println("y".matches("[a-zA-Z]"));//true*/

        //a到d，或m到p
        /*System.out.println("c".matches("[a-d[m-p]]"));//true
        System.out.println("n".matches("[a-d[m-p]]"));//true
        System.out.println("e".matches("[a-d[m-p]]"));//false*/

        //a到z和def的交集
        /*System.out.println("e".matches("[a-z&&[def]]"));//true
        System.out.println("a".matches("[a-z&&[def]]"));//false*/

        //a-z和非bc的交集
        /*System.out.println("b".matches("[a-z&&[^bc]]"));//false
        System.out.println("a".matches("[a-z&&[^bc]]"));//true*/

        //a到z和除了m到p的交集
        //必须写两个"&"，否则表达的只是&这个符号
        /*System.out.println("a".matches("[a-z&&[^m-p]]"));//true
        System.out.println("a".matches("[a-lq-z]"));//true
        System.out.println("&".matches("[a-z&[^m-p]]"));//true
        System.out.println("n".matches("[a-z&&[^m-p]]"));//false*/

    }

}

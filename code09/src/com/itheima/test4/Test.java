package com.itheima.test4;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //键盘录入：
        //第一套体系：
        //nextInt（）；接收整数
        //nextDouble（）；接收小数
        //next（）；接收字符串
        //遇到空格，制表符，回车就停止接收。这些符号后面的数据就不会接收了



        //第二套体系：
        //nextLine（）；接收字符串
        //可以接收空格，制表符，遇到回车才停止接收数据


/*        Scanner sc =new Scanner(System.in);
        System.out.println("请输入第一个整数：");//123 123
        int num1 = sc.nextInt();
        System.out.println(num1);//123
        System.out.println("请输入第二个整数：");
        int num2 = sc.nextInt();
        System.out.println(num2);//123*/

/*        Scanner sc =new Scanner(System.in);
        System.out.println("请输入第一个字符串：");//abc def
        String str1 = sc.next();
        System.out.println(str1);//abc
        System.out.println("请输入第二个字符串：");
        String str2 = sc.next();
        System.out.println(str2);//def*/

        Scanner sc =new Scanner(System.in);
        System.out.println("请输入第一个字符串：");//abc def
        String str1 = sc.nextLine();
        System.out.println(str1);//abc def
        System.out.println("请输入第二个字符串：");
        String str2 = sc.nextLine();
        System.out.println(str2);
    }
}

package com.itheima.a08regexdemo;

import java.util.zip.CheckedOutputStream;

public class RegexDemo4 {
    public static void main(String[] args) {
        /* 需求
            请编写正则表达式验证用户输入的手机号码是否满足要求。
            请编写正则表达式验证用户输入的邮箱号是否满足要求。
            请编写正则表达式验证用户输入的电话号码是否满足要求。


验证手机号码      13112345678 13712345667 13945679027 139456790271

验证座机电话号码        020-2324242 02122442 027-42424 0712-3242434

验证邮箱号码      3232323@qq.com      zhangsan@itcast.com     dlei0009@163.com        dlei0009@pci.com.cn

*/
        String phoneNumber1 = "13112345678";
        String phoneNumber2 = "13712345667";
        String phoneNumber3 = "13945679027";
        String phoneNumber4 = "139456790271";
        System.out.println("校验手机号码：");
        System.out.println(checkPhoneNumber(phoneNumber1));
        System.out.println(checkPhoneNumber(phoneNumber2));
        System.out.println(checkPhoneNumber(phoneNumber3));
        System.out.println(checkPhoneNumber(phoneNumber4));
        System.out.println();

        System.out.println("校验座机号码：");
        String landLineNumber1 = "020-2324242";
        String landLineNumber2 = "02122442";
        String landLineNumber3 = "027-42424";
        String landLineNumber4 = "0712-3242434";
        System.out.println(checkLandlineNumber(landLineNumber1));
        System.out.println(checkLandlineNumber(landLineNumber2));
        System.out.println(checkLandlineNumber(landLineNumber3));
        System.out.println(checkLandlineNumber(landLineNumber4));
        System.out.println();

        System.out.println("校验邮箱地址：");
        String email1 = "3232323@qq.com";
        String email2 = "zhangsan@itcast.com";
        String email3 = "dlei0009@163.com";
        String email4 = "dlei0009@pci.com.cn";
        System.out.println(checkEmailAddress(email1));
        System.out.println(checkEmailAddress(email2));
        System.out.println(checkEmailAddress(email3));
        System.out.println(checkEmailAddress(email4));

    }

    public static boolean checkPhoneNumber(String phoneNumber)
    {
        return phoneNumber.matches("1[3-9]\\d{9}");
    }

    public static boolean checkLandlineNumber(String landlineNumber)
    {
        return landlineNumber.matches("0\\d{2,3}-?\\d{5,10}");
    }

    public static boolean checkEmailAddress(String emailAddress)
    {
        return emailAddress.matches("\\w+@[\\w[^_]]{2,6}(\\.[a-zA-z]{2,3}){1,2}");
    }

}

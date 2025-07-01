package com.itheima.a08regexdemo;

public class RegexDemo5 {
    /*正则表达式练习：
需求
请编写正则表达式验证用户名是否满足要求。
要求：大小写字母，数字，下划线一共4-16位
请编写正则表达式验证身份证号码是否满足要求。
简单要求：18位，前17位任意数字，最后一位可以是数字可以是大写或小写的x
复杂要求：按照身份证号码的格式严格要求。
身份证号码：
41080119930228457x
510801197609022309
15040119810705387X
130133197204039024
430102197606046442*/

    public static void main(String[] args) {

    }

    public static boolean checkUserName(String userName)
    {
        return userName.matches("\\w{4,16}");
    }

    public static boolean checkIDNumber(String IDNumber)
    {
        //前面6位：省份，市区，派出所等信息         第一位不能是0，后面5位是任意数字
        //后面四位：任意数字出现3次             最后一位可以是数字也可以是大写x或者小写x
        return IDNumber.matches("[\\d&&[^0]]\\d{5}((18|19)\\d{2})|(20([0-1]\\d)|2[0-4])(0[1-9])|(1[0-2])");
    }
}

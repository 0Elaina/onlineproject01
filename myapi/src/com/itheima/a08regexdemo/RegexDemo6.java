package com.itheima.a08regexdemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo6 {
    public static void main(String[] args) {
        String str = "Java自从95年问世以来，经历了很多版本，目前企业中用的最多的是Java8和Java11，" +
                "因为这两个是长期支持版本，下一个长期支持版本是Java17，相信在未来不久Java17也会逐渐登上历史舞台";

        //method1(str);

        Pattern p = Pattern.compile("Java\\d{0,2}");
        Matcher m = p.matcher(str);
        while(m.find())
        {
            String s = m.group();
            System.out.println(s);
        }
    }

    private static void method1(String str) {
        //获取正则表达式的对象
        Pattern p = Pattern.compile("Java\\d{0,2}");
        //获取文本匹配器的对象
        Matcher m = p.matcher(str);

        boolean b = m.find();
        //拿着文本匹配器从头开始读取，寻找是否有满足规则的子串
        //如果没有，方法返回false
        //如果有，返回true。在底层记录字串的起始索引和结束索引+1

        String s1 = m.group();
        System.out.println(s1);
        //方法底层会根据find方法记录的索引进行字符串的截取
        //subString[起始索引，结束索引)
        //会把截取的小串返回

        b = m.find();
        //第二次调用find的时候，会继续读取后面的内容
    }
}

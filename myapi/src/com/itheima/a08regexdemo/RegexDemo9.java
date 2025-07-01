package com.itheima.a08regexdemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo9 {
    public static void main(String[] args) {
        /*
        Java自从95年问世以来，经历了很多版本，目前企业中用的最多的是Java8和Java11，因为这两个是长
期支持版本，下一个长期支持版本是Java17，相信在未来不久Java17也会逐渐登上历史舞台*/

        //需求1：爬取版本号为8,11,17的Java文本，但是只要Java，不显示版本号。
        //需求2：爬取版本号为8,11,17的Java文本。正确爬取结果为：
        // Java8    Java11  Java17  Java17
        //需求3：爬取除了版本号为8,11,17的Java文本，

        String regex = "Java(?=8|11|17)";
        String s = "Java自从95年问世以来，经历了很多版本，目前企业中用的最多的是Java8和Java11，因为这两个是长" +
                "期支持版本，下一个长期支持版本是Java17，相信在未来不久Java17也会逐渐登上历史舞台";

        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);
        /*while(m.find())
        {
            System.out.println(m.group());
        }*/

        String str = "java自从95年问世以来，经历了很多版本，目前企业中用的最多的是Java8和JAva11，因为这两个是长" +
                "期支持版本，下一个长期支持版本是JAVa17，相信在未来不久JAVA17也会逐渐登上历史舞台";

        //需求一：爬取版本号为8,11,17的Java文本，但是只要Java，不显示版本号。
        String regex1 = "((?i)Java)(?=8|11|17)";

        //需求二：爬取版本号为8,11,17的Java文本。
        String regex2 = "((?i)Java)(8|11|17)";
        String regex3 = "((?i)Java)(?:8|11|17)";

        //需求三：爬取除了版本号为8,11,17的Java文本
        String regex4 = "((?i)Java)(?!8|11|17)";

        Pattern p1 = Pattern.compile(regex4);
        Matcher m1 = p1.matcher(str);

        while(m1.find()){
            System.out.println(m1.group());
        }
    }
}

package com.itheima.a08regexdemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo10 {
    public static void main(String[] args) {
        /*Java自从95年问世以来，abbbbbbbbbbbbaaaaaaaaaaaaaaaaaa
经历了很多版本，目前企业中用的最多的是Java8和Java11，因为这两个是长期支持版本，下一个长期
支持版本是Java17，相信在未来不久Java17也会逐渐登上历史舞台*/

        //需求1：按照ab+的方式爬取ab，b尽可能多获取
        //需求2：按照ab+的方式爬取ab，b尽可能少获取

        String s = "Java自从95年问世以来，abbbbbbbbbbbbaaaaaaaaaaaaaaaaaa" +
                "经历了很多版本，目前企业中用的最多的是Java8和Java11，因为这两个是长期支持版本，下一个长期" +
                "支持版本是Java17，相信在未来不久Java17也会逐渐登上历史舞台";
        String regex1 = "ab+";//贪婪
        String regex2 = "ab+?";//非贪婪

        Pattern p = Pattern.compile(regex2);
        Matcher m = p.matcher(s);
        while(m.find()){
            System.out.println(m.group());
        }
    }
}

package com.itheima.test;

public class Test2Case1 {
    public static void main(String[] args) {
        String A = "abcde";
        String B = "cdeab";
        System.out.println(changeStr(A,B));


    }
    public static boolean changeStr(String A,String B){
        if(A.length() != B.length()){
            return false;
        }

        for(int i=0;i<A.length();i++){
            char c1 = A.charAt(i);
            boolean flag = false;
            for(int j=0;j<B.length();j++){
                char c2 = B.charAt(j);
                if(c1 == c2){
                    flag = true;
                    break;
                }
            }
            if(!flag){
                return false;
            }
        }


        int count = 0;
        StringBuilder sb = new StringBuilder(A);
        while(true){
            if(sb.toString().equals(B)){
                A = sb.toString();
                break;
            }else{
                char c = sb.charAt(0);
                sb.deleteCharAt(0);
                sb.append(c);
                count++;

            }
        }
        System.out.println(count);
        return true;
    }
}

package com.xl.java.week7;

import java.util.Date;

/**
 * @ClassName Test
 * @Description TODO
 * @Author 1
 * @Date 2020/10/22
 **/
public class TestDemo {
    public static String sum(int a, int b) {
        int secondAll = a + b;
        int min = secondAll / 60;
        int hour = min / 60;
        String hours = ""+hour;
        int second = secondAll - min * 60;
        String str = hour == 0 ? hours + ":" : "" ;
        return str + min + ":" + second;
    }

    public static String sum(String s1, String s2, String s3) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(s1);
        stringBuilder.append(s2);
        stringBuilder.append(s3);
        return stringBuilder.toString();
        //return s1 + s2 + s3;
    }

    public static void main(String[] args) {
        System.out.println(sum(35, 68));
    }
}

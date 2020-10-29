package com.xl.java.week8;

/**
 * @ClassName OverLoadTest
 * @Description TODO
 * @Author 1
 * @Date 2020/10/28
 **/

public class OverLoadTest {
    public static String sum(String s1, String s2, String s3) {
        return s1 + s2 + s3;
    }

    public static String sum(int a, int b) {
        int sec = 0, min = 0, hour = 0;
        sec = a + b;
        if (sec >= 60 && sec <= 3600) {
            min = sec / 60;
            sec = sec % 60;
        } else {
            hour = sec / 3600;
            min = (sec / 60) % 60;
            sec = sec % 60;
        }
        return hour + "时" + min + "分" + sec + "秒";
    }

    public static void main(String[] args) {
        System.out.println(sum(545, 3600));
        System.out.println(sum("a", "b", "c"));
    }
}


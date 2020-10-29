package com.xl.java.week8;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName FormatUtil
 * @Description TODO
 * @Author 1
 * @Date 2020/10/28
 **/

public class FormatUtil {
    public synchronized String format(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(date);
    }

    public synchronized String format(Date date, String pattern) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(date);
    }

    public synchronized String format(double number, String pattern) {
        return null;
    }
}


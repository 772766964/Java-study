package com.xl.java.week8;

import lombok.ToString;

import java.io.*;
import java.util.Arrays;
import java.util.UUID;

/**
 * @ClassName FileCopy
 * @Description TODO
 * @Author 1
 * @Date 2020/10/29
 **/
public class FileCopy {
    public static void main(String[] args) throws IOException {
        /*
        //1. 将源文件读入内存数组
        File file = new File("C:/Users/1/Pictures/0.jpg");
        InputStream is = new FileInputStream(file);
        byte[] b = new byte[(int) file.length()];
        int readResult = is.read(b);
        System.out.println(Arrays.toString(b));
        System.out.println(readResult);
        //2. 将内存数组中的值写到目标文件
        File file2 = new File("C:/Users/1/Pictures/" + UUID.randomUUID().toString() + ".jpg");
        OutputStream os = new FileOutputStream(file2);
        os.write(b);
        os.close();
        is.close();
        */


        //1、将源文件读入内存数组
        File inputFile = new File("C:/Users/1/Pictures/a.txt");
        InputStream file1 = new FileInputStream(inputFile);
        InputStreamReader is = new InputStreamReader(file1);
        char[] b = new char[(char) inputFile.length()];
        //read没有返回值
        int read = is.read(b);
        System.out.println(b);
        System.out.println(read);
        //2、将内存数组中的值写到目标文件
        File outputFile = new File("C:/Users/1/Pictures/" + UUID.randomUUID().toString() + ".txt");
        OutputStream file2 = new FileOutputStream(outputFile);
        OutputStreamWriter os = new OutputStreamWriter(file2);
        os.write(b);
        is.close();
        os.close();

    }
}

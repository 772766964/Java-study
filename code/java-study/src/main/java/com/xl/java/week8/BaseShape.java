package com.xl.java.week8;

/**
 * @ClassName Shape
 * @Description TODO
 * @Author 1
 * @Date 2020/10/29
 **/
public abstract class BaseShape {
    public BaseShape(){
        System.out.println("Shape");
    }

    /**
     * 输出
     * @return 0;
     */
    public abstract void basePrint();

    public void print(){
        System.out.println("print");
    }
}

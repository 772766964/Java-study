package com.xl.java.week8;

/**
 * @ClassName MainTest
 * @Description TODO
 * @Author 1
 * @Date 2020/10/28
 **/
public class MainTest {
    public static void main(String[] args) {

        Point point1 = new Point(5,6);
        Point point2 = new Point(2,2);
        System.out.println(point1.lengh(point2));

        CircleImpl circle = new CircleImpl(3,2,2);
        System.out.println(circle.isExist(point1));;
    }
}

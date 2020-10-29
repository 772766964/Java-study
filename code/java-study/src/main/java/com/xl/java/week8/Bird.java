package com.xl.java.week8;

/**
 * @ClassName Bird
 * @Description TODO
 * @Author zmy
 * @Date 2020/10/29
 **/
public class Bird implements Fly{

    @Override
    public void fly(String name, int speed) {
        System.out.println(Fly.NAME + "," + Fly.SPEED);
        System.out.println(name + "飞行 ， 时速 ： " + speed);
    }
}

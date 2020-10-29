package com.xl.java.week8;

import org.junit.Test;

import static org.junit.Assert.*;

public class FlyTest {

    Fly fly = new Bird();
    @Test
    public void fly() {
        fly.fly("大雁",60);
        fly = new Plane();
        System.out.println("%%%%%%%%%%");
        fly.fly("波音737",1000);
    }
}
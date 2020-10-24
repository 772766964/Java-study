package com.daily.Day5;

/**
 * @ClassName Circle
 * @Description TODO
 * @Author 1
 * @Date 2020/10/24
 **/
public class Circle extends BaseGraph {
    private final double r;

    public Circle(double r) {
        super();
        this.r = r;
    }

    @Override
    public double getCircumference() {
        return 2 * r * Math.PI;
    }
}


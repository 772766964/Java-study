package com.xl.java.week8;

/**
 * @ClassName Point
 * @Description TODO
 * @Author 1
 * @Date 2020/10/28
 **/
public class Point {
    int x,y;

    public Point(){
        this(0,0);
    }
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public double lengh(Point point){
        if( this.x - point.x == 0 && this.y - point.y != 0 ){
            return Math.abs(this.y - point.y );
        }
        if( this.y - point.y == 0 && this.x - point.x != 0 ){
            return Math.abs(this.x - point.x );
        }
        if( this.y - point.y == 0 && this.x - point.x == 0 ){
            return 0 ;
        }
        int newX = this.x - point.x;
        int newY = this.y - point.y;
        double a = Math.pow(newX,2);
        double b = Math.pow(newY,2);
        return Math.pow(a+b,0.5);
    }


}

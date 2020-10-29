package com.xl.java.week8;


/**
 * @ClassName CircleImpl
 * @Description TODO
 * @Author 1
 * @Date 2020/10/28
 **/
public class CircleImpl extends Point implements Circle {

    int r;

    public CircleImpl(){
        super();
    }
    public CircleImpl(int a, int b, int r) {
        super(a, b);
        this.r = r;
    }

    public boolean isExist(Point a){
        int x = this.x;
        int x1 = a.x;
        int y = this.y;
        int y1 = a.y;
        //当前点在圆内
        //当前点在圆外
        return (x - x1) * (x - x1) + (y - y1) * (y - y1) > r * r;
    }
    @Override
    public void zhouchang() {
        System.out.println("周长:" + Math.PI * 2 * r);
    }

    @Override
    public void mianji() {
        System.out.println("面积：" + Math.PI * Math.pow(r,2));
    }
}

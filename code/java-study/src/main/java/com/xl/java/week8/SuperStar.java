package com.xl.java.week8;

/**
 * @ClassName SuperStar
 * @Description TODO
 * @Author 1
 * @Date 2020/10/29
 **/
public class SuperStar
        implements Singable,Filmable,TVable {

    private String name;

    public SuperStar(String name){
        this.name = name;
    }
    public SuperStar(){
        this("阿三");
    }
    @Override
    public void actFilm() {
        System.out.println("film");
    }

    @Override
    public void sing() {
        System.out.println("sing");
    }

    @Override
    public void showTV() {
        System.out.println("Tv");
    }
}

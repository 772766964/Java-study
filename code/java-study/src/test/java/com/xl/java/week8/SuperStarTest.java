package com.xl.java.week8;

import lombok.var;
import org.junit.Test;

import static org.junit.Assert.*;

public class SuperStarTest {

    SuperStar superStar = new SuperStar();
    @Test
    public void actFilm() {
        superStar.actFilm();
    }

    @Test
    public void sing() {
        superStar.sing();
    }

    @Test
    public void showTV() {
        superStar.showTV();
    }
}
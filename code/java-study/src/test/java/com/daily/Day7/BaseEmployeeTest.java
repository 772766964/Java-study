package com.daily.Day7;

import org.junit.Test;

import static org.junit.Assert.*;

public class BaseEmployeeTest {

    @Test
    public void print() {
    }

    @Test
    public void getSalary() {
        BaseEmployee be = new MarketEmployee("admin");
        assertEquals(3000, be.getSalary());
    }
}
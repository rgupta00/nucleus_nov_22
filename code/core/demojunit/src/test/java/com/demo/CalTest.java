package com.demo;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
public class CalTest {
    private Cal cal;
    @Before
    public void setUp() throws Exception {
        cal=new Cal();
    }


    @Test
    public void add() {
        Assert.assertEquals(4, cal.add(2,82));
    }

    @After
    public void tearDown() throws Exception {
        cal=null;
    }

}
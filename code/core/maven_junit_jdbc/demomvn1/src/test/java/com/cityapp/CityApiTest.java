package com.cityapp;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CityApiTest {
    private CityApi cityApi;
    @Before
    public void setUp() throws Exception {
        cityApi=new CityApi();
    }

    @Test(timeout = 200)
    public void getCity() {
        Assert.assertNotNull(cityApi.getCity("banglore"));
    }

    @After
    public void tearDown() throws Exception {
        cityApi=null;
    }


}
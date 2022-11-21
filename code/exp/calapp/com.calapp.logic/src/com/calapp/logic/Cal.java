package com.calapp.logic;

import com.calapp.helper.CalHelper;

public class Cal {

    private CalHelper calHelper=new CalHelper();
    public int add(int a, int b){
        return calHelper.addHelper(a, b);
    }

}
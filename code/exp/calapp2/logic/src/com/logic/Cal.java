package com.logic;

import com.internal.CalHelper;

public class Cal {
    private CalHelper calHelper=new CalHelper();
    public int add(int a, int b){
        return calHelper.addHelper(a, b);
    }

}

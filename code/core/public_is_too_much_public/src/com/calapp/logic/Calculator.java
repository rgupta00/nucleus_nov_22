package com.calapp.logic;

import com.calapp.internal.CalculatorHelper;

public class Calculator {
    private CalculatorHelper calculatorHelper=new CalculatorHelper();
    public  int add(int a, int b){
        return  calculatorHelper.addHelper(a, b);
    }
}

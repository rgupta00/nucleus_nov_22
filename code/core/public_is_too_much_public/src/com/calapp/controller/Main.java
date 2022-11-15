package com.calapp.controller;

import com.calapp.internal.CalculatorHelper;
import com.calapp.logic.Calculator;

public class Main {
    public static void main(String[] args) {
        Calculator calculator=new Calculator();
        CalculatorHelper calculatorHelper=new CalculatorHelper();

        System.out.println(calculator.add(4,6));
        System.out.println(calculatorHelper.addHelper(4,6));
    }
}

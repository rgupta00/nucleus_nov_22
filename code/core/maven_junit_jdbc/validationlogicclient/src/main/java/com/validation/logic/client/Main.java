package com.validation.logic.client;

import com.validation.logic.EmployeeValidation;

public class Main {
    public static void main(String[] args) {


        boolean isValid= EmployeeValidation.isValidEmailId("rmail.com");

        System.out.println(isValid);
        System.out.println("Hello world!");
    }
}
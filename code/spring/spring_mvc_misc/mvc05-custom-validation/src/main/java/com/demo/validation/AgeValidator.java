package com.demo.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class AgeValidator implements ConstraintValidator<Age, Integer> {

    private int maxAge;
    private int minAge;
    public void initialize(Age age) {
        System.out.println("some post construct work...");
       minAge=age.minAge();
       maxAge=age.maxAge();
    }
    @Override
    public boolean isValid(Integer age, ConstraintValidatorContext context) {
        if(age==null)
            return false;
        if(age<minAge || age> maxAge)
            return false;
        else
        return true;
    }
}

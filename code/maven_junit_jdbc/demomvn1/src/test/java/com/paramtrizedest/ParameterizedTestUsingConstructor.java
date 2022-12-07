package com.paramtrizedest;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
@RunWith(Parameterized.class)
public class ParameterizedTestUsingConstructor {

    private int m1;
    private int m2;
    private int result;
    public ParameterizedTestUsingConstructor(int p1, int p2, int result) {
        m1 = p1;
        m2 = p2;
        this.result=result;
    }
    // creates the test data
    @Parameters
    public static Collection<Object[]> data() {
        System.out.println("----------");
        Object[][] data = new Object[][] { { 1 , 2 ,2}, { 5, 5,25 }, { 11, 4,44 } };
        return Arrays.asList(data);
    }

    @Test
    public void testMultiplyException() {
        MyClass tester = new MyClass();
        assertEquals("Result", result, tester.multiply(m1, m2));
    }

    // class to be tested
    class MyClass {
        public int multiply(int i, int j) {
            return i *j;
        }
    }

}
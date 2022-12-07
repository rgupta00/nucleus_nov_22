package com.calapp;

import org.junit.*;

import static org.junit.Assert.*;

public class CalculatorTest {

    private  Calculator calculator;

    @Before
    public void setUp(){
        calculator=new Calculator();
    }

    @Test
    public void divideTestPositive() {
        Assert.assertEquals(4, calculator.divide(8,2));
    }

    @Test(expected = ArithmeticException.class)
    public void divideTestThrowsException() {
        Assert.assertEquals(4, calculator.divide(8,0));
    }

    @Test
    public void addTest() {
        Assert.assertEquals(4, calculator.add(3,1));
    }

    @Test
    public void mulTest() {
        Assert.assertEquals(40, calculator.mul(20,2));
    }

    @After
    public void tearDown(){
        calculator=null;//way to tell u to close the resorce here
    }


}
//package com.calapp;
//
//        import org.junit.*;
//
//        import static org.junit.Assert.*;
//
//public class CalculatorTest {
//
//    private  Calculator calculator;
//
//
//    @BeforeClass
//    public static void beforeAll(){
//        System.out.println("---beforeAll---");
//    }
//
//
//    @Before
//    public void setUp(){
//        System.out.println("---before---");
//        calculator=new Calculator();
//    }
//
//    @Test
//    public void addTest() {
//        System.out.println("---add test---");
//        Assert.assertEquals(4, calculator.add(3,1));
//    }
//
//    @Test
//    public void mulTest() {
//        System.out.println("---mul test---");
//        Assert.assertEquals(40, calculator.mul(20,2));
//    }
//
//    @After
//    public void tearDown(){
//        System.out.println("---after---");
//        calculator=null;//way to tell u to close the resorce here
//    }
//
//    @AfterClass
//    public static void afterAll(){
//        System.out.println("---afterAll---");
//    }
//
//
//}
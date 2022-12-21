package com.common;

import com.calapp.CalculatorTest;
import com.cityapp.CityApiTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        CalculatorTest.class,
        CityApiTest .class })
public class TestSuit {
}

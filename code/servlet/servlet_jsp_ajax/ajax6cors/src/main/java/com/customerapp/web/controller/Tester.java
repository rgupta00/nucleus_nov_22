package com.customerapp.web.controller;
import com.customerapp.dao.country.Country;
import com.customerapp.dao.country.CountryDao;
import com.customerapp.dao.country.CountryDaoImpl;
import com.customerapp.dao.country.State;

import  java.util.*;
public class Tester {
    public static void main(String[] args) {

        CountryDao countryDao=new CountryDaoImpl();
//        List<Country> countries=countryDao.getAllCounties();
//        countries.forEach(c-> System.out.println(c));

        List<State> states=countryDao.getStateByCountryId(2);
        states.forEach(s-> System.out.println(s));
    }
}

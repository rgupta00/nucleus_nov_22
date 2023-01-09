package com.demo;

import org.springframework.format.Formatter;

import java.text.ParseException;
import java.util.Locale;

public class PhoneFormatter implements Formatter<Phone> {
    @Override
    public Phone parse(String phoneNumberString, Locale locale) throws ParseException {
        System.out.println("--------converting phone string as phone object----");
        Phone phone=new Phone();
        String []tokens=phoneNumberString.split("-");
        int index=phoneNumberString.indexOf("-");
        if(index==-1){
            phone.setCountryCode("91");
            phone.setPhoneNumber(tokens[0]);
        }else {
            phone.setCountryCode(tokens[0]);
            phone.setPhoneNumber(tokens[1]);
        }
        return phone;
    }
    @Override
    public String print(Phone phone, Locale locale) {
      return  phone.getCountryCode()+"-"+phone.getPhoneNumber();
    }
}

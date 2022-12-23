package com.bankapp.service;

import org.springframework.stereotype.Service;

//  <bean id="smsservice" class="com.bankapp.service.SmsServiceImpl"/>
@Service(value = "smsservice")//smsServiceImpl
public class SmsServiceImpl implements SmsService{

    @Override
    public void sendSms(String mobileNumber) {
        System.out.println("sms is send...");
    }
}

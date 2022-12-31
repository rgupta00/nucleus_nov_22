package com.core.topic1.dip.right;
class SmsService{
    public void sendSms(){
        System.out.println("send sms");
    }
}
class EmailService{
    public void sendEmail(){
        System.out.println("send email");
    }
}
class BankTransaction{
    private EmailService emailService=new EmailService();

    public void doTransaction(){
        emailService.sendEmail();
    }
}
public class DemoDIp {
    public static void main(String[] args) {

    }
}

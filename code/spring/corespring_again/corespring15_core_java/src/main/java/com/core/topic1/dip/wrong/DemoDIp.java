package com.core.topic1.dip.wrong;
interface MessageService{
    public void sendMessage();
}
class SmsService implements MessageService{
    public void sendMessage(){
        System.out.println("send sms");
    }
}
class EmailService implements MessageService{
    public void sendMessage(){
        System.out.println("send email");
    }
}
class BankTransaction{
    private MessageService messageService=new EmailService();

    public void doTransaction(){
        messageService.sendMessage();
    }
}
public class DemoDIp {
    public static void main(String[] args) {

    }
}

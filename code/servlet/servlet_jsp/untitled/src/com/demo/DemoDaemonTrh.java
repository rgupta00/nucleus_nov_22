package com.demo;

class MyJob implements Runnable{

    @Override
    public void run() {
        System.out.println("run start...");
        try{
            Thread.sleep(10000);
        }catch (InterruptedException e){}
        System.out.println("run end...");
    }
}
public class DemoDaemonTrh {
    public static void main(String[] args) {
        System.out.println("start");
        MyJob myJob=new MyJob();
        Thread thread=new Thread(myJob);
        thread.setDaemon(true);
        thread.start();

        System.out.println("end");
    }
}

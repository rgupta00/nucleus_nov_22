package com.demo;
class MyJob implements Runnable{

    @Override
    public void run() {
        try{
            Thread.sleep(2000);
            System.out.println("Finished");
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }
    }
}
public class DemoTh {
    public static void main(String[] args) {
        Thread thread=new Thread(new MyJob());
        thread.setDaemon(true);
        thread.start();

        System.out.println("End");
    }
}

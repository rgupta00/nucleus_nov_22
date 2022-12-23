package com.demo;

public class Main {
    public static void main(String[] args) {
        //Pull vs push
        //rather then passanger is looking for vehical , vehical should be pushed to the passanger
        //HLM                       LLM
        //Passanger ---------------- Vehical: Car , Metro
        Vehical vehical=new Metro();
       Passanger passanger=new Passanger();
       passanger.setName("raj");
        passanger.setVehical(vehical);

       passanger.setVehical(vehical);

       passanger.travel();
    }
}
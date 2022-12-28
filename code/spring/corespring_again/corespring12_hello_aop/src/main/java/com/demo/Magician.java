package com.demo;

import org.springframework.stereotype.Component;

@Component(value = "m")
final  public class Magician {

    public void doMagic(){
        System.out.println("abra ka dabra...");
    }
}

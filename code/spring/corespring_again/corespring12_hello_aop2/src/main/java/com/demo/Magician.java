package com.demo;

import org.springframework.stereotype.Component;

@Component(value = "m")
public class Magician {

    public String doMagic(){
        System.out.println("abra ka dabra...");
        return "rabbit from the hat";
    }
}

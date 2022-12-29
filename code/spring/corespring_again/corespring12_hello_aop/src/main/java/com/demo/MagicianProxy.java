package com.demo;

public class MagicianProxy extends Magician{

    private Audience audience=new Audience();

    public void doMagic(){
        super.doMagic();
        audience.clapping();
    }
}

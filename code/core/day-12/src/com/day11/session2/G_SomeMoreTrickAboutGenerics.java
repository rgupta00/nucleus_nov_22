package com.day11.session2;
import java.time.Period;
import  java.util.*;
//gerncis can help u to imp ur business containers
interface Drinkable{
}
interface Floable{
}
class Cake{ }
class Water implements Drinkable, Floable{ }
class Juice implements Drinkable, Floable{ }
class Petrol implements Floable{
}

class Glass<T extends Floable & Drinkable>{
    private T liquid;

    public T getLiquid() {
        return liquid;
    }
    public void setLiquid(T liquid) {
        this.liquid = liquid;
    }
}

public class G_SomeMoreTrickAboutGenerics {
    public static void main(String[] args) {
//        Glass<Juice> glass=new Glass<>();
//       glass.setLiquid(new Juice());

//        Glass<Water> glass=new Glass<>();
//        glass.setLiquid(new Water());

//        Glass<Petrol> glass=new Glass<>();
//        glass.setLiquid(new Petrol());

//        Glass<Cake> glass=new Glass<>();
//        glass.setLiquid(new Cake());

    }
}




//class Glass{
//    private Object liquid;
//
//    public Object getLiquid() {
//        return liquid;
//    }
//    public void setLiquid(Object liquid) {
//        this.liquid = liquid;
//    }
//}
package com.day5.session2;
class Milk{
}


class PMilk extends Milk{
}
class KD{
    public  Milk sellMilk(){
        return  new Milk();
    }
}
class   ImprovedKD extends KD{

    public  PMilk sellMilk(){
        return  new PMilk();
    }
}
public class D_CovarientRetrunType {
    public static void main(String[] args) {

    }
}

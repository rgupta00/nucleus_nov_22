package com.day1.session2.ex3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import static java.util.stream.Collectors.*;

//SOLID :O: OCP
public class AppleApp {
    public static List<Apple> getAllApplesOnPredicate(List<Apple> apples,
                                               Predicate<Apple> applePredicate){
        return apples.stream().filter(applePredicate).collect(toList());
    }


//    public List<Apple> getAllGreenApples(List<Apple> apples){
//        List<Apple> tempApples=new ArrayList<>();
//        for (Apple temp: apples){
//            if(temp.getColor().equals("green"))
//                tempApples.add(temp);
//        }
//        return tempApples;
//    }

//    public List<Apple> getAllHeavyApples(List<Apple> apples){
//        List<Apple> tempApples=new ArrayList<>();
//        for (Apple temp: apples){
//            if(temp.getWeight()>=300)
//                tempApples.add(temp);
//        }
//        return tempApples;
//    }
}

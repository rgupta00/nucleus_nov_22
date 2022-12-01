package com.day1.session2.ex3;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

import javax.swing.text.html.parser.Entity;

import com.day1.session1.ex2.Book;

public class AppleTester {

		
		public static void main(String[] args) {

		List<Apple> apples = Arrays.asList(
				new Apple("red", 400),
				new Apple("green", 450),
				new Apple("green", 300),
				new Apple("green", 200),
				new Apple("red", 250));


//		Predicate<Apple> greenApplePredicate=a-> a.getColor().equals("green");
//
	Predicate<Apple> greenApplePredicate=Apple::isGeenApple;

		List<Apple> geenAppleList=
				AppleApp.getAllApplesOnPredicate(apples, greenApplePredicate);
			geenAppleList.forEach(a-> System.out.println(a));

			//Predicate<Apple> heavyApplePredicate=a-> a.getWeight()>=350;

			Predicate<Apple> heavyApplePredicate=Apple::isHeavyApple;


			System.out.println("------all heavy apples-------");
			List<Apple> heavyAppleList=
					AppleApp.getAllApplesOnPredicate(apples, heavyApplePredicate);
			heavyAppleList.forEach(a-> System.out.println(a));

			//i want all heavy and green apples
			System.out.println("i want all heavy and green apples");
			Predicate<Apple> allHeavayAndGreenApplePredicate=
					heavyApplePredicate.and(greenApplePredicate);

			List<Apple>allHeavayAndGreenAppleList
					=AppleApp.getAllApplesOnPredicate(apples,
					allHeavayAndGreenApplePredicate);

			allHeavayAndGreenAppleList.forEach(a-> System.out.println(a));

		//Most imp functional interface in java 8
		
		//Predicate	


		//Function


		
		//Consumer
		
		//biConsumer
		Map<String, Integer>map=new HashMap<String, Integer>();
		
		//Supplier
	
		
		//BiFunction
	
		
		
		
	}
}


















package com.day1.session2.ex4;
import static java.util.stream.Collectors.toList;

import java.nio.MappedByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.day1.session2.ex4.Dish.Type;

public class DishTesterExample2Sol {
	
	
	
	public static void main(String[] args) {
		
		List<Dish> allDishes=getAllDishes();
		
		
		//Example: return the names of dishes that are low in calories (<400), 
		//sorted by number of calories
		
		
		List<String> names=allDishes.stream()
				.parallel()
				.filter(d-> d.getCalories()<400)
				.sorted(Comparator.comparing(Dish::getCalories))
				.map(d-> d.getName())
				.collect(toList());
		
		
		//Getting all veg dishes
		List<Dish> allVeg=allDishes
				.stream()
				.filter(d-> d.isVegetarian())
				.collect(toList());
		
		//Filtering unique elements in a stream: get all unique even nos
		List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 3, 2, 4);
		
		List<Integer> uniqueNos=numbers
				.stream()
				.filter(i->i%2==0)
				.distinct()
				.collect(toList());
		
		
		//Get list of All Dishes only containing name and calValue
		
		Function<Dish, DishSelectedField> selectedFields= d-> new DishSelectedField(d.getName(), d.getCalories());
		
		List<DishSelectedField> allSelectedFeild
		=allDishes.stream()
		.map(selectedFields)
		.collect(toList());
		
		//Ex: create a List by selecting the first three dishes
		//that have more than 300 calories as follows:
				
		List<Dish> allDishWithMoreThen300CalFirstThree=
				allDishes.stream()
				.filter(d-> d.getCalories()>300)
				.limit(3)
				.collect(toList());
		
		
		
		/*
		 * allMatch, anyMatch,noneMatch, findFirst, findAny
		 */
		
		//find out whether the menu has a vegetarian option: anyMatch
		
		boolean isVeg=allDishes.stream()
				.anyMatch(Dish::isVegetarian);
		
		//find out whether the menu ishealthy :allMatch
		//(ie. all dishes are below 1000 calories):
		
		
		boolean isAllhealthy=allDishes.stream()
				.allMatch(d-> d.getCalories()<1000);
		
		//noneMatc:	opposite of allMatch
		boolean isHealthy = allDishes.stream().noneMatch(d -> d.getCalories() >= 1000);
		
		//find if any food item is veg? findAny
		
		Optional<Dish> findAny = allDishes.stream()
		.filter(d-> d.isVegetarian())
		.findAny();
		
		System.out.println(findAny.map(Dish::getName).orElse("not found"));
	
		//Primitive stream specializations
		
		//IntStream,DoubleStream, and LongStream==> avoide boxing cost
		
		//get all the cal values of all food items
		
		int totalCal=allDishes.stream()
				.map(d-> d.getCalories())
				.reduce(0,Integer::sum);
		
		//using primitive stream
		
		int totalCal2=allDishes.stream()
				.mapToInt(d-> d.getCalories())
				.sum();
		
		//find max cal values for all dishes
		
		OptionalInt val=allDishes.stream()
				.mapToInt(d-> d.getCalories())
				.max();
		
		System.out.println(val.orElse(-1));
		
		
		
		/*
		 * What type of quaries Collect helps:
		-------------------------------------
			1. Dishes grouped by type
			2. Dishes grouped by caloric level
			3. Dishes grouped by type and then caloric level
			4. Count dishes in each groups
			5. Most caloric dishes by type
			6. Sum calories by type
		 */
		
		//Dishes grouped by type
		Map<Type, List<Dish>> collect = allDishes.stream()
		.collect(Collectors.groupingBy( d-> d.getType()));
		
		
		//Dishes grouped by caloric level
		allDishes.stream().collect(Collectors.groupingBy(DishTesterExample2Sol::getCalLevel));
		
		
		
		
		
		// Most caloric dishes by type
		// ie i want to find out most caloric dish (if any ) in each dish type

		

		Map<Integer, List<Dish>> collect2 = allDishes.stream()
				.collect(Collectors.groupingBy(Dish::getCalories));
		
		
		/*Map<Integer, Optional<Dish>> collect3 = allDishes.stream()
				.collect(Collectors.groupingBy(Dish::getCalories,
						Collectors.reducing((Dish t, Dish u) -> t.getCalories() > u.getCalories() ? t: u)));*/
	}


















	private static CaloricLevel getCalLevel(Dish dish) {
		if (dish.getCalories() <= 400) return CaloricLevel.DIET;
		else if (dish.getCalories() <= 700) return CaloricLevel.NORMAL;
		else return CaloricLevel.FAT;
	}

	private static List<Dish> getAllDishes() {
		List<Dish> disheds = Arrays.asList(
				new Dish("pork", false, 800, Dish.Type.MEAT),
				new Dish("beef", false, 700, Dish.Type.MEAT),
				new Dish("chicken", false, 400, Dish.Type.MEAT),
				new Dish("french fries", true, 530, Dish.Type.OTHER),
				new Dish("rice", true, 350, Dish.Type.OTHER),
				new Dish("season fruit", true, 120, Dish.Type.OTHER),
				new Dish("pizza", true, 550, Dish.Type.OTHER),
				new Dish("prawns", false, 300, Dish.Type.FISH),
				new Dish("salmon", false, 450, Dish.Type.FISH) );
		return disheds;
	}







	
	
	
	
	
	
	
	
	


}

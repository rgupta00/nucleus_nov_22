package com.day1.session1.ex2;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class DemoLambdaExpession2 {

	
	public static void main(String[] args) {
		
		List<Book> books=Arrays.asList
				(new Book(121, "java", "raj", 400),
						new Book(11, "python", "ekta", 840),
						new Book(11, "python", "ekta", 840),
						new Book(621, "c programming", "gunika", 300));
		//print all the books
//		for(Book book: books){
//			System.out.println(book);
//		}

		////print all the books
		//books.stream().forEach(b-> System.out.println(b));

//		Predicate<Book> javaBookPredicate=b->b.getTitle().equals("java");
//
//		books.stream()
//				.filter(costlyBookPredicate.or(javaBookPredicate))
//				.forEach(b-> System.out.println(b));

//		books.stream()
//				.filter(b->b.getPrice()>=500)
//				.forEach(b-> System.out.println(b));



		//We want only book name whose price is
		// //more then 500 and sorted as per price

//		books.stream()
//				.filter(b-> b.getPrice()>=350)
//				.sorted(( o1,  o2)-> Double.compare(o2.getPrice(), o1.getPrice()))
//				.forEach(b-> System.out.println(b));

		//What is method ref: syntex suger on lamaba
		Predicate<Book> costlyBookPredicate=b->b.getPrice()>=350;
		/*
		1
		2
		3
		4
		5
		 */
		Set<Book> bookList= books.stream()
				//.filter(Book::isCostlyBook)
				.filter(costlyBookPredicate)
				.sorted(Comparator.comparing(Book::getPrice).reversed())
//				.skip(1)
//				.limit(2)
				.collect(Collectors.toSet());

		bookList.forEach(b-> System.out.println(b));



	}
}

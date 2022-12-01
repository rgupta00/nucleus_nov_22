package com.day1.session2.ex5;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class CopyOfDemoBookCaseStudyProblem {

	public static void main(String[] args) {

		List<Book> allBooks = loadAllBooks();

		System.out.println("------printing all books------");
		//allBooks.forEach(b-> System.out.println(b));


		// 1. Find books with more then 400 pages
		//Lazy evulation (calucation)*
//	  List<Book> books=	allBooks.stream()
//				 .filter(b->{
//					 System.out.println("hello");
//					 return b.getPages()>=400;
//				 }).collect(Collectors.toList());
//
//	  books.forEach(b-> System.out.println(b));
//		System.out.println("---------------");

		// 2. Find all books that are java books and more then 400 pages
//		Predicate<Book> p1=b-> b.getPages()>=400;
//		Predicate<Book>p2=b-> b.getTitle().contains("java");
//		List<Book> books=	allBooks.stream()
//				.filter(p1.and(p2)).collect(Collectors.toList());
//
//		books.forEach(b-> System.out.println(b));
//		System.out.println("---------------");



		// 3. We need the top three longest books

//		List<Book> books=	allBooks.stream()
//						.sorted(Comparator.comparing(Book::getPages).reversed())
//								.limit(3)
//										.collect(Collectors.toList());
//		books.forEach(b-> System.out.println(b));
//		System.out.println("---------------");
	
		// 4. We need from the fourth to the last longest books
//		List<Book> books=	allBooks.stream()
//				.sorted(Comparator.comparing(Book::getPages).reversed())
//				.skip(3)
//				.collect(Collectors.toList());
//		books.forEach(b-> System.out.println(b));
//		System.out.println("---------------");
//
		// 5. We need to get all the publishing years

//		List<Integer> years=
//				allBooks.stream()
//						.map(Book::getYear)
//						.distinct()
//						.collect(Collectors.toList());
//
//		years.forEach(y-> System.out.println(y));
//		System.out.println("---------------");


		// 6. We need all the authors names who have written a book		

//			Stream<Stream<Author>> bookSteam=	allBooks
//					.stream()
//					.map(b->b.getAuthors().stream());

		Stream<Author> bookSteam=	allBooks
				.stream()
				.flatMap(b->b.getAuthors().stream());


//		List<String>authorNamees=	allBooks
//				.stream()
//				.flatMap(b->b.getAuthors().stream())
//				.map(a->a.getName())
//				.distinct()
//				.collect(Collectors.toList());


		//raj, ekta, guru
//		String authorNameesString=	allBooks
//				.stream()
//				.flatMap(b->b.getAuthors().stream())
//				.map(a->a.getName())
//				.distinct()
//				.collect(Collectors.joining(", "));
//		System.out.println(authorNameesString);

		// We need all the origin countries of the authors
//				String authorCourntyString=	allBooks
//				.stream()
//				.flatMap(b->b.getAuthors().stream())
//				.map(a->a.getCountry())
//				.distinct()
//				.collect(Collectors.joining(", "));
//		System.out.println(authorCourntyString);

		// We want the most recent published book.

		//primitive stream*
		Optional<Book> optionalBook=  allBooks.stream()
				.max(Comparator.comparingInt(Book::getYear));

		String bookName=optionalBook
				.map(b-> b.getTitle()).orElse("book is not foudn");
		System.out.println(bookName);

		// We want to know if all the books are written by more than one author
	
		// We want one of the books written by more than one author. (findAny)
		
		// We want the total number of pages published.

	
		// We want to know how many pages the longest book has.

	
		// We want the average number of pages of the books
	
		// We want all the titles of the books

	
		// We want the book with the higher number of authors?

	
		// We want a Map of book per year.

		

		// We want to count how many books are published per year.

	

	}

	private static List<Book> loadAllBooks() {
		List<Book> books = new ArrayList<Book>();
		List<Author> authors1 = Arrays.asList(new Author("raj", "gupta", "in"),
				new Author("ekta", "gupta", "in"));

		List<Author> authors2 = Arrays.asList(new Author("raj", "gupta", "in"));

		List<Author> authors3 = Arrays.asList(new Author("gunika", "gupta", "us"),
				new Author("keshav", "gupta", "us"));

		books.add(new Book("java", authors1, 400, Subject.JAVA, 2007, "1213"));
		books.add(new Book("python", authors2, 479, Subject.JAVA, 2007, "1218"));
		books.add(new Book("C# basics", authors3, 600, Subject.DOT_NET, 2000, "1293"));

		return books;
	}

}

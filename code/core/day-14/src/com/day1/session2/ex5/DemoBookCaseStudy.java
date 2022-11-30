package com.day1.session2.ex5;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class DemoBookCaseStudy {

	public static void main(String[] args) {

		List<Book> allBooks = loadAllBooks();

		// 1. Find books with more then 400 pages
		List<Book> ibooksWithMoreThen400pages = allBooks.stream()
				.filter(b -> b.getPages() > 400).collect(Collectors.toList());

		// 2. Find all books that are java books and more then 400 pages

		Predicate<Book> lengthyBooks=b -> b.getPages() > 400;
		Predicate<Book> javaBooks=b -> b.getSubject() == Subject.JAVA;
		
		List<Book> books = allBooks.stream()
				.filter(lengthyBooks.or(javaBooks)).collect(Collectors.toList());

		// 3. We need the top three longest books
		List<Book> top3Longest = allBooks.stream()
				.sorted(Comparator.comparing(Book::getPages)).limit(3)
				.collect(Collectors.toList());

		// 4. We need from the fourth to the last longest books

		// 5. We need to get all the publishing year
		List<Integer> allPubYear = allBooks.stream().map(b -> b.getYear())
				.distinct().collect(Collectors.toList());

		// 6. We need all the authors who have written a book
		
		 allBooks.stream()
				.flatMap(b-> b.getAuthors().stream()).map(a->a.getName()).distinct().count();
		
/*
		List<Author> allAuthorsWrittenBook = allBooks.stream()
				.flatMap(b -> b.getAuthors().stream()).distinct()
				.collect(Collectors.toList());*/

		// We need all the origin countries of the authors

		List<String> allCountiesWhereAuthorBelongs = allBooks.stream()
				.flatMap(b -> b.getAuthors().stream()).map(a -> a.getCountry())
				.distinct().collect(Collectors.toList());

		// We want the most recent published book.
		Optional<Book> min = allBooks.stream().min(Comparator.comparing(Book::getYear));

		// We want to know if all the books are written by more than one author
		boolean isAllBooksWrittenBy2Author = books.stream().allMatch(
				b -> b.getAuthors().size() > 1);



		// We want one of the books written by more than one author.

		Optional<Book> multiAuthorBook = books.stream()
				.filter(b -> b.getAuthors().size() > 1).findAny();

		// We want the total number of pages published.

		Integer totalPubPages = books.stream().map(b -> b.getPages())
				.reduce(0, (a, b) -> a + b);

		// We want to know how many pages the longest book has.

		Optional<Integer> longestBook = books.stream().map(b -> b.getPages())
				.reduce(Integer::max);

		// We want the average number of pages of the books
		Double avgPages = books.stream().collect(
				Collectors.averagingDouble(Book::getPages));

		// We want all the titles of the books

		String title = books.stream().map(b -> b.getTitle())
				.collect(Collectors.joining(" "));

		// We want the book with the higher number of authors?

		Optional<Book> bookWrittenByHighestAuthors = books.stream().
				collect(Collectors.maxBy(Comparator
						.comparing((Book b )-> b.getAuthors().size())));

		// We want a Map of book per year.

		Map<Integer, List<Book>> yearBooks = books.stream().collect(
				Collectors.groupingBy(Book::getYear));

		

		// We want to count how many books are published per year.

		Map<Integer, Long> yearBooks1 = books.stream().collect(
				Collectors.groupingBy(Book::getYear, Collectors.counting()));

	}

	private static List<Book> loadAllBooks() {
		List<Book> books = new ArrayList<Book>();
		List<Author> authors1 = Arrays.asList(new Author("raj", "gupta", "in"),
				new Author("ekta", "gupta", "in"));

		List<Author> authors2 = Arrays.asList(new Author("raj", "gupta", "in"));

		List<Author> authors3 = Arrays.asList(new Author("foo", "fee", "us"),
				new Author("bar", "bee", "us"));

		books.add(new Book("java", authors1, 400, Subject.JAVA, 2000, "1213"));
		books.add(new Book("python", authors2, 479, Subject.JAVA, 2007, "1218"));
		books.add(new Book("Mgt", authors3, 600, Subject.DOT_NET, 2000, "1293"));

		return books;
	}

}

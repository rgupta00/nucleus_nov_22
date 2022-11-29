package com.demo.session2.ex5;

import java.util.Arrays;
import java.util.Optional;

class StringConcatenator {
	public static String result = "";

	public static void concatStr(String str) {
		result = result + " " + str;
	}
}
public class DemoParellelDataProcessing {
	
	public static void main(String[] args) {
		/*String words[] = "the quick brown fox jumps over the lazy dog".split(" ");
		Arrays.stream(words).parallel().forEach(StringConcatenator::concatStr);
		System.out.println(StringConcatenator.result);*/
		
		String words[] = "the quick brown fox jumps over the lazy dog".split(" ");

		Optional<String> originalString =(Arrays.stream(words).parallel().
				reduce((a, b) -> a + " " + b));

		System.out.println(originalString.get());
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

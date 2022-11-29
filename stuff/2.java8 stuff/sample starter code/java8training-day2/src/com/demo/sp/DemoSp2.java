package com.demo.sp;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
public class DemoSp2 {
	
	public static void main(String[] args) {
		List<String> list=Arrays.asList("one", "two","three","four","five","six"
				,"seven","eight","nine","ten","eleven","twelve");
		
		//list.stream().forEach(l->System.out.println(l));
	
	/*	Spliterator<String> sp=list.stream().spliterator();
		
		Stream<String> stream=StreamSupport.stream(sp, true);
		stream.forEach(System.out::println);*/
		
		
		
		
		Spliterator<String> sp=list.stream().spliterator();
		NoOpSpliterator noOpSpliterator=new NoOpSpliterator(sp);
		 
		Predicate<String> predicate=s->s.length()>3;
		FilteringOpSpliterator filteringOpSpliterator=new 
				FilteringOpSpliterator(noOpSpliterator,predicate);
		
		Stream<String> stream=StreamSupport.stream(filteringOpSpliterator, true);
		stream.forEach(System.out::println);
		
		
		
		
	}

}

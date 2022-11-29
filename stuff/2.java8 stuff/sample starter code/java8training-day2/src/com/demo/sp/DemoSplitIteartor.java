package com.demo.sp;
import java.util.*;
public class DemoSplitIteartor {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		list.add(2);
		list.add(4);
		list.add(6);
		list.add(-7);
		list.add(90);
		
		Spliterator<Integer> sp=list.spliterator();
		Spliterator<Integer> sp2=sp.trySplit();
		
		while(sp.tryAdvance(System.out::println));
		System.out.println("----------");
		while(sp2.tryAdvance(System.out::println));
		
		System.out.println(sp.characteristics());
		
	}
}

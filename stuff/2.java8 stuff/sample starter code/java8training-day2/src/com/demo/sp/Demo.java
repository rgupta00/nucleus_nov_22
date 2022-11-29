package com.demo.sp;
import java.util.*;
class FooComp implements Comparator<Foo>{

	@Override
	public int compare(Foo o1, Foo o2) {
		return Integer.compare(o2.getI(), o1.getI());
	}
	
}
class Foo implements Comparable<Foo>{
	private int i;

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public Foo(int i) {
		this.i = i;
	}

	public Foo() {}

	@Override
	public int compareTo(Foo o) {
		return Integer.compare(this.getI(), o.getI());
	}

	@Override
	public String toString() {
		return "Foo [i=" + i + "]";
	}
	
	
	
}
public class Demo {

	public static void main(String[] args) {
		
		TreeSet<Foo> foos=new TreeSet<Foo>(new FooComp());
		foos.add(new Foo(21));
		foos.add(new Foo(1));
		foos.add(new Foo(201));
		foos.add(new Foo(210));
		
		Spliterator<Foo> it=foos.spliterator();

		
		
		
		
	}
}

package com.day1.session1.ex1;
//interface Foo{
//	public void foo();
//	//1
//	public default void bar(){
//		System.out.println("default method bar of Foo inteface");
//	}
//	//2
//	public static void fooStatic(){
//		System.out.println("i am static fooStatic method inside foo");
//	}
//	//3
//	private void fooPrivate(){
//		//act as a helper method for default method
//		System.out.println("i am private method insise inteface java 9 ?");
//	}
//}
//
//interface Foo{
//	public void foo();
//	//1
//	public default void bar(){
//		System.out.println("default method bar of Foo inteface");
//	}
//}
//class FooImpl implements Foo{
//	@Override
//	public void foo() {
//		System.out.println("foo overrend by FooImpl");
//	}
//	public void bar(){
//		System.out.println("default method bar of Foo inteface is overrien");
//	}
//}


//interface Foo1{
//	public static void bar(){
//		System.out.println("static method bar");
//	}
//}
//interface Foo2 extends Foo1{
//	public static void bar2(){
//		System.out.println("static method bar 2");
//	}
//}


interface Foo1{
	public static void fooStatic(){
		commonCodeForLine1();
	}
	public default void  function1(){
		commonCodeForLine1();
		// code line specific to function1
		commonCodeForLine2();

	}

	public  default void function2(){
		commonCodeForLine1();
		// code line specific to function2
		commonCodeForLine2();

	}
	private static void commonCodeForLine1(){
		//code line no 1
	}

	private  void commonCodeForLine2(){
		//code line no 2
	}

	//we can define a private method inside the interface that can act
	//as a assistent of default method

}
class FooImp implements Foo1{

}

public class A_DemoFuncationalInterface {
	public static void main(String[] args) {
		Foo1 f=new FooImp();
		f.function1();
		f.function2();

		//What is functional interface?
		
		/*
		 * What is functional interface?
		 * @FunctionalInterface
		 * Interface and diamond problem and solution
		 * Interface evolution: default method , static method examples
		 */
	}
}

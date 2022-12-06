package com.b.singleton_pattern;

import java.io.*;
import java.lang.reflect.Constructor;

//
class MySingleton implements Serializable , Cloneable {
//	private static MySingleton mySingleton=new MySingleton();
     private volatile static MySingleton mySingleton;
	private MySingleton(){
		if (mySingleton!=null)
			throw new IllegalArgumentException("you already have a object of if");
	}
	//t1 t2
	public  static MySingleton getMySingleton(){
		if(mySingleton==null){
			synchronized(MySingleton.class) {
					if(mySingleton==null){
						mySingleton = new MySingleton();
					}
			}
		}
		return  mySingleton;
	}
	//JVM will look for this method during de-ser, if this method is found jvm will not do de-ser and retrun the onject from this method
	private  Object readResolve(){
		System.out.println("---");
		return mySingleton;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("clone is not supped");
		//return mySingleton;
	}
}

public class F_Exp_With_Sigleton_Pattern {
	public static void main(String[] args) throws  Exception{

		MySingleton mySingleton1 = MySingleton.getMySingleton();




		//4.static holder pattern, how it is thread safe
		//https://stackoverflow.com/questions/15019306/regarding-static-holder-singleton-pattern


		//3. singleton is broken due to java refe
//		Class<?> clazz=Class.forName("com.b.singleton_pattern.MySingleton");
//		Constructor[]constructors=clazz.getDeclaredConstructors();
//		constructors[0].setAccessible(true);
//
//		MySingleton mySingleton2= (MySingleton) constructors[0].newInstance();
//		System.out.println(mySingleton1==mySingleton2);

		//2. clonning

//		MySingleton mySingleton2= (MySingleton) mySingleton1.clone();
//		System.out.println(mySingleton1==mySingleton2);


		//1. singleton is broken due ser
//		ObjectOutputStream oos =new ObjectOutputStream(new FileOutputStream("demo.ser"));
//		oos.writeObject(mySingleton);
//
//		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("demo.ser"));
//
//		MySingleton mySingleton2 = (MySingleton) ois.readObject();
//
//		System.out.println(mySingleton==mySingleton2);

		//singleton is broken due to clonning

		//singleton is broken due to java refe

		//singleton is broken due mutiple class loading

		//to simp singlet best way is to enum

		//singleton is broken due to multithreaing
	}
}

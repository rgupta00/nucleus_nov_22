package com.day15.session1.io.ser.ex2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Rat implements Serializable {
}

class Cat implements Serializable {
}

class Dog implements Serializable {
}

public class A_SerilizationDeSerOrderMustBeMaintained {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		//
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("foo.ser"));
		//now we want to save rat , cat then Dog
		Rat rat=new Rat();
		Cat cat=new  Cat();
		Dog dog=new Dog();
		
		oos.writeObject(rat);
		oos.writeObject(cat);
		oos.writeObject(dog);
		
		System.out.println("done");
	}
}

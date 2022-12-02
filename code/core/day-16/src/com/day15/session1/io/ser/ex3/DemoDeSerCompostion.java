package com.day15.session1.io.ser.ex3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DemoDeSerCompostion {
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		ObjectInputStream ois=
				new ObjectInputStream(new FileInputStream(new File("foo.ser")));
		
		Dog dog=(Dog) ois.readObject();
		
		System.out.println(dog.dogName);
		System.out.println(dog.collar.size);
	}
}

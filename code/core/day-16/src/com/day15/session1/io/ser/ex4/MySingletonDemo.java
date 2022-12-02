package com.day15.session1.io.ser.ex4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class MySingleton implements Serializable {

	private static MySingleton mySingleton = new MySingleton();

	private MySingleton() {
	}

	public static MySingleton getMySingleton() {
		return mySingleton;
	}

	//how to save singleton from serilization
	//how jvm treat this method 
	//before de-ser : jvm will look for this method .. if it is there it will not do de-ser***
	//simply call this mehtod 
	public Object readResolve() {
		System.out.println("---------");
		return mySingleton;
	}
}

public class MySingletonDemo {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// directly
		MySingleton mySingleton = MySingleton.getMySingleton();
		System.out.println(mySingleton.hashCode());

		// ser--de-ser
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("demo.ser")));
		oos.writeObject(mySingleton);

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("demo.ser")));

		MySingleton mySingleton2 = (MySingleton) ois.readObject();

		System.out.println(mySingleton2.hashCode());
	}

}

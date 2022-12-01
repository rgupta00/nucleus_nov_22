package com.day15.session1.io.ser.ex3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

 class Collar{
	int size;
}

class Dog implements Serializable {
	
	transient Collar collar;
	String dogName;

	public Collar getCollar() {
		return collar;
	}

	//we can apply some trick and tell java to customized ser for us
	private void writeObject(ObjectOutputStream oos) throws IOException {
		oos.defaultWriteObject();// hey java whatever u can do by default do it...
		oos.writeInt(collar.size);// but why not u carray a int for me and put into that file
		
	}
	
	private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException {
		ois.defaultReadObject();
		collar=new Collar();
		collar.size=ois.readInt();
	}
	
	public void setCollar(Collar collar) {
		this.collar = collar;
	}

	public String getDogName() {
		return dogName;
	}

	public void setDogName(String dogName) {
		this.dogName = dogName;
	}

}

public class SerilizationAndComposition {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("foo.ser"));
		
		Collar collar=new Collar();
		collar.size=10;
		Dog dog=new Dog();
		dog.setCollar(collar);
		dog.setDogName("stonish");
		
		oos.writeObject(dog);
		System.out.println("------------");
	}
}

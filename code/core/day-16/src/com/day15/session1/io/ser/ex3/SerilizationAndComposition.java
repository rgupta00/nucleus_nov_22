package com.day15.session1.io.ser.ex3;
//Compostion and ser...
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

 class Collar {
	int size;
}

class Dog implements Serializable {
	transient Collar collar;
	String dogName;

	//let we interfare during ser
	private void writeObject(ObjectOutputStream oos) throws IOException{
		oos.defaultWriteObject();
		oos.writeInt(collar.size);
		System.out.println("----called during ser----");
	}
	//de-ser
	private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException {
		ois.defaultReadObject();
		collar=new Collar();
		collar.size=ois.readInt();
		System.out.println("---called during deser----");
	}
	public Dog(Collar collar, String dogName) {
		this.collar = collar;
		this.dogName = dogName;
	}
}

public class SerilizationAndComposition {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		ObjectOutputStream oos=
				new ObjectOutputStream(new FileOutputStream("foo.ser"));


		Collar collar=new Collar();
		collar.size=45;
		Dog dog=new Dog(collar,"stonish");
		oos.writeObject(dog);
		System.out.println("---done---");
	}
}

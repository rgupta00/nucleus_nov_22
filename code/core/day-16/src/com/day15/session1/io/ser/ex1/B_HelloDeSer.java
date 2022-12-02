package com.day15.session1.io.ser.ex1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class B_HelloDeSer {

	//Why we have to ClassNotFoundException this ex?
	public static void main(String[] args){

		//De-ser
		try(ObjectInputStream ois=
		new ObjectInputStream(new FileInputStream(new File("demo.ser")))){
			Account account=(Account) ois.readObject();
			System.out.println(account);
		}catch (FileNotFoundException e){
			e.printStackTrace();
		}catch (IOException e){
			e.printStackTrace();
		}catch (ClassNotFoundException e){
			e.printStackTrace();
		}
	}
}

package com.day15.session1.io.ser.ex1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class A_HelloSerilization {
	public static void main(String[] args) {

		Account account=new Account(1, "raj", 80);
		account.setBankName("PNB");

		account.setBalance(account.getBalance()+10);
		//what i want do: ser
		try(ObjectOutputStream ois=
					new ObjectOutputStream
							(new FileOutputStream("demo.ser"))){
			ois.writeObject(account);
		}catch (FileNotFoundException e){
			e.printStackTrace();
		}catch (IOException e){
			e.printStackTrace();
		}catch (Exception e){
			e.printStackTrace();
		}

		System.out.println("------done------");
		
	}
}













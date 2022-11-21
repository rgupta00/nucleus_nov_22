package com.tester;

import com.factory.ComputerFactory;
import com.factory.PCFactory;
import com.factory.ServerFactory;
import com.pojo.Computer;

public class Main {

	public static void main(String[] args) {
			Computer pc=ComputerFactory.createComputer(new PCFactory("8", "1","i5" ));
			Computer server=ComputerFactory.createComputer(new ServerFactory("8", "1","i5" ));
			
	}

}

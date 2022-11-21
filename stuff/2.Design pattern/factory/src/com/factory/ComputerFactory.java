package com.factory;

import com.pojo.Computer;

public class ComputerFactory {

	public static Computer createComputer(ComputerAbstractFactory abstractFactory) {
		return abstractFactory.createComputer();
	}
}

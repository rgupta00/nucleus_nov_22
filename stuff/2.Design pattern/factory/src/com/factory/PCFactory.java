package com.factory;

import com.pojo.Computer;
import com.pojo.PC;

public class PCFactory implements ComputerAbstractFactory{

	private String RAM, HD,CPU;
	
	@Override
	public Computer createComputer() {
		return new PC(this.RAM, this.HD, this.CPU);
	}

	public PCFactory(String rAM, String hD, String cPU) {
		RAM = rAM;
		HD = hD;
		CPU = cPU;
	}

	
}

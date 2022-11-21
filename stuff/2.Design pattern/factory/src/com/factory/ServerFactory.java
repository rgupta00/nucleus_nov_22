package com.factory;

import com.pojo.Computer;
import com.pojo.PC;
import com.pojo.Server;

public class ServerFactory implements ComputerAbstractFactory{

	private String RAM, HD,CPU;
	
	@Override
	public Computer createComputer() {
		return new Server(this.RAM, this.HD, this.CPU);
	}

	public ServerFactory(String rAM, String hD, String cPU) {
		RAM = rAM;
		HD = hD;
		CPU = cPU;
	}

	
}

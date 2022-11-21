package com.pojo;

public class Server implements Computer {

	private String RAM, HD,CPU;
	
	
	public Server(String rAM, String hD, String cPU) {
		System.out.println("creating a Server");
		RAM = rAM;
		HD = hD;
		CPU = cPU;
	}

	@Override
	public String getRAM() {
		return RAM;
	}

	@Override
	public String getHD() {
		// TODO Auto-generated method stub
		return HD;
	}

	@Override
	public String getCPU() {
		// TODO Auto-generated method stub
		return CPU;
	}

}

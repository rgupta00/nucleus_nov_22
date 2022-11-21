package com.pojo;

public class PC implements Computer {

	private String RAM, HD,CPU;
	
	
	public PC(String rAM, String hD, String cPU) {
		System.out.println("creating a PC");
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

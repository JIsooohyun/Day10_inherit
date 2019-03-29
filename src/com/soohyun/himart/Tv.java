package com.soohyun.himart;

public class Tv extends Product{
	
	private int inch;
		
	public int getInch() {
		return inch;
	}
	public void setInch(int inch) {
		this.inch = inch;
	}
	public Tv() {
		// TODO Auto-generated constructor stub
		this.inch = 65;
		this.setBrand("LG");
		this.setColor("Black");
		this.setInch(55);
		this.setPoint(25);
		this.setPrice(150);
	}
	

}

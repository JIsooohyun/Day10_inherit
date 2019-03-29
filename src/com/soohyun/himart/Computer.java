package com.soohyun.himart;

public class Computer extends Product{
	private int hd;
	private String cpu = "i7";
	
	public Computer() {
		this.hd = 256;
		this.cpu = "i7";
		this.setBrand("Apple");
		this.setColor("Silver");
		this.setPrice(200);
		this.setPoint(20);
				
	}
	
	
	public int getHd() {
		return hd;
	}
	public void setHd(int hd) {
		this.hd = hd;
	}
	public String getCpu() {
		return cpu;
	}
	public void setCpu(String cpu) {
		this.cpu = cpu;
	}
	

}

package com.soohyun.himart;


public class HandPhone extends Product{
	private String phone;
	private int inch;

	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getInch() {
		return inch;
	}
	public void setInch(int inch) {
		this.inch = inch;
	}

	public HandPhone() {
		// TODO Auto-generated constructor stub
		this.inch = 10;
		this.phone = "s10";
		this.setBrand("SAMSUNG");
		this.setColor("Blue");
		this.setPoint(10);
		this.setPrice(100);
	}
	

}

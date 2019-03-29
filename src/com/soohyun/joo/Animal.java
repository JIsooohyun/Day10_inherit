package com.soohyun.joo;

public abstract class Animal {  //abstract는 상속 X
	//공동적인 요소
	private String color;
	private double ki;
	private double muge;
	private int age;
	
	
	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public double getKi() {
		return ki;
	}


	public void setKi(double ki) {
		this.ki = ki;
	}


	public double getMuge() {
		return muge;
	}


	public void setMuge(double muge) {
		this.muge = muge;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public abstract void eat();  //추상메서드 입니다. 
}

package com.soohyun.joo;

public class Tazo extends Birds{  //왜냐하면 Bird클래스에서 Animal을 상속받고 있기 때문
	private int egg;
	public Tazo() {
		this(10);
		this.egg = 10;
	}
	
	public Tazo(int egg) {
		this.egg = egg;
		this.getAge();
		super.getAge();
		
	}
	
	@Override
		public void eat() {
			// TODO Auto-generated method stub
			
		}
	
}

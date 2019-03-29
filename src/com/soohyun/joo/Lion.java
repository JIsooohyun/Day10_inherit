package com.soohyun.joo;

public class Lion extends Animal{
	private int tooth;
	
	
	public Lion() {
		super();
	}
	
	
	public int getTooth() {
		return tooth;
	}



	public void setTooth(int tooth) {
		this.tooth = tooth;
	}


	public void eat() {
		
	}
	
	public static void main(String[] args) {
		Lion lion = new Lion();
		lion.eat();
		//Animal animal = new Animal(); //실체화되지 않은 것은 만들면 안된다.(의미적으로)
	}
	
	
	
}

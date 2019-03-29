package com.soohyun.joo;

public interface Flyable {
	
	//상수하고 추상메서드만 가능합니다.
	//생성자 안됨~~~
	
	//상수
	//접근 지정자는 public static final
	//안쓰면 자동으로 만들어줌
	public static final int NUM=10;
	int NUMBER=20; //생략해도 가능

	
	
	//추상메서드
	//public abstract
	//안쓰면 자동으로 만들어줌
	public abstract void fly();  //추상메서드는 바로 ;  붙여서 끝낸다.
	
	
}

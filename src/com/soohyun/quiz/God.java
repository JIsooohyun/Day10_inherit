package com.soohyun.quiz;

public class God {

	private static final God god = new God();  //싱글톤이라고 불린다.
	
	private God() {
	
	}
	
	public static God get() {
		return god;
		
	}
	//God이란 객체를 만들어봐봐 -> 생성자를 호출해야하는데  -> private이라서 호출 불가
	
	public void say() {
		System.out.println("Today is Friday");
	}
	
}

package com.soohyun.himart;

public class HimartView {
	
	
	//각 제품의 정보를 출력해주는 메서드
	//오버로딩
	public void view(Product p) {
		System.out.println("----컴퓨터----");
		System.out.println("Brand : "+p.getBrand());
		System.out.println("Color : "+p.getColor());
		System.out.println("Point : "+p.getPoint());
		System.out.println("Price : "+p.getPrice());
		
		if(p instanceof Tv) {
			Tv t = (Tv)p;
			System.out.println(t.getInch());
		}else if(p instanceof Computer) {
			Computer c =(Computer)p;
			System.out.println(c.getCpu());
			System.out.println(c.getHd());
		}else {
			HandPhone h = (HandPhone)p;
		}
	}
	

}

package com.soohyun.himart;

public class Product {
	private String brand;
	private String color;
	private int price;
	private int point;
	
	public Product() {
		this.brand = "LG";
		this.color = "black";
		this.price = 1000;
		this.point = 300;
	}
	
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
}

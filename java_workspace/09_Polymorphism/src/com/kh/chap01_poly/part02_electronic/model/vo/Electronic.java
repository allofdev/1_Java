package com.kh.chap01_poly.part02_electronic.model.vo;

public class Electronic {
	
	// 필드
	private String brand;
	private String name;
	private int price;
	
	// 기본 생성자
	public Electronic() { }
	
	// 매개변수 생성자
	public Electronic(String brand, String name, int price) {
		this.brand = brand;
		this.name = name;
		this.price = price;
	}
	
	// setter/getter 메소드
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getBrand() {
		return brand;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getname() {
		return name;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	
	@Override
	public String toString() {
		return "브랜드 : " + brand + ", 제품명 : " + name + ", 가격 : " + price + "원";
	}
	
}

package com.kh.chap01_beforeVSafter.after.model.vo;

public class Product {
	
	/*
	 * 세 클래스 모두 공통적으로 가지고 있는 요소만 추출해서 부모클래스로 만듬
	 * 공통적인 요소 : brand, pCode, pName, price
	 * 
	 *            setBrand, setpCode, setpName, setPrice
	 *            
	 *            getBrand, getpCode, getpName, getPrice
	 *            
	 *            information 메소드
	 */
	
	// 필드
	private String brand;
	private String pCode;
	private String pName;
	private int price;
	
	// 기본 생성자
	public Product() { }
	
	// 매개변수 생성자
	public Product(String brand, String pCode, String pName, int price) {
		this.brand = brand;
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
	}
	
	// setter/getter 메소드 묶어서
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getBrand() {
		return brand;
	}
	
	public void setpCode(String pCode) {
		this.pCode = pCode;
	}
	public String getpCode() {
		return pCode;
	}
	
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getpName() {
		return pName;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	
	// information 메소드
	public String information() {
		return "브랜드명 : " + brand + ", 상품번호 : " + pCode + ", 상품명 : " + pName + ", 가격 : " + price;
	}
}
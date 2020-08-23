package com.kh.chap01_beforeVSafter.before.model.vo;

public class SmartPhone {

	// 필드
	private String brand;
	private String pCode;
	private String pName;
	private int price;
	private String mobileAgency;
	
	// 기본 생성자
	public SmartPhone() {
		
	}
	
	// 매개변수 생성자
	public SmartPhone(String brand, String pCode, String pName, int price, String mobileAgency) {
		this.brand = brand;
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
		this.mobileAgency = mobileAgency;
	}
	
	// setter 메소드
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setpCode(String pCode) {
		this.pCode = pCode;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setMobileAgency(String mobileAgency) {
		this.mobileAgency = mobileAgency;
	}
	
	// getter 메소드
	public String getBrand() {
		return brand;
	}
	public String getpCode() {
		return pCode;
	}
	public String getpName() {
		return pName;
	}
	public int getPrice() {
		return price;
	}
	public String getMobileAgency() {
		return mobileAgency;
	}
	
	// information 메소드
	public String information() {
		return "브랜드명 : " + brand + ", 상품번호 : " + pCode + ", 상품명 : " + pName + ", 가격 : " + price + ", 통신사 : " + mobileAgency;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}

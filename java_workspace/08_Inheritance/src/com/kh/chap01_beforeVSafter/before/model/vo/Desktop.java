package com.kh.chap01_beforeVSafter.before.model.vo;

public class Desktop {

	// 필드
	private String brand;
	private String pCode;
	private String pName;
	private int price;
	private boolean allInOne;
	
	// 기본생성자
	public Desktop(){
		
	}
	
	// 매개변수 생성자
	public Desktop(String brand, String pCode, String pName, int price, boolean allInOne) {
		this.brand = brand;
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
		this.allInOne = allInOne;
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
	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
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
	public boolean isAllInOne() {		// boolean 자료형은 get 대신에 is를 사용!!!!!!!!!
		return allInOne;
	}
	
	// information 메소드
	public String information() {
		return  "브랜드명 : " + brand + ", 상품번호 : " + pCode + ", 상품명 : " + pName + ", 가격 : " + price + ", 일체여부 : " + allInOne;
	}
	
	
	
	
	
}

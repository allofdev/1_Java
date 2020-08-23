package com.kh.chap03_class.model.vo;


// 클래스 앞에 기술 가능한 접근 제한자 : public, default두가지
// default : (접근제한자를 생략하면 default됨  ex) class product { } )       /          다른 패키지에서는 절대 사용(접근) 불가
 public class Product {

	// 필드
	private String pName;
	private int price;
	private String brand;
	
	
	
	
	
	
	
	
	
	// 생성자
	// 기본생성자
	public Product() {}
	
	
	// 매개변수 있는 생성자
	public Product(String pName, int price, String brand) {
		this.pName = pName;
		this.price = price;
		this.brand = brand;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// 메소드
	// setter메소드
	public void setpName(String pName) {		// 바로 뒤에 대문자가 있는경우 이름 그대로 사용
		this.pName = pName;						// setpName O 	setPName X   setPname X
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	
	// getter메소드
	public String getpName() {
		return pName;
	}
	
	public int getPrice() {
		return price;
	}
	
	public String getBrand() {
		return brand;
	}
	
	
	// 모든필드값을 하나의 문자열로 합쳐서 반환시키는 information 메소드	
	public String information() {
		return  "제품명 : " + pName + ", 가격 : " + price + "원, 브랜드 : " + brand;

	}
	
	
	
	
	
}

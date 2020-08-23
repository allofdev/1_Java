package com.kh.chap01_poly.part02_electronic.model.vo;

public class Tablet extends Electronic{

	// 필드
	private boolean penFlag;
	
	// 기본 생성자
	public Tablet() {}
	
	// 매개변수 생성자
	public Tablet(String brand, String name, int price, boolean penFlag) {
		super(brand, name, price);
		this.penFlag = penFlag;
	}
	
	// setter/getter 메소드
	public void setPenFlag(boolean penFlag) {
		this.penFlag = penFlag;
	}
	public boolean isPenFlag() {
		return penFlag;
	}
	
	// toString 메소드
	@Override
	public String toString() {
		return super.toString() + ", 팬 유무 : " + (penFlag ? "있음" : "없음");
	}								  // 삼항연산자(  조건식   ?  true : false);
	
	
	
}

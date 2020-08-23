package com.kh.chap01_beforeVSafter.after.model.vo;

//***** 자식클래스  extends 부모클래스 *****
public class Tv extends Product{
	
	// 필드
	private int inch;
	
	// 기본 생성자
	public Tv() { }
	
	// 매개변수 생성자
	public Tv(String brand, String pCode, String pName, int price, int inch) {
		super(brand, pCode, pName, price);	
		this.inch = inch;
	}
	
	// setter/getter 메소드
	public void setInch(int inch) {
		this.inch = inch;
	}
	
	public int getInch() {
		return inch;
	}
	
	public String information() {
		return super.information() + ", 인치 : " + inch;
	}
	
	
}

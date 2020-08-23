package com.kh.chap01_beforeVSafter.after.model.vo;

//        ***** 자식클래스  extends 부모클래스 *****
public class SmartPhone extends Product{

	// 필드
	private String mobileAgency;
	
	// 기본 생성자
	public SmartPhone() { }
	
	// 매개변수 생성자
	public SmartPhone(String brand, String pCode, String pName, int price, String mobileAgency) {
		super(brand, pCode, pName, price);
		this.mobileAgency = mobileAgency;
	}
	
	
	public void setMobileAgency(String mobileAgency) {
		this.mobileAgency = mobileAgency;
	}
	
	public String getMobileAgency() {
		return mobileAgency;
	}
	
	public String information() {
		return super.information() + ", 통신사 : " + mobileAgency;
	}
	
}

package com.kh.chap01_beforeVSafter.before.model.vo;

public class SmartPhone {

	// �ʵ�
	private String brand;
	private String pCode;
	private String pName;
	private int price;
	private String mobileAgency;
	
	// �⺻ ������
	public SmartPhone() {
		
	}
	
	// �Ű����� ������
	public SmartPhone(String brand, String pCode, String pName, int price, String mobileAgency) {
		this.brand = brand;
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
		this.mobileAgency = mobileAgency;
	}
	
	// setter �޼ҵ�
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
	
	// getter �޼ҵ�
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
	
	// information �޼ҵ�
	public String information() {
		return "�귣��� : " + brand + ", ��ǰ��ȣ : " + pCode + ", ��ǰ�� : " + pName + ", ���� : " + price + ", ��Ż� : " + mobileAgency;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
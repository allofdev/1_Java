package com.kh.chap01_beforeVSafter.before.model.vo;

public class Desktop {

	// �ʵ�
	private String brand;
	private String pCode;
	private String pName;
	private int price;
	private boolean allInOne;
	
	// �⺻������
	public Desktop(){
		
	}
	
	// �Ű����� ������
	public Desktop(String brand, String pCode, String pName, int price, boolean allInOne) {
		this.brand = brand;
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
		this.allInOne = allInOne;
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
	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
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
	public boolean isAllInOne() {		// boolean �ڷ����� get ��ſ� is�� ���!!!!!!!!!
		return allInOne;
	}
	
	// information �޼ҵ�
	public String information() {
		return  "�귣��� : " + brand + ", ��ǰ��ȣ : " + pCode + ", ��ǰ�� : " + pName + ", ���� : " + price + ", ��ü���� : " + allInOne;
	}
	
	
	
	
	
}

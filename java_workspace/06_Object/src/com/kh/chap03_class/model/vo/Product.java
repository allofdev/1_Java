package com.kh.chap03_class.model.vo;


// Ŭ���� �տ� ��� ������ ���� ������ : public, default�ΰ���
// default : (���������ڸ� �����ϸ� default��  ex) class product { } )       /          �ٸ� ��Ű�������� ���� ���(����) �Ұ�
 public class Product {

	// �ʵ�
	private String pName;
	private int price;
	private String brand;
	
	
	
	
	
	
	
	
	
	// ������
	// �⺻������
	public Product() {}
	
	
	// �Ű����� �ִ� ������
	public Product(String pName, int price, String brand) {
		this.pName = pName;
		this.price = price;
		this.brand = brand;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// �޼ҵ�
	// setter�޼ҵ�
	public void setpName(String pName) {		// �ٷ� �ڿ� �빮�ڰ� �ִ°�� �̸� �״�� ���
		this.pName = pName;						// setpName O 	setPName X   setPname X
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	
	// getter�޼ҵ�
	public String getpName() {
		return pName;
	}
	
	public int getPrice() {
		return price;
	}
	
	public String getBrand() {
		return brand;
	}
	
	
	// ����ʵ尪�� �ϳ��� ���ڿ��� ���ļ� ��ȯ��Ű�� information �޼ҵ�	
	public String information() {
		return  "��ǰ�� : " + pName + ", ���� : " + price + "��, �귣�� : " + brand;

	}
	
	
	
	
	
}

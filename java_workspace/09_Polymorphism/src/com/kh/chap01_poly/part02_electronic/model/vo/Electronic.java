package com.kh.chap01_poly.part02_electronic.model.vo;

public class Electronic {
	
	// �ʵ�
	private String brand;
	private String name;
	private int price;
	
	// �⺻ ������
	public Electronic() { }
	
	// �Ű����� ������
	public Electronic(String brand, String name, int price) {
		this.brand = brand;
		this.name = name;
		this.price = price;
	}
	
	// setter/getter �޼ҵ�
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getBrand() {
		return brand;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getname() {
		return name;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	
	@Override
	public String toString() {
		return "�귣�� : " + brand + ", ��ǰ�� : " + name + ", ���� : " + price + "��";
	}
	
}
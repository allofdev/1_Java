package com.kh.chap01_poly.part02_electronic.model.vo;

public class Tablet extends Electronic{

	// �ʵ�
	private boolean penFlag;
	
	// �⺻ ������
	public Tablet() {}
	
	// �Ű����� ������
	public Tablet(String brand, String name, int price, boolean penFlag) {
		super(brand, name, price);
		this.penFlag = penFlag;
	}
	
	// setter/getter �޼ҵ�
	public void setPenFlag(boolean penFlag) {
		this.penFlag = penFlag;
	}
	public boolean isPenFlag() {
		return penFlag;
	}
	
	// toString �޼ҵ�
	@Override
	public String toString() {
		return super.toString() + ", �� ���� : " + (penFlag ? "����" : "����");
	}								  // ���׿�����(  ���ǽ�   ?  true : false);
	
	
	
}

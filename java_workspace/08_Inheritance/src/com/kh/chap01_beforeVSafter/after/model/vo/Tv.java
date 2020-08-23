package com.kh.chap01_beforeVSafter.after.model.vo;

//***** �ڽ�Ŭ����  extends �θ�Ŭ���� *****
public class Tv extends Product{
	
	// �ʵ�
	private int inch;
	
	// �⺻ ������
	public Tv() { }
	
	// �Ű����� ������
	public Tv(String brand, String pCode, String pName, int price, int inch) {
		super(brand, pCode, pName, price);	
		this.inch = inch;
	}
	
	// setter/getter �޼ҵ�
	public void setInch(int inch) {
		this.inch = inch;
	}
	
	public int getInch() {
		return inch;
	}
	
	public String information() {
		return super.information() + ", ��ġ : " + inch;
	}
	
	
}

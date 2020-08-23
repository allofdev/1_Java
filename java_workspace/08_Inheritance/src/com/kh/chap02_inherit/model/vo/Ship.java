package com.kh.chap02_inherit.model.vo;

public class Ship extends Vehicle{
	
	// �ʵ�
	private int propeller; // �����緯
	
	// �⺻ ������
	public Ship() { }
	
	// �Ű����� ������
	public Ship(String name, double mileage, String kind, int propeller) {
		
		super(name, mileage, kind);
		
		this.propeller = propeller;
	}
	
	// setter/getter �޼ҵ�
	public void setPropeller(int propeller) {
		this.propeller = propeller;
	}
	public int getProperller() {
		return propeller;
	}
	
	// information �޼ҵ�
	@Override
	public String information() {
		return super.information() + ", �����緯�� : " + propeller + "��";
	}
	
	@Override
	public void howToMove() {
		System.out.print("�����緯�� �������鼭 ");
		super.howToMove();
	}
	
}

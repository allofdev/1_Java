package com.kh.chap02_inherit.model.vo;

public class Airplane extends Vehicle{
	
	// �ʵ�
	private int tire; // ����
	private int wing; // ����
	
	// �⺻ ������
	public Airplane() { }
	
	// �Ű����� ������
	public Airplane(String name, double mileage, String kind, int tire, int wing) {
		super(name, mileage, kind);

		this.tire = tire;
		this.wing = wing;
	}
	
	// setter/getter �޼ҵ�
	public void setTire(int tire) {
		this.tire = tire;
	}
	public int getTire() {
		return tire;
	}
	
	public void setWing(int wing) {
		this.wing = wing;
	}
	public int getWing() {
		return wing;
	}
	
	// information �޼ҵ�
	@Override
	public String information() {
		return super.information() + ", ������ : " + tire + "��, ������ : " + wing + "��";
	}
	
	@Override
	public void howToMove() {
		System.out.print("������ ������ ");
		super.howToMove();
	}
	
	
}

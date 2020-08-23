package com.kh.chap02_inherit.model.vo;

public class Car extends Vehicle{
	
	// �ʵ�
	private int tire; // Ÿ�̾� ����
	
	// �⺻ ������
	public Car() { }
	
	// �Ű����� ������
	public Car(String name, double mileage, String kind, int tire) {
		super(name, mileage, kind);
		
		this.tire = tire;
	}
	
	// setter/getter �޼ҵ�
	public void setTire(int tire) {
		this.tire = tire;
	}
	public int getTire() {
		return tire;
	}
	
	// information �޼ҵ�
	@Override	// �������� �޼ҵ�. �θ�Ŭ������ �޼ҵ�� ��ȯ�� �޼ҵ�� �Ű����� ��� ���ƾ� ��	// �ڽĸ޼ҵ忡�� Override�ϸ� �θ�Ŭ���������� ����ȵ� --> �����Ϸ��� super�� ���� ȣ���ϸ��!!!!!!!!!
	public String information() {
		return super.information() + ", ������ : " + tire + "��";
	}
	
	@Override
	public void howToMove() {
		System.out.print("������ �������� ");  
		super.howToMove();
	}
	
}

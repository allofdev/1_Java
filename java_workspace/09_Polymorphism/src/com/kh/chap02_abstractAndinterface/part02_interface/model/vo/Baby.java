package com.kh.chap02_abstractAndinterface.part02_interface.model.vo;

public class Baby extends Person implements Basic {
	//							implements -> �������̽��� �����ϱ� ���� �����
	// 									             �������̽��� Ŭ������Ӱ��� �ٸ��� �������� ����
	
	// �ʵ�
	// �ʵ� �߰�����
	
	// �⺻ ������
	public Baby() {}
	
	// �Ű����� ������
	public Baby(String name, double weight, int health) {
		super(name, weight, health);
	}
	
	// setter/getter �޼ҵ�
	// ����
	
	@Override
	public String toString() {
		return "Baby[" + super.toString() + "]";
	}
	
	@Override
	public void eat() {
		super.setWeight(super.getWeight() + 3);
		super.setHealth(super.getHealth() + 1);
	}
	
	@Override
	public void sleep() {
		super.setHealth(super.getHealth() + 3);
	}
	
	
}

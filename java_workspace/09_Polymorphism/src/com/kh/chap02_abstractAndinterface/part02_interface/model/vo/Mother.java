package com.kh.chap02_abstractAndinterface.part02_interface.model.vo;

public class Mother extends Person implements Basic {
//								  implements -> �������̽��� �����ϱ� ���� �����
// 							                                             �������̽��� Ŭ������Ӱ��� �ٸ��� �������� ����

	// �ʵ�
	private String babyBirth;	// ������ ź������ : ���, �Ծ�, ����
	
	// �⺻ ������
	public Mother() {}
	
	// �Ű����� ������
	public Mother(String name, double weight, int health, String babyBirth) {
		super(name, weight, health);
		this.babyBirth = babyBirth;
	}
	
	// setter/getter �޼ҵ�
	public void setBabyBirth(String babyBirth) {
		this.babyBirth = babyBirth;
	}
	public String getBabyBirth() {
		return babyBirth;
	}
	
	@Override
	public String toString() {
		return "Mother[" + super.toString() + ", ������ ź�� : " + babyBirth + "]";
	}
	
	@Override
	public void eat() {
		
		// ������ 10����
		super.setWeight(super.getWeight() + 10);
		
		// �ǰ��� 10����
		super.setHealth(super.getHealth() - 10);
		
	}
	
	@Override
	public void sleep() {
		super.setHealth(super.getHealth() + 10);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
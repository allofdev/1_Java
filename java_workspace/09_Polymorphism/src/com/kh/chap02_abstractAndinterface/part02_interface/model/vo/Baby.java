package com.kh.chap02_abstractAndinterface.part02_interface.model.vo;

public class Baby extends Person implements Basic {
	//							implements -> 인터페이스를 구현하기 위한 예약어
	// 									             인터페이스는 클래스상속과는 다르게 다중으로 가능
	
	// 필드
	// 필드 추가안함
	
	// 기본 생성자
	public Baby() {}
	
	// 매개변수 생성자
	public Baby(String name, double weight, int health) {
		super(name, weight, health);
	}
	
	// setter/getter 메소드
	// 없음
	
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

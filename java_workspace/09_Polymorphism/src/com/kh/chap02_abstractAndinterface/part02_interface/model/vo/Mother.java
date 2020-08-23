package com.kh.chap02_abstractAndinterface.part02_interface.model.vo;

public class Mother extends Person implements Basic {
//								  implements -> 인터페이스를 구현하기 위한 예약어
// 							                                             인터페이스는 클래스상속과는 다르게 다중으로 가능

	// 필드
	private String babyBirth;	// 아이의 탄생정보 : 출산, 입양, 없음
	
	// 기본 생성자
	public Mother() {}
	
	// 매개변수 생성자
	public Mother(String name, double weight, int health, String babyBirth) {
		super(name, weight, health);
		this.babyBirth = babyBirth;
	}
	
	// setter/getter 메소드
	public void setBabyBirth(String babyBirth) {
		this.babyBirth = babyBirth;
	}
	public String getBabyBirth() {
		return babyBirth;
	}
	
	@Override
	public String toString() {
		return "Mother[" + super.toString() + ", 아이의 탄생 : " + babyBirth + "]";
	}
	
	@Override
	public void eat() {
		
		// 몸무게 10증가
		super.setWeight(super.getWeight() + 10);
		
		// 건강도 10감소
		super.setHealth(super.getHealth() - 10);
		
	}
	
	@Override
	public void sleep() {
		super.setHealth(super.getHealth() + 10);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

package com.kh.part02_mvc.model.vo;

// Model : 데이터 관련한 역할을 담당
// vo(ValueObject) : 데이터값을 담기위한 용도의 클래스(그릇 같은 역할을 함)

public class Person {
	
	// 필드
	private String name;	// 이름
	private int age;		// 나이
	private int wealth;		// 재산
	
	// 기본 생성자
	public Person() { }
	
	// 매개변수 생성자
	public Person(String name, int age, int wealth) {
		this.name = name;
		this.age = age;
		this.wealth = wealth;
	}
	
	// setter 메소드
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setWealth(int wealth) {
		this.wealth = wealth;
	}
	
	// getter메소드
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public int getWealth() {
		return wealth;
	}
	
	// information 메소드
	public String information() {
		return "이름 : " + name + ", 나이 : " + age + ", 재산 : " + wealth + "원";
	}
}
package com.kh.chap02_abstractAndinterface.part02_interface.model.vo;

public abstract class Person {
		
	
	// 필드
	private String name;	// 이름
	private double weight;	// 몸무게
	private int health;		// 건강도
	
	// 기본 생성자
	public Person() {}
	
	// 매개변수 생성자
	public Person(String name, double weight, int health) {
		this.name = name;
		this.weight = weight;
		this.health = health;
	}
	
	// setter/getter 메소드
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getWeight() {
		return weight;
	}
	
	public void setHealth(int health) {
		this.health = health;
	}
	public int getHealth() {
		return health;
	}
	
	@Override
	public String toString() {
		return "이름 : " + name + ", 몸무게 : " + weight + ", 건강도 : " + health;
	}
	
	/* interface를 위해 주석 처리
	 * 
	 * public abstract void eat(); 
	 * public abstract void sleep();
	 */
	
	
	
}

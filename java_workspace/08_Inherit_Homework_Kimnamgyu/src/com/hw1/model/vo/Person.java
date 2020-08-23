package com.hw1.model.vo;

public class Person {

	//필드
	protected String name;
	private int age;
	private double height;
	private double weight;
	
	//기본 생성자
	public Person() {}
	
	//매개변수 생성자
	public Person(int age, double height, double weight) {
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	//setter/getter 메소드
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	public double getHeight() {
		return height;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getWeight() {
		return weight;
	}
	
	//information 메소드
	public String information() {
		return "이름 : " + name + ", 나이 : " + age + ", 키 : " + height + ", 몸무게 : " + weight;
	}
	
}
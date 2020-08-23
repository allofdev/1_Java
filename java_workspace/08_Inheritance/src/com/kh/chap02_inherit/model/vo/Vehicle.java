package com.kh.chap02_inherit.model.vo;

public class Vehicle {
	
	// 필드
	private String name;	// 이름
	private double mileage; // 연비
	private String kind;    // 종류(쏘나타, 그랜저)
	
	// 기본 생성자
	public Vehicle() { }
	
	// 매개변수 생성자
	public Vehicle(String name, double mileage, String kind) {
		this.name = name;
		this.mileage = mileage;
		this.kind = kind;
	}
	
	// setter/getter 메소드
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setMileage(double mileage) {
		this.mileage = mileage;
	}
	public double getMileage() {
		return mileage;
	}
	
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getKind() {
		return kind;
	}
	
	// information 메소드
	public String information() {
		return "이름 : " + name + ", 연비 : " + mileage + ", 종류 : " + kind;
	}
	
	public void howToMove() {
		System.out.println("움직인다.");
	}
	
	
	
	
}

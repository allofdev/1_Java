package com.hw2.model.vo;

public class Circle extends Point{

	//필드
	private int radius;
	
	//기본 생성자
	public Circle() {}
	
	//매개변수 생성자
	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}
	
	//setter/getter 메소드
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public int getRadius() {
		return radius;
	}
	
	//draw 메소드 오버라이딩
	@Override
	public void draw() {
		super.draw();
		System.out.println("면적 : " +  Math.round(Math.PI * radius * radius));
		System.out.println("둘레 : " +  Math.round(Math.PI * radius * 2));
	}
}
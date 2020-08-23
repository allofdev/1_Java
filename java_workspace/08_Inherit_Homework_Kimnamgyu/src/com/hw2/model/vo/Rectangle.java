package com.hw2.model.vo;

public class Rectangle extends Point{

	//필드
	private int width;
	private int height;
	
	//기본 생성자
	public Rectangle() {}
	
	//매개변수 생성자
	public Rectangle(int x, int y, int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}
	
	//setter/getter 메소드
	public void setWidth(int width) {
		this.width = width;
	}
	public int getWidth() {
		return width;
	}
	
	public void setHeight(int height) {
		this.height = height;
	}
	public int getHeight() {
		return height;
	}
	
	//draw메소드 오버라이딩
	@Override
	public void draw() {
		super.draw();
		System.out.println("면적 : " + (width * height));
		System.out.println("둘레 : " + (2 * (width + height)));
	}
}

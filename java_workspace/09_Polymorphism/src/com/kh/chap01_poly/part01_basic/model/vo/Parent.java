package com.kh.chap01_poly.part01_basic.model.vo;

public class Parent {

	// 부모클래스의 필드
	private int x;
	private int y;
	
	// 생성자
	public Parent() { }
	
	// 매개변수 생성자
	public Parent(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// setter/getter 메소드
	public void setX(int x) {
		this.x = x;
	}
	public int getX() {
		return x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	public int getY() {
		return y;
	}
	
	// 메소드
	public void printParent() {
		System.out.println("나 부모야");
	}
	
	public void print() {
		System.out.println("나 부모야");
	}
	
	
}

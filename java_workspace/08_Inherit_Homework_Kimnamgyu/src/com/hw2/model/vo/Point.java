package com.hw2.model.vo;

public class Point {

	//필드
	private int x;
	private int y;
	
	//기본 생성자
	public Point() {}
	
	//매개변수 생성자
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//setter/getter 메소드
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
	
	public void draw() {
		System.out.println("(x, y) : " + "(" + x + ", " + y + ")");
	}
	
}
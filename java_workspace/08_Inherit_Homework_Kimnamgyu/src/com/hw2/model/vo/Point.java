package com.hw2.model.vo;

public class Point {

	//�ʵ�
	private int x;
	private int y;
	
	//�⺻ ������
	public Point() {}
	
	//�Ű����� ������
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//setter/getter �޼ҵ�
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
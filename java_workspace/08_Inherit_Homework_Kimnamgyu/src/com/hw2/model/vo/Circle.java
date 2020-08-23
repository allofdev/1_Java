package com.hw2.model.vo;

public class Circle extends Point{

	//�ʵ�
	private int radius;
	
	//�⺻ ������
	public Circle() {}
	
	//�Ű����� ������
	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}
	
	//setter/getter �޼ҵ�
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public int getRadius() {
		return radius;
	}
	
	//draw �޼ҵ� �������̵�
	@Override
	public void draw() {
		super.draw();
		System.out.println("���� : " +  Math.round(Math.PI * radius * radius));
		System.out.println("�ѷ� : " +  Math.round(Math.PI * radius * 2));
	}
}
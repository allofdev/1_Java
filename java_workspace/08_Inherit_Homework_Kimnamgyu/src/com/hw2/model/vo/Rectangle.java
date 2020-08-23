package com.hw2.model.vo;

public class Rectangle extends Point{

	//�ʵ�
	private int width;
	private int height;
	
	//�⺻ ������
	public Rectangle() {}
	
	//�Ű����� ������
	public Rectangle(int x, int y, int width, int height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}
	
	//setter/getter �޼ҵ�
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
	
	//draw�޼ҵ� �������̵�
	@Override
	public void draw() {
		super.draw();
		System.out.println("���� : " + (width * height));
		System.out.println("�ѷ� : " + (2 * (width + height)));
	}
}

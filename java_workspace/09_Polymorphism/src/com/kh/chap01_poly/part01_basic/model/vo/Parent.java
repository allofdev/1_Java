package com.kh.chap01_poly.part01_basic.model.vo;

public class Parent {

	// �θ�Ŭ������ �ʵ�
	private int x;
	private int y;
	
	// ������
	public Parent() { }
	
	// �Ű����� ������
	public Parent(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// setter/getter �޼ҵ�
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
	
	// �޼ҵ�
	public void printParent() {
		System.out.println("�� �θ��");
	}
	
	public void print() {
		System.out.println("�� �θ��");
	}
	
	
}

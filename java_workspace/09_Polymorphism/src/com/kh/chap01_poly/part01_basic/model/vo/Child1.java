package com.kh.chap01_poly.part01_basic.model.vo;

public class Child1 extends Parent{

	// 자식클래스에서만 있는 필드
	private int z;
	
	// 기본 생성자
	public Child1() { }
	
	// 매개변수 생성자
	public Child1(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
	
	// setter/getter 메소드
	public void setZ(int z) {
		this.z = z;
	}
	public int getZ() {
		return z;
	}
	
	public void printChild1() {
		System.out.println("나 첫번쨰 자식이야");
	}
	
	@Override
	public void print() {
		System.out.println("나 첫번째 자식이야");
	}
	
	
}

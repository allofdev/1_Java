package com.kh.chap01_poly.part01_basic.model.vo;

public class Child1 extends Parent{

	// �ڽ�Ŭ���������� �ִ� �ʵ�
	private int z;
	
	// �⺻ ������
	public Child1() { }
	
	// �Ű����� ������
	public Child1(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
	
	// setter/getter �޼ҵ�
	public void setZ(int z) {
		this.z = z;
	}
	public int getZ() {
		return z;
	}
	
	public void printChild1() {
		System.out.println("�� ù���� �ڽ��̾�");
	}
	
	@Override
	public void print() {
		System.out.println("�� ù��° �ڽ��̾�");
	}
	
	
}

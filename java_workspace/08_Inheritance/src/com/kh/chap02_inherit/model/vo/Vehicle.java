package com.kh.chap02_inherit.model.vo;

public class Vehicle {
	
	// �ʵ�
	private String name;	// �̸�
	private double mileage; // ����
	private String kind;    // ����(�Ÿ, �׷���)
	
	// �⺻ ������
	public Vehicle() { }
	
	// �Ű����� ������
	public Vehicle(String name, double mileage, String kind) {
		this.name = name;
		this.mileage = mileage;
		this.kind = kind;
	}
	
	// setter/getter �޼ҵ�
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setMileage(double mileage) {
		this.mileage = mileage;
	}
	public double getMileage() {
		return mileage;
	}
	
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getKind() {
		return kind;
	}
	
	// information �޼ҵ�
	public String information() {
		return "�̸� : " + name + ", ���� : " + mileage + ", ���� : " + kind;
	}
	
	public void howToMove() {
		System.out.println("�����δ�.");
	}
	
	
	
	
}

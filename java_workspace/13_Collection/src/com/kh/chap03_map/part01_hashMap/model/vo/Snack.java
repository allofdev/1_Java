package com.kh.chap03_map.part01_hashMap.model.vo;

public class Snack {

	// �ʵ�
	// private String name;
	private String flavor;
	private int calory;
	
	// �⺻ ������
	public Snack() {}

	// �Ű����� ������
	public Snack(String flavor, int calory) {
		super();
		this.flavor = flavor;
		this.calory = calory;
	}

	// setter/getter �޼ҵ�
	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	public int getCalory() {
		return calory;
	}

	public void setCalory(int calory) {
		this.calory = calory;
	}

	// toString �޼ҵ�
	@Override
	public String toString() {
		return "Snack [flavor=" + flavor + ", calory=" + calory + "]";
	}
	
	
}

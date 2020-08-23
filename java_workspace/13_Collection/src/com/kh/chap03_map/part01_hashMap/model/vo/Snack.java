package com.kh.chap03_map.part01_hashMap.model.vo;

public class Snack {

	// 필드
	// private String name;
	private String flavor;
	private int calory;
	
	// 기본 생성자
	public Snack() {}

	// 매개변수 생성자
	public Snack(String flavor, int calory) {
		super();
		this.flavor = flavor;
		this.calory = calory;
	}

	// setter/getter 메소드
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

	// toString 메소드
	@Override
	public String toString() {
		return "Snack [flavor=" + flavor + ", calory=" + calory + "]";
	}
	
	
}

package com.kh.chap02_inherit.model.vo;

public class Ship extends Vehicle{
	
	// 필드
	private int propeller; // 프로펠러
	
	// 기본 생성자
	public Ship() { }
	
	// 매개변수 생성자
	public Ship(String name, double mileage, String kind, int propeller) {
		
		super(name, mileage, kind);
		
		this.propeller = propeller;
	}
	
	// setter/getter 메소드
	public void setPropeller(int propeller) {
		this.propeller = propeller;
	}
	public int getProperller() {
		return propeller;
	}
	
	// information 메소드
	@Override
	public String information() {
		return super.information() + ", 프로펠러수 : " + propeller + "개";
	}
	
	@Override
	public void howToMove() {
		System.out.print("프로펠러를 돌려가면서 ");
		super.howToMove();
	}
	
}

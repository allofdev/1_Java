package com.kh.chap02_inherit.model.vo;

public class Airplane extends Vehicle{
	
	// 필드
	private int tire; // 바퀴
	private int wing; // 날개
	
	// 기본 생성자
	public Airplane() { }
	
	// 매개변수 생성자
	public Airplane(String name, double mileage, String kind, int tire, int wing) {
		super(name, mileage, kind);

		this.tire = tire;
		this.wing = wing;
	}
	
	// setter/getter 메소드
	public void setTire(int tire) {
		this.tire = tire;
	}
	public int getTire() {
		return tire;
	}
	
	public void setWing(int wing) {
		this.wing = wing;
	}
	public int getWing() {
		return wing;
	}
	
	// information 메소드
	@Override
	public String information() {
		return super.information() + ", 바퀴수 : " + tire + "개, 날개수 : " + wing + "개";
	}
	
	@Override
	public void howToMove() {
		System.out.print("날개를 가지고 ");
		super.howToMove();
	}
	
	
}

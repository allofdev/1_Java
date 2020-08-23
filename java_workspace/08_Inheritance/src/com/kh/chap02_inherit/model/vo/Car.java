package com.kh.chap02_inherit.model.vo;

public class Car extends Vehicle{
	
	// 필드
	private int tire; // 타이어 갯수
	
	// 기본 생성자
	public Car() { }
	
	// 매개변수 생성자
	public Car(String name, double mileage, String kind, int tire) {
		super(name, mileage, kind);
		
		this.tire = tire;
	}
	
	// setter/getter 메소드
	public void setTire(int tire) {
		this.tire = tire;
	}
	public int getTire() {
		return tire;
	}
	
	// information 메소드
	@Override	// 재정의한 메소드. 부모클래스의 메소드와 반환형 메소드명 매개변수 모두 같아야 함	// 자식메소드에서 Override하면 부모클래스에서는 실행안됨 --> 실행하려면 super을 통해 호출하면됨!!!!!!!!!
	public String information() {
		return super.information() + ", 바퀴수 : " + tire + "개";
	}
	
	@Override
	public void howToMove() {
		System.out.print("바퀴를 굴려가며 ");  
		super.howToMove();
	}
	
}

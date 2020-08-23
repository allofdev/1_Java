package com.kh.chap02_abstractAndinterface.part01_abstract.model.vo;

public abstract class Sports {
	
	// 필드
	private int people; // 해당 스포츠에 참여하는 명수
	
	// 기본 생성자
	public Sports() {}
	
	// 매개변수 생성자
	public Sports(int people) {
		this.people = people;
	}
	
	// setter/getter 메소드
	public void setPeople(int people) {
		this.people = people;
	}
	
	public int getPeople() {
		return people;
	}
	
	// toString 메소드
	public String toString() {
		return "참여하는 명수" + people + "명";
	}
	
	// 추상메소드 (미완성된 메소드) ---> 중괄호로 열고 닫으면 완성된 메소드
	public abstract void rule();
	
	/*
	 * 객체에서 배운 추상이랑 다름
	 * 
	 * 추상메소드 (미완성된 메소드로 내용 구현이 되어있지 않은 메소드)
	 * --> 몸통부( {} )가 구현되어있지 않음
	 * --> 미완성된 추상메소드가 현재 이클래스에 있다란 소리 == 이 클래스 또한 미완성된 클래스 == 추상클래스로 작성해야됨!!!
	 * 
	 * abstract -> 추상을 뜻하는 예약어
	 */
}
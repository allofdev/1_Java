package com.kh.chap02_abstractAndinterface.part01_abstract.model.vo;

public class FootBall extends Sports {
	
	
	
	
	
	// 부모클래스에 있는 추상메소드를 강제로 오버라이딩(재정의)
	// 미완성된 추상메소드를 자식메소드에서 완성시킴
	@Override
	public void rule() {
		System.out.println("손이 아닌 발로 공을 차야만한다.");
	}
	
	
	
	
	
}

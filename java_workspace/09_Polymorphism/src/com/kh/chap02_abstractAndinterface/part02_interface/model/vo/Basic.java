package com.kh.chap02_abstractAndinterface.part02_interface.model.vo;

public interface Basic {
	
	// 추상클래스 --> 일반필드 + 일반메소드 + [추상메소드]		-- 추상메소드는 있어도 되고 없어도 됨 -- 있으면 자식 클래스에서 무조껀 오버라이딩해야됨
	// 인터페이스 --> only 상수(public static final)필드  + 추상메소드
	
	// 상수 필드
	// 인터페이스에서의 필드는 무조건 상수필드이기 때문에 생략 가능 
	/*public static final*/ int NUM = 10;  	
	
	// 추상 메소드
	// 인터페이스에서의 메소드는 무조건 추상메소드이기 떄문에 생략 가능
	/*public abstract*/ void eat();
	/*public abstract*/ void sleep();
	
}
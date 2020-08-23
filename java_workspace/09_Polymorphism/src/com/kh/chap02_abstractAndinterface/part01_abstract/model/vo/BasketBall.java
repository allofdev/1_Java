package com.kh.chap02_abstractAndinterface.part01_abstract.model.vo;

public class BasketBall extends Sports{

	
	
	
	// 미완성된 추상메소드를 자식메소드에서 완성시킴
	@Override
	public void rule() {
		System.out.println("공을 던져 링에 넣어야된다.");
	}
}

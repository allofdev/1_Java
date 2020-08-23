package com.kh.chap04_field.model.vo;

// 전역변수 중  클래스변수(static변수)
public class FieldTest3 {
	
	// static : 공유의 개념 (메모리 영역에 단 한번 올려놓고 공유해서 갖다 쓰자!!)
	// 생성 시점 : 프로그램 실행하자 마자 Static 메모리영역에 할당 (궂이 해당 이클래스가지고 생성안해도!!)
	public static String sta = "static";	// static을 사용하면 변수명이 기울이기됨
	
	
	// final : 상수(한번 지정한 값은 변경 불가!!)
	// 상수 필드(public static final)
	public static final int NUM = 1; // 예약어를 두개 사용한것임
	public final static String TEST = "컴퓨터";
}

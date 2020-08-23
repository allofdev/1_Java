package com.kh.chap06_method.controller;

public class MethodTest1 {

	// 메소드
	/*
	 * 접근제한자 [예약어] 반환할값의자료형 메소드명([매개변수, 매개변수 ...]){
	 * 		수행할 코드;
	 * 		수행할 코드;
	 * 
	 * 		[return 반환값;]
	 * 
	 *  }
	 */
	
	// 매개변수 유무와 반환값 유무에 따른 구분
	
	// 1. 매개변수 없고 반환값도 없는 메소드
	public void method1() {
		System.out.println("매개변수와 반환값이 둘 다 없는 메소드입니다.");
		//return;   사실상 모든 메소드에 return이 있음      void이기 때문에 return생략가능
	}
	
	// 2. 매개변수는 없지만 반환값은 있는 메소드
	public double method2() {
		System.out.println("매개변수 없지만 반환값은 있는 메소드입니다.");
		return Math.random();
	}
	
	// 3. 매개변수는 있지만 반환값은 없는 메소드
	public void method3(int num1, int num2) {
		System.out.println("매개변수는 있지만 반환값은 없는 메소드입니다.");
		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
	}
	
	// 4. 매개변수도 있고 반환값도 있는 메소드
	public int method4(int num1, int num2) {
		System.out.println("매개변수도 있고 반환값도 있는 메소드입니다.");
		return num1 - num2;
	}
}
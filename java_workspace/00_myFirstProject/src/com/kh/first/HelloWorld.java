package com.kh.first;

// 주석: 소스코드와 무관한 즉, 코드로 인식 안됨 => 주로 코드에 대한 설명을 작성할때 사용

/* 
 * 여러줄
 * 주석
 */

public class HelloWorld {
	
	// 기능 == 메소드 
	// 한 클래스 안에 여러개의 메소드르 만들 수 있음
	// 프로그램 실행 시 제일 먼저 실행되는 메소드 == main메소드(실행메소드)
	public static void main(String[] args) {
		
		// 화면에 출력하고 싶을 때 출력문을 통해 작업 (print, println, printf)
		
		// System.out.println(출력하고자하는 값); --> 해당 구문 출력 후 "한줄 띄어주는(개행)" 역할
		System.out.println("Hi EveryOne!!");
		
		// System.out.print(출력하고자하는 값); --> 해당 구문만 출력하고 끝 --> 한줄 띄어쓰기 X
		System.out.print("안녕하세요~~");

		System.out.print("여러분~~");
		
		// 각 클래스마다 역할별로 나눠서 관리
		// 각 클래스안에서도 해당 코드들도 각 기능별로 메소드로 따로 작성함!
		
	}
	
}


/*배운 클래스 순서
 * 1일차
 * HelloWorld
 * A_MethodPrinter
 * RunA
 * B_ValuePrinter
 * RunB
 * 
 * 2일차
 * A_Variable --> 패키지 없이만든 클래스
 * A_Variable --> com.kh.variable.A_Variable
 * */
 
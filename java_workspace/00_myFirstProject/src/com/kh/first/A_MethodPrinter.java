package com.kh.first;            // 패키지 선언부 : 해당 클래스가 어떤패키지에 속해있는지

public class A_MethodPrinter {      // 클래스명은 대문자로 시작!

		
	// 기능 단위 == 메소드
	// 클래스마다 무조건 메인 메소드를 포함할 필요없음!
	
	//일반 메소드 public void 메소드명 () {}
	public void methodA() {     // 메소드명은 소문자로 시작!
		System.out.println("methodA 호출되었어요!!");
		methodB();  // 같은 클래스 내 메소드 호출 시 바로 그냥 메소드명();
	}

	public void methodB() {
		System.out.println("methodB 호출되었어요!!");
		methodC();
	}
	
	public void methodC() {
		System.out.println("methodC 호출되었어요!!");
		//methodA();  -->  이게 있으면 무한반복 됨
	}
	
}

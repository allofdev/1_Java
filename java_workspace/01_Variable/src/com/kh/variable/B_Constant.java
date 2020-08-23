package com.kh.variable;

public class B_Constant {
	
	// 상수
	public void finalConstant() {
		
		// 자료형 변수명 = 값;  => 변수(변하는 수)(얼마든지 변경 가능)
		int age = 20;
		
		System.out.println("age: " + age);
		
		age = 21;    // 자료형은 한번만 기술해야됨. 즉, 숫자 값을 변경할 때는 자료형입력 x
		
		System.out.println("age: " + age);
		
		
		// final 자료형 변수명 = 값;		=> 상수(항상 같은 수) 한번 값을 입력하면 변경 불가함
		// 상수의 이름은  다 대문자로 해주는게 권장사항!
		
		final int AGE = 20;
		
		System.out.println("AGE: " + AGE);
		
		//AGE = 21; final로 한번 지정된 값 변경 불가!!
		System.out.println("상수 값은 한 번 지정된 값은 변경 불가하다.");
		
	}
}
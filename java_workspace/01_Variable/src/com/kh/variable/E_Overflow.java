package com.kh.variable;

public class E_Overflow {
	
	public void overflow() {
		// byte 자료형에 저장 가능한 범위 : -128 ~ 127
		
		// byte bNum = 128; // 명시적으로 범위에 벗어난 숫자 제시시 빨간줄 뜸!
		
		byte bNum = 127;	// byte 최대값
		
		bNum++;	// bNum에 담긴 값 1증가시키겠다!!
		
		// 1 ... 126 127 -128 -127 -126 ...
		// 담을 수 있는 범위를 넘어가면 다시 처음부터 시작
		
		System.out.println("bNum : " + bNum);
		
		// 연산시 저장한 가능한 값의 범위를 벗어나는 걸 오버플로우 라고 함!!
		// 문제가 뜨진 않음!! 단 예측불가한 값이 담길 수 있다!!
		
		
		
	}
	
}







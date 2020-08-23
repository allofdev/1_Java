package com.kh.variable;

public class F_Printf {
	
	public void printfMethod() {
		
		// println(출력하고자하는 값); --> 출력 후 개행
		// print(출력하고자하는 값); --> 출력
		
		// System.out.printf("출력하고싶은 형식", 출력하고자하는 값, 값, 값);
		// 출력하고자 하는 값들이 내가 제시한 포맷(형식)에 맞춰서 출력만 진행 --> 한줄띄어쓰기 안해줌!
		
		/*
		 * %d : 정수값 들어갈 자리임
		 * %f : 실수값 들어갈 자리임
		 * %c : 문자값 들어갈 자리임(한 글자)		%C : 대문자
		 * %s : 문자열값 들어갈 자리임(문자도 가능)	%S : 대문자
		 */
		
		// \n : 개행 \t : 탭
		
		int iNum1 = 10; 
		int iNum2 = 20;
		
		// 10
		System.out.println(iNum1);
		System.out.print(iNum1 + "\n");
		System.out.printf("%d\n", iNum1, iNum2); // 뒤에 값은 무시됨! (prinf도 개행해주지 않기 때문에 다음줄을 위해 \n입력)
		// System.out.printf("%d"); // 에러발생 --> 포맷에 들어갈 값이 없어서
		
		// 10 + 20 = 30
		// xx + xx = xx
		System.out.println(iNum1 + " + " + iNum2 + " = " + (iNum1 + iNum2));
		System.out.printf("%d + %d = %d\n", iNum1, iNum2, iNum1 + iNum2);	//개행을 위해 \n 입력
		
		// "iNum1 : 10, iNum2 : 20"
		System.out.println("iNum1 : " + iNum1 + ", " + "iNum2 : " + iNum2);
		//System.out.printf("iNum1 : %d, iNum2 : %d\n", iNum1, iNum2);
		System.out.printf("iNum1 : %d, iNum2 : %d\n", iNum1, iNum2);
		                  
		
		System.out.printf("%5d\n", iNum1);	// 5 : 5칸 공간 확보 후 / 양수 : 오른쪽 정렬하겠음!
		
		double dNum1 = 1.2345458;
		double dNum2 = 4.53;
		
		System.out.printf("%f %f\n", dNum1, dNum2); // %f - 실수값을 무조건 소수점 아래 6째자리까지 보여줌
													// 		만약 넘어가면 반올림, 모자라면 0으로 채워짐
		
		System.out.printf("%.1f\t%.1f\n", dNum1, dNum2); // %.1f 소수점 첫번째 자리까지 출력
		
		char ch = 'a';
		String str = "Hello";
		
		System.out.printf("%c %s\n", ch, str);	// 대문자로도 출력 가능
		
		
		
		
	}
	
	
}
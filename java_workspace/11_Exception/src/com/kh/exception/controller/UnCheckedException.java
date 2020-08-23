package com.kh.exception.controller;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UnCheckedException {
	
	// 프로그램 실행시 발생하는 예외들
	/*
	 * * RuntimeException
	 *   - 프로그램 실행시 발생하는 예외들 (문법적으로 문제되진 않음!!) --> 예외처리가 필수는 아님 --> 코드로 해결가능하기때문
	 * 
	 * * RuntimeException의 후손들
	 * - NullPointerException : 레퍼런스 변수가 null인 상태에서 메소드를 호출하는 경우
	 * - ArrayIndexOutOfBoundsException : 배열의 접근에 부적절한 인덱스 값 제시했을 경우 ex)배열크기3인데 5번쨰 배열 출력할때
	 * - ClassCastException : 허용할 수 없는 형변환이 진행되는 경우
	 * - ArithmeticException : 나누기 연산시 0으로 나누는 경우 ex) 분모가 0일때
	 * - NegativeArraySizeException : 배열의 크기를 음수로 지정하는 경우
	 * 
	 */
	
	private Scanner sc = new Scanner(System.in);
	
	public void method1() {
		// ArithmeticException : 나누기 연산시 0으로 나누는 경우
		
		// 사용자에게 두개의 정수값을 입력받은 후 나눗셈 연산후 결과 출력
		
		System.out.print("정수 1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("정수2 (0 입력하지마세요): ");
		int num2 = sc.nextInt();
		
		// 애초에 예외자체가 밸생 안되게끔 조건검사 => 예외처리 아님!!
		/*
		int result = 0;
		if(num2 != 0) {
			result = num1/ num2;
			
		}else {
			System.out.println("혼날래?");
		}
		
		System.out.println("결과 : " + result);
		
		System.out.println("프로그램을 종료합니다.");
		*/
		
		//===================================================
		
		// 예외처리 : 예외가 발생했을 때 처리하는 구문을 미리 기술해두는거
		/*
		 * * try catch 방법
		 * 
		 * try {
		 * 		예외가 발생될법한 구문;
		 * 		예외가 발생될법한 구문;
		 *
		 * }catch(발생될예외클래스명  변수명) {
		 * 		해당 예외가 발생되는 경우 처리할 구문;
		 * }
		 * }catch(발생될예외클래스명  변수명) {
		 * 		해당 예외가 발생되는 경우 처리할 구문;
		 * }
		 * 
		 */
		int result = 0;
		
		try {
			result = num1/ num2;			
		}catch(ArithmeticException e){
			System.out.println("0으로 나눌 수 없습니다.");
		}
		
		System.out.println("결과 : " + result);
		System.out.println("프로그램을 종료합니다.");
		
	}
	
	public void method2() {
		
		// NegativeArraySizeException : 배열 크기 지정시 음수로 지정했을 경우
		
		
		// 애초에 예외자체가 발생 안되게끔 조건처리 가능
		/*
		System.out.print("배열의 크기 입력(양수만 입력) : ");
		int size = sc.nextInt();
		
		if(size > 0) {
			int[] arr = new int[size];
			System.out.println("0번 인덱스 값 : " + arr[0]);
		}
		
		System.out.println("프로그램을 종료합니다.");
		*/
		
		//=======================================================
		
		// 예외처리
		
		System.out.print("배열의 크기 입력(양수만 입력) : ");
		
		try {
			int size = sc.nextInt(); // InputMismatchException // 문자열 입력하면 오류
			int[] arr = new int[size]; //NegativeArraySizeException // 음수입력시
			System.out.println("0번 인덱스 값 : " + arr[0]); //ArrayIndexOutOfBoundsException // 0입력시 배열의 크기가0인데 arr[0]번째 출력하려고하면 오류  // (arr[0]은 배열의 크기가1 일때임!) 
		}catch(RuntimeException e) { // 예외클래스들의 부모 클래스하나로 모든 예외처리가능
			System.out.println("예외발생했습니다.."); // 자식예외클래스들을 같이 사용하려면 부모예외클래스를 가장 아래에 입력											        
		}/*catch(NegativeArraySizeException e){
			System.out.println("양수를 입력하세요.");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("부적절한 인덱스에 접근했습니다.");  
		}catch(InputMismatchException e) {
			System.out.println("정수값을 입력해주세요");
		}
		*/
		
		System.out.println("프로그램을 종료합니다.");
		
	}
		
	// UnCheckedException 는 예외처리를 해도 되고 안해도됨
	// 예측 가능한 상황에 있어서 if문으로 조건처리 가능하다고 하면
	// 애초에 예외가 발생하기 전에 조건문으로 핸들링해주는게 권장사항!!!
		
}
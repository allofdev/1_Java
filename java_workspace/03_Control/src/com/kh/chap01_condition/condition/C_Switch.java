package com.kh.chap01_condition.condition;
import java.util.Scanner;

public class C_Switch {
	
	/*
	 * switch문과 if문의 차이점
	 * 
	 * if문은 조건식에서 범위지정 가능했음!! (대소비교연산자) + ( == equals() 동등비교연산자) + (& || 논리연산자)
	 * switch문은 확실한 값의 조건			only 동등비교
	 * 
	 * switch(동등비교할대상자) {			//동등비교할대상자는 반드시 int값, char값, String만 가능!!!
	 * case 값1 : 실행코드1; break;
	 * case 값2 : 실행코드2; break;
	 * case 값3 : 실행코드3; break;
	 * ...
	 * [default : 위의 조건에 다 만족하지 않을 경우 반드시 실행할 코드;] --- 생략 가능
	 * }
	 * 
	 * 비교할대상자 == 값1 의 조건이 true일 경우 실행코드1을 수행하고 break를 만나 빠져나감
	 * 단, false일 경우 값2와 다시 동등비교 수행...
	 * 
	 * case에 제시한 모든 값들과 일치하지 않을 경우 default에 제시되어있는 구문이 반드시 실행!! (else문과도 같은 존재)
	 * 
	 * * 주의할 점
	 * if-else if문과 달리 실행코드 실행하고 자동으로 빠져나가지 못함.. break 걸어줘야됨!!
	 */
	
	public void method1() {
		// 사용자에게 1~3사이의 정수를 입력받아
		// 1인 경우 "빨간색입니다." 출력
		// 2인 경우 "파란색입니다." 출력
		// 3인 경우 "초록색입니다." 출력
		// 잘못입력했을 경우 "잘못입력하였습니다." 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수(1~3) : ");
		int num = sc.nextInt();
		
		// if문
		/*
		if(num == 1) {
			System.out.println("빨간색입니다.");
		}else if(num == 2) {
			System.out.println("파란색입니다.");
		}else if(num == 3) {
			System.out.println("초록색입니다.");
		}else {
			System.out.println("잘못입력하였습니다.");
		}
		*/
		
		// 위의 if문을 switch문으로 변경
		
		switch(num) {
		case 1 : System.out.println("빨간색입니다."); break;
		case 2 : System.out.println("파란색입니다."); break;
		case 3 : System.out.println("초록색입니다."); break;
		default : System.out.println("잘못입력하였습니다."); //마지막에는 break; 을 할필요 없음
		
		}
		
	}
	
	public void method2() {
		// 사용자에게 과일이름(사과, 바나나, 복숭아, 키위)을 입력받아
		// 사과일 경우 => 1000
		// 바나나일 경우 => 2000
		// 복숭아일 경우 => 5000
		// 키위일 경우 => 4000
		// 잘못입력했을 경우 => 잘못입력하였습니다. 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("과일이름(사과, 바나나, 복숭아, 키위) 입력 : ");
		String fruit = sc.nextLine();
		
		// if문
		/*
		if(fruit.equals("사과")) {
			
		}else if(fruit.equals("바나나")) {
			
		}else if(fruit.equals("복숭아")) {
			
		}else if(fruit.equals("키위")) {
		
		}
		*/
		// 위의 if문을 switch문으로 변경
		
		int price = 0;
		
		switch(fruit) {
		case "사과" : price = 1000; break;
		case "바나나" : price = 2000; break;
		case "복숭아" : price = 5000; break;
		case "키위" : price = 4000; break;
		default : System.out.println("잘못입력하였습니다."); return; // return; 메소드 빠져나가기
		}
		
		// "xx의 가격은 xxx원 입니다."
		System.out.printf("%s의 가격은 %d원 입니다.", fruit, price);
	
	}
	
	public void method3() {
		
		// break가 없는 switch문 사용
		
		// 사용자에게(1, 2, 3) 등급을 입력 받은 후
		// 3등급일 경우 => 관리 권한, 글쓰기 권한, 읽기 권한
		// 2등급일 경우 => 글쓰기 권한, 읽기 권한
		// 1등급일 경우 => 읽기 권한
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("등급(1, 2, 3) 입력 : ");
		int level = sc.nextInt();
		
		switch(level) {
		case 3: System.out.println("나 관리 권한있어");
		case 2: System.out.println("나 글쓰기 권한있어");
		case 1: System.out.println("나 읽기 권한있어"); break;
		default: System.out.println("잘못입력했습니다.");
		}
		
	}
	
	public void method4() {
		
		
		// 1월~12월까지 입력받아 해당하는 달의 마지막 날짜를 출력하세요
		
		// 1, 3, 5, 7, 8, 10, 12	=> "입력하신 월은 31일까지 입니다."
		// 4, 6, 9, 11				=> "입력하신 월은 30일까지 입니다."
		// 2						=> "입력하신 월은 28일 또는 29일까지 입니다."
		// 잘못입력했을 경우				=> "반드시 1~12월까지를 입력해야 합니다."
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1월~12월까지 중 하나를 입력하세요 : ");
		int month = sc.nextInt();
		
		//if문 사용했을떄
		/*
		if(month == 1 || month == 3 || month ==5 ||.....) {
			
		}else if(month == 4 || month == 6 || .....) {
			
		}
		*/
		
		switch(month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12: System.out.println("입력하신 월은 31일까지 입니다."); break;
		case 4:
		case 6:
		case 9:
		case 11: System.out.println("입력하신 월은 30일까지 입니다."); break;
		case 2: System.out.println("입력하신 월은 28일 또는 29일까지 입니다."); break;
		default: System.out.println("반드시 1~12월까지를 입력해야 합니다."); return;
		
		}
		
	}
	
}
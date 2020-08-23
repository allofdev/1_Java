package com.kh.chap01.practice.example;
import java.util.*;

public class ConditionPractice {
	
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1. 입력\n2. 수정\n3. 조회\n4. 삭제\n9. 종료"
				+ "\n메뉴 번호를 입력하세요 : ");
		int menu = sc.nextInt();
		String result = "";
		
		if (menu == 1) {
			result = "입력";
		}else if (menu == 2) {
			result = "수정";
		}else if (menu == 3) {
			result = "조회";
		}else if (menu == 4) {
			result = "삭제";
		}else if (menu == 9) {
			System.out.println("프로그램이 종료됩니다.");
			return;
		}else {
			System.out.println("잘못 입력하였습니다.");
			return;
		}
		System.out.printf("%s 메뉴입니다.", result);
	}
	
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 한 개 입력하세요 : ");
		int num = sc.nextInt();
		
		if (num > 0 && num % 2 == 0) {
			System.out.println("짝수다");
		}else if(num > 0 && num % 2 == 1) {
			System.out.println("홀수다");
		}else {
			System.out.println("양수만 입력해주세요.");
		}
		
	}
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수 : ");
		int kor = sc.nextInt();
		
		System.out.print("수학점수 : ");
		int math = sc.nextInt();
		
		System.out.print("영어점수 : ");
		int eng = sc.nextInt();
		
		int sum = kor + math + eng;
		
		double avg = sum / 3.0;
		
		String result = "";
		
		if (kor >= 40 && math >= 40 && 
			eng >= 40 && avg >= 60) {
			result = "축하합니다, 합격입니다!";
		} else {
			System.out.println("불합격입니다.");
			return;
		}
		
		System.out.printf("국어 : %d\n수학 : %d\n영어 : "
				+ "%d\n합계 : %d\n평균 : %.1f\n%s", 
				kor, math, eng , sum, avg, result);
		
	}
	
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~12 사이의 정수 입력 : ");
		int month = sc.nextInt();
		
		String season = "";
		
		switch(month) {
		case 12:
		case 1:
		case 2: season = "겨울"; break;
		case 3:
		case 4:
		case 5: season = "봄"; break;
		case 6:
		case 7:
		case 8: season = "여름"; break;
		case 9:
		case 10:
		case 11: season = "가을입니다."; break;
		default: season = "잘못 입력된 달";
		}
		System.out.printf("%d월은 %s입니다.", month, season);
		
	}
	
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		String userid = "namgyu";
		String userpwd = "123123";
		
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		
		System.out.print("비밀번호 : ");
		String ps = sc.nextLine();
		
		if(id.equals(userid) && ps.equals(userpwd)) {
			System.out.println("로그인 성공");
		}else if(id.equals(userid)) {
			System.out.println("비밀번호가 틀렸습니다.");
		}else if(ps.equals(userpwd)){
			System.out.println("아이디가 틀렸습니다.");
		}else {
			System.out.println("아이디와 비밀번호 모두 틀렸습니다.");
		}
		
	}
	
	public void practice6() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		String level = sc.nextLine();
		
		switch(level) {
		case "관리자": System.out.println("회원관리, 게시글 관리");
		case "회원": System.out.println("게시글 작성, 댓글 작성");
		case "비회원": System.out.println("게시글 조회"); break;
		default: System.out.println("잘못 입력했습니다.");
		}
		
	}
	public void practice7() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키(m)를 입력해 주세요 : ");
		double height = sc.nextDouble();
		
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double weight = sc.nextDouble();
		
		double bmi = weight / (height * height);
		
		String result = "";
		
		if (bmi < 18.5) {
			result = "저체중";
		}else if (bmi < 23) {
			result = "정상체중";
		}else if (bmi < 25) {
			result = "과체중";
		}else if (bmi < 30) {
			result = "비만";
		}else {
			result = "고도 비만";
		}
		
		System.out.printf("BMI 지수 : %f\n%s", bmi, result);
		
	}
	
	public void practice8() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("피연산자 1 입력 : ");
		int num1 = sc.nextInt();
		
		System.out.print("피연산자 2 입력 : ");
		int num2 = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("연산자를 입력(+,-,*,/,%) : ");
		char ch = sc.nextLine().charAt(0);
		
		int result = 0;	// 연산기호에 따라 산술연산한 결과를 담을 변수 선언 해놓음
		
		if(num1 > 0 && num2 > 0) {
			
			switch(ch) {
			case '+': result = num1 + num2; break;
			case '-': result = num1 - num2; break;
			case '*': result = num1 * num2; break;
			case '/': result = num1 / num2; break;
			case '%': result = num1 % num2; break;
			default: System.out.println("연산기호를 잘못 입력하셨습니다. 프로그램을 종료합니다."); return;
			}
		}else {
			System.out.println("피연산자를 잘못 입력하셨습니다. 프로그램을 종료합니다.");	return;
		}
		
		System.out.printf("%d %c %d = %d", num1, ch, num2, result);
	
	}
	
	public void practice9() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("중간 고사 점수 : ");
		double mid = sc.nextDouble() * 0.2;
		
		System.out.print("기말 고사 점수 : ");
		double fin = sc.nextDouble() * 0.3;
		
		System.out.print("과제 점수 : ");
		double hw = sc.nextDouble() * 0.3;
		
		System.out.print("출석 회수 : ");
		double at = sc.nextDouble();
		
		double sum = mid + fin + hw + at;	// 도합 100점 만점 기준으로 총점
		
		System.out.println("==========결과==========");
		
		if (sum >= 70 && at >= 20 * 0.7) {
			System.out.println("중간 고사 점수 :	(20)" + mid);
			System.out.println("기말 고사 점수 :	(30)" + fin);
			System.out.println("과제 점수	  :	(30)" + hw);
			System.out.println("출석 점수	  :	(20)" + at);
			System.out.println("총점 : " + sum);
			System.out.println("PASS");
		}else if(at >= 20 * 0.7) {
			System.out.printf("FAIL [점수미달] (총점 %.1f)", sum);
		}else if(sum >= 70) {
			System.out.printf("FAIL [출석 횟수 부족] (%.0f/20)", at);
			
		}else {
			System.out.printf("FAIL [점수미달] (총점 %.1f) \n", sum);
			System.out.printf("FAIL [출석 횟수 부족] (%.0f/20)", at);
		}
		
	}
	
	public void practice10() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. 메뉴 출력");
		System.out.println("2. 짝수/홀수");
		System.out.println("3. 합격/불합격");
		System.out.println("4. 계절");
		System.out.println("5. 로그인");
		System.out.println("6. 권한 확인");
		System.out.println("7. BMI");
		System.out.println("8. 계산기");
		System.out.println("9. Pass/Fail");
		System.out.print("선택 : ");
		int menu = sc.nextInt();
		
		switch (menu) {
		case 1: practice1(); break;
		case 2: practice2(); break;
		case 3: practice3(); break;
		case 4: practice4(); break;
		case 5: practice5(); break;
		case 6: practice6(); break;
		case 7: practice7(); break;
		case 8: practice8(); break;
		case 9: practice9(); break;
		default: System.out.println("다시 입력해주세요"); return;
		
		}
		
	}
	
}
package com.kh.practice.example;
import java.util.*;

public class OperatorPractice {
	
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		String result = (num > 0? "양수다" : "양수가 아니다");
		
		System.out.println(result);
	
	}
	
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		String result = (num > 0? "양수다" : (num == 0? "0이다" : "음수다"));
		
		System.out.println(result);
	
	}
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		String result = (num % 2 == 0? "짝수다" : "홀수다");
		
		System.out.println(result);
		
	}
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원 수 : ");
		int num1 = sc.nextInt();
		
		System.out.print("사탕 개수 : ");
		int num2 = sc.nextInt();
		int result1 = num2 / num1;
		int result2 = num2 % num1;
		
		System.out.println("1인당 사탕 개수 : " + result1);
		System.out.println("남은 사탕 개수 : " + result2);
		
	}
	
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();	
		
		System.out.print("학년(숫자만) : ");
		int grade = sc.nextInt();	
		
		System.out.print("반(숫자만) : ");
		int group = sc.nextInt();	
		
		System.out.print("번호(숫자만) : ");
		int num = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("성별(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		
		String result = (gender == 'M' || gender == 'm'? "남" : (gender == 'Y' || gender == 'y' ? "여" : "오류"));
		
		
		System.out.print("성적(소수점 아래 둘째 자리까지 ) : ");
		
		double score = sc.nextDouble();
		
		System.out.println(grade + "학년 " + group + "반 " + num +
				"번 " + name + " " + result + "학생의 성적은 " + score + "이다.");
	
		System.out.printf("%d학년 %d반 %d번 %s %s학생의 성적은 %.2f이다.", grade, group, num, name, result, score);
	}
	
	public void practice6() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		String result = age <= 13? "어린이" : (age > 13 && age <=19)? "청소년" : age > 19? "성인" : "오류";
		
		System.out.println(result);
		
	}
	
	public void practice7() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		
		System.out.print("수학 : ");
		int math = sc.nextInt();
		
		int sum = (kor + eng + math);
		
		double avg = sum / 3.0;	// (double)int / double => 300.0 / 3.0 => double (int(4byte) -> double(8byte)자동형변환 됨)
								// int / int => 결과값 int => 소수점 표현이 어렵기 때문에 데이터 손실 발생
		
		String result = (kor >= 40 && eng >= 40 && math >=40 && avg >=60? "합격" : "불합격");
		
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
		System.out.println(result);
		
	}
	
	public void practice8() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민번호를 입력하세요(- 포함)");
		
		String str = sc.nextLine();
		
		char ch = str.charAt(7);
		
		String result = (ch == '1' || ch == '3'? "남자" : 
						(ch == '2' || ch == '4'? "여자" : "오류"));
		
		System.out.println(result);
		
	}
	
	public void practice9() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		
		System.out.print("입력 : ");
		int num3 = sc.nextInt();
		
		String result = num1 < num2? (num3 <= num1 || num3 > num2? "true" : "false") : "정수1이 정수2보다 작아야 합니다";
		
		System.out.println(result);
		
	}
	
	public void practice10() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("입력2 : ");
		int num2 = sc.nextInt();
		
		System.out.print("입력3 : ");
		int num3 = sc.nextInt();
		
		String result = num1 == num2 && num1 == num3? "true" : "false";
		
		System.out.println(result);
		
	}
	
	
	
}

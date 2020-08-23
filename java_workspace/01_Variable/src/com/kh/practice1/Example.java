package com.kh.practice1;
import java.util.Scanner;

public class Example {
	
	public void method1() {
		
		Scanner sc = new Scanner(System.in);
		
		// 입력
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		System.out.print("나이를 입려하세요 : ");
		int age = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("성별을 입력하세요(남/여) : ");
		char gender = sc.nextLine().charAt(0);
		
		System.out.print("키를 입력하세요(cm) : ");
		double height = sc.nextDouble();
		
		// 결과 출력
		System.out.println("키 " + height + "인 " + age + "살 " + gender + "자 " +
		name + "님 반갑습니다^^");
		
	}
	
	public void method2() {
		
		// 입력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수를 입력하세요 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 정수를 입력하세요 : ");
		int num2 = sc.nextInt();
		
		// 결과 출력
		System.out.println("더하기 결과 : " + (num1 + num2));
		System.out.println("빼기 결과 : " + (num1 - num2));
		System.out.println("곱하기 결과 : " + (num1 * num2));
		System.out.println("나누기 몫 결과 : " + (num1 / num2));
		
	}
	
	public void method3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로 : ");
		double width = sc.nextDouble();
		
		System.out.print("세로 : ");
		double height = sc.nextDouble();
		
		
		// 결과 출력
		// 방법1 변수 사용
		double area = width * height; // 면적
		double perimeter = (width + height) * 2; // 둘레
		System.out.println("(변수 사용)면적 : " + area);
		System.out.println("(변수 사용)둘레 : " + perimeter);
		
		// 방법2
		System.out.println("면적 : " + width * height);
		System.out.println("둘레 : " + (width + height) * 2);
		
	}
	
	public void method4() {
			
		Scanner sc = new Scanner(System.in);
		
		System.out.print("적어도 3글자 이상의 문자열을 입력하세요 : ");
		String str = sc.nextLine();
		
		
		// 문자열.chartAt(인덱스);	
		
		// 결과 출력				
		// 방법1 변수 사용
		char ch1 = str.charAt(0);
		char ch2 = str.charAt(1);
		char ch3 = str.charAt(2);
		System.out.println("(변수 사용)첫 번째 문자 : " + ch1);
		System.out.println("(변수 사용)두 번째 문자 : " + ch2);
		System.out.println("(변수 사용)세 번째 문자 : " + ch3);		
		
		// 방법2
		System.out.println("첫 번째 문자 : " + str.charAt(0));
		System.out.println("두 번째 문자 : " + str.charAt(1));
		System.out.println("세 번째 문자 : " + str.charAt(2));
		
	}

}
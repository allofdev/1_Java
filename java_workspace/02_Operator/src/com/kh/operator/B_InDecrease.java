package com.kh.operator;

public class B_InDecrease {
	
	/*
	 * * 증감연산자 (단한영산자)
	 * 
	 * ++ : 값을 1증가시키는 연산자
	 * -- : 값을 1감소시키는 연산자
	 * 
	 * (증감연산자)값  : 전위 연산자	--> 선증감 후처리
	 * 값(증감연산자) : 후위 연산자	--> 선처리 후증감
	 */
	
	public void method1() {
		
		// 전위 연산 테스트
		int num1 = 10;
		System.out.println("전위연산 적용 전 num1의 값 : " + num1);		// num1 = 10 출력
		System.out.println("1회 수행 후 결과 : " + ++num1);			// num1 = 11 출력
		System.out.println("2회 수행 후 결과 : " + ++num1);			// num1 = 12 출력
		System.out.println("전위연산 적용 후 num1의 값 : " + num1);		// num1 = 12 출력
		
		System.out.println("=============================");
		
		// 후위 연산 테스트
		int num2 = 10;
		System.out.println("후위연산 적용 전 num2의 값 : " + num2);		// num2 = 10 출력
		System.out.println("1회 수행 후 결과 : " + num2++);			// num2 = 10 출력 후 --> 11로 증가
		System.out.println("2회 수행 후 결과 : " + num2++);			// num2 = 11 출력 후 --> 12로 증가
		System.out.println("후위연산 적용 후 num2의 값 : " + num2);		// num2 = 12 출력
		
	}
	
	public void method2() {
		
		// 전위연산
		System.out.println("전위연산");
		int a = 10;
		int b = ++a;	// a = 11	b = 11
		System.out.println("a : " + a + ", b : " + b);
		
		int num2 = 20;
		int result2 = ++num2 * 3;	// num2 = 21	result2 = 21 * 3 = 63
		System.out.println("num2 : " + num2 + ", result2 : " + result2);
		
		System.out.println("=======");
		
		// 후위연산
		System.out.println("후위연산");
		int c = 10;
		int d = c++;	// c = 10(11)	d = 10
		System.out.println("c : " + c + ", d : " + d);
		
		int num1 = 20;
		int result = num1++ * 3;	// num1 = 20(21)	result = 20 * 3 = 60
		System.out.println("num1 : " + num1 + ", result : " + result);
	}
	
	public void method3() {
		
		int a = 10;
		int b = 20;
		int c = 30;
		
		System.out.println(a++);	//10(11)	--> 10출력
		
		System.out.println((++a) + (b++));	//12 + 20(21)	--> 32출력
		
		System.out.println((a++) + (--b) + (--c));	//12(13) + 20 + 29	--> 61출력
		
		System.out.println("a : " + a);	// 13출력
		System.out.println("b : " + b);	// 20출력
		System.out.println("c : " + c);	// 29출력
		
	}
	
	public void method4() {
		
		int a = 10;
		int b = 10;
		int c = 20;
		
		System.out.println(++a - --b);	// 11 - 9	--> 2출력
		System.out.println(--b + c++);	// 8 + 20(21)	--> 28출력
		System.out.println(a++ + b-- * c++);	// 11(12) + 8(7) * 21(22)	--> 179출력
		
		System.out.println("a : " + a);	// 12출력
		System.out.println("b : " + b);	// 7출력
		System.out.println("c : " + c );	// 22출력
		
	}
	
	
	
	
}
package com.kh.operator;

public class C_Arithmetic {
	
	// 산술 연산자 (이항 연산자 == 두 개의 값을 가지고 연산하는 연산자 )
	// + - * / %(나머지)
	
	// 	* / %	(+ - 보다 우선순위가 더 높다)
	// 	+ -
	
	public void method1() {
		
		int num1 = 10;
		int num2 = 4;
		
						// 괄호 안에 묶지 않으면 문자열부터 + 되기때문에 아래와 같은 결과 발생함
						// "num1 + num2 = 10" + num2
						// "num1 + num2 = 104"		
		System.out.println("num1 + num2 = " + num1 + num2);
		//System.out.println("num1 - num2 = " + num1 - num2);	//괄호를 안하면 문자열 빼기 숫자가 되기 때문에 오루가 나게됨
		
		System.out.println("num1 + num2 = " + (num1 + num2));	// 14
		System.out.println("num1 - num2 = " + (num1 - num2));	// 6
		System.out.println("num1 x num2 = " + (num1 * num2));	// 40
		System.out.println("num1 / num2 = " + (num1 / num2));	// 2.5		
		System.out.println("num1 % num2 = " + (num1 % num2));	// 
		
		System.out.println(10 / 3);
		System.out.println(10 % 3);
		
	}
	
	public void method2() {
		
		int a = 5;
		int b = 10;
		int c = (++a) + b;
		int d = c / a;
		int e = c % a;
		int f = e++;
		int g = (--b) + (d--);
		int h = 2;
		int i = a++ + b / (--c / f) * (g-- -d) % (++e + h);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		System.out.println(i);
		
	}
	
}
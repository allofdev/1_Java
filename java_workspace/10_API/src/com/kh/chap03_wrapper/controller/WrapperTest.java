package com.kh.chap03_wrapper.controller;

public class WrapperTest {
	
	/*
	 * * Wrapper 클래스
	 * --> 기본자료형을 객체로 포장해주는 클래스가 래퍼클래스(Wrapper클래스)
	 * 
	 *     기본자료형		Wrapper클래스
	 *     boolean <--> Boolean
	 *     char    <--> Character	*
	 *     byte    <--> Byte
	 *     short   <--> Short
	 *     int     <--> Integer		*
	 *     long    <--> Long
	 *     float   <--> Float
	 *     double  <--> Double
	 *     
	 *     - 기본자료형으로 사용을 해도 되지만 프로그램에 따라 해당 기본자료형을 객체로 취급해야 되는 경우 있음
	 *     ex) 메소드 호출해야될때
	 *         메소드의 매개변수로 기본자료형이 아닌 객체 타입만이 요구될 때
	 *         다형성을 적용시키고 싶을 때
	 *     
	 */

	public void method1() {
		
		// Boxing : 기본자료형 --> Wrapper클래스 자료형
		int num1 = 10;
		int num2 = 15;
		
		
		//							----> num1. 하면 아무것도 안나옴
		// 1. 객체 생성을 통한 방법			----> i1. 하면 메소드 이용가능
		Integer i1 = new Integer(num1);	// num1 --> i1
		Integer i2 = new Integer(num2); // num2 --> i2
		
		System.out.println(i1);
		System.out.println(i2);
		
		System.out.println(i1 == i2); // false
		
		// 객체로 바꾸게 되면 메소드들 이용가능
		System.out.println(i1.equals(i2)); // false
		System.out.println(i1.compareTo(i2)); // 두값을 비교해서 앞쪽이 크면 1반환, 뒤쪽이 크면 -1반환, 같으면 0반환
		
		
		// 2. 객체 생성따위 하지 않고 바로 대입하는 방법 (AutoBoxing) --> 같은 타입으로만 가능
		Integer i3 = num2; // num2 --> i3
		
		System.out.println(i3);
		
		// 근데 언제 객체생성을 통해서 변환하냐?		--> 문자열을 Integer 타입으로
		Integer i4 = new Integer("123");	// 객체생성시 문자열도 반환 하능하지만 숫자값만 대입해야됨!
											// "123" --> 123
		System.out.println(i4);
		
		
		
		// UnBoxing : Wrapper 클래스자료형 --> 기본자료형
		
		// 1. 해당 Wrapper 클래스에서 제공하는 xxxValue() 메소드 통해
		// i1 --> num3
		int num3 = i1.intValue();	// 10
		int num4 = i2.intValue();	// 15
		System.out.println(num3);
		System.out.println(num4);
		// 1번 할필요 없음 2번하면됨
		// 그냥 이런 메소드가 있다는걸 배우기위해 사용해봄
		
		// 2. 메소드따위 사용하지 않고 바로 대입하는 방법 (AutoUnBoxing)
		int num5 = i1;
		int num6 = i2;
		System.out.println(i1);
		System.out.println(i2);
		
	}
	
	public void method2() {
		
		// 기본자료형 <--> String
		
		String str1 = "10";
		String str2 = "15.3";
		System.out.println(str1 + str2); // 문자열로 작업됨!!
		
		
		System.out.println("=====");
		// 1. String --> 기본자료형		: 파싱한다(문자열을 기본자료형으로 변환한다)
		//    "10"   --> 10
		//    "15.3" --> 15.3
		
		//    해당Wrapper클래스.parsexxx() 사용 ★★★★★★★★★★★★★★★★★★★★★
		int i = Integer.parseInt(str1);	// 10
		double d = Double.parseDouble(str2); // 15.3
		
		System.out.println(i + d);
		
		
		
		
		
		
		// 2. 기본자료형 --> String
		//    10     --> "10"
		//    15.3   --> "15.3"
		
		/*
		// 기본자료형 --> Wrapper객체 --> String
		String strI = Integer.valueOf(i).toString(); // "10"
		String strD = Double.valueOf(d).toString(); // "15.3"
		*/
		
		// 위에 주석보다 더 쉬운 방법
		// String.valueOf()는 무조껀 문자열로 반환해줌 
		String strI = String.valueOf(i);
		String strD = String.valueOf(d);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
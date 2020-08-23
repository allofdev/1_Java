package com.kh.chap02_String.controller;

public class A_StringPoolTest {

	public void method1() {
			
		// 기본자료형 : boolean, char, byte, short, int, long, float, double
		// 참조자료형 : String, Person, Student, ....
				
		/*
		 * * String 클래스
		 * - 불변 클래스 (변하지 않는 클래스)
		 *   --> 수정하는 순간 그자리에서 변경이 되지 않음
		 */
			
		// 1. 생성자를 통한 문자열 생성 --> String은 클래스이기 때문에 가능
		String str1 = new String("hello");	// 객체생성
		String str2 = new String("hello");	// 객체생성

		System.out.println("\n== 비교");
		System.out.println(str1 == str2); // false (주소값다름)

		System.out.println("\n반환");
		System.out.println(str1);
		System.out.println(str2);
		// toString() --> String 클래스에 이미 오버라이딩 되어있음 실제담긴 문자열 반환

		System.out.println("\nequals 비교");
		System.out.println(str1.equals(str2)); // true (실제담긴 문자열간 비교)
		//  equals() --> String 클래스에 이미 오버라이딩 되어있음 (실제담긴 문자열간 비교)

		System.out.println("\nhashCode");
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		// hashCode() --> String 클래스에 이미 오버라이딩 되어있음 (실제담긴 문자열가지고 해시코드만들기)
		
		System.out.println("\nidentityHashCode");
		// 만약에 정말 정말 주소값에 대해서 알고 싶다면 System.identityHashCode(레퍼런스)
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
	}
	
	public void method2() {
			
		// 2. 문자열을 리터럴로 생성
		String str1 = "hello";
		String str2 = "hello";
		// 리터럴 제시시 상수풀(String pool) 영역에 올라감
		// String Pool 특징 : 동일한 문자열 존재 불가
		
		System.out.println("== 비교");
		System.out.println(str1 == str2); // true (주소값이 일치함)
		
		System.out.println("\n 반환");
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println("\nidentityHashCode");
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		
		// 불변클래스 (변하지 않는 클래스 == 그자리에서 수정되는개념 ㄴㄴ)
		
		str2 = "bcd";
		System.out.println("\nstr2를 첫번째 변경 후 identityHashCode");
		System.out.println(System.identityHashCode(str2)); 
		// 문자열 변경하는 순간 기존의 문자열 자리에서 변경되는게 아닌
		// String Pool 영역의 새로운 곳에  할당 (새로운 주소값 부여받음 == 주소값 변경)
		
		str2 = "abc";
		System.out.println("\nstr2를두번째 변경 후 identityHashCode");
		System.out.println(System.identityHashCode(str2)); 
		
		str2 = "eee";
		System.out.println("\nstr2를세번째 변경 후 identityHashCode");
		System.out.println(System.identityHashCode(str2));		
		
		/*
		 * String 클래스 == 불변클래스
		 * --> 계속 값을 변경하는 경우 가비지컬렉터(GC)가 계속 지워줘야만 하는 단점이 있음
		 * --> 변경이 적고 단지 읽기만 하는 경우  String 클래스가 용이
		 */
		
		str2 = "hello";
		System.out.println("\n다시 처음 값으로 identityHashCode");
		System.out.println(System.identityHashCode(str2));
		
		
		
		
		}
}

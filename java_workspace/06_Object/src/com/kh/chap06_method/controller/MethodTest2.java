package com.kh.chap06_method.controller;

import java.util.Arrays;

import com.kh.chap05_constructor.model.vo.User;

public class MethodTest2 {
	
	public static int num1 = 10;
	public static int num2 = 20;
	
	
	// static이 붙은 메소드
	// 1. 매개변수x, 반환값x
	public static void method1() {
		System.out.println(num1 + num2);
		num2++;
	}
	
	// 2. 매개변수x, 반환값o
	public static int method2() {
		return num1 - num2;
	}
	
	// 3. 매개변수o, 반환값x
	public static void method3(String name) {
		System.out.println(name + "님의 방문을 환영합니다.");
	}
	
	// 4. 매개변수o, 반환값o
	public static String method4(String name) {
		return name + "님의 방문을 환영합니다.";
	}
	
	
	public static int[] test1() {		// 배열 반환 가능
		int[] arr = new int[5];
		arr[0] = 10;
		arr[2] = 5;
		
		return arr;
	}
	
	public static User test2(String userId, String userPwd, String userName) {		// User 사용자정의 자료형 반환가능
		
		User u = new User(userId, userPwd, userName);
		
		return u;
	}
	
	public static void test3(int[] a) {
		
		
	}
	
	
}

package com.kh.chap02_String.controller;
import java.util.StringTokenizer;

public class C_StringTokenizerTest {
	
	public void method1() {
		
		String str = "Java,Oracl,JDBC,HTML,CSS,Spring";
		
		// 구분자를 이용하여 해당 문자열 분리
		
		System.out.println("========== 방법1 ==========");
		// 방법1. 분리된 문자열들을 배열로 차곡차곡담아서 처리하고 싶을 때
		//       String 클래스에서 제공하는 split 메소드 이용
		//       문자열.split(String 구분자) : String[]
		String[] arr = str.split(",");
		
		System.out.println("분리 후 문자열의 갯수 : " + arr.length);
		for(int i=0; i<arr.length; i++) {
			System.out.println("arr[" + i + "] : " + arr[i]);
		}
		
		
		System.out.println("========== 방법2 ==========");
		// 방법2. 분리된 각각의 문자열들을 객체로 취급하고 싶을 때
		//       java.util.StringTokenizer 클래스를 이용하는 방법 (java에서만 사용가능)
		//       StringTokenizer stn = new StringTokenizer(분리시키고자하는문자열, 구분자);
		
		StringTokenizer stn = new StringTokenizer(str, ","); // --> 각각의 토큰들이 생성됨
		
		System.out.println("분리 후 문자열의 갯수(토큰 수) : " + stn.countTokens());
		
		/*
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		
		System.out.println("남은 토큰 수 : " + stn.countTokens());
		
		// nextToken() --> stn의 공간으로부터 아예 뽑아와 버리는 것임
		*/
		
		
		
		/*
		for(int i=0; i<stn.countTokens(); i++) {
			System.out.println(stn.nextToken());
		}
		*/
		// i=0 i<6 true syso("JAVA");	i++
		// i=1 i<5 true syso("Oracle");	i++
		// i=2 i<4 true syso("JDBC");	i++
		// i=3 i<3 false --> 반복문 빠져나옴
		
		
		/*
		// 해결방법1.
		int count = stn.countTokens(); // 6
		
		for(int i=0; i<count; i++) {
			System.out.println(stn.nextToken());
		}
		*/
		
		// 해결방법2.
		while(stn.hasMoreTokens()) {	// stn에 토큰이 남아있습니까? 라는뜻
			System.out.println(stn.nextToken());
		}
	}
	
	public void method2() {
		String colors = "red/yellow#green blue,orange";
		
		System.out.println("========== 방법1 split ==========");
		// split방법
		String[] arr = colors.split("[/# ,]"); // 구분자가 여러개일때 대괄호에 묶어서
		for(String s : arr) {
			System.out.println(s);
		}
		
		System.out.println("========== 방법2 StringTokenizer==========");
		// StringTokenizer 방법
		StringTokenizer stn = new StringTokenizer(colors, "/# ,");
		while(stn.hasMoreTokens()) {
			System.out.println(stn.nextToken());
		}
	}
}
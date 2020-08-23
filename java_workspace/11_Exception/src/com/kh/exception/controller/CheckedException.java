package com.kh.exception.controller;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class CheckedException {

	// CheckedException : 반드시 예외처리를 해줘야하는 예외들.
	//                    예측 불가한 상황에 있어서 예외가 발생하기 때문에 
	//                    미리 예외가"발생"했을 때를 대비해서 "처리"하는 구분 기술해둬야됨!!
	
	// 보통 외부매개체와 어떤 입출력이 발생할때 Exception 발생!!
	
	public void method1() throws IOException{
		
		/*
		try {
			method2();
		} catch (IOException e) {
			e.printStackTrace();
		}
		*/
		
		method2();
	}
	
	public void method2() throws IOException{
		
		// Scanner sc = new Scanner(System.in);
		
		// Scanner와 같이 키보드로 값을 입력바을 수 있는 객체 (단, 문자열로만 가능)
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("아무 문자열 입력해주세요 : ");
		
		/*
		try {
			String str = br.readLine();
			System.out.println(str);
		} catch (IOException e) {

			e.printStackTrace();
		}
		*/
		
		// 예외처리방법2.  throws - 지금 당장 여기서 예외처리하지 않고 해당 이 메소드를 호출한 곳으로 떠넘기겠다!! (위임)
		String str = br.readLine();
		System.out.println(str);
		
	}
	//						|     예외발생 시점		|     예외처리
	//=================================================================================
	// RuntimeException		| 런타임 에러(프로그램실행)	| 세모(개발자 케바케)	--> UnCheckedException
	// RuntimeException 외	| 컴파일 에러(빨간줄)		| 필수			--> CheckedException
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

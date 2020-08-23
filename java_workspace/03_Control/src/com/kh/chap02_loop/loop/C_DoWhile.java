package com.kh.chap02_loop.loop;
import java.util.*;


public class C_DoWhile {
	
	/*
	 * * do-while문
	 * 
	 * 초기식;
	 * 
	 * do{
	 * 		반복적으로 실행할 코드;
	 * 		증감식;
	 * 
	 * }while(조건식);
	 * 
	 * 초기식 --> 무조건 한번은 실행 --> 증감식
	 * 조건식 --> true면 실행        --> 증감식
	 * 조건식 --> false -----------------> 빠져나감
	 */
	
	public void method1() {
		
		int num = 1;
		
		/*	
		while(num == 0) {
			System.out.println(num);
		}
		*/
		
		// while문은 조건식이 앞에 있기 때문에 false면 실행하지 않음
		
		// do-while문은 조건식이 뒤에 있기 때문에 false여도 최초 한번은 실행
		
		do {
			System.out.println(num);
			
		}while(num == 0);
		
	}
	
	public void method2() {
		// 1 2 3 4 5
		
		int i = 1;
		
		do {
			System.out.print(i++ + " ");
		}while(i<=5);
		
	}
	
	public void method3() {
		// 1부터 랜덤값(11 ~ 20) 까지합계
		
		int random = (int)(Math.random() * 10 +11);
		
		// sum += 1
		// sum += 2
		// ..
		// sum += random
		
		int sum = 0;
		
		int i = 1;
		do {
			sum += i++;
		}while(i <= random);
		
		System.out.println("1부터" + random + "까지의 합계 : " + sum);
	}
}
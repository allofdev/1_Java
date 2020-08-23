package com.kh.chap02_loop.loop;
import java.util.*;

public class B_While {
	
	/*
	 * * while문
	 * 
	 * 초기식;
	 * 
	 * while(조건식) {
	 * 		반복적으로 실행시키고자하는 구문
	 * 		증감식;
	 * }
	 * 
	 * 초기식, 증감식 위치만 다를뿐 for 문과 같음
	 * 
	 * 
	 */
	
	public void method1() {
		
		int i = 1;
		
		while(i<=5) {
			System.out.println("안녕하세요");
			i++;	
		}
		System.out.println(i);	//반복문이 끝난시점에서의 i
		
		
		// 1 2 3 4 5
		i = 1;		// i가 6으로 되어있기 때문에 다시 1로 지정
		while(i<=5) {
			System.out.print(i + " ");
			i++;
		}
		
		System.out.println();
		
		// 5 4 3 2 1
		i = 5;
		while(i >= 1) {
			System.out.print(i + " ");
			i--;
		}
		
	}	
	
	public void method2() {
		// 1에서부터 10까지의 홀수만을 출력
		// 1 3 5 7 9
		
		int i = 1;
		while(i<=10) {
			if(i % 2 == 1) {
				System.out.print(i + " ");
			}
			i++;
		}
		
		
		System.out.println();
		
		
		i = 1;
		while(i<=10) {
			System.out.print(i + " ");
			i+=2;
		}
		
	}
	
	public void method3() {
		
		// 1에서부터 랜덤한 수(1~50)까지의 합계
		
		int random = (int)(Math.random() * 50 + 1);	// 1에서부터 50개 랜덤값 발생
		
		System.out.println("랜덤값 : " + random);
		
		int sum = 0;
		int i = 1;
		while(i<=random) {
			System.out.print(i + " ");
			sum += i;
			i++;
		}
		System.out.print("\n1부터" + random + "까지의 합계 : " + sum);
		
	}
	
	public void method4() {
		
		// 사용자에게 문자열 입력받은 후
		// 0번 ~ 마지막인덱스(문자열의 길이 -1) 까지의 문자 추출 후 출력
			
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		System.out.print("문자열의 길이 : " + str.length());
		System.out.println();
		
		int i=0;
		while(i < str.length()) {
			System.out.print(str.charAt(i));
			i++;
		}
	}
	
	public void method5() {
		// 사용자가 입력한 단 출력하기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("단 수(2~9) 입력 : ");
		int dan = sc.nextInt();
		
	
		
		
		if(dan >= 2 && dan <= 9) {		// 잘 입력했을 경우
			int i = 1;
			while(i<=9) {
				System.out.printf("%d x %d = %d\n", dan, i, dan*i);
				i++;
			}
		}else {		// 잘못입력했을 경우
			System.out.println("2~9사이의 숫자를 입력해야됩니다.");
		}
		
	}
	
}
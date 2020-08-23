package com.kh.chap02.practice.example;
import java.util.*;

public class LoopPractice {
	
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num >= 1) {
			for(int i=1; i<=num; i++) {
				System.out.print(i + " ");
			}
			
		}else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}
	
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {

			System.out.print("1이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();
		
			if(num>=1) {
				for(int i=1; i<=num; i++) {
					System.out.print(i + " ");
				}
				break;
			}else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
			
		}
		
	}
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num >= 1) {
			for(int i=num; i>=1; i--) {
				System.out.print(i + " ");
			}
		}else {
			System.out.println("잘못 입력하셨습니다.");
		}
		
	}
	
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("1이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();
			
			if(num >= 1) {
				for(int i=num; i>=1; i--) {
				System.out.print(i + " ");
				}		
				break;
			}else {
			System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");			
			}	
			
		}
		
	}
	
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		
		int sum = 0;
		
		for(int i=1; i<=num; i++) {
			
			System.out.print(i);
			if(num != i) {
				System.out.print(" + ");
			}else {
				System.out.print(" = ");
			}
			sum += i;
			
		}
		
		System.out.print(sum);
		
	}
	
	
	public void practice6() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		
		int max = Math.max(num1, num2);
		int min = Math.min(num1, num2);
		
		if(min>=1) {
			for(int i=min; i<=max; i++) {
				System.out.print(i + " ");
			}			
		}else {
			System.out.println("1이상의 숫자만을 입력해주세요.");
		}

	}
	
	public void practice7() {
		
		Scanner sc = new Scanner(System.in);
	
		while(true) {
			
			System.out.print("첫 번째 숫자 : ");
			int num1 = sc.nextInt();
		
			System.out.print("두 번째 숫자 : ");
			int num2 = sc.nextInt();
		
			int max = Math.max(num1, num2);
			int min = Math.min(num1, num2);
		
			if(min>=1) {
				for(int i=min; i<=max; i++) {
					System.out.print(i + " ");
				}
				break;
			}else if(min < 1) {
				System.out.println("1 이상의 숫자를 입력해주세요");
			}
				
		}
		
	}
	
	public void practice8() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		System.out.println("====="+ num +"단 =====");
		for(int i=1; i<=9; i++) {
			System.out.printf("%d x %d = %d\n", num, i, num*i);
			
		}
		
	}
	
	public void practice9() {
		
		Scanner sc = new Scanner(System.in);
	
			System.out.print("숫자 : ");
			int num = sc.nextInt();
			
			if(num >= 2 && num <= 9) {
				
				for(int i=num; i<=9; i++) {
					System.out.println("===== " + i + "단 =====");
					
					for(int j=1; j<=9; j++) {
						System.out.printf("%d x %d = %d\n", i, j, i*j);
					}
					System.out.println();
				}
			
			}else {
				System.out.println("2~9 사이의 숫자만 입력해주세요.");
			}
		
	}
	
	public void practice10() {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		
			System.out.print("숫자 : ");
			int num = sc.nextInt();
			
			if(num >= 2 && num <= 9) {
				
				for(int i=num; i<=9; i++) {
					System.out.println("===== " + i + "단 =====");
					
					for(int j=1; j<=9; j++) {
						System.out.printf("%d x %d = %d\n", i, j, i*j);
					}
					System.out.println();
				}
				break;
			
			}else {
				System.out.println("2~9 사이의 숫자만 입력해주세요.");
			}
		
		}
		
	}
	
	public void practice11() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("시작 숫자 : ");
		int num1 = sc.nextInt();
		
		System.out.print("공차 : ");
		int num2 = sc.nextInt();
		
		
		// 방법1
			for(int i=1; i<=10; i++) {		// 1에서부터 10까지 1씩 증가하는동안 반복 (10회)
				
				System.out.print(num1 + " ");
				
				num1 += num2;
				
			}
			
			
			System.out.println();
			
			
		// 방법2
			int count = 0;
			
			for(int i=num1;; i+=num2) {		// num1에서부터 매번 num2씩 증가됨
				
				System.out.print(i + " ");
				count++;
				
				if(count == 10) {
					break;
				}
				
			}
			
	}
	
	public void practice12() {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("연산자(+, -, *, /, %) : ");
			String op = sc.nextLine();
			
			if(op.equals("exit")){
				System.out.println("프로그램을 종료합니다.");
				break;			
				}						
			
			System.out.print("정수1 : ");
			int num1 = sc.nextInt();

			System.out.print("정수2 : ");
			int num2 = sc.nextInt();
			
			sc.nextLine();
			
			int result = 0;

			switch(op) {
			case "+": result = num1 + num2; break;
			case "-": result = num1 - num2; break;
			case "*": result = num1 * num2; break;
			case "/": if(num2 == 0) {
						System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.\n");
						continue;
						} else {
						result = num1 / num2; break;
						}
			case "%": if(num2 == 0) {
						System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.\n");
						continue;
						}else {
						result = num1 % num2; break;
						}
			default:System.out.println("없는 연산자입니다. 다시 입력해주세요.\n");
			continue;
			}
				
			System.out.printf("%d %s %d = %d\n\n", num1, op, num2, result);

		}
		
	}
	
}
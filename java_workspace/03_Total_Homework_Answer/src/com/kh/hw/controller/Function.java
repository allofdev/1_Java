package com.kh.hw.controller;
import java.util.*;

public class Function {
	
	public void calculator() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수 : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		System.out.print("연산자(+, -, x, /) : "); 
		char op = sc.nextLine().charAt(0);
		
		int result = 0;
		
		switch(op) {
		case '+': result = num1 + num2; break;
		case '-': result = num1 - num2; break;
		case '*': result = num1 * num2; break;
		case '/': 	if(num2 == 0) {
					System.out.println("0으로 나눌 수 없습니다."); break;
					}else {
					result = num1 / num2; break;
					}
		}
		System.out.printf("%d %c %d = %d", num1, op, num2, result);
	}
	
	public void totalCalculator() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 정수 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수 : ");
		int num2 = sc.nextInt();
		
		int max = Math.max(num1, num2);
		int min = Math.min(num1, num2);
		int sum = 0;
		
		for(int i=min; i<=max; i++) {
			sum += i;
		}
		System.out.printf("%d부터 %d까지 정수들의 합 : %d", min, max, sum);
	}
	
	public void printProfile() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.print("성별 : ");
		String gender = sc.nextLine();
		System.out.print("성격 : ");
		String character = sc.nextLine();
		
		System.out.printf("이름 : %s\n나이 : %d\n성별 : %s\n성격 : %s\n", name, age, gender, character);
	}
	
	public void printScore() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("학년 : ");
		int year = sc.nextInt();
		System.out.print("반 : ");
		int group = sc.nextInt();
		System.out.print("번 : ");
		int num = sc.nextInt();
		sc.nextLine();
		System.out.print("성별(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		System.out.print("성적 : ");
		double score = sc.nextDouble();
		
		char genderResult = '0';
		String scoreResult = "";
		
		if (gender == 'F' || gender == 'f') {
			genderResult = '여';
		} else if(gender == 'M' || gender == 'm') {
			genderResult = '남';
		} else {
			System.out.println("성별을 잘못 입력하였습니다.");
			return;
		}
		
		if(score >= 90) {
			scoreResult = "A등급";
		}else if(score >= 80) {
			scoreResult = "B등급";
		}else if(score >= 70) {
			scoreResult = "C등급";
		}else if(score >= 60) {
			scoreResult = "D등급";
		}else {
			scoreResult = "F등급";
		}
		System.out.printf("%d학년 %d반 %d번 %c학생 %s의 점수는 %.2f 이고 %s입니다."
				,year, group, num, genderResult, name, score, scoreResult);
	}
	
	public void printStarNumber() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
	
		if(num >= 1) {
			for(int i=1; i<=num; i++) {
				for(int j=1; j<=num; j++) {
					if(j==i) {
						System.out.println(i);
						break;
					}
					System.out.print("*");
				}
			}
		}else {
			System.out.println("양수가 아닙니다.");
		}
	}
	
	public void sumRandom() {
		
		int random = (int)(Math.random() * 100 + 1);
		int sum = 0;
		
		for (int i=1; i<=random; i++) {
			sum += i;
		}
		System.out.printf("1부터 %d까지의 합 : %d", random, sum);
	}
	
	public void exceptGugu() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		for(int i=1; i<=9; i++) {
			if(i % num == 0) {
				continue;
			}	
			System.out.printf("%d * %d = %d\n", num, i, (num * i));
		}
	}
	
	public void diceGame() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {

			int random1 = (int)(Math.random() * 6 + 1);
			int random2 = (int)(Math.random() * 6 + 1);
			int sum = random1 + random2;
			
			System.out.println("정답 미리보기^^ : " + sum);
			
			while(true) {
				System.out.print("주사위 두 개의 합을 맞춰보세요(1~12입력) : ");
				int num = sc.nextInt();	
			
				if(num == sum) {
					System.out.println("맞췄습니다.");
					System.out.print("계속 하시겠습니까?(y/n) : ");
					sc.nextLine();
					char ch = sc.nextLine().charAt(0);
					if(ch == 'n' || ch == 'N') {
						System.out.println("게임을 종료합니다.");
						return;
					}else if(ch == 'y' || ch == 'Y') {
						System.out.println("계속합니다. 랜덤값을 새로 생성합니다.");
						break;
					}
				}else {
					System.out.println("틀렸습니다.");
				}
			}
		}
	}
}
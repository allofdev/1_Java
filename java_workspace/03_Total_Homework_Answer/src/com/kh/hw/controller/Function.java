package com.kh.hw.controller;
import java.util.*;

public class Function {
	
	public void calculator() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù ��° ���� : ");
		int num1 = sc.nextInt();
		System.out.print("�� ��° ���� : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		System.out.print("������(+, -, x, /) : "); 
		char op = sc.nextLine().charAt(0);
		
		int result = 0;
		
		switch(op) {
		case '+': result = num1 + num2; break;
		case '-': result = num1 - num2; break;
		case '*': result = num1 * num2; break;
		case '/': 	if(num2 == 0) {
					System.out.println("0���� ���� �� �����ϴ�."); break;
					}else {
					result = num1 / num2; break;
					}
		}
		System.out.printf("%d %c %d = %d", num1, op, num2, result);
	}
	
	public void totalCalculator() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù ��° ���� : ");
		int num1 = sc.nextInt();
		System.out.print("�� ��° ���� : ");
		int num2 = sc.nextInt();
		
		int max = Math.max(num1, num2);
		int min = Math.min(num1, num2);
		int sum = 0;
		
		for(int i=min; i<=max; i++) {
			sum += i;
		}
		System.out.printf("%d���� %d���� �������� �� : %d", min, max, sum);
	}
	
	public void printProfile() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		System.out.print("���� : ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.print("���� : ");
		String gender = sc.nextLine();
		System.out.print("���� : ");
		String character = sc.nextLine();
		
		System.out.printf("�̸� : %s\n���� : %d\n���� : %s\n���� : %s\n", name, age, gender, character);
	}
	
	public void printScore() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		System.out.print("�г� : ");
		int year = sc.nextInt();
		System.out.print("�� : ");
		int group = sc.nextInt();
		System.out.print("�� : ");
		int num = sc.nextInt();
		sc.nextLine();
		System.out.print("����(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		System.out.print("���� : ");
		double score = sc.nextDouble();
		
		char genderResult = '0';
		String scoreResult = "";
		
		if (gender == 'F' || gender == 'f') {
			genderResult = '��';
		} else if(gender == 'M' || gender == 'm') {
			genderResult = '��';
		} else {
			System.out.println("������ �߸� �Է��Ͽ����ϴ�.");
			return;
		}
		
		if(score >= 90) {
			scoreResult = "A���";
		}else if(score >= 80) {
			scoreResult = "B���";
		}else if(score >= 70) {
			scoreResult = "C���";
		}else if(score >= 60) {
			scoreResult = "D���";
		}else {
			scoreResult = "F���";
		}
		System.out.printf("%d�г� %d�� %d�� %c�л� %s�� ������ %.2f �̰� %s�Դϴ�."
				,year, group, num, genderResult, name, score, scoreResult);
	}
	
	public void printStarNumber() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
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
			System.out.println("����� �ƴմϴ�.");
		}
	}
	
	public void sumRandom() {
		
		int random = (int)(Math.random() * 100 + 1);
		int sum = 0;
		
		for (int i=1; i<=random; i++) {
			sum += i;
		}
		System.out.printf("1���� %d������ �� : %d", random, sum);
	}
	
	public void exceptGugu() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
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
			
			System.out.println("���� �̸�����^^ : " + sum);
			
			while(true) {
				System.out.print("�ֻ��� �� ���� ���� ���纸����(1~12�Է�) : ");
				int num = sc.nextInt();	
			
				if(num == sum) {
					System.out.println("������ϴ�.");
					System.out.print("��� �Ͻðڽ��ϱ�?(y/n) : ");
					sc.nextLine();
					char ch = sc.nextLine().charAt(0);
					if(ch == 'n' || ch == 'N') {
						System.out.println("������ �����մϴ�.");
						return;
					}else if(ch == 'y' || ch == 'Y') {
						System.out.println("����մϴ�. �������� ���� �����մϴ�.");
						break;
					}
				}else {
					System.out.println("Ʋ�Ƚ��ϴ�.");
				}
			}
		}
	}
}
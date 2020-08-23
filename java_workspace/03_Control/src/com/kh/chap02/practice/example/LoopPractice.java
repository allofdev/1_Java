package com.kh.chap02.practice.example;
import java.util.*;

public class LoopPractice {
	
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		if(num >= 1) {
			for(int i=1; i<=num; i++) {
				System.out.print(i + " ");
			}
			
		}else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
	}
	
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {

			System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
			int num = sc.nextInt();
		
			if(num>=1) {
				for(int i=1; i<=num; i++) {
					System.out.print(i + " ");
				}
				break;
			}else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
			}
			
		}
		
	}
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		if(num >= 1) {
			for(int i=num; i>=1; i--) {
				System.out.print(i + " ");
			}
		}else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
		
	}
	
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
			int num = sc.nextInt();
			
			if(num >= 1) {
				for(int i=num; i>=1; i--) {
				System.out.print(i + " ");
				}		
				break;
			}else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");			
			}	
			
		}
		
	}
	
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �ϳ� �Է��ϼ��� : ");
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
		
		System.out.print("ù ��° ���� : ");
		int num1 = sc.nextInt();
		
		System.out.print("�� ��° ���� : ");
		int num2 = sc.nextInt();
		
		int max = Math.max(num1, num2);
		int min = Math.min(num1, num2);
		
		if(min>=1) {
			for(int i=min; i<=max; i++) {
				System.out.print(i + " ");
			}			
		}else {
			System.out.println("1�̻��� ���ڸ��� �Է����ּ���.");
		}

	}
	
	public void practice7() {
		
		Scanner sc = new Scanner(System.in);
	
		while(true) {
			
			System.out.print("ù ��° ���� : ");
			int num1 = sc.nextInt();
		
			System.out.print("�� ��° ���� : ");
			int num2 = sc.nextInt();
		
			int max = Math.max(num1, num2);
			int min = Math.min(num1, num2);
		
			if(min>=1) {
				for(int i=min; i<=max; i++) {
					System.out.print(i + " ");
				}
				break;
			}else if(min < 1) {
				System.out.println("1 �̻��� ���ڸ� �Է����ּ���");
			}
				
		}
		
	}
	
	public void practice8() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		System.out.println("====="+ num +"�� =====");
		for(int i=1; i<=9; i++) {
			System.out.printf("%d x %d = %d\n", num, i, num*i);
			
		}
		
	}
	
	public void practice9() {
		
		Scanner sc = new Scanner(System.in);
	
			System.out.print("���� : ");
			int num = sc.nextInt();
			
			if(num >= 2 && num <= 9) {
				
				for(int i=num; i<=9; i++) {
					System.out.println("===== " + i + "�� =====");
					
					for(int j=1; j<=9; j++) {
						System.out.printf("%d x %d = %d\n", i, j, i*j);
					}
					System.out.println();
				}
			
			}else {
				System.out.println("2~9 ������ ���ڸ� �Է����ּ���.");
			}
		
	}
	
	public void practice10() {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		
			System.out.print("���� : ");
			int num = sc.nextInt();
			
			if(num >= 2 && num <= 9) {
				
				for(int i=num; i<=9; i++) {
					System.out.println("===== " + i + "�� =====");
					
					for(int j=1; j<=9; j++) {
						System.out.printf("%d x %d = %d\n", i, j, i*j);
					}
					System.out.println();
				}
				break;
			
			}else {
				System.out.println("2~9 ������ ���ڸ� �Է����ּ���.");
			}
		
		}
		
	}
	
	public void practice11() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ���� : ");
		int num1 = sc.nextInt();
		
		System.out.print("���� : ");
		int num2 = sc.nextInt();
		
		
		// ���1
			for(int i=1; i<=10; i++) {		// 1�������� 10���� 1�� �����ϴµ��� �ݺ� (10ȸ)
				
				System.out.print(num1 + " ");
				
				num1 += num2;
				
			}
			
			
			System.out.println();
			
			
		// ���2
			int count = 0;
			
			for(int i=num1;; i+=num2) {		// num1�������� �Ź� num2�� ������
				
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
			
			System.out.print("������(+, -, *, /, %) : ");
			String op = sc.nextLine();
			
			if(op.equals("exit")){
				System.out.println("���α׷��� �����մϴ�.");
				break;			
				}						
			
			System.out.print("����1 : ");
			int num1 = sc.nextInt();

			System.out.print("����2 : ");
			int num2 = sc.nextInt();
			
			sc.nextLine();
			
			int result = 0;

			switch(op) {
			case "+": result = num1 + num2; break;
			case "-": result = num1 - num2; break;
			case "*": result = num1 * num2; break;
			case "/": if(num2 == 0) {
						System.out.println("0���� ���� �� �����ϴ�. �ٽ� �Է����ּ���.\n");
						continue;
						} else {
						result = num1 / num2; break;
						}
			case "%": if(num2 == 0) {
						System.out.println("0���� ���� �� �����ϴ�. �ٽ� �Է����ּ���.\n");
						continue;
						}else {
						result = num1 % num2; break;
						}
			default:System.out.println("���� �������Դϴ�. �ٽ� �Է����ּ���.\n");
			continue;
			}
				
			System.out.printf("%d %s %d = %d\n\n", num1, op, num2, result);

		}
		
	}
	
}
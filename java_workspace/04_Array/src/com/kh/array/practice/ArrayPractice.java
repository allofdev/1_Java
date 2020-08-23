package com.kh.array.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
	
	public void practice1() {
		
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
		}
		
		// ���
		for(int i=0; i<arr.length; i++) {
			
			System.out.print(arr[i] + " ");
		}
	}
	
	
	//�ڡڡڡڡڡڡڡڡڡڡڡ�
	public void practice2() {
		
		// arr[0] = 10
		// arr[1] = 9
		// arr[2] = 8
		// arr[10] = 1	
		
		int[] arr = new int[10];

		for(int i=0; i<arr.length; i++) {
			arr[i] = arr.length-i;
		}
		
		for(int i=0; i<arr.length; i++) {
			
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ���� : ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		for(int i=0; i<num; i++) {
			arr[i] = i+1;
		}
		
		//���
		for(int i=0; i<num; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
	
	public void practice4() {
		
		String[] arr = {"���", "��", "����", "������", "����"};
		
		System.out.println(arr[1]);
	}
	
	//�ڡڡڡڡڡڡڡڡڡڡڡ�
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ� : ");
		String str = sc.nextLine();
		
		char[] arr = new char[str.length()];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = str.charAt(i);
		}
		
		System.out.print("���� : ");
		char ch = sc.nextLine().charAt(0);
		
		int index = 0;
		int count = 0;
		
		System.out.printf("\n%s�� %c�� �����ϴ� ��ġ(�ε���) : ", str, ch);		
		for(int i=0; i<arr.length; i++) {
			if(ch == arr[i]) {
				System.out.print(i + " ");	//��ġ ���
				count ++;
			}
		}
		System.out.printf("\n%c ���� : %d", ch, count);
	}
	
	public void practice6() {
		
		Scanner sc = new Scanner(System.in);
		
		String[] arr = {"��", "ȭ", "��", "��", "��", "��", "��"};
		
		System.out.print("0 ~ 6 ���� ���� �Է� : ");
		int num = sc.nextInt();
		
		if(num >= 0 && num <=6) {
			System.out.println(arr[num] + "����");
		}else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
		
	}
	
	public void practice7() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			System.out.print("�迭  " + i + "��° �ε����� ���� �� : ");
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n�� �� : " + sum);
		
	}
	
	public void practice8() {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("���� : ");
			int num = sc.nextInt();
			
			if(num>=3 && num % 2 == 1) {
				int[] arr = new int[num];
				int count = 1;
				
				for(int i=0; i<arr.length; i++) {
					arr[i] = count;
					
					if(i < arr.length / 2) {
						count++;
					}else {
						count--;
					}
				}
				for(int i=0; i<arr.length; i++) {
					System.out.print(arr[i] + " ");
				}
				break;
			}else {
				System.out.println("�ٽ� �Է��ϼ���.");
				continue;
			}
		}
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ġŲ �̸��� �Է��ϼ��� : ");
		String str = sc.nextLine();
		
		String[] arr = {"���", "�ұ�", "�Ѹ�Ŭ"};
		
		boolean bl = false;
		
		for(int i=0; i<arr.length; i++) {
			if(str.equals(arr[i])) {
				bl = true;
				break;
			}
		}
		
		if(bl) {
		System.out.println(str + "ġŲ ��� ����");
		}else {
			System.out.println(str + "ġŲ ��� �Ұ�");
		}
	}	
	
	public void practice10() {
			
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			int random = (int)(Math.random() * 10 + 1);
			arr[i] = random;	
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice11() {
		
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			
			arr[i] = (int)(Math.random() * 10 + 1);
			System.out.printf("%d ", arr[i]);
		}
		System.out.println();
		
		// ���� �������� ����
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<i; j++) {
				if(arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("�ִ� : " + arr[9]);
		System.out.println("�ּڰ� : " + arr[0]);
	}
	
	public void practice12() {
		
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 + 1);
			for(int j=0; j<i; j++) {
				if(arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice13() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ֹε�Ϲ�ȣ(-����) : ");
		String str = sc.nextLine();
		
		char[] arr = new char[str.length()];
		
		for(int i=0; i<arr.length; i++) {
			if(i < 8) {
				arr[i] = str.charAt(i);
			} else {
				arr[i] = '*';
			}
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
		}
	}
	
	public void practice14() {
		
		int[] arr = new int[6];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * 45 + 1);
			for(int j=0; j<i; j++) {
				if(arr[i] == arr[j]) {
					i--;
					break;
				}
			}
			for(int j=0; j<i; j++) {
				if(arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}	
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
package com.kh.practice.example;
import java.util.*;

public class OperatorPractice {
	
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		String result = (num > 0? "�����" : "����� �ƴϴ�");
		
		System.out.println(result);
	
	}
	
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		String result = (num > 0? "�����" : (num == 0? "0�̴�" : "������"));
		
		System.out.println(result);
	
	}
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		String result = (num % 2 == 0? "¦����" : "Ȧ����");
		
		System.out.println(result);
		
	}
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ο� �� : ");
		int num1 = sc.nextInt();
		
		System.out.print("���� ���� : ");
		int num2 = sc.nextInt();
		int result1 = num2 / num1;
		int result2 = num2 % num1;
		
		System.out.println("1�δ� ���� ���� : " + result1);
		System.out.println("���� ���� ���� : " + result2);
		
	}
	
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸� : ");
		String name = sc.nextLine();	
		
		System.out.print("�г�(���ڸ�) : ");
		int grade = sc.nextInt();	
		
		System.out.print("��(���ڸ�) : ");
		int group = sc.nextInt();	
		
		System.out.print("��ȣ(���ڸ�) : ");
		int num = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("����(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		
		String result = (gender == 'M' || gender == 'm'? "��" : (gender == 'Y' || gender == 'y' ? "��" : "����"));
		
		
		System.out.print("����(�Ҽ��� �Ʒ� ��° �ڸ����� ) : ");
		
		double score = sc.nextDouble();
		
		System.out.println(grade + "�г� " + group + "�� " + num +
				"�� " + name + " " + result + "�л��� ������ " + score + "�̴�.");
	
		System.out.printf("%d�г� %d�� %d�� %s %s�л��� ������ %.2f�̴�.", grade, group, num, name, result, score);
	}
	
	public void practice6() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int age = sc.nextInt();
		
		String result = age <= 13? "���" : (age > 13 && age <=19)? "û�ҳ�" : age > 19? "����" : "����";
		
		System.out.println(result);
		
	}
	
	public void practice7() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int kor = sc.nextInt();
		
		System.out.print("���� : ");
		int eng = sc.nextInt();
		
		System.out.print("���� : ");
		int math = sc.nextInt();
		
		int sum = (kor + eng + math);
		
		double avg = sum / 3.0;	// (double)int / double => 300.0 / 3.0 => double (int(4byte) -> double(8byte)�ڵ�����ȯ ��)
								// int / int => ����� int => �Ҽ��� ǥ���� ��Ʊ� ������ ������ �ս� �߻�
		
		String result = (kor >= 40 && eng >= 40 && math >=40 && avg >=60? "�հ�" : "���հ�");
		
		System.out.println("�հ� : " + sum);
		System.out.println("��� : " + avg);
		System.out.println(result);
		
	}
	
	public void practice8() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ֹι�ȣ�� �Է��ϼ���(- ����)");
		
		String str = sc.nextLine();
		
		char ch = str.charAt(7);
		
		String result = (ch == '1' || ch == '3'? "����" : 
						(ch == '2' || ch == '4'? "����" : "����"));
		
		System.out.println(result);
		
	}
	
	public void practice9() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("����2 : ");
		int num2 = sc.nextInt();
		
		System.out.print("�Է� : ");
		int num3 = sc.nextInt();
		
		String result = num1 < num2? (num3 <= num1 || num3 > num2? "true" : "false") : "����1�� ����2���� �۾ƾ� �մϴ�";
		
		System.out.println(result);
		
	}
	
	public void practice10() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�Է�1 : ");
		int num1 = sc.nextInt();
		
		System.out.print("�Է�2 : ");
		int num2 = sc.nextInt();
		
		System.out.print("�Է�3 : ");
		int num3 = sc.nextInt();
		
		String result = num1 == num2 && num1 == num3? "true" : "false";
		
		System.out.println(result);
		
	}
	
	
	
}

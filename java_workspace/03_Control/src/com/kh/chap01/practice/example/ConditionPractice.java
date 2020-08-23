package com.kh.chap01.practice.example;
import java.util.*;

public class ConditionPractice {
	
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1. �Է�\n2. ����\n3. ��ȸ\n4. ����\n9. ����"
				+ "\n�޴� ��ȣ�� �Է��ϼ��� : ");
		int menu = sc.nextInt();
		String result = "";
		
		if (menu == 1) {
			result = "�Է�";
		}else if (menu == 2) {
			result = "����";
		}else if (menu == 3) {
			result = "��ȸ";
		}else if (menu == 4) {
			result = "����";
		}else if (menu == 9) {
			System.out.println("���α׷��� ����˴ϴ�.");
			return;
		}else {
			System.out.println("�߸� �Է��Ͽ����ϴ�.");
			return;
		}
		System.out.printf("%s �޴��Դϴ�.", result);
	}
	
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڸ� �� �� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		if (num > 0 && num % 2 == 0) {
			System.out.println("¦����");
		}else if(num > 0 && num % 2 == 1) {
			System.out.println("Ȧ����");
		}else {
			System.out.println("����� �Է����ּ���.");
		}
		
	}
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�������� : ");
		int kor = sc.nextInt();
		
		System.out.print("�������� : ");
		int math = sc.nextInt();
		
		System.out.print("�������� : ");
		int eng = sc.nextInt();
		
		int sum = kor + math + eng;
		
		double avg = sum / 3.0;
		
		String result = "";
		
		if (kor >= 40 && math >= 40 && 
			eng >= 40 && avg >= 60) {
			result = "�����մϴ�, �հ��Դϴ�!";
		} else {
			System.out.println("���հ��Դϴ�.");
			return;
		}
		
		System.out.printf("���� : %d\n���� : %d\n���� : "
				+ "%d\n�հ� : %d\n��� : %.1f\n%s", 
				kor, math, eng , sum, avg, result);
		
	}
	
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~12 ������ ���� �Է� : ");
		int month = sc.nextInt();
		
		String season = "";
		
		switch(month) {
		case 12:
		case 1:
		case 2: season = "�ܿ�"; break;
		case 3:
		case 4:
		case 5: season = "��"; break;
		case 6:
		case 7:
		case 8: season = "����"; break;
		case 9:
		case 10:
		case 11: season = "�����Դϴ�."; break;
		default: season = "�߸� �Էµ� ��";
		}
		System.out.printf("%d���� %s�Դϴ�.", month, season);
		
	}
	
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		String userid = "namgyu";
		String userpwd = "123123";
		
		System.out.print("���̵� : ");
		String id = sc.nextLine();
		
		System.out.print("��й�ȣ : ");
		String ps = sc.nextLine();
		
		if(id.equals(userid) && ps.equals(userpwd)) {
			System.out.println("�α��� ����");
		}else if(id.equals(userid)) {
			System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
		}else if(ps.equals(userpwd)){
			System.out.println("���̵� Ʋ�Ƚ��ϴ�.");
		}else {
			System.out.println("���̵�� ��й�ȣ ��� Ʋ�Ƚ��ϴ�.");
		}
		
	}
	
	public void practice6() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ Ȯ���ϰ��� �ϴ� ȸ�� ��� : ");
		String level = sc.nextLine();
		
		switch(level) {
		case "������": System.out.println("ȸ������, �Խñ� ����");
		case "ȸ��": System.out.println("�Խñ� �ۼ�, ��� �ۼ�");
		case "��ȸ��": System.out.println("�Խñ� ��ȸ"); break;
		default: System.out.println("�߸� �Է��߽��ϴ�.");
		}
		
	}
	public void practice7() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ű(m)�� �Է��� �ּ��� : ");
		double height = sc.nextDouble();
		
		System.out.print("������(kg)�� �Է��� �ּ��� : ");
		double weight = sc.nextDouble();
		
		double bmi = weight / (height * height);
		
		String result = "";
		
		if (bmi < 18.5) {
			result = "��ü��";
		}else if (bmi < 23) {
			result = "����ü��";
		}else if (bmi < 25) {
			result = "��ü��";
		}else if (bmi < 30) {
			result = "��";
		}else {
			result = "�� ��";
		}
		
		System.out.printf("BMI ���� : %f\n%s", bmi, result);
		
	}
	
	public void practice8() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ǿ����� 1 �Է� : ");
		int num1 = sc.nextInt();
		
		System.out.print("�ǿ����� 2 �Է� : ");
		int num2 = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("�����ڸ� �Է�(+,-,*,/,%) : ");
		char ch = sc.nextLine().charAt(0);
		
		int result = 0;	// �����ȣ�� ���� ��������� ����� ���� ���� ���� �س���
		
		if(num1 > 0 && num2 > 0) {
			
			switch(ch) {
			case '+': result = num1 + num2; break;
			case '-': result = num1 - num2; break;
			case '*': result = num1 * num2; break;
			case '/': result = num1 / num2; break;
			case '%': result = num1 % num2; break;
			default: System.out.println("�����ȣ�� �߸� �Է��ϼ̽��ϴ�. ���α׷��� �����մϴ�."); return;
			}
		}else {
			System.out.println("�ǿ����ڸ� �߸� �Է��ϼ̽��ϴ�. ���α׷��� �����մϴ�.");	return;
		}
		
		System.out.printf("%d %c %d = %d", num1, ch, num2, result);
	
	}
	
	public void practice9() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�߰� ��� ���� : ");
		double mid = sc.nextDouble() * 0.2;
		
		System.out.print("�⸻ ��� ���� : ");
		double fin = sc.nextDouble() * 0.3;
		
		System.out.print("���� ���� : ");
		double hw = sc.nextDouble() * 0.3;
		
		System.out.print("�⼮ ȸ�� : ");
		double at = sc.nextDouble();
		
		double sum = mid + fin + hw + at;	// ���� 100�� ���� �������� ����
		
		System.out.println("==========���==========");
		
		if (sum >= 70 && at >= 20 * 0.7) {
			System.out.println("�߰� ��� ���� :	(20)" + mid);
			System.out.println("�⸻ ��� ���� :	(30)" + fin);
			System.out.println("���� ����	  :	(30)" + hw);
			System.out.println("�⼮ ����	  :	(20)" + at);
			System.out.println("���� : " + sum);
			System.out.println("PASS");
		}else if(at >= 20 * 0.7) {
			System.out.printf("FAIL [�����̴�] (���� %.1f)", sum);
		}else if(sum >= 70) {
			System.out.printf("FAIL [�⼮ Ƚ�� ����] (%.0f/20)", at);
			
		}else {
			System.out.printf("FAIL [�����̴�] (���� %.1f) \n", sum);
			System.out.printf("FAIL [�⼮ Ƚ�� ����] (%.0f/20)", at);
		}
		
	}
	
	public void practice10() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. �޴� ���");
		System.out.println("2. ¦��/Ȧ��");
		System.out.println("3. �հ�/���հ�");
		System.out.println("4. ����");
		System.out.println("5. �α���");
		System.out.println("6. ���� Ȯ��");
		System.out.println("7. BMI");
		System.out.println("8. ����");
		System.out.println("9. Pass/Fail");
		System.out.print("���� : ");
		int menu = sc.nextInt();
		
		switch (menu) {
		case 1: practice1(); break;
		case 2: practice2(); break;
		case 3: practice3(); break;
		case 4: practice4(); break;
		case 5: practice5(); break;
		case 6: practice6(); break;
		case 7: practice7(); break;
		case 8: practice8(); break;
		case 9: practice9(); break;
		default: System.out.println("�ٽ� �Է����ּ���"); return;
		
		}
		
	}
	
}
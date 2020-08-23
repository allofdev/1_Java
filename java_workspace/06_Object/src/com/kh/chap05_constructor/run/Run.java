package com.kh.chap05_constructor.run;
import java.util.Scanner;

import com.kh.chap05_constructor.model.vo.*;

public class Run {

	public static void main(String args[]) {
		
		// 1. �⺻�����ڷ� ��ü ����
		User u1 = new User();
		
		System.out.println(u1.information());	// JVM�� �ʱⰪ�� �������
		
		//	setter�� ���� �� �ʱ�ȭ
		u1.setUserId("user01");
		u1.setUserPwd("pass01");
		u1.setUserName("ȫ�浿");
		System.out.println(u1.information());		
		
		
		
		// ������ ���ÿ� �ʱ�ȭ �� �� ������??
		// 2. �Ű����� ����¥�� ����ؼ�
		User u2 = new User("user02", "pass02", "�踻��");
		System.out.println(u2.information());
		
		u2.setAge(30);	// �����ڸ� ��� �ϴ��� setter�޼ҵ�� ����ؾ��� -> �� �ʵ��� ���� �ϳ��� ������ �� ���
		System.out.println(u2.information());
		
		
		// 3. �Ű����� 5��¥�� �����ڸ� ���� ��ü ����
		User u3 = new User("user03", "pass03", "ȫ���", 20, '��');
		System.out.println(u3.information());
		
		
		
		// �Ű����� ������ ���
		// ����ڰ� ������ �Է�
		System.out.println("\n================================================");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���̵� : ");
		String userId = sc.nextLine();
		
		System.out.print("��й�ȣ : ");
		String userPwd = sc.nextLine();
		
		System.out.print("�̸� : ");
		String userName = sc.nextLine();
		
		
		System.out.print("���� �Ǵ� ������ �߰������� �Է��Ͻðڽ��ϱ�?(y/n) : ");
		char ch = sc.nextLine().charAt(0);
		
		User u4 = null;	// �ּҰ��̱� ������ �⺻�� null�� �ʱ�ȭ
		
		if(ch == 'y' || ch == 'Y') {
				System.out.print("���� : ");
				int age = sc.nextInt();
				sc.nextLine();
		
				System.out.print("����(��/��) : ");
				char gender = sc.nextLine().charAt(0);
				
				u4 = new User(userId, userPwd, userName, age, gender);
				
		}else if(ch == 'n' || ch == 'N') {
			u4 = new User(userId, userPwd, userName);
		}else {
			System.out.println("�߸��Է��߽��ϴ�.");
		}
		
		System.out.println(u4.information());
		
		
		
		
		
		// �⺻������ ���
		// ����ڰ� ������ �Է�
		User u5 = new User();
		
		System.out.print("���̵� : ");
		u5.setUserId(sc.nextLine());
		
		System.out.print("��й�ȣ : ");
		u5.setUserPwd(sc.nextLine());
		
		System.out.print("�̸� : ");
		u5.setUserName(sc.nextLine());
		
		
		System.out.print("���� �Ǵ� ������ �߰������� �Է��Ͻðڽ��ϱ�?(y/n) : ");
		char chr = sc.nextLine().charAt(0);
		

		
		if(chr == 'y' || chr == 'Y') {
				System.out.print("���� : ");
				u5.setAge(sc.nextInt());
				sc.nextLine();
				
				System.out.print("����(��/��) : ");
				u5.setGender(sc.nextLine().charAt(0));
				
		}else if(chr == 'n' || chr == 'N') {

		}else {
			System.out.println("�߸��Է��߽��ϴ�.");
			return;
		}
		
		System.out.println(u5.information());
		
	}
}

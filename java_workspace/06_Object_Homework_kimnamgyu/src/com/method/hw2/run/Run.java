package com.method.hw2.run;
import com.method.hw2.controller.*;
import java.util.Scanner;
import java.util.Arrays;

public class Run {

	public static void main(String[] args) {
		
		NonStaticSample nss = new NonStaticSample();
		
		Scanner sc = new Scanner(System.in);
		
		// �޼ҵ�1
		System.out.print("���� �Է�: ");
		int num = sc.nextInt();
		
		int[] arr = nss.intArrayAllocation(num);

		
		// �޼ҵ�2
		
		System.out.print("ũ�Ⱑ" + num + "�� ������ �迭�� : ");
		nss.display(arr);
		
		
		// �޼ҵ�3   �ڡڡڡڡڡڡڡڡڡڡڡڡڡ�
		// nss.swap(0, dix1, idx2);
		
		
		// �޼ҵ�4
		System.out.print("�������� ��� : ");
		nss.sortDescending(arr);
		
		// �޼ҵ�5
		System.out.print("�������� ��� : ");
		nss.sortAscending(arr);
		
		
		// �޼ҵ�6
		System.out.print("\n���ڿ� �Է� : ");
		sc.nextLine();
		String str = sc.nextLine();
		
		System.out.print("���� �ϳ� �Է� : ");
		char ch = sc.nextLine().charAt(0);
		
		System.out.print(str + "���ڿ��� " + ch + "�� ���� : " + nss.countChar(str, ch));
		
		
		// �޼ҵ�7
		System.out.print("\n���� 1 �Է� : ");
		int num1 = sc.nextInt();
		
		System.out.print("���� 2 �Է� : ");
		int num2 = sc.nextInt();
		
		System.out.println(num1 + "�� " + num2 + "���� �������� �հ� : " + nss.totalValue(num1, num2));
		
		
		// �޼ҵ�8
		System.out.print("���ڿ� �Է� : ");
		sc.nextLine();
		String strc = sc.nextLine();
		
		System.out.print("�ε��� �Է� : ");
		int index = sc.nextInt();
		
		System.out.println(strc + "���ڿ��� " + index + "�� �ε��� ���� : " + nss.pCharAt(strc, index));
		
		
		// �޼ҵ�9
		System.out.print("1�� ���ڿ� : ");
		sc.nextLine();
		String str1 = sc.nextLine();
		
		System.out.print("2�� ���ڿ� : ");
		String str2 = sc.nextLine();
		
		System.out.println(str1 + "�� " + str2 + "�� ��ģ ���ڿ� : " + nss.pConcat(str1, str2));
		
	}
	
	

	
	
	
	
	
	
	
}

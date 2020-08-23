package com.kh.chap02_String.controller;

public class A_StringPoolTest {

	public void method1() {
			
		// �⺻�ڷ��� : boolean, char, byte, short, int, long, float, double
		// �����ڷ��� : String, Person, Student, ....
				
		/*
		 * * String Ŭ����
		 * - �Һ� Ŭ���� (������ �ʴ� Ŭ����)
		 *   --> �����ϴ� ���� ���ڸ����� ������ ���� ����
		 */
			
		// 1. �����ڸ� ���� ���ڿ� ���� --> String�� Ŭ�����̱� ������ ����
		String str1 = new String("hello");	// ��ü����
		String str2 = new String("hello");	// ��ü����

		System.out.println("\n== ��");
		System.out.println(str1 == str2); // false (�ּҰ��ٸ�)

		System.out.println("\n��ȯ");
		System.out.println(str1);
		System.out.println(str2);
		// toString() --> String Ŭ������ �̹� �������̵� �Ǿ����� ������� ���ڿ� ��ȯ

		System.out.println("\nequals ��");
		System.out.println(str1.equals(str2)); // true (������� ���ڿ��� ��)
		//  equals() --> String Ŭ������ �̹� �������̵� �Ǿ����� (������� ���ڿ��� ��)

		System.out.println("\nhashCode");
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		// hashCode() --> String Ŭ������ �̹� �������̵� �Ǿ����� (������� ���ڿ������� �ؽ��ڵ常���)
		
		System.out.println("\nidentityHashCode");
		// ���࿡ ���� ���� �ּҰ��� ���ؼ� �˰� �ʹٸ� System.identityHashCode(���۷���)
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
	}
	
	public void method2() {
			
		// 2. ���ڿ��� ���ͷ��� ����
		String str1 = "hello";
		String str2 = "hello";
		// ���ͷ� ���ý� ���Ǯ(String pool) ������ �ö�
		// String Pool Ư¡ : ������ ���ڿ� ���� �Ұ�
		
		System.out.println("== ��");
		System.out.println(str1 == str2); // true (�ּҰ��� ��ġ��)
		
		System.out.println("\n ��ȯ");
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println("\nidentityHashCode");
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		
		// �Һ�Ŭ���� (������ �ʴ� Ŭ���� == ���ڸ����� �����Ǵ°��� ����)
		
		str2 = "bcd";
		System.out.println("\nstr2�� ù��° ���� �� identityHashCode");
		System.out.println(System.identityHashCode(str2)); 
		// ���ڿ� �����ϴ� ���� ������ ���ڿ� �ڸ����� ����Ǵ°� �ƴ�
		// String Pool ������ ���ο� ����  �Ҵ� (���ο� �ּҰ� �ο����� == �ּҰ� ����)
		
		str2 = "abc";
		System.out.println("\nstr2���ι�° ���� �� identityHashCode");
		System.out.println(System.identityHashCode(str2)); 
		
		str2 = "eee";
		System.out.println("\nstr2������° ���� �� identityHashCode");
		System.out.println(System.identityHashCode(str2));		
		
		/*
		 * String Ŭ���� == �Һ�Ŭ����
		 * --> ��� ���� �����ϴ� ��� �������÷���(GC)�� ��� ������߸� �ϴ� ������ ����
		 * --> ������ ���� ���� �б⸸ �ϴ� ���  String Ŭ������ ����
		 */
		
		str2 = "hello";
		System.out.println("\n�ٽ� ó�� ������ identityHashCode");
		System.out.println(System.identityHashCode(str2));
		
		
		
		
		}
}

package com.kh.operator;

public class C_Arithmetic {
	
	// ��� ������ (���� ������ == �� ���� ���� ������ �����ϴ� ������ )
	// + - * / %(������)
	
	// 	* / %	(+ - ���� �켱������ �� ����)
	// 	+ -
	
	public void method1() {
		
		int num1 = 10;
		int num2 = 4;
		
						// ��ȣ �ȿ� ���� ������ ���ڿ����� + �Ǳ⶧���� �Ʒ��� ���� ��� �߻���
						// "num1 + num2 = 10" + num2
						// "num1 + num2 = 104"		
		System.out.println("num1 + num2 = " + num1 + num2);
		//System.out.println("num1 - num2 = " + num1 - num2);	//��ȣ�� ���ϸ� ���ڿ� ���� ���ڰ� �Ǳ� ������ ���簡 ���Ե�
		
		System.out.println("num1 + num2 = " + (num1 + num2));	// 14
		System.out.println("num1 - num2 = " + (num1 - num2));	// 6
		System.out.println("num1 x num2 = " + (num1 * num2));	// 40
		System.out.println("num1 / num2 = " + (num1 / num2));	// 2.5		
		System.out.println("num1 % num2 = " + (num1 % num2));	// 
		
		System.out.println(10 / 3);
		System.out.println(10 % 3);
		
	}
	
	public void method2() {
		
		int a = 5;
		int b = 10;
		int c = (++a) + b;
		int d = c / a;
		int e = c % a;
		int f = e++;
		int g = (--b) + (d--);
		int h = 2;
		int i = a++ + b / (--c / f) * (g-- -d) % (++e + h);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		System.out.println(i);
		
	}
	
}
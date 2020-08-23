package com.kh.chap06_method.run;
import com.kh.chap05_constructor.model.vo.User;
import com.kh.chap06_method.controller.MethodTest1;
import com.kh.chap06_method.controller.MethodTest2;

import java.util.Arrays;


public class Run {
	public static void main(String[] args) {
		
		
		MethodTest1 m1 = new MethodTest1();

		
		m1.method1();
		
		System.out.println("====================");
		m1.method1();
		double random = m1.method2();	// ���� ��ȣ�ȿ��ִ� ����Ʈ�� ȣ���� ������ ���Ե����� �������� ��¾ȵ�
		System.out.println(random);
		System.out.println(m1.method2());  // ���� ������� �ʰ� �ٷ� ����Ʈ������ ��� ����
		
		System.out.println(m1.method2());
		
		System.out.println("====================");
		
		m1.method3(10, 5);
		
		System.out.println("====================");
		
		m1.method4(6, 3);	// ��ȯ���� ��¸���
		int minus = m1.method4(6,3);
		System.out.println(minus);
		System.out.println(m1.method4(6,3));	// ��ȯ�� ���
		
		
		System.out.println("\n\n==========MethodTest2==========");
		
		MethodTest2.method1();
		
		System.out.println("====================");
		
		System.out.println(MethodTest2.method2());
		
		System.out.println("====================");
		
		MethodTest2.method3("ȫ�浿");
		
		System.out.println("====================");
		
		String str = MethodTest2.method4("�趯��");
		System.out.println(str);
		
		System.out.println("====================");
		
		int[] a = MethodTest2.test1();
		System.out.println(Arrays.toString(a));
		
		System.out.println("====================");
		
		User b = MethodTest2.test2("user123", "pass123", "ȫ�泲");
		System.out.println(b.information());
		
		System.out.println("====================");
		
		MethodTest2.test3(a);
		
		
		System.out.println(true);
		
		
		
	}
}
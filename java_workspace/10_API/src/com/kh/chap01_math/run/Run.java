package com.kh.chap01_math.run;

//import java.lang.*;
// java.lang ��Ű���� import���ʿ� ���� �ٷ� ����� �� ����
// String, Object, Math ��

public class Run {
	public static void main(String[] args) {
		
		String str = "";
		Object o;
		
		
		// Math Ŭ����
		
		// ����ʵ�
		System.out.println("���� : " + Math.PI);
		
		// ���밪�� �˰��� �� �� : abs
		int num1 = 10;
		System.out.println("���밪 : " + Math.abs(num1));
		
		// �ø� : ceil
		double num2 = 4.349;
		System.out.println("�ø� : " + (int)Math.ceil(num2));		// double�� ��ȯ�� -> int�� ����ȯ
	
		// �ݿø� : round
		System.out.println("�ݿø� : " + Math.round(num2));		// ó������ int�� ��ȯ��
		
		// ���� : floor
		System.out.println("���� : " + (int)Math.floor(num2));	// double�� ��ȯ�� -> int�� ����ȯ
	
		// ���� ����� ������ : rint
		System.out.println("���� ����� ������ : " + Math.rint(num2));	// double�� ��ȯ��
		
		// ������(��Ʈ) : sqrt
		System.out.println("4�� ������ : " + Math.sqrt(4));			// double�� ��ȯ��
		
		// ���� : pow
		System.out.println("2�� 10���� : " + Math.pow(2, 10));		// double�� ��ȯ��
		
		// Math Ư¡
		// ��� �ʵ� ����ʵ�, ��� �޼ҵ� static �޼ҵ�!!
		// ����  static
		// ������ �ƽθ� private ==> ���� �Ұ��ϰ�
		
		// static --> ���α׷� ������ �� �� �� �� static �޸𸮿����� �ø�!
		//            Math ��ü ������ �ʿ� ���� Ŭ������. ���� ���� ����
		
		// �ѹ��� �޸� ������ �÷����� �����ϴ� ���� ==> �̱�������
		
	}
}
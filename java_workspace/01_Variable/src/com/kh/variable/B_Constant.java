package com.kh.variable;

public class B_Constant {
	
	// ���
	public void finalConstant() {
		
		// �ڷ��� ������ = ��;  => ����(���ϴ� ��)(�󸶵��� ���� ����)
		int age = 20;
		
		System.out.println("age: " + age);
		
		age = 21;    // �ڷ����� �ѹ��� ����ؾߵ�. ��, ���� ���� ������ ���� �ڷ����Է� x
		
		System.out.println("age: " + age);
		
		
		// final �ڷ��� ������ = ��;		=> ���(�׻� ���� ��) �ѹ� ���� �Է��ϸ� ���� �Ұ���
		// ����� �̸���  �� �빮�ڷ� ���ִ°� �������!
		
		final int AGE = 20;
		
		System.out.println("AGE: " + AGE);
		
		//AGE = 21; final�� �ѹ� ������ �� ���� �Ұ�!!
		System.out.println("��� ���� �� �� ������ ���� ���� �Ұ��ϴ�.");
		
	}
}
package com.kh.run;

import com.kh.first.B_ValuePrinter;


public class RunB {
	
	// ���� �޼ҵ�
	public static void main(String[] args) {
		
		// �ٸ� Ŭ������ �ִ� �żҵ� ȣ��
		// 1) Ŭ���� ���� (new) �����ϱ�
		//    Ŭ������ ������̸� = new Ŭ������();
		B_ValuePrinter b = new B_ValuePrinter();
		
		// 2) �޼ҵ� ȣ��(����)
		//    ������̸�.�����Ҹ޼ҵ��();
		b.printValue();
		
		b.sumStringNumber();
		
		
		
	}
}

package com.kh.chap02_abstractAndinterface.part02_interface.model.vo;

public interface Basic {
	
	// �߻�Ŭ���� --> �Ϲ��ʵ� + �Ϲݸ޼ҵ� + [�߻�޼ҵ�]		-- �߻�޼ҵ�� �־ �ǰ� ��� �� -- ������ �ڽ� Ŭ�������� ������ �������̵��ؾߵ�
	// �������̽� --> only ���(public static final)�ʵ�  + �߻�޼ҵ�
	
	// ��� �ʵ�
	// �������̽������� �ʵ�� ������ ����ʵ��̱� ������ ���� ���� 
	/*public static final*/ int NUM = 10;  	
	
	// �߻� �޼ҵ�
	// �������̽������� �޼ҵ�� ������ �߻�޼ҵ��̱� ������ ���� ����
	/*public abstract*/ void eat();
	/*public abstract*/ void sleep();
	
}
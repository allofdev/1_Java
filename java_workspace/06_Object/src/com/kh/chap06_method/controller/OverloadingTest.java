package com.kh.chap06_method.controller;

// ���� �̸��� �޼ҵ带 ����� ���
public class OverloadingTest {
	
	// �����ε� : �� Ŭ���� ������ ���� �޼ҵ������ ������ �� �ִ� ���
	
	public void test() {	// xx.test();
		
	}
	
	public void test(int a) {	// xx.test(10);		// �Ű������� ������ �ش�޼ҵ尡 ����ǰ� ������ ���� �޼ҵ� ����
		
	}
	
	public void test(int a, String s) {		// xx.test(10, "");
		
	}
	
	public void test(int a, int b) {	// xx.test(10, 20);
		
	}

	/*
	public void test(int c, int d) {
		
	}
	*/
	// �����߻� --> �Ű��������̶��� ������� �ڷ����� ������ ������ �ٸ��� �ۼ��Ǿ�ߵ�!!
	
	public void test(int a, int b, String str) {	// xx.test(10, 20, "");
		
	}
	
	/*
	public int test(int a, int b, String str) {
		return 0;
	}
	*/
	// �����߻� --> ��ȯ���� �ٸ��ٰ� �����ε� �����������!! (�Ű������� ������ �޶�߸���!!)
	
	/*
	private void test(int a, int b, String str) {
		
	}
	*/
	// �����߻� --> ���������ڰ� �ٸ��ٰ� �����ε� ������� ����!!
	
	/*
	 * * ���
	 * �����ε� : ������ �޼ҵ���� ����ϴ°�
	 *         ��, ���������ڵ� ��ȯ���̵� �� ������(���� �Ƶ簣��)
	 *         "�Ű������� �ڷ����� ����, ������ �ٸ��� �ۼ��Ǿ�߸���!!"
	 */
	
	
	
	
	
	
	
	
	
}
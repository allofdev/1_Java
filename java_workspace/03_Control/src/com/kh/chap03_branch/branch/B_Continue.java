package com.kh.chap03_branch.branch;

public class B_Continue {
	
	/*
	 * continue : continue;�� ������ �Ǹ� �� �ڿ� �������� �������� �ʰ�
	 * 			   ���� ����� �ݺ��� ���� �ö󰡴� �ǹ�
	 * 
	 */
	public void method1() {
		// 1���� 10������ Ȧ�� ���
		// 1 3 5 7 9
		
		System.out.println("===ù��° ���===");
		for(int i=1; i<=10; i++) {
			
			if(i % 2 == 1) {	// 
			System.out.print(i + " ");
			
			}	
		}
		
		System.out.println("\n===�ι�° ���===");
		for(int i=1; i<=10; i++) {
			if(i % 2 == 0) {	// ¦���ϰ�� => ���� ���� �������� ���� �ٽ� �ݺ��� ���� �ö󰡶�!
				continue;
			}
			System.out.print(i + " ");
		}

	}
	
	public void method2() {
		
		// 1���� 100���� �������� �հ�
		// ��, 6�� ������� ���� ���������ض�
		
		int sum = 0;
		
		for(int i=1; i<=100; i++) {
			
			if(i % 6 == 0) {		// 6�� ����ϰ�� continue;�� ���� �ڿ������� �����Ű������ ���� ����� �ݺ��� ���� �ö�
				continue;
			}
			sum += i;
		}
		System.out.println(sum);
		
	}
	
	public void method3() {
		
		// 2~9�� ������ ������ ���
		// ��, 4�� ������� ���� ��� (4��, 8������)
		
		// �� : 2~9 1�� ����			==> �ٱ��� for��
		// �� : �� �ܸ��� 1~9 1�� ����		==> ���� for��
		
		for(int dan=2; dan<=9; dan++) {
			
			if(dan % 4 == 0) {		// 4�� ����� ��� continue;��  ���� �ڿ� ������ �����Ű�� �ʰ� ���� ����� �ݺ��� ���� �ö�
				continue;
			}
			System.out.println("=== " + dan + "�� ===");
			
			for(int su=1; su<=9; su++) {
				
				if(su % 2 == 0) {
					continue;		// ¦���� ��� continue;�� ���� �ڿ� ������ �����Ű�� �ʰ� ���� ����� �ݺ��� ���� �ö�
				}
				
				
				System.out.printf("%d x %d = %d\n", dan, su, dan*su);

			}	
				System.out.println();			
		}

		
		
		
		
	}
	
}
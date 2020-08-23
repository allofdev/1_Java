package com.kh.array;

import java.util.Arrays;

public class B_ArrayCopy {
	
	/*
	 * * �迭�� ����
	 * - ���� ���� : �迭�� �ּҸ��� ����
	 * - ���� ���� : �迭�� ������ �����ϰ� ���� ���� ������ ����
	 */
	
	
	//���� ����-----------------------------------------------------
	public void method1() {
		
		int[] origin = {1, 2, 3, 4, 5};
		
		System.out.println("==���� �迭==");
		
		for(int i=0; i<origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		
		// ���纻 �迭
		int[] copy = origin;
		
		System.out.println("\n==���纻 �迭==");
		
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		
		copy[2] = 99; // ���纻 �迭 ������ ����
		
		System.out.println("\n\n---���纻 �迭 ������---");
		
		System.out.println("==���� �迭==");
		
		for(int i=0; i<copy.length; i++) {
			System.out.print(origin[i] + " ");
		}
		
		System.out.println("\n==���纻 �迭==");
		
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		
		System.out.println("\norigin�ּҰ� : " + origin.hashCode());
		System.out.println("copy�ּҰ� : " + copy.hashCode());
		
		// �ּҰ����� ����(��������)���� �� ���� �迭�� �����ϰ� ����
		
	}
	
	// ���� ����----------------------------------------------------
	public void method2() {
		// 1. for�� ���
		int[] origin = {1, 2, 3, 4, 5};
		
		int[] copy = new int[origin.length];
		
		for(int i=0; i<copy.length; i++) {
			copy[i] = origin[i];
		}
		
		System.out.println("== ���纻 �迭 ==");
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		
		copy[2] = 99;
		
		System.out.println("\n\n---���纻 �迭 ������---");
		
		System.out.println("==���� �迭==");
		
		for(int i=0; i<copy.length; i++) {
			System.out.print(origin[i] + " ");
		}
		
		System.out.println("\n==���纻 �迭==");
		
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		
		System.out.println();
		System.out.println("origin�ּҰ� : " + origin.hashCode());
		System.out.println("copy�ּҰ� : " + copy.hashCode());
		
	}
	
	public void method3() {
		// 2. ���ο� �迭 �����ϰ� SystemŬ�������� arraycopy �޼ҵ带 �̿��� ����
		
		int[] origin = {1, 2, 3, 4, 5};
		int[] copy = new int[10]; // �˳��ϰ� ũ�� ����
		
		// System.arraycopy(�����迭��, ���縦�������ε���, ���纻�迭��, ���纻�迭�� ���簡 ���۵� �����ε���, �����Ұ���);
		System.arraycopy(origin, 0, copy, 2, 5);
		
		// ���纻 �迭 ���
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		
		System.out.println();
		System.out.println("origin�ּҰ� : " + origin.hashCode());
		System.out.println("copy�ּҰ� : " + copy.hashCode());
		
		// �ּҰ� �ٸ� => �迭 ���� �� ���� ������ ���� ����!
	}
	
	public void method4() {
		// 3. Arrays Ŭ�������� �����ϴ� copyOf �޼ҵ� ���
		
		int[] origin = {1, 2, 3, 4, 5};
		
		// ���纻 �迭 = Arrays.copyOf(�����迭��, �����Ұ���); => copy�迭�� ũ�� == ������ ���� 	 
		// (ArraysŬ���� import����ߵ�!!)
		int[] copy = Arrays.copyOf(origin, 7); // �������� ũ�Ե� ������ �� ����!
		
		System.out.print("copy : ");
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		
		// ArraysŬ���������� copyOf �޼ҵ�� SystemŬ���������� arraycopy�� ������
		// �����ҽ����ε���, ����ɽ����ε��� ���ô� �Ұ�!!
		
		System.out.println();
		System.out.println("origin �ּҰ� : " + origin.hashCode());
		System.out.println("copy �ּҰ� : " + copy.hashCode());
		
	}
	
	public void method5() {
		// 4. clone() �޼ҵ� �̿��� ����(�����ε���, �����Ұ��� ��ü ���úҰ�)
		
		int[] origin = {1, 2, 3, 4, 5};
		int[] copy = origin.clone();
		
		/*
		System.out.print("copy : ");
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		*/
		// �ݺ��� ���� �迭 ����ϴ¹�
		System.out.println(Arrays.toString(copy)); //�ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�
		
		System.out.println("origin �ּҰ� : " + origin.hashCode());
		System.out.println("copy �ּҰ� : " + copy.hashCode());
		
	}
	
}
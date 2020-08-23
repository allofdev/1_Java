package com.method.hw2.controller;
import java.util.Arrays;

public class NonStaticSample {

	
	// ������
	// �⺻������
	public NonStaticSample() {
		
	}
	
	// �޼ҵ�
	// �޼ҵ�1
	public int[] intArrayAllocation(int length) {
		
		int[] arr = new int[length];
		
		for(int i=0; i<arr.length; i++) {
			int random = (int)(Math.random() * 100 + 1);
			arr[i] = random;
		}
		
		return arr;
		
	}
	
	
	// �޼ҵ�2
	public void display(int[] arr) {
		System.out.println(Arrays.toString(arr));
	}
	
	// �޼ҵ�3
	public void swap(int[] arr, int idx1, int idx2) {
		
		int temp = 0;
		temp = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = temp;
	}
	
	
	// �޼ҵ�4
	public void sortDescending(int[] arr) {
		int temp = 0;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<i; j++) {
				
				if(arr[j] < arr[i]) {
					swap(arr, i, j);
				}
			}
		}
		
		display(arr);

	}
	
	// �޼ҵ�5
	public void sortAscending(int[] arr) {
		int temp = 0;
		
				for(int i=0; i<arr.length; i++) {
			for(int j=0; j<i; j++) {
				if(arr[j] > arr[i]) {
					swap(arr, i, j);
				}
			}
		}

		display(arr);
				
	}
	
	// �޼ҵ�6
	public int countChar(String str, char c) {

		int count = 0;
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == c) {
				count++;
			}
		}
		
		return count;
		
	}
	
	// �޼ҵ�7
	public int totalValue(int num1, int num2) {
		
		int max = Math.max(num1, num2);
		int min = Math.min(num1, num2);
		
		int sum = 0;
		
		for(int i=min+1; i<max; i++) {
			sum += i;
		}
		return sum;
	}
	
	// �޼ҵ�8
	public char pCharAt(String str, int index) {
		
		/*	���� �ߴ� ���� ---> �ſ� ��
		 * char ch = ' ';
		 * 
		 * for(int i=0; i<str.length(); i++) { if(i == index) { ch = str.charAt(i); } }
		 * 
		 * return ch;
		 */
		
		// �� ������ ����
		
		return str.charAt(index);
		
	}
	
	// �޼ҵ�9
	public String pConcat(String str1, String str2) {
		
		String con = str1.concat(str2);
		
		return con;
	}
	
	
}

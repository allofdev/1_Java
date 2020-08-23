package com.method.hw1.controller;
import java.util.Scanner;
import java.util.Arrays;

public class NonStaticSample {

	
	// ������
	// �⺻������
	public NonStaticSample() {
		
	}
	
	// �޼ҵ�1
	public void printLottoNumbers() {
		
		int[] lotto = new int[7];
		
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = (int)(Math.random() * 45 + 1);
			for(int j=0; j<i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				} 
			}
		}
		
		int temp = 0;
		
		for(int i=0; i<lotto.length; i++) {
			for(int j=0; j<i; j++) {
				if(lotto[i]<lotto[j]) {
					temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}
			}
		}
		
		System.out.println("1. ���� �� : " + Arrays.toString(lotto));
		
	}
	
	// �޼ҵ�2
	public void outputChar(int num, char c) {
		
		char[] arr = new char[num];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = c;
		}
		
		System.out.print("2. " + c + "���� " + num + "�� ��� : " + Arrays.toString(arr));
	}
	
	// �޼ҵ�3
	public char alphabette() {
		
		char random = ' ';
		
		int randomNum = (int)(Math.random() * 2 + 1);
		
			if(randomNum == 1) {
				random = (char)((int)(Math.random() * 26 + 65));
			}else if(randomNum == 2) {
				random = (char)((int)(Math.random() * 26 + 97));
			}

		return random;
		
	}
	
	// �޼ҵ�4
	public String mySubstring(String str, int index1, int index2) {
		
		char[] arr = new char[str.length()];
		
		for(int i=0; i<str.length(); i++) {
			
			arr[i] = str.charAt(i);
			
		}
		
		
		int max = Math.max(index1, index2);
		int min = Math.min(index1, index2);
		String a = "";
		
		
		
		
		for(int i=0; i<arr.length; i++) {
			if(i < max && i > min) {
				System.out.print(arr[i]);			
			}
		}
		
		System.out.println("\n==============================");
		
		return str + "�� " + min + "�� " + max + "�� �ε��� ������ �� ���";
	}
}

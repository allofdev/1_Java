package com.method.hw3.run;
import com.method.hw3.controller.*;


public class Run {

	public static void main(String[] args) {
		
		StaticSample ss = new StaticSample();
		
		// setValue �޼ҵ�
		ss.setValue("Java");
		
		// getValue �޼ҵ�
		System.out.println("vlaue : " + ss.getValue());
		
		// toUpper �޼ҵ�
		System.out.print("�빮�ڷ� : ");
		ss.toUpper();
		
		// setChar �޼ҵ�
		System.out.print("\nJ => C : ");
		ss.setChar(0, 'C');
		
		// valueLength �޼ҵ�
		System.out.println("\n���� : " + ss.valueLength());
		
		
		// valueConcat �޼ҵ�
		System.out.print("PROGRAMMING �ٿ��� : " + ss.valueConcat("PROGRAMMING"));
		
		
	}
}

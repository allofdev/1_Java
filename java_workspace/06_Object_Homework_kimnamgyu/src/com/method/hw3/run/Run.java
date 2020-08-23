package com.method.hw3.run;
import com.method.hw3.controller.*;


public class Run {

	public static void main(String[] args) {
		
		StaticSample ss = new StaticSample();
		
		// setValue 메소드
		ss.setValue("Java");
		
		// getValue 메소드
		System.out.println("vlaue : " + ss.getValue());
		
		// toUpper 메소드
		System.out.print("대문자로 : ");
		ss.toUpper();
		
		// setChar 메소드
		System.out.print("\nJ => C : ");
		ss.setChar(0, 'C');
		
		// valueLength 메소드
		System.out.println("\n길이 : " + ss.valueLength());
		
		
		// valueConcat 메소드
		System.out.print("PROGRAMMING 붙여서 : " + ss.valueConcat("PROGRAMMING"));
		
		
	}
}

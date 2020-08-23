package com.method.hw3.controller;

public class StaticSample {
	
	// 필드
	private static String value;
	
	
	// setter 메소드
	public static void setValue(String value) {
		StaticSample.value = value;
	}
	
	public static String getValue() {
		return value;
	}
	
	public static void toUpper() {
		
	}
	
	public static void setChar(int index, char c) {
		
		char[] arr = new char[value.length()];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = value.charAt(i);
		}

		arr[index] = c;
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
		}
		
	}
	
	public static int valueLength() {
		
		return value.length();
	}
	
	public static String valueConcat(String str) {
		return value.concat(str);
	}
	
	
	
}

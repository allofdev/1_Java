package com.kh.array;
import java.util.Scanner;
import java.util.Arrays;

public class D_Overlap {
	
	public void method1() {
		
		int[] arr = new int[5];
		
		// 0번~마지막인덱스 랜덤값(1~10) 담기
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 + 1);	// 새로운 램덤값 우선 i번째 인덱스에 담고
			
			// 비교대상 for문 (기존에 담겨있던 값들이랑 일일이 비교하겠다.)
			for(int j=0; j<i; j++) {
				if(arr[i] == arr[j]) {	// 기존에 중복된 값이 존재할 경우
					System.out.println("중복발생!!");
					i--; // 중복이 발생되는 순간 현재의 i값에 다시 랜덤값을 담을 수 있게끔 (제자리걸음할 수 있게끔)
					break;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	
	public void method2() {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(i + "번째 정수 값 : ");
			arr[i] = sc.nextInt();
			
			for(int j=0; j<i; j++) {
				if(arr[i] == arr[j]) {
					System.out.println("중복값이 존재합니다. 다시입력해주세요.");
					i--;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
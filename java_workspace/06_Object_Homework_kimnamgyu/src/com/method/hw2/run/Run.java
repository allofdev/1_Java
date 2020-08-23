package com.method.hw2.run;
import com.method.hw2.controller.*;
import java.util.Scanner;
import java.util.Arrays;

public class Run {

	public static void main(String[] args) {
		
		NonStaticSample nss = new NonStaticSample();
		
		Scanner sc = new Scanner(System.in);
		
		// 메소드1
		System.out.print("정수 입력: ");
		int num = sc.nextInt();
		
		int[] arr = nss.intArrayAllocation(num);

		
		// 메소드2
		
		System.out.print("크기가" + num + "인 랜덤의 배열값 : ");
		nss.display(arr);
		
		
		// 메소드3   ★★★★★★★★★★★★★★
		// nss.swap(0, dix1, idx2);
		
		
		// 메소드4
		System.out.print("내림차순 출력 : ");
		nss.sortDescending(arr);
		
		// 메소드5
		System.out.print("오름차순 출력 : ");
		nss.sortAscending(arr);
		
		
		// 메소드6
		System.out.print("\n문자열 입력 : ");
		sc.nextLine();
		String str = sc.nextLine();
		
		System.out.print("문자 하나 입력 : ");
		char ch = sc.nextLine().charAt(0);
		
		System.out.print(str + "문자열에 " + ch + "의 갯수 : " + nss.countChar(str, ch));
		
		
		// 메소드7
		System.out.print("\n정수 1 입력 : ");
		int num1 = sc.nextInt();
		
		System.out.print("정수 2 입력 : ");
		int num2 = sc.nextInt();
		
		System.out.println(num1 + "과 " + num2 + "사이 정수들의 합계 : " + nss.totalValue(num1, num2));
		
		
		// 메소드8
		System.out.print("문자열 입력 : ");
		sc.nextLine();
		String strc = sc.nextLine();
		
		System.out.print("인덱스 입력 : ");
		int index = sc.nextInt();
		
		System.out.println(strc + "문자열의 " + index + "번 인덱스 문자 : " + nss.pCharAt(strc, index));
		
		
		// 메소드9
		System.out.print("1번 문자열 : ");
		sc.nextLine();
		String str1 = sc.nextLine();
		
		System.out.print("2번 문자열 : ");
		String str2 = sc.nextLine();
		
		System.out.println(str1 + "와 " + str2 + "을 합친 문자열 : " + nss.pConcat(str1, str2));
		
	}
	
	

	
	
	
	
	
	
	
}

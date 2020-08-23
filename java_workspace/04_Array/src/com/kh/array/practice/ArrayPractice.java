package com.kh.array.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
	
	public void practice1() {
		
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
		}
		
		// 출력
		for(int i=0; i<arr.length; i++) {
			
			System.out.print(arr[i] + " ");
		}
	}
	
	
	//★★★★★★★★★★★★
	public void practice2() {
		
		// arr[0] = 10
		// arr[1] = 9
		// arr[2] = 8
		// arr[10] = 1	
		
		int[] arr = new int[10];

		for(int i=0; i<arr.length; i++) {
			arr[i] = arr.length-i;
		}
		
		for(int i=0; i<arr.length; i++) {
			
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("양의 정수 : ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		for(int i=0; i<num; i++) {
			arr[i] = i+1;
		}
		
		//출력
		for(int i=0; i<num; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
	
	public void practice4() {
		
		String[] arr = {"사과", "귤", "포도", "복숭아", "참외"};
		
		System.out.println(arr[1]);
	}
	
	//★★★★★★★★★★★★
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		char[] arr = new char[str.length()];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = str.charAt(i);
		}
		
		System.out.print("문자 : ");
		char ch = sc.nextLine().charAt(0);
		
		int index = 0;
		int count = 0;
		
		System.out.printf("\n%s에 %c가 존재하는 위치(인덱스) : ", str, ch);		
		for(int i=0; i<arr.length; i++) {
			if(ch == arr[i]) {
				System.out.print(i + " ");	//위치 출력
				count ++;
			}
		}
		System.out.printf("\n%c 개수 : %d", ch, count);
	}
	
	public void practice6() {
		
		Scanner sc = new Scanner(System.in);
		
		String[] arr = {"월", "화", "수", "목", "금", "토", "일"};
		
		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int num = sc.nextInt();
		
		if(num >= 0 && num <=6) {
			System.out.println(arr[num] + "요일");
		}else {
			System.out.println("잘못 입력하셨습니다.");
		}
		
	}
	
	public void practice7() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			System.out.print("배열  " + i + "번째 인덱스에 넣을 값 : ");
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n총 합 : " + sum);
		
	}
	
	public void practice8() {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("정수 : ");
			int num = sc.nextInt();
			
			if(num>=3 && num % 2 == 1) {
				int[] arr = new int[num];
				int count = 1;
				
				for(int i=0; i<arr.length; i++) {
					arr[i] = count;
					
					if(i < arr.length / 2) {
						count++;
					}else {
						count--;
					}
				}
				for(int i=0; i<arr.length; i++) {
					System.out.print(arr[i] + " ");
				}
				break;
			}else {
				System.out.println("다시 입력하세요.");
				continue;
			}
		}
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("치킨 이름을 입력하세요 : ");
		String str = sc.nextLine();
		
		String[] arr = {"양념", "소금", "뿌링클"};
		
		boolean bl = false;
		
		for(int i=0; i<arr.length; i++) {
			if(str.equals(arr[i])) {
				bl = true;
				break;
			}
		}
		
		if(bl) {
		System.out.println(str + "치킨 배달 가능");
		}else {
			System.out.println(str + "치킨 배달 불가");
		}
	}	
	
	public void practice10() {
			
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			int random = (int)(Math.random() * 10 + 1);
			arr[i] = random;	
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice11() {
		
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			
			arr[i] = (int)(Math.random() * 10 + 1);
			System.out.printf("%d ", arr[i]);
		}
		System.out.println();
		
		// 오름 차순으로 정렬
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<i; j++) {
				if(arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("최댓값 : " + arr[9]);
		System.out.println("최솟값 : " + arr[0]);
	}
	
	public void practice12() {
		
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 + 1);
			for(int j=0; j<i; j++) {
				if(arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice13() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민등록번호(-포함) : ");
		String str = sc.nextLine();
		
		char[] arr = new char[str.length()];
		
		for(int i=0; i<arr.length; i++) {
			if(i < 8) {
				arr[i] = str.charAt(i);
			} else {
				arr[i] = '*';
			}
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
		}
	}
	
	public void practice14() {
		
		int[] arr = new int[6];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * 45 + 1);
			for(int j=0; j<i; j++) {
				if(arr[i] == arr[j]) {
					i--;
					break;
				}
			}
			for(int j=0; j<i; j++) {
				if(arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}	
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
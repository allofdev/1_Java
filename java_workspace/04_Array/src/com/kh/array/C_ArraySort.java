package com.kh.array;
import java.util.Arrays;


// 배열 정렬
public class C_ArraySort {
	
	public void method1() {
		
		// 변수를 가지고 값 변경
		int num1 = 20;
		int num2 = 10;
		
		System.out.println("==== 변경전 ====");
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		
		/*
		num1 = num2;	// num1 = 10;		-->
		num2 = num1;	// num2 = 10;		-->		틀린표현
		*/
		// 기존의 값을 보관할 임시 변수 만든 후 하나의 값을 기록해둠
		int temp = num1; // 보통 임시 값의 변수를 temp라고함	temp=20;
		num1 = num2;	 // num1 = 10;
		num2 = temp;	 // num2 = 20;
		
		System.out.println("==== 변경후 ====");
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
	}
	
	public void method2() {
		
		int[] arr = {2, 1, 3};	// 오름차순 : 앞에 제시된 값이 뒤에 제시된 값보다 더 클 경우 "변경" 해줘야함
		System.out.println("변경전 : " + Arrays.toString(arr));
		
		// arr[0] <--> arr[1]
		
		int temp = arr[0];	// temp = 2;
		arr[0] = arr[1];	// arr[0] = 1;
		arr[1] = temp;		// arr[1] = 2;
		
		System.out.println("변경후 : " + Arrays.toString(arr));
		
	}
	
	public void method3() {
		
		int[] arr = {2, 5, 4, 1, 3};
		
		/* 빨간색(뒤)	파란색(앞)
		 * 비교주체(i) 비교대상(j)
		 * i=0 일때	j=x
		 * i=1 일때	j=0
		 * i=2 일떄	j=01
		 * i=3 일때	j=012
		 * i=4 일때	j=0123
		 * 
		 * i=0~마지막인덱스   j=0~i-1
		 * 바깥for		안쪽for
		 */
		
		// 오름차순 정렬 : 앞에꼐 뒤에꺼보다 클경우 => 변경!!!
		
		// 1.비교주체를 선정하는 for문
		for(int i=0; i<arr.length; i++) {
			// 2.비교대상을 선정하는 for문
			for(int j=0; j<i; j++) {	// j=0; j<2; j++
				// 비교대상(앞) > 비교주체(뒤)		=> 변경
				if(arr[j] > arr[i]) {	// ----> 대소비교를 반대로 < 변경하면 내림차순정렬로 변경됨
					System.out.println("변경!!");
					// arr[j] <--> arr[i]
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	
	public void method4() {
		
		int[] arr = {2, 5, 4, 1, 3};
		
		Arrays.sort(arr);	// method3처럼 이중 for문 사용하지않고 한줄로 편하게 오름차순할수있음
		
		System.out.println(Arrays.toString(arr));
		
		
		
		
		
		
		
		
	}
}

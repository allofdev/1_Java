package com.kh.array;

import java.util.*;

public class A_Array {
	
	/*
	 * 배열 : 여러개의 값을 보관할 수 있는 공간 (단, 같은 자료형에 해당하는 값들만 보관)
	 *      같은 자료형의 변수를 하나의 묶음으로 다루는 것
	 *      각 인덱스의 자리에 값을 기록! (인덱스는 항상 0부터)
	 */
	
	public void method1() {
		// * 배열을 왜쓰는지 (배열 안쓰는경우 어떤 번거로움이 있는지..)
		
		// - 다량의 데이터를 기록해두고자 할 때 일일이 변수만들고 담아서 관리하면되긴함.. but 비효율적
		/*
		int num1 = 0;
		int num2 = 1;
		int num3 = 2;
		int num4 = 3;
		int num5 = 4;
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		*/
		
		/*
		for(int i=1; i<=5; i++) {
			System.out.println("num" + i);
		}
		*/
		
		// - 반복문 사용불가
		//int sum = num1 + num2 + num3 + num4 + num5;
		
		
		// * 배열사용법
		/*
		 * 1. 배열 선언
		 *    자료형 배열명[];
		 *    자료형[] 배열명;		--> 둘다 같은 배열 선언
		 */
		//int arr[];
		//int[] arr;
		
		/*
		 * 2. 배열 할당 (배열의 크기 지정!!)
		 *    배열명 = new int[배열크기];
		 */
		
		//arr = new int[5];
		
		// => 위의 과정을 동시에 진행 가능 (선언과 동시에 할당)
		int[] arr = new int[5]; // 배열의 크기 5로 지정되는 순간 (5개의 방이 생김.. 0번방 ~ 4번방)
		
		/*
		 * 3. 값 대입(초기화)
		 *    배열명[인덱스] = 값;
		 */
		
		/*
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 3;
		arr[4] = 4;
		*/
		
		// 마지막 인덱스 == 배열의 크기 -1
		for(int i=0; i<arr.length; i++) {
			arr[i] = i;	
		}
		
		// 배열의 장점 = 배열 사용시 일정한 규칙이 있을 경우 "반복문" 통해 편리하게 사용 가능
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		int sum2 = 0;
		// sum2 += arr[0];
		// sum2 += arr[1];
		// ...
		// sum2 += arr[4];
		for(int i=0; i<arr.length; i++) {
			sum2 += arr[i];	
		}
		
		System.out.println("총합계" + sum2);
		
		System.out.println(arr);
		
		
		
	}
	
	public void method2() {
		
		int a = 10;
		double d = 2.3;
		
		int[] iArr = new int[5];
		double[] dArr = new double[7];
		
		System.out.println(a);
		System.out.println(d);
		
		/*
		 * 기본자료형(8개)으로 선언한 변수
		 * => 진짜 값(리터럴)을 담는 변수 => 일반변수
		 * 
		 * 그 외 자료형(String, int[], char[], ....)
		 * => 수소값을 담는 변수 => 레퍼런스(참조) 변수
		 */
		
		System.out.println(iArr);	// i@뒤의 내용이 Heap에있는 주소값
		System.out.println(dArr);
		
	}
	
	public void method3() {
		
		double[] dArr = new double[3];
		
		for(int i=0; i<dArr.length; i++) {
			System.out.println(dArr[i]);
		}
			
		// 아직 값을 대입하지 않았는데 오류없이 잘 출력이 될 수 있었던 이유가
		// 배열의 각 인덱스에 별도로 대입하지 않으면  JVM이 지정한 기본값이 담기게 됨!!
		// 왜? Heap 영역에는 절대 빈 공간이 있어서는 안됨!! => JVM이 자동으로 초기값 부여

		int[] iArr = new int[5];
		
		for(int i=0; i<iArr.length; i++) {
			System.out.println(iArr[i]);
		}
		
		/*
		 * 		Stack			Heap			Static
		 *  ____________________________________________
		 * | double[]	|					  |			|
		 * | ________	| 	 ________		  |			|
		 * || 0X123  |	|	|  |  |  |		  |			|
		 * ||________|--|-->|__|__|__|		  |			|
		 * | dArr		|    [0][1][2]		  |			|
		 * |			|    0X123			  |			|
		 * |			|					  |			|
		 * | int[]		|					  |			|
		 * | ________	|    ______________	  |			|
		 * || 0x234  |	|	|  |  |  |  |  |  |			|
		 * ||________|--|-->|__|__|__|__|__|  |			|
		 * |iArr		|    [0][1][2][3][4]  |			|
		 * |            |    0X234			  |			|
		 * |____________|_____________________|_________|
		 */
		
	}
	
	public void method4() {
			
		int[] arr = new int[10];	
		/*
		 * arr[0] = 1;
		 * arr[1] = 2;
		 * arr[2] = 3;
		 * arr[3] = 4;
		 * arr[4] = 5;
		 * 	
		 */
		for(int i=0; i<arr.length; i++) {
			arr[i] = i + 1;
			
		}
		for(int i=0; i<arr.length; i++) {
			
			// iArr[0] : 1
			// iArr[1] : 2
			// ...
			// iArr[4] : 5
			System.out.println("iArr["+ i +"] : " + arr[i]);
			
		}
		
		System.out.println("arr : " + arr);
		System.out.println("arr의 해시코드값 : " + arr.hashCode());	// 주소값의 10진수 형태
		System.out.println("배열의 길이 : " + arr.length);
			
	}
		
	public void method5() {
		
		// 사용자가 입력한 정수값만큼의 배열 크기 지정		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("새로 할당할 배열의 길이 : ");
		int size = sc.nextInt();
		
		char[] arr = new char[size];
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		// int => 기본값 0
		// double => 기본값 0.0
		// char => 기본값 '' (공백)
		
	}
	
	public void method6() {
		
		
		int[] arr = new int[5];
		
		/*
		 * arr[0] = 2;
		 * arr[1] = 4;
		 * arr[2] = 6;
		 * arr[3] = 8;
		 * arr[4] = 10;
		 */
		
		int value = 2;
		
		for(int i=0; i<arr.length; i++) {	// 값을 담는 코딩
			arr[i] = value; 
			
			value += 2;
			
		}
		
		
		for(int i=0; i<arr.length; i++) {
			
			System.out.println("arr[" + i + "] = " + arr[i]);
			
		}
		
		System.out.println("arr의 길이 : " + arr.length);
		System.out.println("arr의 주소값 : " + arr.hashCode());
		
		// 추가로 값을 더 넣어주게 되면 오류 발생 0~4까지 5크기로 할당 되어있음
		// arr[5] = 12;
		
		// * 배열의 가장 큰 단점!!
		// - 한번 지정된 크기는 더이상 변경이 불가!!
		
		// 만일 크기를 변경해야만 한다면 다시 배열을 할당
		// (배열의 크기를 다시지정한 새로운 배열만들어야됨)
		
		arr = new int[10];
		
		System.out.println("\n===== 변경후 arr =====");
		System.out.println(arr);
		System.out.println("arr의 길이 : " + arr.length);
		System.out.println("arr의 주소값 : " + arr.hashCode());
		
		// 주소값 변경됨!! (기존에 참조하고 있던 곳과 연결끊긴 후 새로운 곳을 참조하고 있음)
		
		// 끊어진 기존껀 heap영역에 둥둥 떠다니는 상태 (어느곳에도 참조되지 않음)
		// => 일정 시간이 지나면 가비지 컬렉터(GC)가 지워줌 (자바의 특징 중 하나 : 자동메모리 관리)
		
		// 지금 할당된 배열을 지우고자 할 때 어떻게 해야되나요?
		arr = null; // 주소값이 없다 라는걸 의미
		
		System.out.println("\n===== 삭제후 arr =====");
		System.out.println(arr);
		System.out.println("길이 : " + arr.length);			//NullPointerException
		System.out.println("주소값 : " + arr.hashCode());		//NullPointerException
		
		// NullPointerException : 아무것도 참조하지 않는 null 이라는 특수한 값을 참조하고 있을 때 발생
		// null.xxx
		
	}
	
	public void method7() {
		// 배열 선언 및 크기 지정 => 값 초기화		--- 위에서 한 내용
		
		// 배열 선언 및 크기 지정 및 값 초기화
		// 자료형[] 배열명 = {값, 값, 값};					//배열 크기 지정안해도 됨 (할당 x)
		// 자료형[] 배열명 = new 자료형[]{값, 값, 값};		//배열 크기 지정안해도 됨 (할당 x)
		
		int[] arr = {1, 2, 3, 4};
		
		int[] arr2 =new int[]{1, 2, 3, 4};
		
		System.out.println(arr == arr2);	//false (주소값비교)	//실제 값을 비교한것이 아니라 각각의 주소값을 비교한것이기 때문에 false
		
	}
	
	//--------------------------------------------------------
	
	public void method8() {
		
		// 문자열 보관할 수 있는 String[] 크기 5로 지정한 후
		// 반복적으로 사용자에게 좋아하는 과일명 입력받은 후 해당 배열에 차곡차곡 담기
		
		Scanner sc = new Scanner(System.in);
		
		String[] arr = new String[5];
		
		for(int i=0; i<arr.length; i++) {
			System.out.print("좋아하는 과일명" + (i+1) + " : ");
			arr[i] = sc.nextLine(); 
		}
		
		// 잘 담겼는지 해당 인덱스에 담긴 값 출력
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}
	
	public void method9() {
		
		// 크기 10짜리 정수형 배열 만들고
		
		// 0번인덱스~마지막인덱스까지
		// 매번 새로이 만들어지는 랜덤값(1~100)을 담을꺼임
		
		// 출력
		
		int[] arr = new int[10];
		
		/*		내 풀이 - 나는 변수 사용함
		for(int i=0; i<arr.length; i++) {
			
			int random = (int)(Math.random() * 100 + 1);	
			
			arr[i] = random;
			
		}
		*/
		
		for(int i=0; i<arr.length; i++) {
			
			arr[i] = (int)(Math.random() * 100 + 1);
			
		}
		
		for(int i=0; i<arr.length; i++) {
			
			System.out.println(i + "번째 index : " + arr[i]);
			
		}
		
	}
	
	public void method10() {
		
		// 사용자에게 3명의 키 정보를 입력받아서 차곡차곡 담기
		// 반복문을 이용해서 3명의 키의 총합, 평균값 구하기
		
		Scanner sc = new Scanner(System.in);
		
		double[] height = new double[3];
		
		for(int i=0; i<height.length; i++) {
			System.out.print("키 입력 : ");
			height[i] = sc.nextDouble();	
		}
		
		double sum = 0;
		
		for(int i=0; i<height.length; i++) {
			sum += height[i];
		}
		
		System.out.println("총합 : " + sum);
		System.out.println("평균 : " + (sum / height.length));
		
	}
	
	public void method11() {
		
		// 사용자가 입력한 수만큼의 크기의 int배열 만들기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열 크기 : ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		// 0번인덱스~마지막인덱스까지 값 담기 (랜덤값(1~100))
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * 100 + 1);
		}
		
		// 담겨있는 값들 출력, 짝수들의 총합 계산
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
			
			if(arr[i] % 2 == 0) {
				sum += arr[i];
			}
		}
		System.out.println("\n짝수의 총합 : " + sum);
		
	}
	
	public void method12() {
		
		// 사용자에게 문자열 입력받은 후
		// 각 인덱스별 문자를 char[] 배열에 옮겨담기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();		// apple
										// ['a', 'p', 'p', 'l', 'e']
		char[] arr = new char[str.length()];
		
		// arr[0] = str.charAt(0);
		// arr[1] = str.charAt(1);
		// ..
		// arr[길이-1] = str.charAt(길이-1);
		for(int i=0; i<arr.length; i++) {
			arr[i] = str.charAt(i);
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}
	
}
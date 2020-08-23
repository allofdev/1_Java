package com.kh.chap02_loop.loop;
import java.util.*;

public class A_For {
	
	/*
	 * * for문
	 * 
	 * for(초기식; 조건식; 증감식) {		// 반복 횟수를 지정하기 위해 제시하는 것들
	 * 		.. 반복적으로 실행시키고자하는 실행구문...
	 * }
	 * 
	 * for문을 만나는 순간
	 * 초기식 --> 조건식 --> true일 경우 실행구문 실행 --> 증감식
	 *      --> 조건식 --> true일 경우 실행구문 실행 --> 증감식
	 *      --> 조건식 --> true일 경우 실행구문 실행 --> 증감식
	 *      ------------- 이 내용이 계속 반복 -------------
	 *      --> 조건식 --> false일 경우 실행구문 실행X ---------> 반복문(for문) 빠져나옴
	 *      
	 * 
	 * - 초기식 : 반복문이 수행될 때 "단 한번만 실행되는 구문"
	 * 			(주로 변수 선언과 동시에 초기화 구문)
	 * 
	 * - 조건식 : "반복문이 수행될 조건"을 작성하는 구문
	 * 			조건식이 true일 경우 해당 실행 구문을 실행
	 * 			조건식이 false가 되는 순간 반복을 멈추고 빠져나옴
	 * 			(주로 초기식에서 사용된 변수를 가지고 조건식을 작성)
	 * 
	 * - 증감식 : 반복문을 제어하는 변수값을 증감시키는 부분
	 * 			(주로 초기식에 제시한 변수를 가지고 증감연산자(++, --)를 사용)
	 */
	
	public void method1() {
		// "안녕하세요"를 5번 반복해서 출력
		
		/*
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		*/
		// 100번일경우 출력문 100번 복붙? --> GG
		
		
		// for문 5회 반복
		for(int i=1; i<=5; i++) {		// 1에서부터 5까지 1씩 증가하는동안 반복 (5회)
			System.out.println("안녕하세요");
			
		}
		
		for(int i=0; i<=4; i++) {		// 0에서부터 4까지 1씩 증가하는동안 반복 (5회)
			System.out.println("반갑습니다");
		}
		
		for(int i=1; i<6; i++) {		// 1에서부터 5까지 1씩 증가하는동안 반복 (5회)
			System.out.println("다시만나요");
		}
		
		for(int i=5; i>=1; i--) {		// 5에서부터 1까지 1씩 감소하는동안 반복 (5회)
			System.out.println("헬로우");
		}
		
		//10회
		//for(int i=1; i<=10; i++) { }		// 1에서부터 10까지 1씩 증가하는동안 반복 (10회)
		//for(int i=11; i<=20; i++) { }
		
		// 초기값에서부터 해당 조건이 true일때까지 1씩 증가하는동안 반복 수행!!
		
		// i=1  i<=5  true  출력  i++
		// i=2  i<=5  true  출력  i++
		// i=3  i<=5  true  출력  i++
		// i=4  i<=5  true  출력  i++
		// i=5  i<=5  true  출력  i++
		// i=6  i<=5  false ------------> 반복문을 빠져나옴
		
	}
	
	public void method2() {
		
		// 1부터 5까지 출력
		// 1
		// 2
		// 3
		// 4
		// 5
		/*
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		*/
		
		// 반복문에 제시된 변수값을 이용할 수도 있음
		for(int i=1; i<=5; i++) {		// 1에서부터 5까지 1씩증가하는동안 반복 (5회)
			System.out.println(i);
		}
		
		// 1 2 3 4 5 개행없이 옆으로 출력
		for(int i=1; i<=5; i++) {		// 1에서부터 5까지 1씩증가하는동안 반복 (5회)
			System.out.print(i + " ");
		}
		
	}
	
	public void method3() {
		// 5 4 3 2 1
		for(int i=5; i>=1; i--) {		// 5에서부터 1까지 1씩 감소하는동안 반복 (5회)
			System.out.print(i + " ");
		}
		
	}
	
	public void method4() {
		// 1 2 3 4 ... 8 9 10
		for(int i=0; i<=9; i++) {		// 0에서부터 9까지 1씩 증가하는동안 반복 (10회)			
			System.out.print(i + 1 + " ");
		}
		
	}
	
	public void method5() {
		// 1부터 10까지의 홀수만을 출력
		// 1 3 5 7 9
		
		//방법1
		for(int i=1; i<=10; i++) {		// 1에서부터 10까지 1씩 증가하는동안 반복 (10회)
			if(i % 2 == 1) {
				System.out.print(i + " ");	// i값이 홀수일 경우만 출력
			}
		}
		
		System.out.println("");
		System.out.println("---------");
		
		//방법2
		for(int i=1; i<=10; i+=2) {		// 1에서부터 10까지 2씩 증가시키는동안 반복 (5회)
			System.out.print(i + " ");
		}
		
	}
	
	public void method6() {
		
		// 1에서부터 10까지의 정수값들의 합계
		// int sum = 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10;
		
		// sum += 1;
		// sum += 2;
		// sum += 3;
		// ...
		// sum += 9;
		// sum += 10;
		
		// 규칙을찾자!!
		// sum +=	10번 반복!
		// 다만 더해지는 수가 1에서부터 10까지 1씩 증가하는 값이구나!
		
		int sum = 0;
		
		for(int i=1; i<=10; i++) {		// 1에서부터 10까지 1씩 증가하는동안 반복 (10회)
			sum += i;
		}
		
		System.out.println("총 합계 : " + sum);
		
	}
	
	public void method7() {
		// 1에서 부터 사용자가 입력한 수까지의 총 합계
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("양수 : ");
		int num = sc.nextInt();
	
		// 사용자가 입력한 정수값이 양수인지 아닌지 (유효한 값 제대로 입력했는지 유효성검사)
		if(num > 0) {		// 양수일 경우
			
			// sum =+ 1;
			// sum =+ 2;
			// ...
			// sum =+ num;
			
			int sum = 0;
			
			for(int i=1; i<=num; i++) {		// 1에서부터 num까지 1씩 증가하는동안 반복 (num회)
				sum += i;
			}
			
			// "1 에서부터 xx까지의 총 합계 : xx"			
			System.out.println("1에서부터" + num + "까지의 총 합계 : " + sum);
			
		}else {				// 양수가 아닐 경우 => 잘못 입력
			System.out.println("양수만 입력해주세요");
		}
		
	}
	
		public void method8() {
			
			// 1에서부터 어떤 랜덤값(1~10사이의 랜덤한 숫자)까지의 합계
			
			
			// Math클래스에서 제공하는 random() 메소드 호출시 => 랜덤값 발생!
			// java.lang.Math 에 있는 메소드 호출시 생성할 필요가 없음!!!!! => 클래스명.메소드();
			// 0.0 ~ 0.999999999 사이의 랜덤값이 발생!!
			// 0.0 <= 랜덤값 < 1.0
			
			
			// int random = Math.random();	// double값을 int형에 담을라고해서 발생한 문제
			//			0.0 <=		< 1.0		--> 0.0 ~ 0.999999999
			
			// int random = Math.random() * 10;
			// 			0.0 <=		< 10.0		--> 0.0 ~ 9.999999999
			
			// int random = Math.random() * 10 + 1;
			//			1.0	<=		< 11.0		--> 1.0 ~ 10.99999999
			
			int random = (int)(Math.random() * 10 + 1);
			//			1 <=		< 11		--> 1 ~ 10
			
			System.out.println("랜덤값 : " + random);
			
			// sum += 1;
			// sum += 2;
			// ...
			// sum += random;
			
			int sum = 0;
			
			for(int i=1; i<=random; i++) {		// 1에서부터 random까지 1씩 증가하는동안 반복 (random회)
				sum += i;
			}
			
			// "1에서부터 xx까지의 총 합계 : xxx"
			System.out.println("1에서부터 " + random + "까지의 총 합계 : " + sum);
			
		}
		
		public void method9() {
			
			// 사용자에게 문자열 입력받은 후
			// 각 인데스별 문자를 추출 후 출력
			
			// 예를 들어 apple로 입력		--> str에 기록
			// a		--> 출력문(str.charAt(0));
			// p		--> 출력문(str.charAt(1));
			// p		--> 출력문(str.charAt(2));
			// l		--> 출력문(str.charAt(3));
			// e		--> 출력문(str.charAt(4));
			
			//길이	  5		 4		    10
			// 		apple	kiwi	strawberry
			//		01234	0123	0123456789
			
			// 마지막인덱스는 항상 (문자열의 길이-1)이구나!!
			
			// 추출하고자 하는 인덱스값이 0~마지막인덱스(문자열의 길이-1)까지 1씩 증가함!!
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("문자열 입력 : ");
			String str = sc.nextLine();
			

			System.out.println("문자열의 길이 : " + str.length());		// 문자열의 길이를 알아내는 문 length();
			
			
			/*
			for(int i=0; i<=str.length()-1; i++) {	
				System.out.println(str.charAt(i));		// 0에서부터 str.length()-1 까지 1씩 증가하는동안 반복 (문자열의 길이 횟수)
			}
			*/
			
			for(int i=0; i < str.length(); i++) {	
				System.out.println(str.charAt(i));		// 위와 결과 동일
			}
			
		}
		
		public void method10() {
			
			// 2단 출력하기
			
			// 2 * 1 = 2
			// 2 * 2 = 4
			// 2 * 3 = 6
			// ...
			// 2 * 8 = 16
			// 2 * 9 = 18
			
			for(int i=1; i<=9; i++) {	// 1에서부터 9까지 1씩 증가하는동안 반복
				
				System.out.println("2 x " + i + " = " + 2 * i);
				
			}
			
		}
		
		public void method11() {
			
			// 1. 사용자가 입력한 단을 출력하기
			/*
			Scanner sc = new Scanner(System.in);
			System.out.print("단 수(2~9)를 입력해주세요 : ");		
			
			int dan = sc.nextInt();
			*/
			
			// 2. 2~9 사이의 랜덤한 단을 출력하기
			int dan = (int)(Math.random() * 8 + 2);	// 2 3 4 5 6 7 8 9
			System.out.println("===== "+ dan + "단 =====");
			
			
			
			if(dan >= 2 && dan <= 9) {
				
				// dan * 1 = 결과
				// dan * 1 = 결과
				// ...
				// dan * 9 = 결과
				for(int i=1; i<=9; i++) {
					System.out.println(dan + " X " + i +" = " + dan * i);
				}
			}else {
				System.out.println("2~9사이의 양수를 입력해야됩니다.");
				return;
			}
			
		}
		
		public void method12() {
			
			// 사용자에게 두개의 정수값 입력 받아
			// 두 개의 정수값 중 작은값 부터 큰값까지의 정수 출력, 총 합계
			
			//2, 4 입력했을 때 --> 2 3 4		총합계 : 9
			//4, 2 입력했을 때 --> 2 3 4		총합계 : 9
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("첫 번째 정수 : ");
			int num1 = sc.nextInt();
			
			System.out.print("두 번째 정수 : ");
			int num2 = sc.nextInt();
			
			/*
			int min = 0; // 두 수 중 작은 값을 저장할 변수
			int max = 0; // 두 수 중 큰 값을 저장할 변수
			
			if (num1 > num2) {
				max = num1;
				min = num2;
			}else {
				max = num2;
				min = num1;
			}
			*/
			int min = Math.min(num1, num2);
			int max = Math.max(num1, num2);
			int sum = 0;
			
			// min에서부터 max까지 1씩 증가하는 값을 매번 출력!
			for(int i=min; i<=max; i++) {
				
				System.out.print(i + " ");
				sum += i;					
				}
			
			System.out.println("총 합계 : " + sum);
			
		}
		
		public void method13() {
			
			/*
			 * 중첩 for문
			 * 
			 * for(초기식1; 조건식1; 증감식1) {
			 * 
			 * 		수행할문장1;
			 * 
			 * 		for(초기식2; 조건식2; 증감식2) {
			 * 			수행할문장2;
			 * 		}
			 * 
			 * 		수행할문장3;
			 * 
			 * }
			 * 
			 */
			
			// 1 2 3 4 5
			// 1 2 3 4 5
			// 1 2 3 4 5
			
			// 첫번째 행으로 고정일 때 1 2 3 4 5
			// 두번째 행으로 고정일 때 1 2 3 4 5
			// 세번쨰 행으로 고정일 때 1 2 3 4 5
			
			// 바깥쪽 for문으로 행을 지정
			// 안쪽 for문으로 열을 지정
			
			for(int i=1; i<=3; i++) {		// 1에서부터 3까지 1씩 증가하는동안 반복 (3회)
				for(int j=1; j<=5; j++) {		// 1에서부터 5까지 1씩 증가하는동안 반복 (5회)
					System.out.print(j + " ");
				}
				System.out.println();
			}
			
			/* 위 내용 설명
			 * 
			 * i=1 true
			 * 		j=1 true 출력 j++
			 * 		j=2 true 출력 j++
			 * 		j=3 true 출력 j++
			 * 		...
			 * 		j=5 true 출력 j++
			 * 		j=6 false 	--> 안쪽반복문 빠져나옴
			 * 		
			 * 		개행출력 i++
			 * 
			 * i=2 true
			 * 		j=1 true 출력 j++
			 * 		j=2 true 출력 j++
			 * 		j=3 true 출력 j++
			 * 		...
			 * 		j=5 true 출력 j++
			 * 		j=6 false 	--> 안쪽반복문 빠져나옴
			 * 
			 * 		개행출력 i++
			 * 
			 * i=3 true
			 * 		j=1 true 출력 j++
			 * 		j=2 true 출력 j++
			 * 		j=3 true 출력 j++
			 * 		...
			 * 		j=5 true 출력 j++
			 * 		j=6 false 	--> 안쪽반복문 빠져나옴
			 * 
			 * i=4 false	--> 바깥쪽반복문 빠져나옴
			 */
		}
		
		public void method14() {
			
			// 0시 0분 ~ 23시 59분
			
			// 0시 0분
			// 0시 1분
			// ...
			// 0시 58분
			// 0시 59분
			// 1시 0분
			// 1시 1분
			// ...
			// 1시 58분
			// 1시 59분
			
			// ...
			
			// 23시 0분
			// 23시 1분
			// ...
			// 23시 58분
			// 23시 59분
			
			// 시간은 0~23시까지 1씩 증가함
			// 매 시간 하나 고정에 0~59분까지 1씩 증가함
			
			// 시 --> 0부터 23까지 1씩 증가		--> 바깥쪽 for문으로 해결
			// 분 --> 매 시마다 0부터 59까지 1씩 증가 --> 안쪽 for문으로 해결
			
			for(int hour=0; hour<24; hour++) {
				
				System.out.println("==" + hour + "시==");
				
				for(int min=0; min<60; min++) {
					
					System.out.println(hour + "시" + min + "분");
				}
				System.out.println();
			}
		
		}
		
		public void method15() {
			
		// 2단부터 9단까지
		
		// === 2단 ===
		// 2 x 1 = 2
		// 2 x 2 = 4
		// ...
		// 2 x 9 = 18
			
		// === 3단 ===
		// 3 x 1 = 3
		// 3 x 2 = 6
		// ...
		// 3 x 9 = 27
			
		// ...
			
		// === 9단 ===
		// 9 x 1 = 9
		// 9 x 2 = 18
		// ...
		// 9 x 9 = 81
			
		// 단 --> 2에서부터 9까지 1씩 증가	=> 바깥쪽 for문
		// 수 --> 1에서부터 9까지 1씩 증가	=> 안쪽 for문
		
		for(int dan=2; dan<=9; dan++) {
			
			
		System.out.println("=== " + dan + "단 ===");
			
			for(int su=1; su<=9; su++) {
				System.out.printf("%d X %d = %d\n", dan, su, dan*su);
			}
		System.out.println();
			
			
		}	
			
	}
		
		public void method16() {
			
			// *****
			// *****
			// *****
			
			// 행은 1~3까지 반복 (3회)			=> 바깥쪽 for문
			// 열은 매 행마다 1~5까지 반복 (5회)		=> 안쪽 for문
			
			for(int i=1; i<=3; i++) {
				for(int j=1; j<=5; j++) {
					
					System.out.print('*');
				}
				System.out.println();		
			}
			
		}
		
		public void method17() {
			//  1234
			//1 1***		=> 4행 4열
			//2 *2**
			//3 **3*
			//4 ***4
			
			//			 i == j 일경우 => 숫자(i또는j) 출력
			//			 그게 아닐경우 => "*" 출력
			
			for(int i=1; i<=4; i++) {	// 행을 지정
				
				for(int j=1; j<=4; j++) {
					
					if(i == j) {
					
					System.out.print(i);
					
					}else {
					System.out.print("*");	
					}
				}
				System.out.println();
			}
			
		}
}
package com.kh.chap01_condition.condition;
import java.util.Scanner;

public class B_Else {
	
	/*
	 * 2. if-else문
	 * 
	 * if(조건식) {
	 * 		... 실행코드1 ..
	 * }else{
	 * 		... 실행코드2 ..
	 * }
	 * 
	 * 조건식이 true인 경우 실행코드1 수행후 if-else문 빠져나감
	 * 하지만 조건식이 false인 경우 무조껀 실행코드2 수행
	 * 
	 * 
	 * 3. if-else if문
	 * 
	 * 같은 비교 대상으로 여러개의 조건을 제시할 경우
	 * 
	 * if(조건식1) {
	 * 		... 실행코드1 ..
	 * }else if(조건식2) {
	 * 		... 실행코드2 ..
	 * }else if(조건식3) {
	 * 		... 실행코드3 ..
	 * }else {
	 * 		... 위의 조건들이 모두 false일 경우 반드시 실행할 코드..(else{ }는 생략 가능)
	 * }
	 * 
	 * 조건식1의 결과가 true일 경우 실행코드1 수행하고 if-else if문 빠져나감
	 * 단, 조건식1의 결과가 false였다면 조건식2 수행
	 * 조건식2의 결과가 true일 경우 실행코드2 수행하고 if-else if문 빠져나감
	 * 아니면 그 뒤의 조건식 실행...
	 * 
	 * 단, else 구문이 제시되어있을 경우 위의 조건들이 모두다 false가 되면 무조건 else 구문 실행
	 */
	
	public void method1() {
		// if클래스 method1()
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		/*
		if(num > 0) {
			System.out.println("양수다");
		}else {
			System.out.println("양수가 아니다");
		}
		*/
		
		if(num > 0) {
			System.out.println("양수다");
		}else if(num == 0) {
			System.out.println("0이다");
		}else {
			System.out.println("음수다");
		}
		
	}
	
	public void method2() {
		// if클래스 method2
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		if(num == 0) {
			System.out.println("0이다");
		}else if(num % 2 == 0) {
			System.out.println("짝수다");
		}else {
			System.out.println("홀수다");
		}
		
	}
	
	public void method3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.nextLine();	
		
		System.out.print("학년(숫자만) : ");
		int grade = sc.nextInt();	
		
		System.out.print("반(숫자만) : ");
		int classNum = sc.nextInt();	
		
		System.out.print("번호(숫자만) : ");
		int num = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("성별(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		
		System.out.print("성적(소수점 아래 둘째 자리까지 ) : ");
		double score = sc.nextDouble();
		
		String result = "";
		if(gender == 'M' || gender == 'm') {
			result = "남";
		}else if(gender == 'F' || gender == 'f') {
			result = "여";
		}else {
			System.out.println("잘못입력하였습니다");
			return;
		}
		
		System.out.printf("%d학년 %d반 %d번 %s %s학생의 성적은 %.2f이다", grade, classNum, num, name, result, score);
	
	}
	
	public void method4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이 : ");
		int age = sc.nextInt();
		
		if (age <= 13) {
			System.out.println("어린이");			
		}else if (age <= 19) {
			System.out.println("청소년");
		}else {
			System.out.println("성인");
		}
		
	}
	
	public void method5() {
		
		// 새로운 예시
		
		// 사용자에게 점수를 입력받아
		// 90점 이상은 A등급
		// 90점 미만 80점 이상은 B등금
		// 80점 미만 70점 이상은 c등급
		// 70점 미만 60점 이상은 D등급
		// 60점 미만 F등급
		// "당신의 점수는 xx점이고, 등급은 x등급입니다."
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 : ");
		int score = sc.nextInt();
		
		String grade = "";
		
		if(score >= 90) {
			grade = "A";
		}else if (score >= 80) {
			grade = "B";
		}else if (score >= 70) {
			grade = "C";
		}else if (score >= 60) {
			grade = "D";
		}else {
			grade = "F";
		}
		
		System.out.printf("당신의 점수는 %d점이고, 등급은 %s등급입니다.", score, grade);
		
	}
	
	public void method6() {
		
		// 위의 문제에 각 등급별 중간 점수 이상의 경우
		// 등급에 "+"라는 문자를 추가해서 출력하게 하자
		// ex) 95점이상 A+		85 = > B+	75 => C+	65 => D+
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 : ");
		int score = sc.nextInt();
		
		String grade = "";
		
		/*
		if (score >= 95) {
			grade = "A+";
		} else if (score >= 90) {
			grade = "A";
		} else if (score >= 85) {
			grade = "B+";
		} else if (score >= 80) {
			grade = "B";
		} else if (score >= 75) {
			grade = "C+";
		} else if (score >= 70) {
			grade = "C";
		} else if (score >= 65) {
			grade = "D+";
		} else if (score >= 60) {
			grade = "D";
		} else {
			grade = "F";
		}
		*/
		
		// 중첩 if
		if(score >= 90) {
			grade = "A";
			
			if(score >= 95) {
				grade += "+";	// grade = grade + "+";
			}
		}else if(score >= 80) {
			grade = "B";
			
			if(score >= 85) {
				grade += "+";
			}
		}else if(score >= 70) {
			grade = "C";
			
			if(score >= 75) {
				grade += "+";
			}
		}else if(score >= 60) {
			grade = "D";
			
			if(score >= 65) {
				grade += "+";
			}
		}else {
			grade = "F";
		}
		
		System.out.printf("당신의 점수는 %d점이고, 등급은 %s 등급입니다.", score, grade);
		
	}
	
	public void method7() {
		// 새로운 예시
		
		// 사용자에게 이름을 입력받은후
		// 사용자가 입력한 이름이 "강보람"과 일치하면 => "본인입니다."
		//						그게 아닐경우 => "본인이 아닙니다."
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 입력 : ");
		String name = sc.nextLine();
		
		/*
		if(name == "김남규") {					// 틀린 표현
			System.out.println("본인입니다.");
		} else {
			System.out.println("본인이 아닙니다.");
		}
		*/
		
		// 문자열간의 동등비교는 == 연산자가 아닌 equals() 메소드를 통해 비교해야만함!!!!
		
		// 문자열.charAt(인덱스)	=> '문자'
		// 문자열.equals(문자열)	=> true/false
		
		if(name.equals("김남규")) {
			System.out.println("본인입니다.");
		}else {
			System.out.println("본인이 아닙니다.");
		}
		
		// 기본자료형값 (int, char, double, boolean, .....) => ==연산자 사용가능
		// 참조자료형	(String) => equals() 메소드
	}
	
}
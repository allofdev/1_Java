package com.kh.variable;

// 다른 패키지라면 같은 클래스명으로 만들 수 있음!! (com.kh.variable.A_Variable)
public class A_Variable {


/*
 *  *  학습목표
 *  1. 변수라는게 뭔지
 *  2. 변수를 왜 사용하는지
 *  3. 변수를 어떻게 쓰면 되는지
 *  4. 변수명은 어떻게 지으면 되는지(명명규칙)
 */
	
	public void printValue() {
		
		System.out.println("=== 변수 사용 전 ===");
		System.out.println(100 + 10);
		System.out.println((100 + 10) * 10);
		System.out.println(((100 + 10) * 10) - 10);
		// 결과물은 잘 출력이 되지만 무슨 의도로, 무슨 의미인지 파악할 수 없음
		
		
		// 1. 변수란? --> 어떤 값을 메모리에 기록하기 위한 공간이다. (박스같은 개념)
		int point = 100;      // 포인트
		int bonus = 10;       // 보너스
		int personCount = 10; // 사람수
		int fees = 10;        // 수수료
		
		System.out.println("\n=== 변수 사용 후 ===");
		System.out.println(point + bonus);
		System.out.println((point + bonus) * personCount);
		System.out.println(((point + bonus) * personCount) - fees);
		
		/*
		 * 2. 변수를 사용하는 이유
		 * - 변수는 우선적으로 값에 의미를 부여하기 위한 목적으로 사용! (가독성이 좋아짐)
		 * - 변수는 한 번 값을 저장해 두고 계속 사용할 목적으로 사용!
		 * - 유지보수에 용이할 목적으로 사용  ex) 변수가 없을 때 일일이 숫자를 바꿔야 하지만 변수가 있을 때는 변수만 한번 변경하면 됨
		 */
		
	}

	public void declareVariable() {
		
		// 3. 변수를 어떻게 쓰면되는지 (변수를 어떻게 만들고, 어떻게 값을 담는지)
		/*
		 * 3_1. 변수의 선언 (저장할 값을 기록하기 위한 변수를 메모리공간에 확보해 놓는 과정) == 변수(박스)만들겠다!!
		 * 
		 * [표현법] 자료형 변수명;
		 * 
		 * 자료형 : 어떤 값을 담아낼지, 어떤 크기의 값을 담아 낼지에 대해 변수(박스)의 크기 및 종류를 정하는 부분
		 * 변수명 : 변수의 이름을 정하는 부분(의미부여)
		 * 
		 * * 주의할점
		 * - 변수명은 반드시 첫 문자가 소문자여야된다.
		 * - 여러 단어로 조합시 낙탚기법 지키기
		 * - 동일한 변수명으로 선언 불가  (중복불가)
		 * - 해당 영역({})에 선언한 변수는 해당 영역에서만 꺼내 쓸 수 있다!! (다른 메소드에서는 사용 불가)
		 * => 지역변수 개념
		 * ex) 위에 point변수가 있지만 메소드가 다르기 때문에 System.out.println(point);   --> 사용 불가
		 */
		
		
		// ---- 기본 자료형(8개) ----
		
		// (1). 논리형
		boolean isTrue; // 1byte
		
		// (2). 숫자형		
		// (2_1). 정수형 (4개)
		byte bNum;  	// 1byte (-128~127)
		short sNum; 	// 2byte
		int iNum;   	// 4byte --> 정수형 중에 가장 대표적인 자료형(기본형) -21억xxx ~ 21억xxx 
		long lNum;  	// 8byte
		
		// (2_2). 실수형 (2개)
		float fNum; // 4byte
		double dNum; // 8byte --> 실수형 중에 가장 대표적인 자료형(기본형) --> 소수점 아래로 더많이 내려가기 때문에 더 정확한 값을 담을 수 있기 때문
		
		// (3). 문자('한글자')형
		char ch; // 2byte 문자 하나만 
		
		
		// ---- 참조 자료형 ----
		// (4). 문자열("여러글자") --> 종특
		String str; // 사이즈가 없음, String만 대문자로 시작함
		
		
		/*
		 * 3_2. 변수에 값 대입(초기화)
		 * 
		 * [표현법] 자료형 변수명 = 값;
		 * 
		 */
		isTrue = true; //논리형변수에는 ture, false 값만 저장 가능
		
		bNum = 1;
		sNum = 2;
		iNum = 4;
		lNum = 8L;		// long형 변수에는 숫자값 담을 때 "l" 또는 "L"을 붙여서 long자료형이라는 걸 표현해주는게 좋다!! --> 출력은 숫자값만 됨
		
		fNum = 4.0f;	// float형 변수에는 실수값 담을 때 반드시 "f"를 붙여야 됨!
		dNum = 8.0;
		
		ch = 'A';		// char형 변수는 홀따옴표를('') 이용하여 값 대입
		ch = '강';		// 'A' 다음 '강'이 변수값이 되므로 결국 출력할때는 '강'만 나옴
		
		str = "ABC";	// String형 변수는 쌍따옴표를("") 이용하여 값 대입 
		
		// 변수에 값이 잘 답겼는지 출력
		System.out.println(isTrue);
		System.out.println(bNum);
		System.out.println(sNum);
		System.out.println(iNum);
		System.out.println(lNum);
		System.out.println(fNum);
		System.out.println(dNum);
		System.out.println(ch);
		System.out.println(str);
		
	}
	
	public void initVariable() {
		
		// 변수선언, 값 대입 따로따로 진행하는 경우 드물다!

		// 지금부터 변수선언과 동시에 초기화(값 대입)
		// [표현법] 자료형 변수명 = 값;
		
		// 1byte == 8bit
		
		// ----기본자료형----
		
		// (1). 논리형
		boolean isTrue = true;	//1byte
		
		// (2_1). 정수형
		byte bNum = 1;			//1byte
		short sNum = 2;			//2byte
		int iNum = 4; 			//4byte
		long lNum = 8L; 		//8byte
		
		// (2_2). 실수형
		float fNum = 4.0f;		//4byte
		double dNum = 8.0;		//8byte
		
		// (3_1). 문자형
		char ch = '가';			//2byte
		
		//(4). 문자열(참조자료형) ----String은 종특
		String str = "I오후반";
		
		// 변수에 저장된 값 출력
		System.out.println("isTrue : " + isTrue); //"inTrue : true"
		System.out.println("bNum : " + bNum); // "bNum : 1"
		System.out.println("iNum : " + iNum); // "iNum : 2"
		System.out.println("sNum : " + sNum); // "sNum : 4"
		System.out.println("lNum : " + lNum); // "lNum : 8"
		System.out.println("fNum : " + fNum); // "fNum : 4.0"
		System.out.println("dNum : " + dNum); // "dNum : 8.0"
		System.out.println("ch : " + ch); // "ch : 가"
		System.out.println("str : " + str); // "str : I오후반"
		
	
		// 번외 
		int result = iNum * 2;
		System.out.println(result);
		
		int etc = 9_999_999;	//언더바 '_'를 이용하여 사용자가 보기 좋게 할 수도 있음! 단, 숫자값만 저장되긴 함!!
		System.out.println("etc : " + etc);
		
		etc = 10;  // 변수는 언제나 변경 가능
		
	}	
	
	public void namingRule() {
		// 4. 변수명명규칙
		
		int number;
		
		// 1) 변수명은 중복될 수 없다!!
		//double number;
		
		// 2) 대소문자는 구분 된다(다른이름이 됨)
		int numBer;
		
		// 3) 예약어(이미 자바에서 사용되고 있는 키워드들) 사용 불가
		
		//int true;
		//int public;
		//int class;
		//int void;
		//int abstract; 
		
		// 4) 숫자 가능 (단, 숫자로 시작하는 건 안됨!)
		int age2;
		//int 2age;
		
		
		// 5) 특수문자 가능 (단, _ & 이외의 특수문자는 사용 불가!)
		int number_1;
		int number$1;
		//int number!1;
		//int number#1;
		
		
		// ----- 지켜야할 규칙은 아니지만 권장사항 -----
		
		// 1) 낙타표기법 지키기 + 소문자로 시작하기
		String username;
		String userName; // 관례상 맞는 표현
		
		// 2) 한글 사용 가능하긴 하지만 한글을 사용하지 않는 환경에서는 오류를 발생시킬 수 있음!!
		String 이름 = "김";
		
	}
	
	/*
	 *  **정리**
	 *  - 변수 : 값(리터럴)을 기록하기위한 공간 (메모리상에 값을 기록)
	 *  - 변수 사용목적
	 *    > 의미 부여
	 *    > 한 번 값 담은 후에 재사용할 목적
	 *    > 유지보수에 용이
	 *    
	 *  - 변수 사용법
	 *    > 변수 선언 	: 자료형 변수형;
	 *    > 값 대입	: 변수명 = 값;
	 *    > 변수 선언과 동시에 값 대입 : 자료형 변수형 = 값; 
	 *    
	 *  - 변수 명명 규칙 
	 */
	
}
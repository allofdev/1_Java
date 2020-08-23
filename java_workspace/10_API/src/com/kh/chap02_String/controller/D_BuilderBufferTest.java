package com.kh.chap02_String.controller;

public class D_BuilderBufferTest {

	/*
	 * * String 클래스 == 불변클래스 (그자리에서 값이 변경되는게 아닌 개념)
	 *   --> 빈번한 값을 변경할 경우 가비지컬렉터(GC)가 계속 기존의 값들을 지워줘야되는 단점
	 *   --> 변경이 적고 읽기만 할 경우 String 클래스가 용이
	 *   
	 * * StringBuilder, StringBuffer == 가변클래스 (그자리에서 값이 변경되는 개념)
	 *   - StringBuilder, StringBuffer 모두 생성자나 제공하고있는 메소드 동일함!!
	 *   - 유일한 차이점은 동기화가 되냐 안되냐의 차이 --> 곧, 속도 차이
	 *   
	 *   > StringBuilder = 동기화 제공 X
	 *   > StringBuffer	 = 동기화 제공 O
	 *   
	 *   멀티 스레드 환경(여러개의 일처리를 병행해서 동시다발적으로 수행하는 환경) -> 동기화 처리가 되는 걸로  실행해야 안전 --> StringBuffer 권장
	 *   단일 스레드 환경 -> 동기화 작업을 하게 되면 속도저하가 발생 될 수 있음 -> StringBuider를 권장
	 *   
	 */
	
	public void method1() {
		
		// StringBuilder, StringBuffer 객체 생성시 처음에 16개의 문자들을 저장할 수 있는 버퍼가 내부적으로 생성
		
		// 1. 기본 생성자로 생성
		StringBuilder sb1 = new StringBuilder();
		
		System.out.println("sb1의 수용량 : " + sb1.capacity());
		System.out.println("sb1의 문자열의 길이 : " + sb1.length());
		
		System.out.println("====================");
		
		// 2. 정수값 전달가능한 매개변수 생성자로 생성		--> 전달한 정수값 크기만큼의 수용량이 지정됨
		StringBuilder sb2 = new StringBuilder(30);
		
		System.out.println("sb2의 수용량 : " + sb2.capacity());
		System.out.println("sb2의 문자열의 길이 : " + sb2.length());
		
		System.out.println("====================");
		
		// 3. 문자열 전달가능한 매개변수 생성자로 생성
		StringBuilder sb3 = new StringBuilder("반가워!!");
		
		System.out.println("sb3의 수용량 : " + sb3.capacity()); // 16 + 5 => 21
		System.out.println("sb3의 문자열의 길이 : " + sb3.length());
		
	}

	public void method2() {
		// 불변인지 가변인지
		
		// String 클래스 가지고 불변인거
		String str = "반가워!";
		System.out.println("str 주소값 : " + System.identityHashCode(str));
		
		str += "난 String이얌";	// str = str + "난 String이얌";
								// str = "반가워! 난 String이얌"; --> 기존에 더해지는게 아니라 StringPool에 새로생김
		System.out.println("변경후 str 주소값 : " + System.identityHashCode(str));
		
		
		System.out.println("====================");
		// StringBuilder 가변인거
		StringBuilder sb = new StringBuilder("반가워!");
		System.out.println("sb : " + sb);
		System.out.println("주소값 : " + System.identityHashCode(sb));
		System.out.println("수용량 :"  + sb.capacity()); // 16(기본) + "반가워!"(4)
		System.out.println("문자열의길이 : " + sb.length());
		
		
		System.out.println("====================");
		// StringBuilder에 담긴 문자열을 변경하고자 할때는 메소드를 통해서 작업해야됨
		// 1. append(String str) : StringBuilder	--> 기존의 문자열에 새로운 문자열 추가하고 싶을때
		sb.append("안녕!");
		System.out.println("변경후 sb : " + sb);
		System.out.println("변경후 주소값 : " + System.identityHashCode(sb));
		System.out.println("변경후 수용량 : " + sb.capacity());
		System.out.println("변경후 문자열의길이 : " + sb.length());
		// 주소값 변동 없음 == 그자리에서 문자열 변경 == 가변
		
		
		System.out.println("====================");
		sb.append("다들 조금만 힘내세요!!!"); // 14 + 7(기존)--> 기존수용량 20보다 오버됨
		System.out.println(sb);
		System.out.println("변경후 sb : " + sb);
		System.out.println("변경후 주소값 : " + System.identityHashCode(sb));
		System.out.println("변경후 수용량 : " + sb.capacity()); // 기존의수용량 * 2 + 2
		System.out.println("변경후 문자열의길이 : " + sb.length());
		
		
		System.out.println("====================");
		// 2. delete(int start, int end) : StringBuilder	--> 문자열 삭제하기(start<=   <end)
		sb.delete(2, 5);	// 워<=      <녕
		System.out.println("삭제후 sb : " + sb);
		System.out.println("삭제후 주소값 : " + System.identityHashCode(sb));
		System.out.println("삭제후 수용량 : " + sb.capacity()); // 문자열 지워져도 수용량 안줄어듬
		System.out.println("삭제후 문자열의길이 : " + sb.length());
		
		
		System.out.println("====================");
		// 3. insert(int offset, String str) : StringBuilder	// 기존의 문자열 사이에 또다른 문자열 추가하고자 할때
																// (offset은 index라고 생각하면 됨)
		sb.insert(1, "ㅎㅎㅎ");
		System.out.println("변경후 sb : " + sb);
		System.out.println("변경후 주소값 : " + System.identityHashCode(sb));
		System.out.println("변경후 수용량 : " + sb.capacity());
		System.out.println("변경후 문자열의길이 : " + sb.length());
		
		
		System.out.println("====================");
		// 4. reverse() : StringBuilder --> 기존의 문자열을 역으로 바꾸고자 할 때
		sb.reverse();
		System.out.println("변경후 sb : " + sb);
		System.out.println("변경후 주소값 : " + System.identityHashCode(sb));
		System.out.println("변경후 수용량 : " + sb.capacity());
		System.out.println("변경후 문자열의길이 : " + sb.length());
		
		
		System.out.println("====================");
		sb.append("ㅋㅋㅋ").delete(0, 4).reverse().insert(2, "ㄱㄱㄱ");
		//    추가                            삭제                    역으로                       2번인덱스에 추가
		// 메소드 체이닝 == 연이어서 메소드 호출
		System.out.println("최종 sb : " + sb);
		System.out.println("최종 주소값 : " + System.identityHashCode(sb));
		System.out.println("최종 수용량 : " + sb.capacity());
		System.out.println("최종 문자열의길이 : " + sb.length());
		
	}
	
	public void method3() {
		StringBuilder sb = new StringBuilder("javaProgram");
		
		sb.append("API").delete(4, 11).reverse(); // 메소드 체이닝
		// javaProgramAPI		|			|
		//					javaAPI			|
		//								IPAavaj
		System.out.println(sb);
		
		
	}
	
}
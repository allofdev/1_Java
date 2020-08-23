package com.kh.chap02_abstractAndinterface.part02_interface.run;
import com.kh.chap02_abstractAndinterface.part02_interface.model.vo.Baby;
import com.kh.chap02_abstractAndinterface.part02_interface.model.vo.Basic;
import com.kh.chap02_abstractAndinterface.part02_interface.model.vo.Mother;
import com.kh.chap02_abstractAndinterface.part02_interface.model.vo.Person;

public class Run {

	public static void main(String[] args) {
		
		// Person p = new Person(); Person클래스는 추상클래스(미완성클래스)이기때문에 객체생성이 불가능
		
//		Person m = new Mother("강엄마", 50, 70, "출산"); // Person m --> 레퍼런스는 생성 가능
//		Person b = new Baby("김아기", 3.5, 70);
//		
//		System.out.println(m);
//		System.out.println(b);
//		
//		// 엄마와 아기가 밥을 먹는다.
//		m.eat();	// 엄마 : 몸무게 +10, 건강도 -10
//		b.eat();	// 아기 : 몸무게 +3, 건강도 +1
//		
//		// 엄마와 아기가 잠을 잔다.
//		m.sleep();	// 엄마 : 건강도 +10
//		b.sleep();  // 아기 : 건강도 +3
//		
//		System.out.println("========== 다음날 ==========");
//		System.out.println(m);
//		System.out.println(b);
		
		
		// 인터페이스 또한 미완성된 상태기 때문에 객체 생성 불가
		// Basic b = new Basic();
		
		Basic b1 = new Mother("강엄마", 50, 70, "입양");
		Basic b2 = new Baby("김아기", 3.2, 70);
		
		System.out.println(b1);
		System.out.println(b2);
		
		b1.eat();
		b2.eat();
		
		b1.sleep();
		b2.sleep();
		
		System.out.println("========== 다음날 ==========");
		System.out.println(b1);
		System.out.println(b2);
		
		
		// 			|		일반클래스		|			추상클래스			|		인터페이스			|		
		//==================================================================================--
		//	  보유		|	일반필드 + 일반메소드	| 일반필드 + 일반메소드 + [추상메소드]	|	상수필드 + 추상메소드		|
		//------------------------------------------------------------------------------------
		//	  상속		|				단일상속(extends)					|	다중상속(implements)	|
		//------------------------------------------------------------------------------------
		// 오버라이딩	|		선택적으로		| 일반메소드는 선택적, 추상메소드는 강제	|	무조건 강제로 오버라이딩		|
		//------------------------------------------------------------------------------------
		//		-------------------------------------------------------------->>>>>
		//						오른쪽으로 갈수록 강제성이 더 짙어짐 (규약이 더쎄짐)
		
		
		// 클래스와 클래스 간		: 클래스명 extends 클래스명					(한개)
		// 클래스와 인터페이스간	: 클래스명 implements 인터페이스, 인터페이스, ...	(여러개)
		// 인터페이스와 인터페이스간	: 인터페이스 extends 인터페이스, 인터페이스, ...	(여러개)
		
		
		
		
		
		
		
		
		
		
	}
}
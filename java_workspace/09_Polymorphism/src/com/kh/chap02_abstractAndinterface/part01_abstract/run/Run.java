package com.kh.chap02_abstractAndinterface.part01_abstract.run;
import com.kh.chap02_abstractAndinterface.part01_abstract.model.vo.BasketBall;
import com.kh.chap02_abstractAndinterface.part01_abstract.model.vo.FootBall;
import com.kh.chap02_abstractAndinterface.part01_abstract.model.vo.Sports;


public class Run {

	public static void main(String[] args) {
		
		/*
		 * * 추상클래스
		 * - 미완성클래스
		 * - 객체 생성 불가!! (단, 레퍼런스 타입으로는 기술 가능)
		 * - 일반필드 + 일반메소드 + [추상메소드]
		 * --> 추상메소드를 가진 클래스는 반드시 추상클래스로 명시해야됨
		 * --> 추상메소드가 궂이 없어도 추상클래스로 만드는거 가능!!
		 *     언제? --> 클래스를 정의하긴 했지만 이 클래스로 객체생성 불가하게끔 해놓고자 한다면
		 * 
		 * * 추상메소드
		 * - 미완성된 메소드로 몸통부 ( {} )가 구현되어있지 않는 메소드
		 * - 추상메소드가 기술된 추상클래스를 상속받는 자식클래스에서 반드시! 오버라이딩 해야됨★★★★★★★★★★
		 *   --> 오버라이딩 하지 않으면 에러 발생
		 *   --> 메소드 사용의 통일성 확보 목적
		 *     
		 */
		
		
		
		// 추상클래스 (미완성 클래스)로 객체 생성 불가
		// Sports s = new Sprots();
		
		// 단, 레퍼런스타입으로는 기술가능     Sports s;
		// 즉, 다형성으로는 적용가능
		// Sports s = new BasketBall();
		Sports[] arr = new Sports[2]; // ---> new Sports[2] 는 단지 배열의 크기지정이지 객체생성이 아님
		arr[0] = new BasketBall();
		arr[1] = new FootBall();
		
		for(int i=0; i<arr.length; i++) {
			arr[i].rule();
		}
	}
}
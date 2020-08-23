package com.kh.chap01_beforeVSafter.after.run;
import com.kh.chap01_beforeVSafter.after.model.vo.*;

public class Run {
	public static void main(String[] args) {
		
		// Desktop객체 생성
		// brand, pCode, pName, price, allInOne
		//ex) --> d.setBrand("삼성");	// 가능한이유 --> Desktop클래스에 setBrand가 없지만 Product클래스를 상속받았기 때문에 사용 가능
		Desktop d = new Desktop("삼성", "d-01", "짱짱데스크탑", 1500000, true);
		
		// tv객체 생성
		Tv t = new Tv("LG", "t-01", "겁나얇은티비", 3500000, 60);
		
		// SmartPhone객체 생성
		SmartPhone s = new SmartPhone("애플", "s-01", "아이폰11pro", 1500000, "KT");
		
		System.out.println(d.information());
		System.out.println(t.information());
		System.out.println(s.information());
		
		
		/*
		 * * 상속의 장점
		 * - 보다 적은 양의 코드로 새로운 클래스 작성 가능
		 * - 코드를 공톡적으로 관리하기 때문에 코드의 추가나 변경에 용이
		 * --> 코드의 중복을 제거하여 프로그램의 생산성이나 유지보수에 크게 기여
		 * 
		 * * 상속의 특징
		 * - 클래스간의 상속은 다중상속이 불가능! (단일 상속만 가능)
		 * - 부모의private 접근제한자로 기술되어있는 경우 아무리 상속구조라고 해서 직접 접근 불가
		 *   (단, protected로 하게 되면 자식에서 직접 접근가능!)
		 * - 명시되어있진 않지만 모든 클래스는 Object 클래스의 후손이다!!
		 *   --> Object클래스에서 제공하는 메소드는 얼마든지 갖다 쓸수 있다.
		 *   --> 맘에 안들면 내 입맛대로 제정의(오버라이딩) 가능하다
		 *
		 */
		
		
		// 다형성 맛보기
		// 부모타입으로 다 만들수 있음
		Product[] arr = new Product[3];
		arr[0] = new Desktop();
		arr[1] = new Tv();
		arr[2] = new SmartPhone();
		
		
		Product p1 = new Desktop();
		Product p2 = new Tv();
		Product p3 = new SmartPhone();
		
		
		
		
		
		
		
		
		
	}
}

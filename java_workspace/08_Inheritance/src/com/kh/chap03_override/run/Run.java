package com.kh.chap03_override.run;
import com.kh.chap01_beforeVSafter.after.model.vo.Desktop;
import com.kh.chap01_beforeVSafter.after.model.vo.Tv;
import com.kh.chap02_inherit.model.vo.Vehicle;
import com.kh.chap03_override.model.vo.*;

public class Run {
	public static void main(String[] args) {
		
		Book bk1 = new Book("수학의 정석", "나수학", 10000);
		Book bk2 = new Book("칭찬은 고래도 춤추게 한다", "고래", 20000);
		
		System.out.println(bk1.information());
		System.out.println(bk2.information());
		
		// * toString()
		// 오버라이딩 전 : Object 클래스의 toString() 실행 --> 풀클래스명 + @ + 주소값의 16진수
		// 오버라이딩 후 : Book 클래스의 toString() 실행 --> 모든 필드값 하나의 문자열로 합쳐서 반환
		System.out.println(bk1.toString()); 
		System.out.println(bk2/*.toString()*/);	// bk2 == bk2.toString() --> Book클래스에서 toString을 오버라이딩(재정의) 하여 information()대신 사용 가능해짐
		// 출력문에서 어떤 레퍼런스를 출력하고자 할 때 JVM이 자동으로 해당 레퍼런스.toString() 메소드 호출해줬던 것!!
		
		
		// equals(), hashCode() 를 가지고 작업해볼 것 !!
		
		Book bk3 = new Book("수학의 정석", "나수학", 10000); // bk1과 동일한 필드값을 가진 bk3객체 생성
		
		System.out.println("bk1과 bk3가 같은책입니까 : " + (bk1 == bk3)); // false 내용물이 같아도 주소값이 다르기 때문에 같지않다
		
		// 래퍼런스간의 동등한지 비교할 때 equals() 메소드 사용 가능 --> equals()메소드는 문자열과의 동등비교할때 , 객체들과의 동등비교할때 사용한다.
		
		// 오버라이딩 전 : Object클래스의 equals메소드 --> 두 주소값을 가지고 비교
		// 오버라이딩 후 : Book클래스의 equals메소드 --> 두 객체의 필드값을 가지고 비교
		System.out.println("bk1과 bk3가 같은책입니까 : " + (bk1.equals(bk3))); // false
		
		
		// 동일객체 : 실제필드값들도 같고 해쉬코드값도 일치한 경우
		
		
		// 오버라이딩 전 : Object클래스의 hashCode메소드 --> "실제 주소값을 베이스"로 10진수로 계산한 결과를 반환
		// 오버라이딩 후 : Book클래스의 hashCode메소드 --> "각 객체의 필드값을 베이스"로 해시코드값 반환
		System.out.println(bk1.hashCode());
		System.out.println(bk2.hashCode());	
		System.out.println(bk3.hashCode());
		
		// 즉, 동일객체를 확인 하기 위해서는 equals() hashCode()는 항상 같이 오버라이딩 해야됨
		
		
		
		// -------------------------------------------------------------------------------
		
		// int, char 등과는 다르게  String은 사실 하나의 클래스임
		
		// String str1 = "hello";
		String str1 = new String("hello");	// 원래는 클래스 이기 때문에 객체생성 방법으로도 가능함
		
		// String str2 = "hello";
		String str2 = new String("hello");	// 원래는 클래스 이기 때문에 객체생성 방법으로도 가능함
		
		System.out.println(str1 == str2); // 단순 주소값 비교
		
		System.out.println(str1.equals(str2)); //★★★★★  equals는 주소값을통해 비교하는 거지만 String에서 바로 가능한 이유는 위의 방법으로 String클래스에서 equals를 오버라이딩 했기 때문임 ★★★★★
		
		System.out.println(str1); //★★★★★ String클래스에서 toString() 메소드 또한 오버라이딩 되어있음          -----> 안되어있다면 주소값이 나왔어야 됨 ★★★★★
		System.out.println(str2);
		
		System.out.println(str1.hashCode()); //★★★★★ hashCode() 또한 동일하게 나옴 ----> 즉, String클래스에서 필드값을 가지고 주소값을 가지게끔 이미 오버라이딩 해놓음 ★★★★★
		System.out.println(str2.hashCode());
		
		
		
		
		// 다형성 맛보기
		// Object클래스는 모든클래스의 부모 클래스이기 때문에 아래와 같은 상황을 가능하게함
		Object[] arr = new Object[10];
		arr[0] = new Book();
		arr[1] = new Tv();
		arr[2] = new Desktop();
		arr[3] = new Vehicle();
		
		
	}
}

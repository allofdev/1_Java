package com.kh.chap05_constructor.run;
import java.util.Scanner;

import com.kh.chap05_constructor.model.vo.*;

public class Run {

	public static void main(String args[]) {
		
		// 1. 기본생성자로 객체 생성
		User u1 = new User();
		
		System.out.println(u1.information());	// JVM의 초기값들 담겨있음
		
		//	setter를 통해 값 초기화
		u1.setUserId("user01");
		u1.setUserPwd("pass01");
		u1.setUserName("홍길동");
		System.out.println(u1.information());		
		
		
		
		// 생성과 동시에 초기화 할 수 없을까??
		// 2. 매개변수 세개짜리 사용해서
		User u2 = new User("user02", "pass02", "김말똥");
		System.out.println(u2.information());
		
		u2.setAge(30);	// 생성자를 사용 하더라도 setter메소드는 사용해야함 -> 각 필드의 값을 하나씩 수정할 때 사용
		System.out.println(u2.information());
		
		
		// 3. 매개변수 5개짜리 생성자를 통해 객체 생성
		User u3 = new User("user03", "pass03", "홍길녀", 20, '여');
		System.out.println(u3.information());
		
		
		
		// 매개변수 생성자 방법
		// 사용자가 데이터 입력
		System.out.println("\n================================================");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이디 : ");
		String userId = sc.nextLine();
		
		System.out.print("비밀번호 : ");
		String userPwd = sc.nextLine();
		
		System.out.print("이름 : ");
		String userName = sc.nextLine();
		
		
		System.out.print("나이 또는 성별을 추가적으로 입력하시겠습니까?(y/n) : ");
		char ch = sc.nextLine().charAt(0);
		
		User u4 = null;	// 주소값이기 때문에 기본값 null로 초기화
		
		if(ch == 'y' || ch == 'Y') {
				System.out.print("나이 : ");
				int age = sc.nextInt();
				sc.nextLine();
		
				System.out.print("성별(남/여) : ");
				char gender = sc.nextLine().charAt(0);
				
				u4 = new User(userId, userPwd, userName, age, gender);
				
		}else if(ch == 'n' || ch == 'N') {
			u4 = new User(userId, userPwd, userName);
		}else {
			System.out.println("잘못입력했습니다.");
		}
		
		System.out.println(u4.information());
		
		
		
		
		
		// 기본생성자 방법
		// 사용자가 데이터 입력
		User u5 = new User();
		
		System.out.print("아이디 : ");
		u5.setUserId(sc.nextLine());
		
		System.out.print("비밀번호 : ");
		u5.setUserPwd(sc.nextLine());
		
		System.out.print("이름 : ");
		u5.setUserName(sc.nextLine());
		
		
		System.out.print("나이 또는 성별을 추가적으로 입력하시겠습니까?(y/n) : ");
		char chr = sc.nextLine().charAt(0);
		

		
		if(chr == 'y' || chr == 'Y') {
				System.out.print("나이 : ");
				u5.setAge(sc.nextInt());
				sc.nextLine();
				
				System.out.print("성별(남/여) : ");
				u5.setGender(sc.nextLine().charAt(0));
				
		}else if(chr == 'n' || chr == 'N') {

		}else {
			System.out.println("잘못입력했습니다.");
			return;
		}
		
		System.out.println(u5.information());
		
	}
}

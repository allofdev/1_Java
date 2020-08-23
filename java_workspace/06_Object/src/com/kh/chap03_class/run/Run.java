package com.kh.chap03_class.run;
import com.kh.chap03_class.model.vo.*;
import java.util.Scanner;

public class Run {
	
	public static void main(String[] args) {
		
		//Person 클래스 =======================================================================
		
		// 객체생성을 통해 Heap 영역에 공간을 먼저 확보해둬야 함(new를 통해) --> 할당
		// Heap에는 빈공간이 없기 때문에 초기값이 기본적으로 생성됨 -> 확인해보려면 p.setId("user01"); 을 주석 처리하고 실행해보면됨
		// String -> null
		// int    -> 0
		// char   -> ''
		
		Person p = new Person();
		
		/* 이거는 public때 가능
		p.id = "user01";
		p.pwd = "pass01";
		*/
		
		//p.setId("user01");
		p.setPwd("pass01");
		p.setName("홍길동");
		//p.setAge(20);
		p.setGender('M');
		p.setPhone("010-1111-2222");
		p.setEmail("hong@naver.com");
		
		
		
		
		// 반환-----------------------------------------------------------------------------
		// String id = p.getId();
		// System.out.println(id);		--> 변수에 입력후 출력도 가능하고 그냥도가능
		
		System.out.println("id : " + p.getId() + ", pwd : " + p.getPwd() + ", name : "
						+ p.getName() + ", age : " + p.getAge() + ", gender : " + p.getGender() 
						+ ", phone : " + p.getPhone() + ", email : " + p.getEmail());
		
		
		p.setPhone("010-2222-3333");		// 기존의 데이터를 변경도 가능
		System.out.println(p.getPhone());
		
		
		// information() 메소드에 있는 내용을 통해 한번에 반환
		System.out.println(p.information());
		
		
		// 사용자가 이름을 변경
		Scanner sc = new Scanner(System.in);
		
		System.out.print("변경할 이름 : ");
		String name = sc.nextLine();
		p.setName(name);
		
		System.out.println(p.information());
	}
}

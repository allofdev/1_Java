package com.kh.part01_objectVSobjectArray.run;
import com.kh.part01_objectVSobjectArray.model.vo.*;
import java.util.Scanner;
import java.util.ArrayList;

// 배열을 이용하여 객체 사용 하기
// for문을 사용할 수 있게 되어서 편리해짐

public class ObjectArrayTest2 {

	public static void main(String[] args) {
		
		/*	기본적인 객체 생성 방법
		int[] arr = new int[3];
		
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		*/
		
		/*
		Book[] bk = new Book[3];	//변수 Book은 Book클래스가 있기 때문에 가능
		bk[0] = new Book();
		bk[1] = new Book("자바의 정석", "홍길", 10000, "KH");
		bk[2] = new Book();
		*/
		
		
		//----- 13번째 프로젝트 - 컬렉션 배운 후 컬렉션으로 바꿔봄!
		ArrayList<Book> list = new ArrayList<>();
		list.add(new Book());
		list.add(new Book("자바의정석", "홍길동", 10000, "KH"));
		list.add(new Book());
		

		// 출력
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).information());
		}
	
		
		// 사용자에게 값 입력받기
		Scanner sc = new Scanner(System.in);
		
		// 1. 전체 도서정보 입력받기
		for(int i=0; i<3; i++) {
			
			System.out.println(i + 1 + "번째 도서 정보 입력");
			
			System.out.print("제목 : ");
			String title = sc.nextLine();
			
			System.out.print("저자 : ");
			String author = sc.nextLine();
			
			System.out.print("가격 : ");
			int price = sc.nextInt();
			
			sc.nextLine();
			
			System.out.print("출판사 : ");
			String publisher = sc.nextLine();
			
			// 조건처리 필요없이 해당 인덱스 도서 객체 생성되도록
			list.add(new Book(title, author, price, publisher));
			
		}
		
		// 2. 전체 도서정보 출력하기
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).information());
		}
		
		// 3. 도서 제목 검색하기
		System.out.print("검색할 책 제목 : ");
		String search = sc.nextLine();
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getTitle().equals(search)) {
				System.out.println(list.get(i).information());
			}	
		}
		
		
	}
}

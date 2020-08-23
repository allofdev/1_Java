package com.kh.hw2.view;

import java.util.ArrayList;
import java.util.Scanner;
import com.kh.hw2.controller.BookManager;
import com.kh.hw2.model.vo.Book;

public class BookMenu {

	private Scanner sc = new Scanner(System.in);
	
	private BookManager bm = new BookManager();
	
	public BookMenu() {}
	
	/**
	 * 메인화면
	 */
	public void mainMenu() {

		while(true) {
			
			System.out.println("★_____________________★");
			System.out.println("1. 새 도서 추가");
			System.out.println("2. 도서 삭제");
			System.out.println("3. 도서 검색 출력");
			System.out.println("4. 전체 출력");
			System.out.println("0. 끝내기");
			System.out.println("★_____________________★");
			System.out.print("메뉴 번호 선택 : ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1: insertBook(); break;
			case 2: deleteBook(); break;
			case 3: searchBook(); break;
			case 4: selectList(); break;
			case 0: System.out.println("프로그램을 종료합니다."); return;
			default : System.out.println("잘못 입력하였습니다.\n다시입력해주세요."); break;
		
			}
		}
	}
	
	/**
	 * 1. 도서 추가 화면
	 */
	public void insertBook(){
		
		System.out.print("도서 제목 : ");
		String title = sc.nextLine();
		
		System.out.print("도서 장르 (1:인문 / 2:자연과학 / 3:의료 / 4:기타) :");
		int category = sc.nextInt();
		sc.nextLine();
		
		if(category > 4) {
			System.out.println("도서 장르를 잘못 입력하였습니다.");
			System.out.println("메인 화면으로 돌아갑니다.");
			return;
		}
		
		System.out.print("도서 저자 : ");
		String author = sc.nextLine();
		
		bm.insertBook(new Book(title, category, author));
		
		
		
		
	}
	
	
	
	
	
	/**
	 * 2. 도서 삭제 화면
	 */
	public void deleteBook() {
		
		System.out.print("도서 번호 : ");
		int bNo = sc.nextInt();
		sc.nextLine();
		
		int result = bm.deleteBook(bNo);
		
		if(result == 0) {
			System.out.println("삭제할 도서가 없습니다.");
		}else {
			System.out.println(bNo + "번 도서를 삭제하였습니다.");
		}
		
	}
	
	
	
	
	/**
	 * 3. 도서 검색 출력 화면
	 */
	public void searchBook() {
		
		System.out.print("도서 제목 : ");
		String tilte = sc.nextLine();
		
		ArrayList<Book> searchList = bm.searchBook(tilte);
		
		if(searchList.isEmpty()) {
			System.out.println("검색 결과가 존재하지 않습니다.");
		}else {
			for(Book b : searchList) {
				System.out.println(b);
			}
			
		}
		
		
		
	}
	
	
	
	
	
	/**
	 * 4. 도서 전체 조회
	 */
	public void selectList() {
		ArrayList<Book> bookList = bm.selectList();
		
		if(bookList.isEmpty()) { // 비어 있음 --> true
			System.out.println("도서가 없습니다.");
		}else {
			for(Book b : bookList) {
				System.out.println(b);
			}
		}
	}
}


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
	 * ����ȭ��
	 */
	public void mainMenu() {

		while(true) {
			
			System.out.println("��_____________________��");
			System.out.println("1. �� ���� �߰�");
			System.out.println("2. ���� ����");
			System.out.println("3. ���� �˻� ���");
			System.out.println("4. ��ü ���");
			System.out.println("0. ������");
			System.out.println("��_____________________��");
			System.out.print("�޴� ��ȣ ���� : ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1: insertBook(); break;
			case 2: deleteBook(); break;
			case 3: searchBook(); break;
			case 4: selectList(); break;
			case 0: System.out.println("���α׷��� �����մϴ�."); return;
			default : System.out.println("�߸� �Է��Ͽ����ϴ�.\n�ٽ��Է����ּ���."); break;
		
			}
		}
	}
	
	/**
	 * 1. ���� �߰� ȭ��
	 */
	public void insertBook(){
		
		System.out.print("���� ���� : ");
		String title = sc.nextLine();
		
		System.out.print("���� �帣 (1:�ι� / 2:�ڿ����� / 3:�Ƿ� / 4:��Ÿ) :");
		int category = sc.nextInt();
		sc.nextLine();
		
		if(category > 4) {
			System.out.println("���� �帣�� �߸� �Է��Ͽ����ϴ�.");
			System.out.println("���� ȭ������ ���ư��ϴ�.");
			return;
		}
		
		System.out.print("���� ���� : ");
		String author = sc.nextLine();
		
		bm.insertBook(new Book(title, category, author));
		
		
		
		
	}
	
	
	
	
	
	/**
	 * 2. ���� ���� ȭ��
	 */
	public void deleteBook() {
		
		System.out.print("���� ��ȣ : ");
		int bNo = sc.nextInt();
		sc.nextLine();
		
		int result = bm.deleteBook(bNo);
		
		if(result == 0) {
			System.out.println("������ ������ �����ϴ�.");
		}else {
			System.out.println(bNo + "�� ������ �����Ͽ����ϴ�.");
		}
		
	}
	
	
	
	
	/**
	 * 3. ���� �˻� ��� ȭ��
	 */
	public void searchBook() {
		
		System.out.print("���� ���� : ");
		String tilte = sc.nextLine();
		
		ArrayList<Book> searchList = bm.searchBook(tilte);
		
		if(searchList.isEmpty()) {
			System.out.println("�˻� ����� �������� �ʽ��ϴ�.");
		}else {
			for(Book b : searchList) {
				System.out.println(b);
			}
			
		}
		
		
		
	}
	
	
	
	
	
	/**
	 * 4. ���� ��ü ��ȸ
	 */
	public void selectList() {
		ArrayList<Book> bookList = bm.selectList();
		
		if(bookList.isEmpty()) { // ��� ���� --> true
			System.out.println("������ �����ϴ�.");
		}else {
			for(Book b : bookList) {
				System.out.println(b);
			}
		}
	}
}

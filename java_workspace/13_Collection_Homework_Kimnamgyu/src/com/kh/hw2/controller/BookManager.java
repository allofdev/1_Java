package com.kh.hw2.controller;

import com.kh.hw2.model.vo.Book;
import java.util.ArrayList;

public class BookManager {

	private ArrayList<Book> bookList = new ArrayList<>();

	
	/**
	 * @param b
	 * 1. 도서 추가
	 */
	public void insertBook(Book b) {
		int lastNo = 0;
		
		try{
			lastNo = bookList.get(bookList.size() - 1).getbNo() + 1;
		}catch(ArrayIndexOutOfBoundsException e){
			lastNo = 1;
		}
		
		b.setbNo(lastNo);
		bookList.add(b);
	}
	
	
	/**
	 * @param bNo
	 * 2. 도서 삭제
	 */
	public int deleteBook(int bNo) {
		
		int result = 0;
		
		for(int i=0; i<bookList.size(); i++) {
			if(bookList.get(i).getbNo() == bNo) {
				bookList.remove(i);
				i--;
				result++;
			}
		}
		return result;
	}
	
	
	public ArrayList<Book> searchBook(String title) {
		
		ArrayList<Book> searchList = new ArrayList<>();
		
		for(int i=0; i<bookList.size(); i++) {
			
			if(bookList.get(i).getTitle().contains(title)) {
				
				searchList.add(bookList.get(i));
			}
		}
		return searchList;
	}
	
	
	
	/**
	 * @return
	 * 4. 전체 조회
	 */
	public ArrayList<Book> selectList() {
		return bookList;
	}
	
	
}

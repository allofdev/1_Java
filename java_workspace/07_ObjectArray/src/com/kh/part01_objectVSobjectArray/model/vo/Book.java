package com.kh.part01_objectVSobjectArray.model.vo;

public class Book {
	
	private String title;		// 도서명
	private String author;		// 저자명
	private int price;			// 도서가격
	private String publisher;	// 출반사
	
	// 기본생성자
	public Book() {
		
	}
	
	// 매개변수생성자 (모든 필드 초기화할 수 있는)
	public Book(String title, String author, int price, String publisher) {
		
		this.title = title;
		this.author = author;
		this.price = price;
		this.publisher = publisher;
		
	}
	
	
	// setter메소드	// 필드값을 수정할 때 필요
	public void setTitle(String title) {
		this.title = title;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	
	// getter메소드
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public int getPrice() {
		return price;
	}
	public String getPublisher() {
		return publisher;
	}
	
	
	// information 메소드	(하나의 문자열로 합쳐서 반환하기위해 만듬)
	public String information() {
		return "제목 : " + title + ", 저자 : " + author + ", 가격 : " + price + ", 출판사 : " + publisher;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

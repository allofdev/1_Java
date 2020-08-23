package com.hw2.model.vo;

public class Book {

	// 필드
	private String title;
	private int price;
	private double discountRate;
	private String author;
	
	// 생성자
	// 기본 생성자
	public Book() {
		
	}
	
	
	public Book(String title, int price, double discountRate, String author) {
		
		this.title = title;
		this.price = price;
		this.discountRate = discountRate;
		this.author = author;
		
	}
	
	
	// 메소드
	// setter
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	// getter
	public String getTitle() {
		return title;
	}
	
	public int getPrice() {
		return price;
	}
	
	public double getdiscountRate() {
		return discountRate;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public String information() {
		return title + " " + price + " " + discountRate + " " + author;
	}
	
	public String titleResult() {
		return "도서명 = " + title;
	}
	
	public String discountRateResult() {
		return "할인된 가격 = " + (int)(price - price * discountRate) + "원";
	}
}
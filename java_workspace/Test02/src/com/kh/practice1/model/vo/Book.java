package com.kh.practice1.model.vo;

import java.io.Serializable;

public class Book implements Serializable{

	// �ʵ�
	private String title;
	private int price;
	
	// �⺻������
	public Book() {}
	
	// �Ű����� ������
	public Book(String title, int price) {
		super();
		this.title = title;
		this.price = price;
	}

	// setter/getter �޼ҵ�
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	// toString �޼ҵ�
	@Override
	public String toString() {
		return "Book [title=" + title + ", price=" + price + "]";
	}
	
}
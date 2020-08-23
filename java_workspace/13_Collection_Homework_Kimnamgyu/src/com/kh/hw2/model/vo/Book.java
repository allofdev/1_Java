package com.kh.hw2.model.vo;

public class Book {

	// �ʵ�
	private int bNo;
	private String title;
	private int category;
	private String author;
	
	// �⺻ ������
	public Book() {}
	
	// �Ű����� ������
	public Book(String title, int category, String author) {
		super();
		this.title = title;
		this.category = category;
		this.author = author;
	}

	// setter/getter �޼ҵ�
	public int getbNo() {
		return bNo;
	}

	public void setbNo(int bNo) {
		this.bNo = bNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getCategory() {
		return category;
	}

	public void setCategory(int category) {
		this.category = category;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	// toString �޼ҵ�
	@Override
	public String toString() {

		return "Book [bNo=" + bNo + ", title=" + title + ", category=" + 
		(category==1? "�ι�" : category==2? "�ڿ�����" : category==3? "�Ƿ�" : "��Ÿ") + ", author=" + author + "]";
	}
	
}
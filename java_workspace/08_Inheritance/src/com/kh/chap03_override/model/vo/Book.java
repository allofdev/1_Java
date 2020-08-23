package com.kh.chap03_override.model.vo;

public class Book /*extends Object*/ {

	// �ʵ�
	private String title;
	private String author;
	private int price;
	
	// �⺻������
	public Book() { }
	
	// �Ű����� ������
	public Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	// setter/getter �޼ҵ�
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getAutor() {
		return author;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	
	// information �޼ҵ�
	public String information() {
		return "title : " + title + ", author : " + author + ", price : " + price;
	}
	
	/*
	 * * �������̵� Override
	 * - �ڽ�Ŭ������  ��ӹް� �ִ� �θ� Ŭ������ �޼ҵ带 ������(���ۼ�)�ϴ� ��
	 * - �θ� �����ϴ� �޼ҵ带 �ڽ��� �Ϻ� ���ļ� ����ϰڴٴ� �ǹ�
	 *   �ڽ� ��ü�� ���� �ش� �޼ҵ� ȣ��� �ڽĸ޼ҵ尡 �켱���� ����!!
	 *   
	 * * �������̵� ���� ����
	 * - �θ�Ŭ������ �޼ҵ��� ��ġ�ؾߵ�
	 * - �Ű������� ��ġ�ؾߵ�
	 * - ��ȯ�� ��ġ�ؾߵ� (jdk�������Ǹ鼭 �θ�޼ҵ� ��ȯ���� �ڽ��ڷ�������� ��� ����)
	 * - �θ�޼ҵ��� ���������ں��� ������ ���ų� Ŀ�ߵ�
	 *   ex) �θ�޼ҵ��� ���������ڰ� protected�� ��� �������̵� �ϴ� �޼ҵ��� ���������ڴ� protected, public
	 *   --> �������̵� �����ϱ� ���� ��������� �Ծ��� ������ ������!
	 *   
	 * * @Override (�������̵� ������̼�)
	 * - ��ø� �����൵ ũ�� ����� ����!
	 * - ������ ������̼��� ���̴� ����
	 *   --> �θ� �޼ҵ���̳� �Ű������� �ٸ��� ������� ��� ���� �߻������� �˷���
	 *   --> ���� �� �޼ҵ尡 �������̵� �� �޼ҵ��� �� �˸��� ���ؼ�
	 */
	
	// Object Ŭ������ �ִ� toString �޼ҵ� �������̵�(������)
	@Override
	public String toString() {
		return "title : " + title + ", author : " + author + ", price : " + price;
	}
	
	
	
	// Object Ŭ������ �ִ� equals �޼ҵ� �������̵�(������)
	// �ּҰ� �񱳰� �ƴ� �����ʵ尪���� ��� ���� ��� true ����
	// �ϳ��� ��ġ���� ������ false�� ����
	
	@Override
	public boolean equals(Object obj) {
		
		//         bk1.equals(bk3)
		// this(����ü) vs obj(���޹��� ���� ��� ��ü)
		
		// �ڷ��� Book          Object
		Book other = (Book)obj;      // Object ���� Book���� ���� ����ȯ
		// this(����ü) vs other(���Ҵ��ü)
		
		// this.title.equals(other.title);
		// this.author.equals(other.authoer);
		// this.price == other.price
		
		if(title.equals(other.title) && author.equals(other.author) && price == other.price){
			return true;
		}else {
			return false;
		}
	}
	
	
	// Object Ŭ������ �ִ� hashCode �޼ҵ带 ������ (�������̵�)
	
	// �������?
	// �ּҰ��� ������ 10������ ���·� ����� ���� ������ ����� �ƴ�
	// �����ʵ尪�� ������ �ؽ��ڵ带 �����Բ�    
	@Override
	public int hashCode() {
		
		// bk1.hashCode()  --> "������ ����������10000"			----> ������ ���ڿ��� ������ �ؽ��ڵ带 ������ ��
		// bk3.hashCode()  --> "������ ����������10000"			----> ������ ���ڿ��� ������ �ؽ��ڵ带 ������ ��
		
		// �ش� ��ü�� �ʵ尪���� �ϳ��� ���ڿ��� ���ļ� �ش� ���ڿ��� �ؽ��ڵ带 ��������!!
		// title + author + price	--> ���ڿ�(String)
		
		return (title + author + price).hashCode();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}

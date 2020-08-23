package mvc.model.vo;

public class Book {

	// �ʵ�
	private String title;		// ������
	private String author;		// ���ڸ�
	private String publisher;	// ���ǻ��
	
	// �⺻������
	public Book() {}
	
	// �Ű����� ������
	public Book(String title, String author, String publisher) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
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
	public String getAuthor() {
		return author;
	}
	
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getPublisher() {
		return publisher;
	}
	
	// toString �޼ҵ�
	@Override
	public String toString() {
		return "������ : " + title + ", ���ڸ� : " + author + "���ǻ�� : " + publisher;
	}
	
}
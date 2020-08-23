package mvc.model.vo;

public class Book {

	// 필드
	private String title;		// 도서명
	private String author;		// 저자명
	private String publisher;	// 출판사명
	
	// 기본생성자
	public Book() {}
	
	// 매개변수 생성자
	public Book(String title, String author, String publisher) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
	}
	
	// setter/getter 메소드
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
	
	// toString 메소드
	@Override
	public String toString() {
		return "도서명 : " + title + ", 저자명 : " + author + "출판사명 : " + publisher;
	}
	
}
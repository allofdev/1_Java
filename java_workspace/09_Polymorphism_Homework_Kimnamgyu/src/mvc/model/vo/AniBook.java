package mvc.model.vo;

public class AniBook extends Book{

	// 필드
	private int accessAge;		// 체한 나이
	
	// 기본 생성자
	public AniBook() {}
	
	// 매개변수 생성자
	public AniBook(String title, String author, String publisher, int accessAge) {
		super(title, author, publisher);
		this.accessAge = accessAge;
	}
	
	// setter/getter 메소드
	public void setAccessAge(int accessAge) {
		this.accessAge = accessAge;
	}
	public int getAccessAge() {
		return accessAge;
	}
	
	// toString 메소드
	@Override
	public String toString() {
		return super.toString() + ", 제한 나이 : " + accessAge;
	}
	
}
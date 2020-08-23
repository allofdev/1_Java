package mvc.model.vo;

public class CookBook extends Book{

	// 필드
	private boolean coupon; // 요리학원쿠폰유무
	
	// 기본 생성자
	public CookBook() {}
	
	// 매개변수 생성자
	public CookBook(String title, String author, String publisher, boolean coupon) {
		super(title, author, publisher);
		this.coupon = coupon;
	}
	
	// setter/getter 메소드
	public void setCoupon(boolean coupon) {
		this.coupon = coupon;
	}
	public boolean isCoupon() {
		return coupon;
	}
	
	// toString 메소드
	@Override
	public String toString() {
		return super.toString() + "요리학원쿠폰유무 : " + (coupon ? "있습니다" : "없습니다");
	}
	
	
	
	
}

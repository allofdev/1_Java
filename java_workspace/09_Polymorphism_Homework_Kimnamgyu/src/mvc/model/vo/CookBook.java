package mvc.model.vo;

public class CookBook extends Book{

	// �ʵ�
	private boolean coupon; // �丮�п���������
	
	// �⺻ ������
	public CookBook() {}
	
	// �Ű����� ������
	public CookBook(String title, String author, String publisher, boolean coupon) {
		super(title, author, publisher);
		this.coupon = coupon;
	}
	
	// setter/getter �޼ҵ�
	public void setCoupon(boolean coupon) {
		this.coupon = coupon;
	}
	public boolean isCoupon() {
		return coupon;
	}
	
	// toString �޼ҵ�
	@Override
	public String toString() {
		return super.toString() + "�丮�п��������� : " + (coupon ? "�ֽ��ϴ�" : "�����ϴ�");
	}
	
	
	
	
}

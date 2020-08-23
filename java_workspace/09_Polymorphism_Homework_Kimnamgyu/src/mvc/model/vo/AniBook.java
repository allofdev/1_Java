package mvc.model.vo;

public class AniBook extends Book{

	// �ʵ�
	private int accessAge;		// ü�� ����
	
	// �⺻ ������
	public AniBook() {}
	
	// �Ű����� ������
	public AniBook(String title, String author, String publisher, int accessAge) {
		super(title, author, publisher);
		this.accessAge = accessAge;
	}
	
	// setter/getter �޼ҵ�
	public void setAccessAge(int accessAge) {
		this.accessAge = accessAge;
	}
	public int getAccessAge() {
		return accessAge;
	}
	
	// toString �޼ҵ�
	@Override
	public String toString() {
		return super.toString() + ", ���� ���� : " + accessAge;
	}
	
}
package mvc.model.vo;

public class Member {
	
	// �ʵ�
	private String name;		// ȸ����
	private int age;			// ȸ������
	private char gender;		// ����
	private int couponCount = 0;//	�丮�п��������� = 0
	
	// �⺻ ������
	public Member() {}
	
	// �Ű����� ������
	public Member(String name, int age, char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	// setter/getter �޼ҵ�
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	public char getGender() {
		return gender;
	}
	
	public void setCouponCount(int couponCount) {
		this.couponCount = couponCount;
	}
	public int getCouponCount() {
		return couponCount;
	}
	 
	// toString �޼ҵ�
	@Override
	public String toString() {
		return "ȸ���� : " + name + ", ȸ������ : " + age + ", ���� : " +gender + ", �丮�п� �������� : " + couponCount + "��";
	}
	
}
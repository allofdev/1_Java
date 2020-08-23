package mvc.model.vo;

public class Member {
	
	// �ʵ�
	private String userId;	// ���̵�
	private String userPwd;	// ��й�ȣ
	private String name;	// �̸�
	private int age;		// ����
	private char gender;	// ����
	private String email;	// �̸���
	
	// �⺻������
	public Member() {}
	
	// �Ű����� ������
	public Member(String userId, String userPwd, String name, 
			int age, char gender, String email) {
		this.userId = userId;
		this.userPwd = userPwd;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.email = email;
	}
	
	// setter �޼ҵ�
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public void setuserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	// getter �޼ҵ�
	public String getUserId() {
		return userId;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public char getGender() {
		return gender;
	}
	public String getEmail() {
		return email;
	}
	
	// information �޼ҵ�
	public String information() {
		return "���̵� : " + userId + ", ��й�ȣ : " + userPwd + ", �̸� : " + name +
				", ���� : " + age + ", ���� : " + gender + ", �̸��� : " + email;
	}
	
	
}

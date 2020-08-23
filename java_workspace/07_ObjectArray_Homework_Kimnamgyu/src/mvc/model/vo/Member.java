package mvc.model.vo;

public class Member {
	
	// 필드
	private String userId;	// 아이디
	private String userPwd;	// 비밀번호
	private String name;	// 이름
	private int age;		// 나이
	private char gender;	// 성별
	private String email;	// 이메일
	
	// 기본생성자
	public Member() {}
	
	// 매개변수 생성자
	public Member(String userId, String userPwd, String name, 
			int age, char gender, String email) {
		this.userId = userId;
		this.userPwd = userPwd;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.email = email;
	}
	
	// setter 메소드
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
	
	
	// getter 메소드
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
	
	// information 메소드
	public String information() {
		return "아이디 : " + userId + ", 비밀번호 : " + userPwd + ", 이름 : " + name +
				", 나이 : " + age + ", 성별 : " + gender + ", 이메일 : " + email;
	}
	
	
}

package mvc.model.vo;

public class Member {
	
	// 필드
	private String name;		// 회원명
	private int age;			// 회원나이
	private char gender;		// 성별
	private int couponCount = 0;//	요리학원쿠폰개수 = 0
	
	// 기본 생성자
	public Member() {}
	
	// 매개변수 생성자
	public Member(String name, int age, char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	// setter/getter 메소드
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
	 
	// toString 메소드
	@Override
	public String toString() {
		return "회원명 : " + name + ", 회원나이 : " + age + ", 성별 : " +gender + ", 요리학원 쿠폰개수 : " + couponCount + "개";
	}
	
}
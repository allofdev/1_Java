package com.kh.chap03_class.model.vo;

public class Person {

	// 필드부
	private String id;
	private String pwd;
	private String name;
	private int age;
	private char gender;
	private String phone;
	private String email;
	
	
	// 생성자부
	
	
	// 메소드부
	// 
	// 표현법.
	// 접근제한자[예약어] 반환형 메소드명(매개변수, 매개변수, ...) {
	// 실행내용
	// }
	
	// * setter 메소드 (값 변경)
	//   전달되는 값을 받아서 해당 필드에 초기화(대입)해줄 목적을 가진 메소드
	//   반환형 : void (setter메소드는 결과값 반환값이 없기 때문에 void사용!!)
	//   메소드명 : setXXX (필드명을 참고해서 메소드명 지어줌)
	//   매개변수명 : 필드명과 일치시켜줌
	
	public void setId(String id) {	// String id = "uesr01";
		this.id = id;
	}
	
	public void setPwd(String pwd) {
		this.pwd = pwd;
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
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	// * getter 메소드 : 각 필드에 담긴값을 반환해주는 역할
	//   메소드명 : getXXX
	//   반환형 : 반환을 해야하기 때문에 void 사용안함 -> 각 필드값의 자료형 입력
	//   매개변수 : 필요없음 (반환만 해주기 때문임)
	
	//   한번에 다같이 반환할 수 없음 각필드별로 반환 메소드를 따로따로 만들어야됨
	
	public String getId() {
		return id;
	}
	
	public String getPwd() {
		return pwd;
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
	
	public String getPhone() {
		return phone;
	}
	
	public String getEmail() {
		return email;
	}
	
	
	// 한번에 다같이 반환할 수 없기 때문에
	// 모든 필드에 담긴 값을 하나의 문자열로 합쳐서
	// 반환해주는 메소드
	public String information() {
		
		/*
		String str = "id : " + id + ", pwd : " + pwd + ", name : " + name
				+ ", age : " + age + ", gender : " + gender + ", phone : " + phone + ", email : " + email;
		
		return str;
		*/
		
		return "id : " + id + ", pwd : " + pwd + ", name : " + name
				+ ", age : " + age + ", gender : " + gender + ", phone : " + phone + ", email : " + email;
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}


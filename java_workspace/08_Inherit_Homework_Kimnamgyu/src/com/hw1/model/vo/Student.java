package com.hw1.model.vo;

public class Student extends Person{

	//필드
	private int grade;		//학년
	private String major;	//전공
	
	//기본 생성자
	public Student() {}
	
	//매개변수 생성자
	public Student(String name, int age, double height, double weight, int grade, String major) {
		super(age, height, weight);
		this.name = name;
		this.grade = grade;
		this.major = major;
	}
	
	//setter/getter 메소드
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getGrade() {
		return grade;
	}
	
	public void setMajor(String major) {
		this.major = major;
	}
	public String getMajor() {
		return major;
	}
	
	//information 메소드 오버라이딩
	@Override
	public String information() {
		return super.information() + ", 학년 : " + grade + ", 전공 : " + major;
	}
	
}
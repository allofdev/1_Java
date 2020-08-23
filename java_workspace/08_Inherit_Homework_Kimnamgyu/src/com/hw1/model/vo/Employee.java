package com.hw1.model.vo;

public class Employee extends Person{

	//필드
	private int salary;		//급여
	private String dept;	//부서
	
	//기본 생성자
	public Employee() {}
	
	//매개변수 생성자
	public Employee(String name, int age, double height, double weight, int salary, String dept) {
		super(age, height, weight);
		this.name = name;
		this.salary = salary;
		this.dept = dept;
	}
	
	//setter/getter 메소드
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getSalary() {
		return salary;
	}
	
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getDept() {
		return dept;
	}
	
	//information 메소드 오버라이딩
	@Override
	public String information() {
		return super.information() + ", 급여 : " + salary + ", 부서 ; " + dept;
	}
	
}
package com.hw1.model.vo;

public class Employee extends Person{

	//�ʵ�
	private int salary;		//�޿�
	private String dept;	//�μ�
	
	//�⺻ ������
	public Employee() {}
	
	//�Ű����� ������
	public Employee(String name, int age, double height, double weight, int salary, String dept) {
		super(age, height, weight);
		this.name = name;
		this.salary = salary;
		this.dept = dept;
	}
	
	//setter/getter �޼ҵ�
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
	
	//information �޼ҵ� �������̵�
	@Override
	public String information() {
		return super.information() + ", �޿� : " + salary + ", �μ� ; " + dept;
	}
	
}
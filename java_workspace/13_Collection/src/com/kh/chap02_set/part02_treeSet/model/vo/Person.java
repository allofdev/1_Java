package com.kh.chap02_set.part02_treeSet.model.vo;

public class Person implements Comparable<Person>{

	// �ʵ�
	private String name;
	private int age;
	private int score;
	
	// �⺻ ������
	public Person() {}
	
	// �Ű����� ������
	public Person(String name, int age, int score) {
		this.name = name;
		this.age = age;
		this.score = score;
	}

	// setter/getter �޼ҵ�
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", score=" + score + "]";
	}

	@Override
	public int compareTo(Person o) {
		// p1.compareTo(P2)
		
		// �̸��� �������� ���� ����
		
		// this(��)�� name���� o(��)�� name������ Ŭ ��� ����� ��ȯ
		
		
		
		return this.name.compareTo(o.name);
	}
	
	
	
	
	
}
package com.kh.chap02_set.part02_treeSet.model.vo;

public class Person implements Comparable<Person>{

	// 필드
	private String name;
	private int age;
	private int score;
	
	// 기본 생성자
	public Person() {}
	
	// 매개변수 생성자
	public Person(String name, int age, int score) {
		this.name = name;
		this.age = age;
		this.score = score;
	}

	// setter/getter 메소드
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
		
		// 이름별 오름차순 정렬 기준
		
		// this(앞)의 name값이 o(뒤)의 name값보다 클 경우 양수값 반환
		
		
		
		return this.name.compareTo(o.name);
	}
	
	
	
	
	
}

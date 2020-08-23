package com.kh.chap01_list.part02_mvc.model.vo;

public class Music implements Comparable<Music>{
					// ArrayList의  오름차순/내림차순을 위해 인터페이스를 임플리먼츠를 함
					// Comparable<Music>으로 제네릭 설정해줘야함
	// 필드
	private String title;
	private String artist;
	
	// 기본 생성자
	public Music() { }

	// 매개변수 생성자
	public Music(String title, String artist) {
		super();
		this.title = title;
		this.artist = artist;
	}

	// setter/getter메소드
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	// toString 메소드
	@Override
	public String toString() {
		return "Music [title=" + title + ", artist=" + artist + "]";
	}

	// 맨위에서 제네릭 설정안해주면 매개변수가(Object o)로 되어있음
	@Override
	public int compareTo(Music o) {
		// TODO Auto-generated method stub
		
		// 가수명 오름차순 정렬이 되게끔 해줘야됨!
		
		// 이 compareTo 메소드 실행시 반환값이 양수일 경우 두 객체의 순서ㅓ가 바뀌게 됨!!
		
		// m1.compareTo(m2)
		// this (앞)     o (뒤)
		
		// this(앞)의 가수명이 o(뒤)의 가수명봐 더 큰 값일 경우 순서를 변경해야됨!! => 즉, 양수값 반환
		/*
		if(this.artist > o.artist) {
			return 양수;
		}else {
			return 0 또는 -1;
		}
		*/
		
		// 문자열간의 대소비교 (>, < 등)는 불가능
		// -> 문자열간에 대소비교를 해주는 String 클래스에서 제공하는
		//    앞쪽문자열.compareTo(뒤쪽문자열)
		
		//    앞쪽문자열이 뒤쪽문자열보다 더 큰경우 1반환, 
		//    뒤쪽문자열이 더 클경우 -1반환,
		//    두개의 문자열이 일치할 경우 0반환
		
		return this.artist.compareTo(o.artist);
	}

	
}

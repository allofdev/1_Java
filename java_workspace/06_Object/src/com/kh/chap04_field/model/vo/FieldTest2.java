package com.kh.chap04_field.model.vo;

// 필드들의 접근제한자를 테스트 해보기 위한 클래스
public class FieldTest2 {
	
	/*
	 * * 필드부에 사용가능한 접근제한자 (4가지 다 쓸수 있음)
	 * 
	 * (+) public		=> 어디서든(같은 패키지, 다른 패키지) 접근가능
	 * (#) protected	=> 같은 패키지 접근 가능 + 다른 패키지일 경우 상속구조간에서는 접근가능
	 * (?) default		=> 같은 패키지 접근 가능 (default는 접근제한자를 생략하면됨)
	 * (-) private		=> only 해당 클래스 내에서만 접근가능
	 * 
	 * 위에서부터 아래로 내려갈 수록 접근 범위가 좁아짐
	 * 
	 */
	public String pub = "public";
	protected String pro = "protected";
	String def = "default";
	private String pri = "private";
	
	
	public static String sta = "FieldTest2";
}

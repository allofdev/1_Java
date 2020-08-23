package com.kh.chap05_constructor.model.vo;

public class User {
	
	
	
	
	
	// �ʵ��
	// ���̵�, ��й�ȣ, �̸�, ����, ����
	private String userId;
	private String userPwd;
	private String userName;
	private int age;
	private char gender;
	
	
	
	
	
	
	
	
	
	// �����ں�
	/*
	 * * ǥ����
	 * �⺻������(�ڵ������� (��������))
	 * public Ŭ������([�Ű�����, �谳����, �Ű�����, ...]) {						���ȣ�� ���������ϴٴ� ��
	 * 
	 * }
	 * 
	 * 
	 * * �����ڸ� �����ϴ� ����
	 * 1. ��ü�� �������ֱ� ���� ����
	 * 2. �Ű������� ���޹��� ������ �ʵ忡 �ٷ� �ʱ�ȭ�� ����
	 * 
	 * * ������ �ۼ��� ���ǻ���
	 * 1. �ݵ�� Ŭ������� �����ؾߵ�!
	 * 2. ��ȯ���� �������� ����!! (�޼ҵ�� �����ؼ� �ް��� �� ����)
	 * 3. �Ű������� ��������� �ۼ��ϰԵǸ� JVM�� �⺻������ �ڵ����� �ο� ����!
	 *    ��, �⺻�����ڴ� �׻� �ۼ��ϴ� ������ ������!!
	 */
	public User() {				//	�⺻������ (�Ű����� ���� ������)
								//  ���� ��ü �������� ����
								//  �⺻ �����ڸ� �ۼ� ���س����� ����X?
								//  => ���� �ȴ�!! => �����ڰ� ���� �ۼ����س����� JVM�� �ڵ����� �ۼ�
								//  RunŬ�������� user u1 = new User() �� �� �����
	}
	
	// �Ű����� ������	
	// ��ü ������ ���ÿ� ���޵� ���� �Ű������� �޾Ƽ� �ش� �ʵ忡 �ʱ�ȭ�� ����
	public User(String userId, String userPwd, String userName) {
		// String userId = "user02";	String userPwd = "pass02";	String userName = "�踻��";
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
		// �ʱ�ȭ�� �ȵ� �ʵ�κ�(age, gender)�� JVM�� �ʱⰪ���� ���������!!
	}
	
	// ��� �ʵ尪 �ʱ�ȭ�����ִ� �Ű����� ������
	public User(String userId, String userPwd, String userName, int age, char gender) {
		/*
		this.userId = userId;
		this.userPwd = userPwd;			        <-----|
		this.userName = userName;					  |
		*/										//    |
		this(userId, userPwd, userName);		//	  |  �׳� ����ó�� �ص���
		// this() ������ : ���� Ŭ���� ������ �ٸ� ������ ȣ�� ����	__|
		// 				 �ݵ�� ù�ٿ� �ۼ��ؾߵ� !
		
		this.age = age;
		this.gender = gender;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// �޼ҵ��
	// setter �޵��� : ���ް��� �� �ʵ忡 ���Խ�ų ����(�� ����)
	public void setUserId(String userId) {
		this.userId = userId;			//setter�� this�� ����� �ʵ��� userId�� ����Ŵ ---> �Ⱦ��� ���� �޼ҵ��� userId�� ����Ŵ
	}
	
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public void setAge(int age) {
		this.age =age;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	
	// getter �޼ҵ� : �� �ʵ忡 ��� ���� ��ȯ�����ִ�(����)
	public String getUserId() {
		return userId;					//getter�� this�� �ᵵ�ǰ� �Ƚᵵ ��
	}
	
	public String getUserPwd() {
		return userPwd;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public int getAge() {
		return age;
	}
	
	public char getGender() {
		return gender;
	}
	
	// information �޼ҵ� : ��� �ʵ尪���� �ϳ��� ���ڿ��� ���ļ� ��ȯ�����ִ� ����
	public String information() {
		return "���̵� : " + userId + ", ��й�ȣ : " + userPwd + ", �̸� : "
				+ userName + ", ���� : " + age + ", ���� : " + gender;
	}	
}
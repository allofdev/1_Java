package com.kh.chap02_abstractAndinterface.part01_abstract.model.vo;

public abstract class Sports {
	
	// �ʵ�
	private int people; // �ش� �������� �����ϴ� ���
	
	// �⺻ ������
	public Sports() {}
	
	// �Ű����� ������
	public Sports(int people) {
		this.people = people;
	}
	
	// setter/getter �޼ҵ�
	public void setPeople(int people) {
		this.people = people;
	}
	
	public int getPeople() {
		return people;
	}
	
	// toString �޼ҵ�
	public String toString() {
		return "�����ϴ� ���" + people + "��";
	}
	
	// �߻�޼ҵ� (�̿ϼ��� �޼ҵ�) ---> �߰�ȣ�� ���� ������ �ϼ��� �޼ҵ�
	public abstract void rule();
	
	/*
	 * ��ü���� ��� �߻��̶� �ٸ�
	 * 
	 * �߻�޼ҵ� (�̿ϼ��� �޼ҵ�� ���� ������ �Ǿ����� ���� �޼ҵ�)
	 * --> �����( {} )�� �����Ǿ����� ����
	 * --> �̿ϼ��� �߻�޼ҵ尡 ���� ��Ŭ������ �ִٶ� �Ҹ� == �� Ŭ���� ���� �̿ϼ��� Ŭ���� == �߻�Ŭ������ �ۼ��ؾߵ�!!!
	 * 
	 * abstract -> �߻��� ���ϴ� �����
	 */
}
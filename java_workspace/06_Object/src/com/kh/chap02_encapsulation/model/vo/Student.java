package com.kh.chap02_encapsulation.model.vo;

public class Student {

	// --�ʵ��--
	/*
	 * �ʵ� == ������� == �ν��Ͻ�����
	 * 
	 * <ǥ����>
	 * ����������[�����] �ڷ��� ������;
	 * 
	 * �ʵ�ο� ���������ڴ� private���� �ؼ� ���������� ������ �Ұ��ϰԲ� "��������"
	 * ��ü���⼳���Ģ �� �ϳ�
	 */
	
	private String name;
	private int age;
	private double height;
	//private�� ���� Ŭ���� �������� ��밡��(�ٸ�Ŭ����(�ܺ�)������ ���ٺҰ�)
	
	
	
	
	
	// --�����ں�--
	
	
	
	
	
	// --�޼ҵ��--
	/*
	 * <ǥ����>
	 * ���������� ��ȯ�� �޼ҵ��([�Ű�����]){		-- �Ű������� ���� �����ϱ� ������ ���ݱ��� �����ϸ鼭 ��������
	 * 		// ��ɱ���
	 * }
	 * 
	 * �Ű����� : �ش� �޼ҵ� ȣ�� �� ���޵Ǵ� ���� �޾��ֱ� ���� ����
	 */
	
	// ���������γ��� �����ؼ� ȣ���� �� �ִ� �޼ҵ常���!!
	// * ������ϴ� �����͸�  ���޹޾Ƽ� �ش� �ʵ忡 �ʱ�ȭ �����ִ� ����� �޼ҵ�
	// == setter �޼ҵ�
	// �ַ� setter�޼ҵ���� ������ �� setXXX
	/*
	public void setName(String name) {	// String newName = "ȫ�浿";
		
		name = newName;
		
	}
	*/
	
	
	// setter �޼ҵ� ���� setXXX���� ��Ÿ ǥ����� ��Ųä�� �����ִ� ����(ex. setName, setAge, setHeight)
	// �Ű������� ���� �ʵ��� ��ġ�����ִ°� ����
	public void setName(String name) {	// String name = "ȫ�浿";		
		// name = name;
		// �Ű����� name = �Ű����� name; // Ʋ��ǥ��
		
		this.name = name; // this.name -> �ʵ忡 �ִ� name�� ����Ű������
						  // ������ ���� Ȯ�ΰ��� this.name�� �Ķ�->�ʵ�	/	name�� ����->�Ű�����
	}
	
	// ���޹��� ���̰��� age �ʵ忡 ���Խ����ִ� ����� setter�޼ҵ�
	public void setAge(int age) {
		this.age = age;
	}
	
	// ���޹��� Ű���� height �ʵ忡 ���Խ����ִ� ����� setter�޼ҵ�
	public void setHeight(double height) {
		this.height = height;
	}	
	
	
	// * �� �ʵ忡 ��䰪�� ��ȯ���ִ� ����� �ϴ� �޼ҵ� (getter�޼ҵ�)
	//   ��� getXXX() �޼ҵ������ ������
	//   getter�޼ҵ�� ���� �ʵ忡 ����ִ� ���� ��ȯ�� �����ٲ��� ������
	//   ������ ���޵Ǵ� �� ����(�Ű����� �����س��� �ʿ� ����)
	
	// name �ʵ忡 ��� ���� ��ȯ���� ������ ���� getter�޼ҵ�
	// void : ��ȯ���� ����.
	public String getName() {	// name�� �����;��ϱ⶧���� void��� String�� �Է��� String��ȯ
		return name;
	}
	
	// age �ʵ忡 ��� ���� ��ȯ���� ������ ���� getter�޼ҵ�
	public int getAge() {
		return age;
	}
	
	// height �ʵ忡 ��� ���� ��ȯ���� ������ ���� height�޼ҵ�
	public double getHeight() {
		return height;
	}
}
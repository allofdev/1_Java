package com.kh.chap04_field.model.vo;
import com.kh.chap04_field.model.vo.*;

public class Run {

	public static void main(String[] args) {

		// ������Ű���� ���������� Ȯ������ run��Ű���� �ִ� Run���� �����ؿ�
		// run ��Ű�������� protected, default ���� �ȵǾ����� ���� ��Ű�������� ���� ��
		
		
		
		
		System.out.println("\n------------ 2. FieldTest2------------------");
		System.out.println("���� ��Ű�� ���� �ִ� RunŬ����");
		
		
		FieldTest2 f2 = new FieldTest2();
		
		// �� �ʵ忡 ���� ���� �غ�����
		
		// public		--> ��𼭵� ���� ����
		System.out.println(f2.pub);
		
		// protected	--> ���� ��Ű�� �� + �ٸ� ��Ű���� ��� ��ӱ���
		System.out.println(f2.pro);
		
		// default		--> ���� ��Ű�� ��
		System.out.println(f2.def);
		
		// private		--> ���� Ŭ����
		// System.out.println(f2.pri);
		
		/*
		 * 		Stack			   Heap	
		 *  __________________________________________________________
		 * | FieldTest2	|					                          |
		 * | ________	| 	 _______________________________________  |
		 * ||        |	|	|       |		  |          |          | |
		 * || 0X123  |--|-->| public|protected| default  | private  | |
		 * ||________|  |   |_______|_________|__________|__________| |		
		 * | f2 		|      pub		pro		  def		  pri     |	
		 * |			|    0X123			  			              |
		 * |____________|_____________________________________________|
		 */	
	}
}
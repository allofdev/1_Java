package com.kh.chap03_class.run;

import com.kh.chap03_class.model.vo.Product;

public class Run2 {

	public static void main(String[] args) {
		// ProductŬ���� ===================================================================
		
		// ��ü ����
		// ù��° ��ǰ
		Product p1 = new Product();
		
		p1.setpName("������");
		p1.setPrice(1300000);
		p1.setBrand("������");
		
		System.out.println("��ǰ�� : " + p1.getpName() + ", ���� : " + p1.getPrice() + "��, �귣�� : " + p1.getBrand());
		System.out.println(p1);	// p1���� Heap�� �ּҰ��� ���� ����
		System.out.println(p1.information());
		
		
		// �ι��� ��ǰ
		Product p2 = new Product();
		
		p2.setpName("������");
		p2.setPrice(1500000);
		p2.setBrand("���");
		
		System.out.println(p2.information());
		
		/*
		 * 		Stack			           Heap			
		 *  __________________________________________________________
		 * | product	|					                          |
		 * | ________	| 	 ________________________________________ |
		 * || 0X123  |	|	| (�⺻��) null |		0	  |    null      ||
		 * ||        |--|-->| -> ������          | -> 1300000| -> ������		 ||	
		 * ||________|  |   |_____________|___________|______________||		
		 * | p1 		|    String pName   int price   String brand  |	
		 * |			|    0X123			  			              |
		 * |  	    	|					  			              |
		 * |  	    	|					  			              |
		 * | product	|					                          |
		 * | ________	| 	 ________________________________________ |
		 * || 0X456  |	|	| (�⺻��) null |		0	  |    null      ||
		 * ||        |--|-->| -> ������          | -> 1500000| -> ���		 ||	
		 * ||________|  |   |_____________|___________|______________||		
		 * | p2 		|    String pName   int price   String brand  |	
		 * |			|    0X456			  			              |
		 * |			|					  			              |
		 * |  	    	|					  			              |
		 * |____________|_____________________________________________|
		 */
		
		
		
		// ����° ��ǰ (������ �Ű������� ���� )
		Product p3 = new Product("����", 1000000,"����");
		System.out.println(p3.information());
		
		
		
		
		
		
	}
}
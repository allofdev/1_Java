package com.kh.chap04_field.run;
import com.kh.chap04_field.model.vo.*;

public class Run {

	public static void main(String[] args) {
		
		System.out.println("------------ 1. FieldTest1------------------");
		FieldTest1 f1 = new FieldTest1();	// ��ü ����
		f1.test(5);	// �޼ҵ� ����
		/*
		 * 		Stack			   Heap			
		 *  ______________________________________
		 * | FieldTest1	|					     |
		 * | ________	| 	 _____________       |
		 * || 0X123  |	|	|             |	     |
		 * ||        |--|-->|    100      |      |	
		 * ||________|  |   |_____________|      |		
		 * | f1 		|    int global          |	
		 * |			|    0X123			     |
		 * |  int       |                        |
		 * | ________	|      				     |	
		 * ||        |	|	   				     |
		 * ||   5    |  |     					 |	
		 * ||________|  |      				     |		
		 * | num 		|                        |	
		 * |			|       			     |
    	 * |  int       |                        |
		 * | ________	|      				     |	
		 * ||        |	|	   				     |
		 * ||   10   |  |     					 |	
		 * ||________|  |      				     |		
		 * | local 		|                        |	
		 * |			|       			     |
		 * |____________|________________________|
		 */
		

		System.out.println("\n------------ 2. FieldTest2------------------");
		FieldTest2 f2 = new FieldTest2();
		
		// �� �ʵ忡 ���� ���� �غ�����
		
		// public		--> ��𼭵� ���� ����
		System.out.println(f2.pub);
		
		// protected	--> ���� ��Ű�� �� + �ٸ� ��Ű���� ��� ��ӱ���
		// System.out.println(f2.pro);
		
		// default		--> ���� ��Ű�� ��
		// System.out.println(f2.def);
		
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
		
		
		System.out.println("\n------------ 3. FieldTest3------------------");
		// Ŭ�������� �ٿ������
		System.out.println(FieldTest3.sta);
		System.out.println(FieldTest2.sta);
		
		/*
		 * 		Stack			   Heap	
		 *  __________________________________________________________
		 * |			|					 |            FieldTest3  |
		 * | 			| 					 |			  __________  |
		 * |			|					 |			 |          | |
		 * |			|					 |			 | static   | |
		 * |		  	| 					 |			 |__________| |		
		 * | 			|                    |                sta     |	
		 * |			|       			 | 			              |
		 * |			|					 |            FieldTest2  |
		 * | 			| 					 |			  __________  |
		 * |			|					 |			 |          | |
		 * |			|					 |			 |FieldTest2| |
		 * |		  	| 					 |			 |__________| |		
		 * | 			|                    |                sta     |	
		 * |			|       			 | 			              |
		 * |____________|____________________|________________________|
		 */
		
		System.out.println(Math.random());	// Math�� Ctrl �� ���� Math�� �޼ҵ��(random, max, min ���)�� 
											// static�� �پ� ���� ��, Math.random()���� �׳� �ҷ��ü� �ִ������� static�� �ֱ� ����
		
		FieldTest3.sta = "FieldTest3";		// ���氡��
		System.out.println(FieldTest3.sta);
		
		System.out.println(FieldTest3.NUM);
		// FieldTest3.NUM = 2; 				// ����� final�� ����ϱ� ������ ���� �Ұ�
		
		System.out.println(Math.PI);
		// Math.PI = 3.11; 			  // PI ���� Math��� Ŭ������ (���)final�� �Ǿ��ֱ� ������ ���� �Ұ�
		
		
		
		/*
		 * public class Ŭ������{
		 * 	�ʵ��
		 * 
		 * 	�����ں�
		 * 
		 *  �޼ҵ��
		 * }
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */


	}

}

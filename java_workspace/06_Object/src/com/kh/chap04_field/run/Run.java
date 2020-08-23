package com.kh.chap04_field.run;
import com.kh.chap04_field.model.vo.*;

public class Run {

	public static void main(String[] args) {
		
		System.out.println("------------ 1. FieldTest1------------------");
		FieldTest1 f1 = new FieldTest1();	// 객체 생성
		f1.test(5);	// 메소드 실행
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
		
		// 각 필드에 직접 접근 해볼꺼임
		
		// public		--> 어디서든 접근 가능
		System.out.println(f2.pub);
		
		// protected	--> 같은 패키지 내 + 다른 패키지일 경우 상속구조
		// System.out.println(f2.pro);
		
		// default		--> 같은 패키지 내
		// System.out.println(f2.def);
		
		// private		--> 같은 클래스
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
		// 클래스명을 붙여줘야함
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
		
		System.out.println(Math.random());	// Math에 Ctrl 후 보면 Math의 메소드들(random, max, min 등등)은 
											// static이 붙어 있음 즉, Math.random()으로 그냥 불러올수 있는이유는 static이 있기 때문
		
		FieldTest3.sta = "FieldTest3";		// 변경가능
		System.out.println(FieldTest3.sta);
		
		System.out.println(FieldTest3.NUM);
		// FieldTest3.NUM = 2; 				// 상수는 final을 사용하기 때문에 변경 불가
		
		System.out.println(Math.PI);
		// Math.PI = 3.11; 			  // PI 또한 Math라는 클래스에 (상수)final로 되어있기 때문에 변경 불가
		
		
		
		/*
		 * public class 클래스명{
		 * 	필드부
		 * 
		 * 	생성자부
		 * 
		 *  메소드부
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

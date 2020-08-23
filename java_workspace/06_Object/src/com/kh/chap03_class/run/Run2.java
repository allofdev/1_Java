package com.kh.chap03_class.run;

import com.kh.chap03_class.model.vo.Product;

public class Run2 {

	public static void main(String[] args) {
		// Product클래스 ===================================================================
		
		// 객체 생성
		// 첫번째 재품
		Product p1 = new Product();
		
		p1.setpName("갤럭시");
		p1.setPrice(1300000);
		p1.setBrand("별세개");
		
		System.out.println("제품명 : " + p1.getpName() + ", 가격 : " + p1.getPrice() + "원, 브랜드 : " + p1.getBrand());
		System.out.println(p1);	// p1에는 Heap의 주소값이 적혀 있음
		System.out.println(p1.information());
		
		
		// 두번쨰 재품
		Product p2 = new Product();
		
		p2.setpName("아이폰");
		p2.setPrice(1500000);
		p2.setBrand("사과");
		
		System.out.println(p2.information());
		
		/*
		 * 		Stack			           Heap			
		 *  __________________________________________________________
		 * | product	|					                          |
		 * | ________	| 	 ________________________________________ |
		 * || 0X123  |	|	| (기본값) null |		0	  |    null      ||
		 * ||        |--|-->| -> 갤럭시          | -> 1300000| -> 별세개		 ||	
		 * ||________|  |   |_____________|___________|______________||		
		 * | p1 		|    String pName   int price   String brand  |	
		 * |			|    0X123			  			              |
		 * |  	    	|					  			              |
		 * |  	    	|					  			              |
		 * | product	|					                          |
		 * | ________	| 	 ________________________________________ |
		 * || 0X456  |	|	| (기본값) null |		0	  |    null      ||
		 * ||        |--|-->| -> 아이폰          | -> 1500000| -> 사과		 ||	
		 * ||________|  |   |_____________|___________|______________||		
		 * | p2 		|    String pName   int price   String brand  |	
		 * |			|    0X456			  			              |
		 * |			|					  			              |
		 * |  	    	|					  			              |
		 * |____________|_____________________________________________|
		 */
		
		
		
		// 세번째 제품 (생성자 매개변수를 통해 )
		Product p3 = new Product("벨벳", 1000000,"헬지");
		System.out.println(p3.information());
		
		
		
		
		
		
	}
}
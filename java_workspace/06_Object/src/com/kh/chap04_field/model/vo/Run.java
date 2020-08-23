package com.kh.chap04_field.model.vo;
import com.kh.chap04_field.model.vo.*;

public class Run {

	public static void main(String[] args) {

		// 같은패키지의 접근제한자 확인위해 run패키지에 있는 Run파일 복사해옴
		// run 패키지에서는 protected, default 실행 안되었지만 같은 패키지에서는 실행 됨
		
		
		
		
		System.out.println("\n------------ 2. FieldTest2------------------");
		System.out.println("같은 패키지 내에 있는 Run클래스");
		
		
		FieldTest2 f2 = new FieldTest2();
		
		// 각 필드에 직접 접근 해볼꺼임
		
		// public		--> 어디서든 접근 가능
		System.out.println(f2.pub);
		
		// protected	--> 같은 패키지 내 + 다른 패키지일 경우 상속구조
		System.out.println(f2.pro);
		
		// default		--> 같은 패키지 내
		System.out.println(f2.def);
		
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
	}
}
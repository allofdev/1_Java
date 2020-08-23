package com.kh.chap01_beforeVSafter.after.model.vo;


//      ***** 자식클래스  extends 부모클래스 *****
public class Desktop extends Product{	// Product클래스를 부모클래스로
	
	// 필드
	private boolean allInOne;
	
	// 기본생성자
	public Desktop() { }
	
	public Desktop(String brand, String pCode, String pName, int price, boolean allInOne) {
		
		// super. 을 통해 부모클래스에 접근가능함!!
		// 단, 접근하고자 하는 필드가 private일 경우 직접접근 불가!!
		
		// 해결방법1. 부모필드를 자식까지만 직접접근 가능하게끔 protected로 접근제한자를 바꾸기
		/*
		 * super.brand = brand; 
		 * super.pCode = pCode; 
		 * super.pName = pName; 
		 * super.price = price;
		 */
		
		// 해결방법2. 간접적으로 접근가능한 setter메소드를 활용하기
		/*
		 * super.setBrand(brand); 
		 * super.setpCode(pCode); 
		 * super.setpName(pName);
		 * super.setPrice(price);
		 */
		
		// 해결방법3. 부모의 매개변수 생성자 호출하기
		super(brand, pCode, pName, price);	// super생성자는 반드시 첫줄에 기술
		this.allInOne = allInOne;
	}
	
	// setter/getter 메소드
	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}
	
	public boolean isAllInOne() {
		return allInOne;
	}
	
	// 재정의 == 오버라이딩
	// 부모클래스에도 있고 자식클래스에도 동일한 메소드가 있을 시 자식클래스메소드가 우선권을 가짐!!!!!
	public String information(){
		
		/*
		return "브랜드명 : " + super.getBrand() + ", 상품번호 : " + super.getpCode() + ", 상품명 : "
		+ super.getpName() + ", 가격 : " + super.getPrice() + "원, 일체여부 : " + allInOne; 
		*/
		//		||		아래처럼 간결하게 정리 가능
		//		\/
		return super.information() + ", 일체여부 : " + allInOne;
		
		
		
	}
	
}

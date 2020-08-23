package com.kh.chap01_poly.part02_electronic.model.vo;

public class Desktop extends Electronic{

	// 필드
	public static final String CPU = "intel";
	private String graphic;
	
	// 기본 생성자
	public Desktop() { }
	
	// 매개변수 생성자
	public Desktop(String brand,String name,int price,String graphic) {
		super(brand, name, price);
		this.graphic = graphic;
	}
	
	// setter/getter 메소드
	public void setGraphic(String graphic) {
		this.graphic = graphic;
	}
	public String getGraphic() {
		return graphic;
	}
	
	// toString 메소드
	@Override
	public String toString() {
		return super.toString() + ", CPU : " + CPU + ", 그래픽 : " + graphic;
	}
	
	
	
	
}

package com.kh.chap01_poly.part02_electronic.model.vo;

public class NoteBook extends Electronic{

	// 필드
	private int usbPort;
	
	// 기본 생성자
	public NoteBook() {}
	
	// 매개변수 생성자
	public NoteBook(String brand, String name, int price, int usbPort) {
		super(brand, name, price);
		this.usbPort = usbPort;
	}
	
	// setter/getter 메소드
	public void setUsbPort(int usbPort) {
		this.usbPort = usbPort;
	}
	public int getUsbPort() {
		return usbPort;
	}
	
	// toString 메소드
	@Override
	public String toString() {
		return super.toString() + ", usbPort수 : " + usbPort + "개";
	}
	
}

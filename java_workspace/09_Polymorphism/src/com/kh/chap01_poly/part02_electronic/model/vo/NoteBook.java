package com.kh.chap01_poly.part02_electronic.model.vo;

public class NoteBook extends Electronic{

	// �ʵ�
	private int usbPort;
	
	// �⺻ ������
	public NoteBook() {}
	
	// �Ű����� ������
	public NoteBook(String brand, String name, int price, int usbPort) {
		super(brand, name, price);
		this.usbPort = usbPort;
	}
	
	// setter/getter �޼ҵ�
	public void setUsbPort(int usbPort) {
		this.usbPort = usbPort;
	}
	public int getUsbPort() {
		return usbPort;
	}
	
	// toString �޼ҵ�
	@Override
	public String toString() {
		return super.toString() + ", usbPort�� : " + usbPort + "��";
	}
	
}
package com.kh.chap01_beforeVSafter.after.model.vo;

//        ***** �ڽ�Ŭ����  extends �θ�Ŭ���� *****
public class SmartPhone extends Product{

	// �ʵ�
	private String mobileAgency;
	
	// �⺻ ������
	public SmartPhone() { }
	
	// �Ű����� ������
	public SmartPhone(String brand, String pCode, String pName, int price, String mobileAgency) {
		super(brand, pCode, pName, price);
		this.mobileAgency = mobileAgency;
	}
	
	
	public void setMobileAgency(String mobileAgency) {
		this.mobileAgency = mobileAgency;
	}
	
	public String getMobileAgency() {
		return mobileAgency;
	}
	
	public String information() {
		return super.information() + ", ��Ż� : " + mobileAgency;
	}
	
}

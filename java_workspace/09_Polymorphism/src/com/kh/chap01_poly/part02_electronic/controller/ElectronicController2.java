package com.kh.chap01_poly.part02_electronic.controller;
import com.kh.chap01_poly.part02_electronic.model.vo.Desktop;
import com.kh.chap01_poly.part02_electronic.model.vo.Electronic;




// 2. 다형성 적용한 클래스
public class ElectronicController2 {
	
	private Electronic[] elec = new Electronic[3];
	private int count = 0;
	
	
	public void insert(Electronic any) {
		elec[count++] = any;
	}
	
	// 하나하나 반환해줌
	/*
	public Electronic select(int index) {
		return elec[index];
	}
	*/
	
	
	// 배열 자체를 반환해줌
	public Electronic[] select() { 
		return elec;
	}
	
	
	
}

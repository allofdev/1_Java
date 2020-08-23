package com.kh.chap01_poly.part02_electronic.controller;

import com.kh.chap01_poly.part02_electronic.model.vo.Desktop;
import com.kh.chap01_poly.part02_electronic.model.vo.NoteBook;
import com.kh.chap01_poly.part02_electronic.model.vo.Tablet;



// 1. 다형성 적용안한 클래스
public class ElectronicController1 {

	// 용산 전자상가 가게
	
	private Desktop desk;
	private NoteBook note;
	private Tablet tab;
	
	public void insert(Desktop d) {
		desk = d;
	}
	
	public void insert(NoteBook n) { // 오버로딩 -> 메소드명은 같지만 매개변수가 다르기 때문에 가능
		note = n;
	}
	
	public void insert(Tablet t) { // 오버로딩 -> 메소드명은 같지만 매개변수가 다르기 때문에 가능
		tab = t;
	}
	
	public Desktop selectDesktop() {
		return desk;
	}
	
	public NoteBook selectNoteBook() {
		return note;
	}
	
	public Tablet selectTablet() {
		return tab;
	}
}

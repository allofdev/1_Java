package com.kh.chap01_poly.part02_electronic.controller;

import com.kh.chap01_poly.part02_electronic.model.vo.Desktop;
import com.kh.chap01_poly.part02_electronic.model.vo.NoteBook;
import com.kh.chap01_poly.part02_electronic.model.vo.Tablet;



// 1. ������ ������� Ŭ����
public class ElectronicController1 {

	// ��� ���ڻ� ����
	
	private Desktop desk;
	private NoteBook note;
	private Tablet tab;
	
	public void insert(Desktop d) {
		desk = d;
	}
	
	public void insert(NoteBook n) { // �����ε� -> �޼ҵ���� ������ �Ű������� �ٸ��� ������ ����
		note = n;
	}
	
	public void insert(Tablet t) { // �����ε� -> �޼ҵ���� ������ �Ű������� �ٸ��� ������ ����
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

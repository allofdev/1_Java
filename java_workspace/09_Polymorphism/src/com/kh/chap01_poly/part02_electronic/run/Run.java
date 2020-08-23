package com.kh.chap01_poly.part02_electronic.run;

import com.kh.chap01_poly.part02_electronic.controller.ElectronicController1;
import com.kh.chap01_poly.part02_electronic.controller.ElectronicController2;
import com.kh.chap01_poly.part02_electronic.model.vo.Desktop;
import com.kh.chap01_poly.part02_electronic.model.vo.Electronic;
import com.kh.chap01_poly.part02_electronic.model.vo.NoteBook;
import com.kh.chap01_poly.part02_electronic.model.vo.Tablet;

public class Run {

	public static void main(String[] args) {

		
		// 납품업체
		
		/*
		// 1. 다형성 적용안했을 때 (ElectronicController1)
		ElectronicController1 ec1 = new ElectronicController1();
		
		// 새로우 Desktop객체, NoteBook객체, Tablet객체를
		// 전달할거임
		ec1.insert(new Desktop("삼성", "데탑", 1200000, "Geforce1070"));
		ec1.insert(new NoteBook("엘지", "그램", 1800000, 3));
		ec1.insert(new Tablet("에플", "아이패드pro", 2000000, true));
		
		
		// 가게에 있는 물건들의 정보를 조회
		Desktop d = ec1.selectDesktop();
		NoteBook n = ec1.selectNoteBook();
		Tablet t = ec1.selectTablet();
		
		System.out.println(d);
		System.out.println(n);
		System.out.println(t);
		*/
		
		
		// 2. 다형성 적용했을 때 (ElectronicController2)
		
		ElectronicController2 ec2 = new ElectronicController2();
		
		// Desktop, NoteBook, Tablet 객체 전달
		ec2.insert(new Desktop("삼성", "데탑", 1200000, "Geforce1070"));
		ec2.insert(new NoteBook("엘지", "그램", 1800000, 3));
		ec2.insert(new Tablet("에플", "아이패드pro", 2000000, true));
		
		// 하나하나 반환받음
		/*
		Electronic d = ec2.select(0); // Desktop 객체 알아내기
		Electronic n = ec2.select(1); // NoteBook 객체 알아내기
		Electronic t = ec2.select(2); // Tablet 객체 알아내기
		
		
		System.out.println(d);
		System.out.println(n);
		System.out.println(t);
		*/
		
		// 배열자체를 반환받음
		Electronic[] elec = ec2.select();
		
		for(Electronic e : elec) {
			System.out.println(e);
		}
		
		
		/*
		 * * 다형성 적용 이유
		 * 1. 부모타입만으로 다양한 자식객체들을 수용 가능 (객체배열)
		 * 2. 매개변수 다형성을 적용하는 경우 메소드 갯수 확 줄어듬
		 */
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

package com.kh.chap01_beforeVSafter.before.run;
import com.kh.chap01_beforeVSafter.before.model.vo.*;

// 상속 사용하지 않으면 겹치는 게 너무많음


public class Run {

	public static void main(String[] args) {
		
		// Desktop 객체 생성
		// brand, pCode, pName, price, allInOne
		Desktop d = new Desktop("삼성", "d-01", "짱짱데스크탑", 1500000, true);
		
		// Tv 객체 생성
		// brand, pCode, pName, price, inch
		Tv t = new Tv("LG", "t-01", "겁나얇은티비", 3500000, 60);
		
		// SmartPhone 객체 생성
		// brand, pCode, pName, price, mobileAgency
		SmartPhone s = new SmartPhone("애플", "s-01", "아이폰11pro", 1500000, "KT");
		
		System.out.println(d.information());
		System.out.println(t.information());
		System.out.println(s.information());
	}
}

package com.kh.chap01_list.part02_mvc.run;

import com.kh.chap01_list.part02_mvc.view.MusicMenu;

public class Run {

	public static void main(String[] args) {
		
		/*
		MusicMenu m = new MusicMenu();
		m.mainMenu();
		*/
		
		// 호출 한번에하기
		new MusicMenu().mainMenu();
		
		
		
	}
}


/* MVC
 * 
 *
 * Model : 데이터를 처리하는 역할 담당
 * 
 * View : 사용자(클라이언트)가 보게되는 시각적인 요소(화면)
 *        - 입력(Scanner) 및출력(print문) 
 * 
 * Controller : 사용자의 요청을 처리하는 담당
 */
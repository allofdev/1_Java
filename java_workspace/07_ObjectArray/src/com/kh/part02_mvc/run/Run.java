package com.kh.part02_mvc.run;
import com.kh.part02_mvc.view.*;


// Run : 프로그램 실행만 시켜주는 역할
//       -> 사용자가 보게될 첫 메인 화면을 띄워만 줌
public class Run {

	public static void main(String[] args) {
		
		/* ★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
		 * * MVC 패턴 익히기
		 * 
		 * Model: 데이터 관련한 역할을 담당
		 * View	: 사용자가 보게될 시각적인 요소 담당(화면같은 존재)
		 *        출력 및 입력
		 * Controller : 사용자가 요청한 기능 처리를 담당 (출력 입력 절대없음!)
		 * ★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
		 * 
		 * 		-Run-						-view- 								-Controller-
		 * 		요청							화면			요청 == 메소드호출			사용자가
		 * 									시각적인 요소 	------------>			요청한 내용
		 * 									입력 및 출력		<-----------			처리해주는 담당
		 *												return 결과						
		 *												
		 */	
		
		PersonView pv = new PersonView();
		pv.mainMenu();
		
		
	}
}

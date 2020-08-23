package com.kh.chap04_date.run;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Run {
	public static void main(String[] args) {
		
		/*
		 * * Date (java.util)
		 * - Date는 자바 개발할 당시 초창기에 급하게 만든 완성도가 높지 않은 클래스. 다국적으로 쓰기도 적합 X
		 * 
		 */
		
		// 기본생성자를 통해 Data 객체 생성 --> (컴퓨터)시스템 날짜(현재 날짜)를 담고 있음
		Date today = new Date();
		System.out.println("기본생성자(오늘날짜) : " + today);
		
		
		// 내가  원하는 날짜(2020년 6월 19일)로 셋팅 가능
		// 1) 매개변수 생성자를 통해서 생성
		Date date = new Date(2020 - 1900, 6 - 1, 19, 15, 30 ,21); // (가운데 줄)Deprecated : 권장하진 않는다.(다만 제공은해줌)
							//    년                 월           일      시      분      초
			// 내부적으로 내가 전달한 년도 + 1900
			// 내부적으로 내가 전달한 월 +1
			// 일, 시, 분, 초 는 이상없음
		System.out.println("매개변수 생성자 : " + date);
		
		// 2) 기본생성자로 생성한 후 setter메소드로 값 변경
		Date date2 = new Date();
		
		date2.setYear(2020 - 1900);
		date2.setMonth(6 - 1);
		date2.setDate(19);
		
		System.out.println("set메소드 : " + date2);
		
		// 내 입맛대로의 포맷을 지정한 채로 출력하고자 할 때
		// java.text.SimpleDateFormat 클래스
		
		// 2020년 07월 22일 19시 36분 22초
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		
		// today --> 포맷 지정한 채로 --> String
		String formatDate = sdf.format(today);
		System.out.println(formatDate);
		
		System.out.println(sdf.format(date));
		
		// String에서 제공하는 메소드들
		// Parsing 파싱하는거
		// SimpleDateFormat 포맷지정
		
	}
		
}
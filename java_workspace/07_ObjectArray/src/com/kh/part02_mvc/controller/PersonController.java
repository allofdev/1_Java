package com.kh.part02_mvc.controller;
import com.kh.part02_mvc.model.vo.Person;

// Controller : View(화면)에서 사용자가 요청한 것들을 처리해주는 기능용 클래스




/**
 * @author user2
 *
 */
public class PersonController {
	
	// 우선 세명의 회원객체를 관리하기 위한 배열셋팅 (전역변수)
	private Person[] people = new Person[3];
	
	// 현재 추가된 사람 수를 나타내는 변수 (전역변수)
	private int count = 0;
	
	
	/**
	 * 매개변수를 통해 신규회원 추가
	 * @param name
	 * @param age
	 * @param wealth
	 * @return
	 */
	public int insertPerson(String name, int age, int wealth) {
		
		if(count < people.length) {
			people[count++] = new Person(name, age, wealth);
			
			//System.out.print("성공적으로 추가되었습니다.");
			return 1;
			
		}else {
			//System.out.print("현재 인원이 다 찬 관계로 추가가 불가합니다.");
			return 0;
		}
		
	}
	
	
	/**
	 * 전체 회원수 반환
	 * @return
	 */
	public int getCount() {
		return count;
	}
	
	
	public Person[] selectList() {
		/* --> 해당클래스에서는 출력 시키지 않기 때문에 people배열을 반환
		for(int i=0; i<count; i++) {
			System.out.print(people[i].information());
		}
		*/
		return people;
	}
	
	public Person searchPerson(String name) {
		
		Person searchPerson = null; // 검색된 회원객체를 받아줄 변수 셋팅
									// 주소값이기 때문에 null로 초기화
		for(int i=0; i<count; i++) {
			if(people[i].getName().equals(name)) {
			// System.out.println(people[i].information());
			searchPerson = people[i];	
			}
		}
		
		return searchPerson; // 검색된 회원객체 또는 null
	}
	
	
	public double avgWealth() {
		
		double sum = 0;
		double avg = 0;
		
		for(int i=0; i<count; i++) {
			sum += people[i].getWealth();
		}
			avg = sum/count;
			return avg;
	}
}
package com.kh.part02_mvc.controller;
import com.kh.part02_mvc.model.vo.Person;

// Controller : View(ȭ��)���� ����ڰ� ��û�� �͵��� ó�����ִ� ��ɿ� Ŭ����




/**
 * @author user2
 *
 */
public class PersonController {
	
	// �켱 ������ ȸ����ü�� �����ϱ� ���� �迭���� (��������)
	private Person[] people = new Person[3];
	
	// ���� �߰��� ��� ���� ��Ÿ���� ���� (��������)
	private int count = 0;
	
	
	/**
	 * �Ű������� ���� �ű�ȸ�� �߰�
	 * @param name
	 * @param age
	 * @param wealth
	 * @return
	 */
	public int insertPerson(String name, int age, int wealth) {
		
		if(count < people.length) {
			people[count++] = new Person(name, age, wealth);
			
			//System.out.print("���������� �߰��Ǿ����ϴ�.");
			return 1;
			
		}else {
			//System.out.print("���� �ο��� �� �� ����� �߰��� �Ұ��մϴ�.");
			return 0;
		}
		
	}
	
	
	/**
	 * ��ü ȸ���� ��ȯ
	 * @return
	 */
	public int getCount() {
		return count;
	}
	
	
	public Person[] selectList() {
		/* --> �ش�Ŭ���������� ��� ��Ű�� �ʱ� ������ people�迭�� ��ȯ
		for(int i=0; i<count; i++) {
			System.out.print(people[i].information());
		}
		*/
		return people;
	}
	
	public Person searchPerson(String name) {
		
		Person searchPerson = null; // �˻��� ȸ����ü�� �޾��� ���� ����
									// �ּҰ��̱� ������ null�� �ʱ�ȭ
		for(int i=0; i<count; i++) {
			if(people[i].getName().equals(name)) {
			// System.out.println(people[i].information());
			searchPerson = people[i];	
			}
		}
		
		return searchPerson; // �˻��� ȸ����ü �Ǵ� null
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
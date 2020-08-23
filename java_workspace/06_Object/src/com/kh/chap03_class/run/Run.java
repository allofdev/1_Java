package com.kh.chap03_class.run;
import com.kh.chap03_class.model.vo.*;
import java.util.Scanner;

public class Run {
	
	public static void main(String[] args) {
		
		//Person Ŭ���� =======================================================================
		
		// ��ü������ ���� Heap ������ ������ ���� Ȯ���ص־� ��(new�� ����) --> �Ҵ�
		// Heap���� ������� ���� ������ �ʱⰪ�� �⺻������ ������ -> Ȯ���غ����� p.setId("user01"); �� �ּ� ó���ϰ� �����غ����
		// String -> null
		// int    -> 0
		// char   -> ''
		
		Person p = new Person();
		
		/* �̰Ŵ� public�� ����
		p.id = "user01";
		p.pwd = "pass01";
		*/
		
		//p.setId("user01");
		p.setPwd("pass01");
		p.setName("ȫ�浿");
		//p.setAge(20);
		p.setGender('M');
		p.setPhone("010-1111-2222");
		p.setEmail("hong@naver.com");
		
		
		
		
		// ��ȯ-----------------------------------------------------------------------------
		// String id = p.getId();
		// System.out.println(id);		--> ������ �Է��� ��µ� �����ϰ� �׳ɵ�����
		
		System.out.println("id : " + p.getId() + ", pwd : " + p.getPwd() + ", name : "
						+ p.getName() + ", age : " + p.getAge() + ", gender : " + p.getGender() 
						+ ", phone : " + p.getPhone() + ", email : " + p.getEmail());
		
		
		p.setPhone("010-2222-3333");		// ������ �����͸� ���浵 ����
		System.out.println(p.getPhone());
		
		
		// information() �޼ҵ忡 �ִ� ������ ���� �ѹ��� ��ȯ
		System.out.println(p.information());
		
		
		// ����ڰ� �̸��� ����
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �̸� : ");
		String name = sc.nextLine();
		p.setName(name);
		
		System.out.println(p.information());
	}
}

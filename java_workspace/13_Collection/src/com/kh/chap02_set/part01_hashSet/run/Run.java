package com.kh.chap02_set.part01_hashSet.run;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import com.kh.chap02_set.part01_hashSet.model.vo.Person;

public class Run {

	public static void main(String[] args) {
		
		HashSet<String> hs1 = new HashSet<>();
		
		hs1.add(new String("�ݰ����ϴ�."));
		hs1.add(new String("������"));
		hs1.add(new String("�ȳ��ϼ���."));
		hs1.add(new String("������"));
		//hs1.add(new Integer(1));
		//hs1.add(new Integer(1));
		
		System.out.println(hs1); // ��������X, �ߺ����X
		
		
		HashSet<Person> hs2 = new HashSet<>();
		
		hs2.add(new Person("����", 40, 100));
		hs2.add(new Person("ȫ�浿", 26, 40));
		hs2.add(new Person("�踻��", 24, 20));
		hs2.add(new Person("����", 40, 100));
		
		
		System.out.println(hs2); // ��������X, �ߺ����..? (��? ���ϰ�ü�� �Ǵ��� �ȵż�!!)
											// hashCode�� equals �޼ҵ带 �������̵� �ϰ� �Ǹ� �� �ʵ尪���� ��� ��ġ�� ��� ���ϰ�ü�� �ǴܵǱ� ����  => 
		
											// �ּҰ��� �ٸ�
											// ����  String Integer Ŭ������ �ּҰ��̾ƴ϶� ���� �����͸� ���ϵ��� �Ǿ�����
											// PersonŬ������ HashCode�޼ҵ带 �������̵� ����ߵ� 
											// art shift s �� ���� ���ָ� �ʤ�
		
		// Set�迭 Ư¡ �� index�������!! => ��, Ư�� ��ü �ϳ����� ���� �� ����!! (get()�޼ҵ尡 ����)
		
		// ��, ����ִ� ��ü�鿡 ���������� ������ ����!!
		// 1. for�� ��밡��! (��, ���� for�����θ� ����!! (for each��))
		for(Person p : hs2) {
			//System.out.println(p);
			System.out.println(p.getName());
		}
		
		
		// 2. ArrayList�� ���� ��  ArrayList �ݺ��� �������鼭 �����ϴ� ���
		// List <--> Set  // �θ� ���� ������ ������� ȣ�� ����
		

		//ArrayList list = new ArrayList(); // �� ����Ʈ
		//list.addAll(hs2);                 // allAll�޼ҵ�� ��°�� �߰��ϴ� ���
		
		
		//--------> �� ���� ���ٷ� ����
		ArrayList<Person> list = new ArrayList<>(hs2); // hs2�� ����ִ� ��ü�� ����Ʈ�� ���ʿ� �����鼭 �����ϴ� ���
		
		System.out.println("==========");
		for(int i=0; i<list.size(); i++) {
			//System.out.println(list.get(i));
			System.out.println(list.get(i).getName());
		}
		
		
		System.out.println("==========");
		
		// 3. Iterator �ݺ��ڸ� �̿��ϴ� ���
		
		// 1) hs2�� ��ü�� --> Iterator(�ݺ���) �Ű� ���		: set�迭.iterator()
		Iterator<Person> it = hs2.iterator(); // hs2 => it
		
		// 2) �ݺ����� ���ؼ� ��� �̾���
		/*
		System.out.println(it.next());
		System.out.println(it.next());
		
		System.out.println(it.hasNext()); // ������ �ֽ��ϱ�? // true
		
		System.out.println(it.next());
		
		System.out.println(it.hasNext()); // false
		*/
		
		while(it.hasNext()) { // ������ �ֽ��ϱ�? true�� �ݺ��� ���� false�� �ݺ��� ����
			//System.out.println(it.next());
			System.out.println(it.next().getName());
		}
		
		
		
		
		// HashSet ������ ��ü�� add�� ��
		// ������ ����ִ� ��ü��� "hashCode�޼ҵ�, equals�޼ҵ�" �� ���ϰ�ü���� �Ǵ���
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
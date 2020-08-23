package com.kh.chap02_inherit.run;
import com.kh.chap02_inherit.model.vo.*;

public class Run extends Object{	// ��~~~�� Ŭ������ Object�� ��� �ް� �ִ�. Object�� ������
	public static void main(String[] args) {
		
		Car c = new Car("��Ʋ��", 12.5,"����",4);
		System.out.println(c.information());
		
		Car c1 = new Car();
		c1.setName("����");
		c1.setMileage(13.0);
		c1.setKind("����");
		c1.setTire(4);
		System.out.println(c1.information());
		
		Airplane a = new Airplane("����", 0.2, "��Ʈ��", 2, 2);
		System.out.println(a.information());
		
		Ship s = new Ship("���ù�", 2.5, "�", 1);
		System.out.println(s.information());
		
		
		c.howToMove();
		a.howToMove();
		s.howToMove();
		
		
		
		
		
	}
}

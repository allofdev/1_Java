package com.kh.chap02_inherit.run;
import com.kh.chap02_inherit.model.vo.*;

public class Run extends Object{	// 모~~~든 클래스는 Object에 상속 받고 있다. Object는 생략됨
	public static void main(String[] args) {
		
		Car c = new Car("벤틀리", 12.5,"세단",4);
		System.out.println(c.information());
		
		Car c1 = new Car();
		c1.setName("현대");
		c1.setMileage(13.0);
		c1.setKind("에쿠스");
		c1.setTire(4);
		System.out.println(c1.information());
		
		Airplane a = new Airplane("보잉", 0.2, "제트기", 2, 2);
		System.out.println(a.information());
		
		Ship s = new Ship("낚시배", 2.5, "어선", 1);
		System.out.println(s.information());
		
		
		c.howToMove();
		a.howToMove();
		s.howToMove();
		
		
		
		
		
	}
}

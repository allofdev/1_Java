package com.hw2.run;

import com.hw2.model.vo.Point;
import com.hw2.model.vo.Circle;
import com.hw2.model.vo.Rectangle;

public class Run {

	public static void main(String[] args) {
		
		Point[] cArr = new Point[2];
		Point[] rArr = new Point[2];
		
		cArr[0] = new Circle(1, 2, 3);
		cArr[1] = new Circle(3, 3, 4);
		
		rArr[0] = new Rectangle(-1, -2, 5, 2);
		rArr[1] = new Rectangle(-2, 5, 2, 8);
		
		System.out.println("===== circle =====");
		for(Point p : cArr) {
			p.draw();
		}
		
		System.out.println("===== rectangle =====");
		for(Point p : rArr) {
			p.draw();
		}
		
		
		
		
	}
}

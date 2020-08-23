package com.kh.chap03_branch.run;
import com.kh.chap03_branch.branch.*;

public class Run {
	
	public static void main(String[] args) {
		
		// 프로그램 흐름을 제어하는 제어문 중 하나인 분기문 (반복문 안에서만 쓰임!)
		// break, continue
		
		A_Break a = new A_Break();
		a.method1();
		//a.method2();
		//a.method3();
		//a.method4();
		
		B_Continue b = new B_Continue();
		//b.method1();
		//b.method2();
		//b.method3();
	}
		

}

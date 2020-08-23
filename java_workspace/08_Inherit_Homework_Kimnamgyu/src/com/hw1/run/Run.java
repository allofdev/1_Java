package com.hw1.run;

import java.util.Scanner;
import com.hw1.model.vo.Person;
import com.hw1.model.vo.Student;
import com.hw1.model.vo.Employee;


public class Run {

	public static void main(String[] args) {
		
		//학생-----------------------------------------
		Person[] sArr = new Person[3]; //학생 객체 배열
		
		Person[] eArr = new Employee[10]; //사원 객체 배열
		
		sArr[0] = new Student("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
		sArr[1] = new Student("김말똥", 21, 187.3, 80.0, 2, "경영학과");
		sArr[2] = new Student("강개순", 23, 167.0, 45.0, 4, "정보통신공학과");
		
		for(Person p : sArr) {
			System.out.println(p.information());
		}
		
		
		
		//사원-----------------------------------------
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		
		while(true) {
			
			System.out.print("이름 : ");
			String name = sc.nextLine();
			System.out.print("나이 : ");
			int age = sc.nextInt();
			System.out.print("신장 : ");
			double height = sc.nextDouble();
			System.out.print("몸무게 : ");
			double weight = sc.nextDouble();
			System.out.print("급여 : ");
			int salary = sc.nextInt();
			System.out.print("부서 : ");
			sc.nextLine();
			String dept = sc.nextLine();
			
			eArr[count] = new Employee(name, age, height, weight, salary, dept);
			count++;
			System.out.print("계속 생성합니다 (Y/N): ");
			char ch = sc.nextLine().charAt(0);
			if(ch == 'y' || ch == 'Y') {	
			}else if(ch == 'n' || ch == 'N'){
				break;
			}
		}	
		for(int i=0; i<count; i++) {
			System.out.println(eArr[i].information());
		}
	}
}

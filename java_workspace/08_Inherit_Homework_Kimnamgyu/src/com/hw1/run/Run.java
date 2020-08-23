package com.hw1.run;

import java.util.Scanner;
import com.hw1.model.vo.Person;
import com.hw1.model.vo.Student;
import com.hw1.model.vo.Employee;


public class Run {

	public static void main(String[] args) {
		
		//�л�-----------------------------------------
		Person[] sArr = new Person[3]; //�л� ��ü �迭
		
		Person[] eArr = new Employee[10]; //��� ��ü �迭
		
		sArr[0] = new Student("ȫ�浿", 20, 178.2, 70.0, 1, "�����ý��۰��а�");
		sArr[1] = new Student("�踻��", 21, 187.3, 80.0, 2, "�濵�а�");
		sArr[2] = new Student("������", 23, 167.0, 45.0, 4, "������Ű��а�");
		
		for(Person p : sArr) {
			System.out.println(p.information());
		}
		
		
		
		//���-----------------------------------------
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		
		while(true) {
			
			System.out.print("�̸� : ");
			String name = sc.nextLine();
			System.out.print("���� : ");
			int age = sc.nextInt();
			System.out.print("���� : ");
			double height = sc.nextDouble();
			System.out.print("������ : ");
			double weight = sc.nextDouble();
			System.out.print("�޿� : ");
			int salary = sc.nextInt();
			System.out.print("�μ� : ");
			sc.nextLine();
			String dept = sc.nextLine();
			
			eArr[count] = new Employee(name, age, height, weight, salary, dept);
			count++;
			System.out.print("��� �����մϴ� (Y/N): ");
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

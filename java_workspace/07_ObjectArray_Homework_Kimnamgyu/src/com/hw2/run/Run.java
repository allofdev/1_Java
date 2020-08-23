package com.hw2.run;
import java.util.Scanner;
import com.hw2.model.vo.*;

public class Run {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Student[] arr = new Student[10];
		
		int count = 0;
		
		while(true) {
			
			if(count <= 10) {
				
				System.out.println("\n" + (count + 1) + "�� ° �Է�");
				
				System.out.print("�г� : ");
				int grade = sc.nextInt();
				
				System.out.print("�� : ");
				int classroom = sc.nextInt();
				
				sc.nextLine();
				
				System.out.print("�̸� : ");
				String name = sc.nextLine();
				
				System.out.print("�������� : ");
				int kor = sc.nextInt();
				
				System.out.print("�������� : ");
				int eng = sc.nextInt();
				
				System.out.print("�������� : ");
				int math = sc.nextInt();
				
				arr[count] = new Student(grade, classroom, name, kor, eng, math);
				
				count++;
				
				System.out.print("��� �Է� �Ұǰ���?(y/n) : ");
				sc.nextLine();
				char ch = sc.nextLine().charAt(0);
				
				if(ch == 'n' || ch == 'N') {
					System.out.println("�����մϴ�.");
					break;
				} else if(ch == 'y' || ch == 'Y') {
					
				} else {
					System.out.println("�߸� �Է��Ͽ����ϴ�. �ٽ��Է��ϼ���");
					continue;
				}

			} else if(count > 10) {
				break;
			}
		}
		
		for(int i=0; i<count; i++) {
			System.out.println(arr[i].information() + "\n" + 
					arr[i].getName() + " �л��� ������� : " + ((arr[i].getKor() + arr[i].getEng() + arr[i].getMath()) / 3) );
		}
	}
}
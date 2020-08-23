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
				
				System.out.println("\n" + (count + 1) + "번 째 입력");
				
				System.out.print("학년 : ");
				int grade = sc.nextInt();
				
				System.out.print("반 : ");
				int classroom = sc.nextInt();
				
				sc.nextLine();
				
				System.out.print("이름 : ");
				String name = sc.nextLine();
				
				System.out.print("국어점수 : ");
				int kor = sc.nextInt();
				
				System.out.print("영어점수 : ");
				int eng = sc.nextInt();
				
				System.out.print("수학점수 : ");
				int math = sc.nextInt();
				
				arr[count] = new Student(grade, classroom, name, kor, eng, math);
				
				count++;
				
				System.out.print("계속 입력 할건가요?(y/n) : ");
				sc.nextLine();
				char ch = sc.nextLine().charAt(0);
				
				if(ch == 'n' || ch == 'N') {
					System.out.println("종료합니다.");
					break;
				} else if(ch == 'y' || ch == 'Y') {
					
				} else {
					System.out.println("잘못 입력하였습니다. 다시입력하세요");
					continue;
				}

			} else if(count > 10) {
				break;
			}
		}
		
		for(int i=0; i<count; i++) {
			System.out.println(arr[i].information() + "\n" + 
					arr[i].getName() + " 학생의 평균점수 : " + ((arr[i].getKor() + arr[i].getEng() + arr[i].getMath()) / 3) );
		}
	}
}
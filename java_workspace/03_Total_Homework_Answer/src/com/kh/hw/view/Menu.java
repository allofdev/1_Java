package com.kh.hw.view;
import com.kh.hw.controller.Function;
import java.util.*;

public class Menu {

	public void displayMenu() {
		Function f = new Function();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("\n===== ���� �޴� =====");
			System.out.println("1. ���� ����");
			System.out.println("2. ���� ������ ū ������ �հ�");
			System.out.println("3. �Ż� ���� Ȯ��");
			System.out.println("4. �л� ���� Ȯ��");
			System.out.println("5. ���� ���� ���");
			System.out.println("6. ���������� �հ�");
			System.out.println("7. ������");
			System.out.println("8. �ֻ��� ���� �˾� ���߱� ����");
			System.out.println("9. ���α׷� ����");
			System.out.print("�޴� ��ȣ : ");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1: f.calculator(); break;
			case 2: f.totalCalculator();break;
			case 3: f.printProfile(); break;
			case 4: f.printScore(); break;
			case 5: f.printStarNumber(); break;
			case 6: f.sumRandom(); break;
			case 7: f.exceptGugu(); break;
			case 8: f.diceGame(); break;
			case 9: System.out.println("�����մϴ�."); return;
			default: System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.\n"); break;
			}	
		}
	}
}

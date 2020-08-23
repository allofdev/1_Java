package mvc.view;
import java.util.Scanner;
import mvc.controller.LibraryManager;
import mvc.model.vo.Member;
import mvc.model.vo.Book;

public class LibraryMenu {

	LibraryManager lm = new LibraryManager();
	
	Scanner sc = new Scanner(System.in);
	
	// mainMenu �޼ҵ�
	public void mainMenu() {
		
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		System.out.print("���� : ");
		int age = sc.nextInt();
		System.out.print("���� (��/��) : ");
		sc.nextLine();
		char gender = sc.nextLine().charAt(0);
		
		Member mem = new Member(name, age, gender);
		lm.insertMember(mem);
		
		
		
		while(true) {
			System.out.println("\n==== �޴� ====");
			System.out.println("1. ����������");
			System.out.println("2. ���� ��ü ��ȸ");
			System.out.println("3. ���� �˻�");
			System.out.println("4. ���� �뿩�ϱ�");
			System.out.println("0. ���α׷� �����ϱ�");
			System.out.print("�޴��� �Է����ּ��� : ");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1: Member m = lm.myInfo(); 
					System.out.println(m); break;
			case 2: selectAll(); break;
			case 3: searchBook(); break;
			case 4: rentBook(); break;
			case 0: System.out.println("���α׷��� �����մϴ�."); return;
			default : System.out.println("�޴��� �߸��Է��Ͽ����ϴ�. �ٽ��Է����ּ���.");
			}
		}
		
	}
	
	// 2. selectAll �޼ҵ�
	public void selectAll() {
		Book[] bList = lm.selectAll();
		
		for(int i=0; i<bList.length; i++) {
			System.out.println(i + "������ : " + bList[i]);
		}
		
	}
	
	// 3. searchBook �޼ҵ�
	public void searchBook() {
		System.out.print("�˻��� ���� Ű���� : ");
		sc.nextLine();
		String keyword = sc.nextLine();
		
		Book[] searchList = lm.searchBook(keyword);
		
		for(Book b : searchList) {
			if(b != null) {
				System.out.println(b.toString());
			}
		}
		
	}
	
	
	// 4. rentBook �޼ҵ�
	public void rentBook() {
		
		selectAll();
		
		System.out.print("�뿩�� ���� ��ȣ ���� : ");
		int num = sc.nextInt();
		
		int rentBook = lm.rentBook(num);
		
		if(rentBook == 1) {
			System.out.println("���� �������� �뿩 �Ұ����մϴ�.");
		}else if(rentBook == 2) {
			System.out.println("���������� �뿩 �Ϸ��Ͽ����ϴ�. �丮�п� ������ �߱޵Ǿ����ϴ�.");
			System.out.println("������������ ���� Ȯ���ϼ���.");
		}else if(rentBook == 0) {
			System.out.println("���������� �뿩�Ǿ����ϴ�.");
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
}

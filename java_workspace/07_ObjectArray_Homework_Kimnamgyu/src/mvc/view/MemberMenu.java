package mvc.view;
import java.util.Scanner;
import mvc.controller.MemberController;
import mvc.model.vo.Member;

public class MemberMenu {

	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();
	
	public void mainMenu() {
		
		while(true) {
			System.out.println("\n===== ȸ�� ���α׷� =====");
			System.out.println("1. �ű� ȸ�� ���");
			System.out.println("2. ȸ�� ���� �˻�");
			System.out.println("3. ȸ�� ���� ����");
			System.out.println("4. ȸ�� ���� ����");
			System.out.println("5. ȸ�� ���� ���");
			System.out.println("9. ���α׷� ����");
			
			System.out.print("�޴��� �Է����ּ��� : ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1:	insertMember(); break;
			case 2: searchMember(); break;
			case 3: updateMember(); break;
			case 4: deleteMember(); break;
			case 5: printAllMember(); break;
			case 9: System.out.println("���α׷��� �����մϴ�."); return;
			default: System.out.println("�߸��Է� �Ͽ����ϴ�. �ٽ� �Է����ּ���."); break;
			}
		}
	}
	
	
	
	/**
	 * 1. �ű� ȸ�� ��� �޼ҵ�
	 */
	public void insertMember() {
		
		int maxCount = mc.SIZE;
		int count =  mc.getMemberCount();
		
		System.out.println("== �ű� ȸ�� ��� ==");
		
		if(count >= maxCount) {
			System.out.println("ȸ������ �ʰ��߽��ϴ�.");
			return;
		} else {
			System.out.print("���̵� : ");
			String userId = sc.nextLine();
			mc.checkId(userId);
			
			if(mc.checkId(userId) == null) {
				System.out.print("��й�ȣ : "); 
				String userPwd = sc.nextLine();
				
				System.out.print("�̸� : "); 
				String name = sc.nextLine();
				
				System.out.print("���� : "); 
				int age = sc.nextInt();
				
				sc.nextLine();
				System.out.print("���� : "); 
				char gender = sc.nextLine().charAt(0);
				
				System.out.print("�̸��� : "); 
				String email = sc.nextLine();
				
				mc.insertMember(userId, userPwd, name, age, gender, email);				
			
				System.out.println("���������� ȸ�� ����� �Ǿ����ϴ�.");
				
			}else {
				System.out.println("������ ���̵� �����մϴ�. ȸ����� ����");	
			}
		}
	}
	
	public void searchMember() {
		
		while(true) {
			
			System.out.println("\n== ȸ�� ���� �˻� ==");
			System.out.println("1. ���̵�� �˻��ϱ�");
			System.out.println("2. �̸����� �˻��ϱ�");
			System.out.println("3. �̸��Ϸ� �˻��ϱ�");
			System.out.println("9. ���� �޴���");
			
			System.out.print("�޴� ���� : ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			if(menu == 9) {
				System.out.println("���� �޴��� ���ư��ϴ�.");
				break;
			}else if(menu >= 1 && menu <= 3){
				System.out.print("�˻� ���� : ");
				String search = sc.nextLine();
				
				Member searchMember = mc.searchMember(menu, search);
				
				if(searchMember == null) {
					System.out.println("�˻��� ����� �����ϴ�.");
				}else {
					System.out.println(searchMember.information());
				}
			}else {
				System.out.println("�߸� �Է��Ͽ����ϴ�. �ٽ��Է����ּ���");
			}
			
		}

	}
	
	public void updateMember() {
		
		while(true) {
			System.out.println("\n== ȸ�� ���� ���� ==");
			System.out.println("1. ��й�ȣ ����");
			System.out.println("2. �̸� ����");
			System.out.println("3. �̸��� ����");
			System.out.println("9. ���� �޴���");
			
			System.out.print("�޴� ���� : ");
			int menu = sc.nextInt();
			sc.nextLine();
	
			if(menu == 9) {
				System.out.println("���� �޴��� ���ư��ϴ�.");
				break;
			}else if(menu >= 1 && menu <=3) {
				
				System.out.print("������ ȸ�� ���̵� : ");
				String userId = sc.nextLine();			
					
				Member checkId = mc.checkId(userId);
				
				
				if(checkId != null) {
					
							System.out.println(checkId.information());
							
							switch(menu) {
							case 1:
								System.out.print(checkId.getName() + "ȸ���� ������ ��й�ȣ : ");
								String update = sc.nextLine();
								
								mc.updateMember(checkId, menu, update);
								break;
							case 2:
								System.out.print(checkId.getName() + "ȸ���� ������ �̸� : ");
								update = sc.nextLine();
								
								mc.updateMember(checkId, menu, update);
								break;
							case 3:
								System.out.print(checkId.getName() + "ȸ���� ������ �̸��� : ");
								update = sc.nextLine();
								
								mc.updateMember(checkId, menu, update);
								break;
							}
							
							System.out.println("������ �Ϸ�Ǿ����ϴ�.");
							
							break;
						
				} else if(checkId == null) {
					System.out.println("������ ȸ���� �������� �ʽ��ϴ�.");
				}
			}else {
				System.out.println("�߸��Է� �Ͽ����ϴ�. �ٽ��Է��� �ּ���.");
			}
		}
	}

	
	public void deleteMember() {
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void printAllMember() {
		
		Member[] mem = mc.getMem();
		
		for(int i=0; i<mc.getMemberCount(); i++) {
			System.out.println(mem[i].information());
		}
		
		
	}
	
}

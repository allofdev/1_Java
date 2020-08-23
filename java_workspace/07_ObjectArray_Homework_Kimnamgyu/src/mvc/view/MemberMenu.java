package mvc.view;
import java.util.Scanner;
import mvc.controller.MemberController;
import mvc.model.vo.Member;

public class MemberMenu {

	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();
	
	public void mainMenu() {
		
		while(true) {
			System.out.println("\n===== 회원 프로그램 =====");
			System.out.println("1. 신규 회원 등록");
			System.out.println("2. 회원 정보 검색");
			System.out.println("3. 회원 정보 수정");
			System.out.println("4. 회원 정보 삭제");
			System.out.println("5. 회원 정보 출력");
			System.out.println("9. 프로그램 종료");
			
			System.out.print("메뉴를 입력해주세요 : ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch(menu) {
			case 1:	insertMember(); break;
			case 2: searchMember(); break;
			case 3: updateMember(); break;
			case 4: deleteMember(); break;
			case 5: printAllMember(); break;
			case 9: System.out.println("프로그램을 종료합니다."); return;
			default: System.out.println("잘못입력 하였습니다. 다시 입력해주세요."); break;
			}
		}
	}
	
	
	
	/**
	 * 1. 신규 회원 등록 메소드
	 */
	public void insertMember() {
		
		int maxCount = mc.SIZE;
		int count =  mc.getMemberCount();
		
		System.out.println("== 신규 회원 등록 ==");
		
		if(count >= maxCount) {
			System.out.println("회원수를 초과했습니다.");
			return;
		} else {
			System.out.print("아이디 : ");
			String userId = sc.nextLine();
			mc.checkId(userId);
			
			if(mc.checkId(userId) == null) {
				System.out.print("비밀번호 : "); 
				String userPwd = sc.nextLine();
				
				System.out.print("이름 : "); 
				String name = sc.nextLine();
				
				System.out.print("나이 : "); 
				int age = sc.nextInt();
				
				sc.nextLine();
				System.out.print("성별 : "); 
				char gender = sc.nextLine().charAt(0);
				
				System.out.print("이메일 : "); 
				String email = sc.nextLine();
				
				mc.insertMember(userId, userPwd, name, age, gender, email);				
			
				System.out.println("성공적으로 회원 등록이 되었습니다.");
				
			}else {
				System.out.println("동일한 아이디가 존재합니다. 회원등록 실패");	
			}
		}
	}
	
	public void searchMember() {
		
		while(true) {
			
			System.out.println("\n== 회원 정보 검색 ==");
			System.out.println("1. 아이디로 검색하기");
			System.out.println("2. 이름으로 검색하기");
			System.out.println("3. 이메일로 검색하기");
			System.out.println("9. 이전 메뉴로");
			
			System.out.print("메뉴 선택 : ");
			int menu = sc.nextInt();
			sc.nextLine();
			
			if(menu == 9) {
				System.out.println("이전 메뉴로 돌아갑니다.");
				break;
			}else if(menu >= 1 && menu <= 3){
				System.out.print("검색 내용 : ");
				String search = sc.nextLine();
				
				Member searchMember = mc.searchMember(menu, search);
				
				if(searchMember == null) {
					System.out.println("검색된 결과가 없습니다.");
				}else {
					System.out.println(searchMember.information());
				}
			}else {
				System.out.println("잘못 입력하였습니다. 다시입력해주세요");
			}
			
		}

	}
	
	public void updateMember() {
		
		while(true) {
			System.out.println("\n== 회원 정보 수정 ==");
			System.out.println("1. 비밀번호 수정");
			System.out.println("2. 이름 수정");
			System.out.println("3. 이메일 수정");
			System.out.println("9. 이전 메뉴로");
			
			System.out.print("메뉴 선택 : ");
			int menu = sc.nextInt();
			sc.nextLine();
	
			if(menu == 9) {
				System.out.println("이전 메뉴로 돌아갑니다.");
				break;
			}else if(menu >= 1 && menu <=3) {
				
				System.out.print("변경할 회원 아이디 : ");
				String userId = sc.nextLine();			
					
				Member checkId = mc.checkId(userId);
				
				
				if(checkId != null) {
					
							System.out.println(checkId.information());
							
							switch(menu) {
							case 1:
								System.out.print(checkId.getName() + "회원의 수정할 비밀번호 : ");
								String update = sc.nextLine();
								
								mc.updateMember(checkId, menu, update);
								break;
							case 2:
								System.out.print(checkId.getName() + "회원의 수정할 이름 : ");
								update = sc.nextLine();
								
								mc.updateMember(checkId, menu, update);
								break;
							case 3:
								System.out.print(checkId.getName() + "회원의 수정할 이메일 : ");
								update = sc.nextLine();
								
								mc.updateMember(checkId, menu, update);
								break;
							}
							
							System.out.println("수정이 완료되었습니다.");
							
							break;
						
				} else if(checkId == null) {
					System.out.println("변경할 회원이 존재하지 않습니다.");
				}
			}else {
				System.out.println("잘못입력 하였습니다. 다시입력해 주세요.");
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

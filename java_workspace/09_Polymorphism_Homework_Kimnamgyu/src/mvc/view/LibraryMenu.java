package mvc.view;
import java.util.Scanner;
import mvc.controller.LibraryManager;
import mvc.model.vo.Member;
import mvc.model.vo.Book;

public class LibraryMenu {

	LibraryManager lm = new LibraryManager();
	
	Scanner sc = new Scanner(System.in);
	
	// mainMenu 메소드
	public void mainMenu() {
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		System.out.print("성별 (남/여) : ");
		sc.nextLine();
		char gender = sc.nextLine().charAt(0);
		
		Member mem = new Member(name, age, gender);
		lm.insertMember(mem);
		
		
		
		while(true) {
			System.out.println("\n==== 메뉴 ====");
			System.out.println("1. 마이페이지");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색");
			System.out.println("4. 도서 대여하기");
			System.out.println("0. 프로그램 종료하기");
			System.out.print("메뉴를 입력해주세요 : ");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1: Member m = lm.myInfo(); 
					System.out.println(m); break;
			case 2: selectAll(); break;
			case 3: searchBook(); break;
			case 4: rentBook(); break;
			case 0: System.out.println("프로그램을 종료합니다."); return;
			default : System.out.println("메뉴를 잘못입력하였습니다. 다시입력해주세요.");
			}
		}
		
	}
	
	// 2. selectAll 메소드
	public void selectAll() {
		Book[] bList = lm.selectAll();
		
		for(int i=0; i<bList.length; i++) {
			System.out.println(i + "번도서 : " + bList[i]);
		}
		
	}
	
	// 3. searchBook 메소드
	public void searchBook() {
		System.out.print("검색할 제목 키워드 : ");
		sc.nextLine();
		String keyword = sc.nextLine();
		
		Book[] searchList = lm.searchBook(keyword);
		
		for(Book b : searchList) {
			if(b != null) {
				System.out.println(b.toString());
			}
		}
		
	}
	
	
	// 4. rentBook 메소드
	public void rentBook() {
		
		selectAll();
		
		System.out.print("대여할 도서 번호 선택 : ");
		int num = sc.nextInt();
		
		int rentBook = lm.rentBook(num);
		
		if(rentBook == 1) {
			System.out.println("나이 제한으로 대여 불가능합니다.");
		}else if(rentBook == 2) {
			System.out.println("성공적으로 대여 완료하였습니다. 요리학원 쿠폰이 발급되었습니다.");
			System.out.println("마이페이지를 통해 확인하세요.");
		}else if(rentBook == 0) {
			System.out.println("성공적으로 대여되었습니다.");
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
}

package mvc.controller;

import mvc.model.vo.Member;
import mvc.model.vo.Book;
import mvc.model.vo.AniBook;
import mvc.model.vo.CookBook;

public class LibraryManager {
	private Member mem = null;
	private Book[] bList = new Book[5];
	
	// �ʱ�ȭ ����� �̿��Ͽ� ���� ������ �ʱ�ȭ
	{
		bList[0] = new CookBook("�������� ����", "������", "tvN" , true);
		bList[1] = new AniBook("�ѹ� �� �ؿ�", "��Ƽ", "�����", 19);
		bList[2] = new AniBook("������ ���ǽ�", "����", "japan", 12);
		bList[3] = new CookBook("�������� �󸶳� ���ְԿ�", "������", "����", false);
		bList[4] = new CookBook("������ �� �����غ�", "������", "�ұ�å", true);
	}
	
	// insertMember
	public void insertMember(Member mem) {
		
		this.mem = mem;
		
	}
	
	// myInfo
	public Member myInfo() {
		
		return mem;
		
	}
	
	// selectAll
	public Book[] selectAll() {
		
		return bList;
		
	}
	
	// searchBook
	public Book[] searchBook(String keyword) {
		
		Book[] b = new Book[bList.length];
		int count = 0;
		
		for(int i=0; i<bList.length; i++) {
			
			if(bList[i].getTitle().contains(keyword)) {
				b[count++] = bList[i];
			}
			
		}

		return b;
		
	}
	
	// rentBook
	public int rentBook(int index) {
		
		int result = 0;
		
		
		if(bList[index] instanceof AniBook && ((AniBook)bList[index]).getAccessAge()>mem.getAge()) {
			result = 1; // �뿩�Ұ�
		}
		
		if(bList[index] instanceof CookBook && ((CookBook)bList[index]).isCoupon() == true) {
			mem.setCouponCount(mem.getCouponCount()+1);
			result = 2;
		}
		
		return result;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
}

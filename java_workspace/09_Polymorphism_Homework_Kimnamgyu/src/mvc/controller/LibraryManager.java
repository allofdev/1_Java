package mvc.controller;

import mvc.model.vo.Member;
import mvc.model.vo.Book;
import mvc.model.vo.AniBook;
import mvc.model.vo.CookBook;

public class LibraryManager {
	private Member mem = null;
	private Book[] bList = new Book[5];
	
	// 초기화 블록을 이용하여 샘플 데이터 초기화
	{
		bList[0] = new CookBook("백종원의 집밥", "백종원", "tvN" , true);
		bList[1] = new AniBook("한번 더 해요", "미티", "원모어", 19);
		bList[2] = new AniBook("루피의 원피스", "루피", "japan", 12);
		bList[3] = new CookBook("이혜정의 얼마나 맛있게요", "이혜정", "문학", false);
		bList[4] = new CookBook("최현석 날 따라해봐", "최현석", "소금책", true);
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
			result = 1; // 대여불가
		}
		
		if(bList[index] instanceof CookBook && ((CookBook)bList[index]).isCoupon() == true) {
			mem.setCouponCount(mem.getCouponCount()+1);
			result = 2;
		}
		
		return result;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
}

package com.kh.chap01_list.part02_mvc.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.kh.chap01_list.part02_mvc.model.sort.ArtistDesc;
import com.kh.chap01_list.part02_mvc.model.sort.TitleAsc;
import com.kh.chap01_list.part02_mvc.model.sort.TitleDesc;
import com.kh.chap01_list.part02_mvc.model.vo.Music;

public class MusicController {

	private ArrayList<Music> list = new ArrayList<>();
	
	//1. 신규 곡 추가하는 화면
	public void insertMusic(Music m) {
		// 방법1.
		// public void insertMusic(String title, String artist) {
		//
		//  	list.add(new Music(title, artist));
		//
		// }
		
		// 방법2.
		list.add(m);
	}
	
	// 2. 곡 전체 조회 하는 화면
	public ArrayList<Music> selectList() {
		return list;
	}
	
	// 3. 곡 검색하는 화면
	/* 간단 버전
	public ArrayList<Music> searchMusic(String keyword, int search) {	
		
		ArrayList<Music> searchList = new ArrayList<>();
		
		for(int i=0; i<list.size(); i++) {
			// "갤럭시".contains("시"); --> true
			if(keyword.contains(list.get(i).getTitle())) {
				searchList.add(list.get(i));
			}
		}
		
		return searchList;
		// 반복문이 다 끝난 시점에 있어서 searchList에는 검색된 곡이 담겨있을 것!
		// 단, 검색된 곡이 하나도 없었을 경우 searchList는 비어있을 것!!
	}
	*/
	
	// 3. 곡 검색하는 화면 (1 = 제목, 2 = 가수명,  3 = 제목+가수명)
	public ArrayList<Music> searchMusic(String keyword, int search) {	
		
		ArrayList<Music> searchList = new ArrayList<>();
		
		if(search == 1) {
			for(int i=0; i<list.size(); i++) {
				if(list.get(i).getTitle().contains(keyword)){
					searchList.add(list.get(i));
				}
			}
		}else if(search == 2) {
			for(int i=0; i<list.size(); i++) {
				if(list.get(i).getArtist().contains(keyword)) {
					
					searchList.add(list.get(i));
				}
			}
		}else if(search == 3) {
			for(int i=0; i<list.size(); i++) {
				//방법1. 그냥 이거 쓰는게 더 좋을듯
				//if(keyword.contains(list.get(i).getTitle()) ||
				//		keyword.contains(list.get(i).getArtist())) {
				
				//방법2.
				//곡명과 가수명을 하나의 문자열로 합친 후 contains로 비교하는 방법
				if(list.get(i).getTitle().concat(list.get(i).getArtist()).contains(keyword)) {
				searchList.add(list.get(i));
				}
			}
		}
		
		return searchList;
		// 반복문이 다 끝난 시점에 있어서 searchList에는 검색된 곡이 담겨있을 것!
		// 단, 검색된 곡이 하나도 없었을 경우 searchList는 비어있을 것!!
	}
	
	// 4. 곡 삭제 하는 화면
	public int removeMusic(String remove) {
		int result = 0;
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getTitle().equals(remove)) {
				list.remove(i);
				result++; // 제거가 되었는지 , 몇개가 삭제되었는지 알려주기 위해 작성함   result == 0 -> 제거안됨
				i--; // ArrayList는 0번 인덱스가 지워지면 1번인덱스가 0번인덱스로 이동함... 2번인덱스는 1번 인덱스로...
				     // 코드를 줄이기위해서 i--; 지우고,  list.remove(i--); 해줘도 됨
			}
		}
		
		return result; // result를 반환
	}
	
	// 5. 곡 수정 하는 화면1
	
	// 삭제와는 다르게 수정은 i--; 해줄 필요없음 삭제되는게 아니기 때문에 인덱스 그자리에 있기때문
	public boolean reviseMusic1(String revise) {
		boolean b = false;
		
		for(int i=0; i<list.size(); i++) {
			if(revise.equals(list.get(i).getTitle())) {				
				b = true;
			}
		}
		return b;
	}
	// 5. 곡 수정 하는 화면2
	public void reviseMusic2(String revise, String title, String artist) {
		for(int i=0; i<list.size(); i++) {
			if(revise.equals(list.get(i).getTitle())) {
				list.set(i, new Music(title, artist));
			}
		}
	}
	
	public ArrayList<Music> sortMusic(int menu) {
		
		// (1) 복사본 리스트 만들기
		ArrayList<Music> sortList = new ArrayList<>();
		sortList.addAll(list);
		//sortList = list; //이건 왜 안될까?
		
		switch(menu) {
		case 1: Collections.sort(sortList); break; // 가수명 오름차순 --> 이거는 Music클래스에 해봄
		case 2: Collections.sort(sortList, new ArtistDesc()); break; // 가수명 내림차순
		case 3: Collections.sort(sortList, new TitleAsc()); break; // 곡명 오름차순
		case 4: Collections.sort(sortList, new TitleDesc()); break; // 곡명 내림차순
		default: break;
		}
		
		return sortList;
		
	}
	
}
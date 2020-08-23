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
	
	//1. �ű� �� �߰��ϴ� ȭ��
	public void insertMusic(Music m) {
		// ���1.
		// public void insertMusic(String title, String artist) {
		//
		//  	list.add(new Music(title, artist));
		//
		// }
		
		// ���2.
		list.add(m);
	}
	
	// 2. �� ��ü ��ȸ �ϴ� ȭ��
	public ArrayList<Music> selectList() {
		return list;
	}
	
	// 3. �� �˻��ϴ� ȭ��
	/* ���� ����
	public ArrayList<Music> searchMusic(String keyword, int search) {	
		
		ArrayList<Music> searchList = new ArrayList<>();
		
		for(int i=0; i<list.size(); i++) {
			// "������".contains("��"); --> true
			if(keyword.contains(list.get(i).getTitle())) {
				searchList.add(list.get(i));
			}
		}
		
		return searchList;
		// �ݺ����� �� ���� ������ �־ searchList���� �˻��� ���� ������� ��!
		// ��, �˻��� ���� �ϳ��� ������ ��� searchList�� ������� ��!!
	}
	*/
	
	// 3. �� �˻��ϴ� ȭ�� (1 = ����, 2 = ������,  3 = ����+������)
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
				//���1. �׳� �̰� ���°� �� ������
				//if(keyword.contains(list.get(i).getTitle()) ||
				//		keyword.contains(list.get(i).getArtist())) {
				
				//���2.
				//����� �������� �ϳ��� ���ڿ��� ��ģ �� contains�� ���ϴ� ���
				if(list.get(i).getTitle().concat(list.get(i).getArtist()).contains(keyword)) {
				searchList.add(list.get(i));
				}
			}
		}
		
		return searchList;
		// �ݺ����� �� ���� ������ �־ searchList���� �˻��� ���� ������� ��!
		// ��, �˻��� ���� �ϳ��� ������ ��� searchList�� ������� ��!!
	}
	
	// 4. �� ���� �ϴ� ȭ��
	public int removeMusic(String remove) {
		int result = 0;
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getTitle().equals(remove)) {
				list.remove(i);
				result++; // ���Ű� �Ǿ����� , ��� �����Ǿ����� �˷��ֱ� ���� �ۼ���   result == 0 -> ���žȵ�
				i--; // ArrayList�� 0�� �ε����� �������� 1���ε����� 0���ε����� �̵���... 2���ε����� 1�� �ε�����...
				     // �ڵ带 ���̱����ؼ� i--; �����,  list.remove(i--); ���൵ ��
			}
		}
		
		return result; // result�� ��ȯ
	}
	
	// 5. �� ���� �ϴ� ȭ��1
	
	// �����ʹ� �ٸ��� ������ i--; ���� �ʿ���� �����Ǵ°� �ƴϱ� ������ �ε��� ���ڸ��� �ֱ⶧��
	public boolean reviseMusic1(String revise) {
		boolean b = false;
		
		for(int i=0; i<list.size(); i++) {
			if(revise.equals(list.get(i).getTitle())) {				
				b = true;
			}
		}
		return b;
	}
	// 5. �� ���� �ϴ� ȭ��2
	public void reviseMusic2(String revise, String title, String artist) {
		for(int i=0; i<list.size(); i++) {
			if(revise.equals(list.get(i).getTitle())) {
				list.set(i, new Music(title, artist));
			}
		}
	}
	
	public ArrayList<Music> sortMusic(int menu) {
		
		// (1) ���纻 ����Ʈ �����
		ArrayList<Music> sortList = new ArrayList<>();
		sortList.addAll(list);
		//sortList = list; //�̰� �� �ȵɱ�?
		
		switch(menu) {
		case 1: Collections.sort(sortList); break; // ������ �������� --> �̰Ŵ� MusicŬ������ �غ�
		case 2: Collections.sort(sortList, new ArtistDesc()); break; // ������ ��������
		case 3: Collections.sort(sortList, new TitleAsc()); break; // ��� ��������
		case 4: Collections.sort(sortList, new TitleDesc()); break; // ��� ��������
		default: break;
		}
		
		return sortList;
		
	}
	
}
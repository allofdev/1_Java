package com.kh.chap01_list.part02_mvc.model.sort;

import java.util.Comparator;

import com.kh.chap01_list.part02_mvc.model.vo.Music;

// ��� �������� ���ı���
public class TitleAsc implements Comparator<Music>{

	@Override
	public int compare(Music o1, Music o2) {
		// TODO Auto-generated method stub
		
		// o1(��)�� ����� o2(��)�� ����� �� Ŭ��� => �ڸ����� => ����� ��ȯ
		
		return o1.getTitle().compareTo(o2.getTitle());
	}

}

package com.kh.chap01_list.part02_mvc.run;

import com.kh.chap01_list.part02_mvc.view.MusicMenu;

public class Run {

	public static void main(String[] args) {
		
		/*
		MusicMenu m = new MusicMenu();
		m.mainMenu();
		*/
		
		// ȣ�� �ѹ����ϱ�
		new MusicMenu().mainMenu();
		
		
		
	}
}


/* MVC
 * 
 *
 * Model : �����͸� ó���ϴ� ���� ���
 * 
 * View : �����(Ŭ���̾�Ʈ)�� ���ԵǴ� �ð����� ���(ȭ��)
 *        - �Է�(Scanner) �����(print��) 
 * 
 * Controller : ������� ��û�� ó���ϴ� ���
 */
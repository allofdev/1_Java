package com.kh.part02_mvc.run;
import com.kh.part02_mvc.view.*;


// Run : ���α׷� ���ุ �����ִ� ����
//       -> ����ڰ� ���Ե� ù ���� ȭ���� ����� ��
public class Run {

	public static void main(String[] args) {
		
		/* �ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�
		 * * MVC ���� ������
		 * 
		 * Model: ������ ������ ������ ���
		 * View	: ����ڰ� ���Ե� �ð����� ��� ���(ȭ�鰰�� ����)
		 *        ��� �� �Է�
		 * Controller : ����ڰ� ��û�� ��� ó���� ��� (��� �Է� �������!)
		 * �ڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡڡ�
		 * 
		 * 		-Run-						-view- 								-Controller-
		 * 		��û							ȭ��			��û == �޼ҵ�ȣ��			����ڰ�
		 * 									�ð����� ��� 	------------>			��û�� ����
		 * 									�Է� �� ���		<-----------			ó�����ִ� ���
		 *												return ���						
		 *												
		 */	
		
		PersonView pv = new PersonView();
		pv.mainMenu();
		
		
	}
}

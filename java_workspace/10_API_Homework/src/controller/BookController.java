package controller;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.StringTokenizer;

import model.vo.Book;
import java.text.SimpleDateFormat;

public class BookController {
	
	private Book[] list = new Book[5];
	{
		list[0] = new Book("�ڹ��� ����", "���ӽ� ����", "����", new Date(2018-1900, 4-1, 15), 20000);
		list[1] = new Book("�����е� �����Ҳ�����", "������", "KH", new Date(2019-1900, 6-1, 15), 30000);
		list[2] = new Book("API�� ����", "������", "KH", new Date(2017-1900, 2-1, 13), 15000);
		list[3] = new Book("����� ���α׷���", "������", "���е���", new Date(2016-1900, 8-1, 30), 10000);
	}
	
	public BookController() {}
	
	// 1. ���� ��ü ��� ��� �޼ҵ�
	public Book[] printAll() {
		
		Book[] bArr = new Book[list.length];
		
		// list �迭 ��ü ���
		for(int i=0; i<list.length; i++) {
			bArr[i] = list[i];
		}
		
		return bArr;
		
	}
	
	// 2. ���� �߰� ��� �޼ҵ�
	public void insertBook(String newTitle, String newAuthor, String newPublisher, String newDate, String newPrice) {
		
		// 1. �Ű������� ���޹��� newPrice��  ==>      String --> int�� ��ȯ �۾�
		
		//      ���� �ۼ�
		int i = Integer.parseInt(newPrice);
		
		// --------------------------------------------------------
		// 2. �Ű������� ���޹��� newDate��   ==>       String --> Date�� ��ȯ �۾�
		//	  '-'�� �����ڷ� StringTokenizer�� �̿��Ͽ� ���ڿ� �и� �� ���� ��,��,�� �� Date�� ����
	
		//      ���� �ۼ�
		StringTokenizer stn = new StringTokenizer(newDate, "-");
		int year = Integer.parseInt(stn.nextToken());
		int month = Integer.parseInt(stn.nextToken());
		int day = Integer.parseInt(stn.nextToken());
		
		Date d = new Date(year - 1900, month -1, day); 
		
		// ------------------------------------------------------
		// 3. ������ ���޹��� ����� ������ ��ȯ�۾��� ���� price�� date���� ������
		//	  �Ű����� �����ڸ� ���� ������ �� 4�� �ε����� ����
		list[4] = new Book(newTitle, newAuthor, newPublisher, d, i);
		
	
	}
	
	
	// 3. ���� �Ⱓ�� ��� ��� �޼ҵ�
	public String printBookPublishDate() {
		// ������ ������ �Ⱓ�� ���
		// "xxxx�� xx�� xx�� �Ⱓ" �� ���� �������� ���

		// SimpleDateFormat�� �̿��Ͽ� ���
		
		//		���� �ۼ�
		Date d = list[4].getPublishDate();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� �Ⱓ");
		
		String formatDate = sdf.format(d);
		
		//		���� ������
		return formatDate;
		
	}
	
	
	// 4. ���� �˻� ��� �޼ҵ�
	public Book[] searchBook(String searchTitle) {
		
		Book[] b = new Book[list.length];
		int count = 0;
		
		// ���� ����Ʈ�� ��ü������ ��ȸ�ϸ鼭 (for�� �̿�)
		// ���޹��� �˻����� ������!! ������ ��� => contains() �޼ҵ� Ȱ��
		for(int i=0; i<list.length; i++) {
			if(list[i].getTitle().contains(searchTitle)) {
				b[count++] = list[i];
			}
		}
		
		return b;
		
	}
	
}
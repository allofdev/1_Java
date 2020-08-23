package com.kh.part01_objectVSobjectArray.run;
import com.kh.part01_objectVSobjectArray.model.vo.*;
import java.util.Scanner;

// �迭�� �̿��Ͽ� ��ü ��� �ϱ�
// for���� ����� �� �ְ� �Ǿ ��������

public class ObjectArrayTest {

	public static void main(String[] args) {
		
		/*	�⺻���� ��ü ���� ���
		int[] arr = new int[3];
		
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		*/
		
		
		Book[] bk = new Book[3];	//���� Book�� BookŬ������ �ֱ� ������ ����
		bk[0] = new Book();
		bk[1] = new Book("�ڹ��� ����", "ȫ��", 10000, "KH");
		bk[2] = new Book();
		
		// ���
		for(int i=0; i<bk.length; i++) {
			System.out.println(bk[i].information());
		}
		
		// ����ڿ��� �� �Է¹ޱ�
		Scanner sc = new Scanner(System.in);
		
		// 1. ��ü �������� �Է¹ޱ�
		for(int i=0; i<bk.length; i++) {
			
			System.out.println(i + 1 + "��° ���� ���� �Է�");
			
			System.out.print("���� : ");
			String title = sc.nextLine();
			
			System.out.print("���� : ");
			String author = sc.nextLine();
			
			System.out.print("���� : ");
			int price = sc.nextInt();
			
			sc.nextLine();
			
			System.out.print("���ǻ� : ");
			String publisher = sc.nextLine();
			
			// ����ó�� �ʿ���� �ش� �ε��� ���� ��ü �����ǵ���
			bk[i] = new Book(title, author, price, publisher);
			
		}
		
		// 2. ��ü �������� ����ϱ�
		for(int i=0; i<bk.length; i++) {
			System.out.println(bk[i].information());
		}
		
		// 3. ���� ���� �˻��ϱ�
		System.out.print("�˻��� å ���� : ");
		String search = sc.nextLine();
		
		for(int i=0; i<bk.length; i++) {
			if(bk[i].getTitle().equals(search)) {
				System.out.println(bk[i].information());
			}	
		}
		
		
	}
}
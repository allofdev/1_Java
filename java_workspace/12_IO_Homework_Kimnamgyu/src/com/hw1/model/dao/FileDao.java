package com.hw1.model.dao;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.time.format.TextStyle;
import java.io.BufferedWriter;

public class FileDao {

	// �ʵ�
	// default (~)
	Scanner sc = new Scanner(System.in);
	
	// �⺻������
	public FileDao() {}
	
	// ������Ʈ --> ���� (���)
	public void fileSave() {
		
	StringBuilder sb = new StringBuilder();	
	
		while(true) {
			
			System.out.print("���Ͽ� ������ ������ �ݺ��ؼ� �Է��Ͻÿ�(\"exit\"�� �Է��ϸ� ���� �Է� ��) : ");
			String str = sc.nextLine();
			
			if(str.equals("exit")) {
				break;
			}
			
			System.out.print("�����Ͻðڽ��ϱ�? (y/n) : ");
			char ch = sc.nextLine().toUpperCase().charAt(0);
			if(ch=='Y') {
				try(BufferedWriter bw = new BufferedWriter(new FileWriter("test.txt", true))) {
																	// true�Է½� �������뿡 �̾ ����
					bw.write(str);						
					System.out.println("�Է¹��� test.txt ���Ͽ� ���������� �����Ͽ����ϴ�.");
					
				} catch (IOException e) {
					e.printStackTrace();
				}
				
			}else if(ch=='N') {
				System.out.println("������ ����մϴ�.");
			}else {
				System.out.println("�߸��Է��Ͽ����ϴ�.");
			}
			
		}
		
	}
	
	// ������Ʈ <-- ���� (�Է�)
	public void fileOpen() {
		System.out.println("Test.txt");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void fileEdit() {
		
	}
	
	
	
}
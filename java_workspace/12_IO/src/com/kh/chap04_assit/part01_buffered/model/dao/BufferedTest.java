package com.kh.chap04_assit.part01_buffered.model.dao;

import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class BufferedTest {

	// ���α׷� --> ����  (���)
	public void fileSave() {
		
		// 1. ��ݽ�Ʈ�� ���� ����(� "�ܺθ�ü"�� �����͸� �ְ���� ������ �������ִ� ��� ��Ʈ�� ��ü�� ��������!!!)
		//FileWriter fw = new FileWriter("c_buffer.dat");
		
		
		// 2. ������Ʈ�� ��ü ����(�ݵ��! �ش� ��ݽ�Ʈ�� ��ü�� ����ä�� ����)
		//BufferedWriter bw = new BufferedWriter(fw);
		
		// ���� ������ ���ٷ� �ٿ�����!
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("c_buffer.dat"/*, true*/))){
																// true�Է½� �������뿡 �̾ ����
			// ������ ��� : write()
			bw.write("�ȳ��ϼ���\n");
			bw.write("�ݰ����ϴ�.");
			// ���۶�� ������ ��� �״ٰ� �ѹ��� ��� ��Ŵ --> �ӵ� ��� ����.
			
			bw.newLine(); // ��ݽ�Ʈ������ �������� �ʴ� �޼ҵ嵵 ���� --> newLine()�� ������Ʈ���� �޼ҵ� (newLine() : ����)
			bw.write("����������.");
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// ���α׷� <-- ���� (�Է�)
	public void fileRead() {
		
		// BufferedReader ��ü ����
		try(BufferedReader br = new BufferedReader(new FileReader("c_buffer.dat"))){
			
			/*
			System.out.println(br.readLine()); // �� �ٴ����� ���ڿ��� �о����
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			*/
			// readeLine()�� ������ ���� ������ ���� null�� ��ȯ
			
			String value = null;
			while((value = br.readLine()) != null) {
				System.out.println(value);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
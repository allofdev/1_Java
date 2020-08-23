package com.kh.chap03_char.model.dao;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileCharTest {

	// ���α׷� --> ����(��� : ���α׷��� �����͸� ���Ϸ� �������ڴ�.)
	public void fileSave() {
		
		// FileWriter : ���Ϸ� �����͸� 2����Ʈ ������ ����ϱ�
		
		/*
		// FileWriter ��ü ����
		FileWriter fw = null; // ���α׷����� �����ʹ� .dat�� �����         .txt�� ���
		try {
			fw = new FileWriter("b_char.dat");
			
			// 2. ��η� ������ ��� : write() �޼ҵ� �̿�
			fw.write('A');
			fw.write(' '); // ���鵵 ��°���
			fw.write("��!IO ��մ�..."); // ���ڿ��� ��°��� - �� ���ھ� ���޵�
			fw.write('\n'); // ���൵ ����
			
			// char[] �迭 ���۰���
			char[] cArr = {'a', 'p', 'p', 'l', 'e'};
			fw.write(cArr);
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				// 3. �� �� �ڿ� �ݳ�
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		*/
		
		
		
		
		//�׽�Ʈ2 - try����ϸ� �ڵ����� close()��*****************************************************************
		// �ش� ��Ʈ�� �� �� �� �ڵ����� close() ���� �ڵ����� ���ִ� ����
		// try with resource ���� - (����7���� ����)
		/*
		 * try(��Ʈ�� ��ü �����ϴ� ����) {
		 * 
		 * }catch(����Ŭ������ e) {
		 * 
		 * }
		 */
		try(FileWriter fw = new FileWriter("b_char.dat")) {  // �ٸ� ��ü�� �߰��Ϸ��� �����ݷ�(;) ���
			
			// 2. ��η� ������ ��� : write() �޼ҵ� �̿�
			fw.write('A');
			fw.write(' '); // ���鵵 ��°���
			fw.write("��!IO ��մ�..."); // ���ڿ��� ��°��� - �� ���ھ� ���޵�
			fw.write('\n'); // ���൵ ����
			
			// char[] �迭 ���۰���
			char[] cArr = {'a', 'p', 'p', 'l', 'e'};
			fw.write(cArr);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	// ���α׷� <-- ���� (�Է� : ���Ϸκ��� ���α׷����� ������ ��������)
	public void fileRead() {
		
		// FileReader : ���Ϸκ��� �����͸� 2����Ʈ ������ �Է¹ޱ�
		
		// 1.FileReader ��ü ����
		try(FileReader fr = new FileReader("b_char.dat")){
			
			// 2. ��θ� ���ؼ� ������ �Է¹޾ƿ��� : read() �޼ҵ�
			
			/*
			System.out.println(fr.read());
			System.out.println(fr.read());
			System.out.println(fr.read());
			System.out.println(fr.read());
			System.out.println(fr.read());
			*/
			// byte�� ���������� ������ ���� ������ -1�� ��ȯ
			
			int value = 0;
			while((value = fr.read()) != -1) {
				System.out.print((char)value);
			}
			
		} /*catch (FileNotFoundException e) {     //IOException�� �θ� Ŭ�����̱� ������ FileNotFoundException�� ������ ��
			e.printStackTrace();
		} */catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
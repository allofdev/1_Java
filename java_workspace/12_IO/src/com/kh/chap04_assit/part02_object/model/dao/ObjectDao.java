package com.kh.chap04_assit.part02_object.model.dao;

import com.kh.chap04_assit.part02_object.model.vo.Phone;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.FileInputStream;

public class ObjectDao {
	
	// ���α׷� --> ���� (���)
	public void fileSave() {
		
		// ���Ͽ� ����� Phone ��ü ����
		Phone ph = new Phone("������", "�Ｚ", 1500000);

		// ��ü ��ü�� ���Ͽ� ����� �� ���Ǵ� ��Ʈ��
		// ObjectOutputStream : ��ü ������ ��� ������ �޼ҵ� �������ִ� ������Ʈ��
		// FileOutputStream : ���Ͽ� ��½� ���Ǵ� ��� ��Ʈ��
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Phone.dat"))){
			
			// ��ü ��ü�� ��½� writeObject() �޼ҵ� �̿�
			oos.writeObject(ph); // �ش� ����� ��ü Ŭ������ ����ȭ ���� ����ߵ�!!! -> PhoneŬ����(implements Serializable)
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	// ���α׷� <-- ���� (�Է�)
	public void fileRead() {
		
		// ���Ͽ� ��ϵ� ��ü ������ �Է¹ޱ� ���� ��Ʈ�� Ŭ����
		
		// ObjectInputStream : ��ü ������ �о���̱� ���� �ʿ��� ������Ʈ�� Ŭ����
		// FileInputStream   : ���Ͽ� ��ϵ� �����͸� �Է¹ޱ� ���� ��ݽ�Ʈ�� Ŭ����
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Phone.dat"))){
			
			// ��ü ������ ������ �о���� �� : readObject() �޼ҵ� �̿�
			Phone ph = (Phone)ois.readObject();
			System.out.println(ph);
					
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

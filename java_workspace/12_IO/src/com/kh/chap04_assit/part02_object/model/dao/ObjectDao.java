package com.kh.chap04_assit.part02_object.model.dao;

import com.kh.chap04_assit.part02_object.model.vo.Phone;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.FileInputStream;

public class ObjectDao {
	
	// 프로그램 --> 파일 (출력)
	public void fileSave() {
		
		// 파일에 기록할 Phone 객체 생성
		Phone ph = new Phone("갤럭시", "삼성", 1500000);

		// 객체 자체를 파일에 출력할 때 사용되는 스트림
		// ObjectOutputStream : 객체 단위로 출력 가능한 메소드 제공해주는 보조스트림
		// FileOutputStream : 파일에 출력시 사용되는 기반 스트림
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Phone.dat"))){
			
			// 객체 자체를 출력시 writeObject() 메소드 이용
			oos.writeObject(ph); // 해당 출력할 객체 클래스에 직렬화 선언도 해줘야됨!!! -> Phone클래스(implements Serializable)
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	// 프로그램 <-- 파일 (입력)
	public void fileRead() {
		
		// 파일에 기록된 객체 단위를 입력받기 위한 스트림 클래스
		
		// ObjectInputStream : 객체 단위로 읽어들이기 위해 필요한 보조스트림 클래스
		// FileInputStream   : 파일에 기록된 데이터를 입력받기 위한 기반스트림 클래스
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Phone.dat"))){
			
			// 객체 단위로 데이터 읽어들일 때 : readObject() 메소드 이용
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

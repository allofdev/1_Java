package com.hw1.model.dao;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.time.format.TextStyle;
import java.io.BufferedWriter;

public class FileDao {

	// 필드
	// default (~)
	Scanner sc = new Scanner(System.in);
	
	// 기본생성자
	public FileDao() {}
	
	// 프로젝트 --> 파일 (출력)
	public void fileSave() {
		
	StringBuilder sb = new StringBuilder();	
	
		while(true) {
			
			System.out.print("파일에 저장할 내용을 반복해서 입력하시오(\"exit\"을 입력하면 내용 입력 끝) : ");
			String str = sc.nextLine();
			
			if(str.equals("exit")) {
				break;
			}
			
			System.out.print("저장하시겠습니까? (y/n) : ");
			char ch = sc.nextLine().toUpperCase().charAt(0);
			if(ch=='Y') {
				try(BufferedWriter bw = new BufferedWriter(new FileWriter("test.txt", true))) {
																	// true입력시 기존내용에 이어서 쓰기
					bw.write(str);						
					System.out.println("입력받은 test.txt 파일에 성공적으로 저장하였습니다.");
					
				} catch (IOException e) {
					e.printStackTrace();
				}
				
			}else if(ch=='N') {
				System.out.println("저장을 취소합니다.");
			}else {
				System.out.println("잘못입력하였습니다.");
			}
			
		}
		
	}
	
	// 프로젝트 <-- 파일 (입력)
	public void fileOpen() {
		System.out.println("Test.txt");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void fileEdit() {
		
	}
	
	
	
}

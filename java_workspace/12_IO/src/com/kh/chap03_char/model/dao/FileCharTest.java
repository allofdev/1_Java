package com.kh.chap03_char.model.dao;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileCharTest {

	// 프로그램 --> 파일(출력 : 프로그램상 데이터를 파일로 내보내겠다.)
	public void fileSave() {
		
		// FileWriter : 파일로 데이터를 2바이트 단위로 출력하기
		
		/*
		// FileWriter 객체 생성
		FileWriter fw = null; // 프로그램상의 데이터는 .dat에 기술함         .txt와 비슷
		try {
			fw = new FileWriter("b_char.dat");
			
			// 2. 통로로 데이터 출력 : write() 메소드 이용
			fw.write('A');
			fw.write(' '); // 공백도 출력가능
			fw.write("와!IO 재밌다..."); // 문자열도 출력가능 - 한 문자씩 전달됨
			fw.write('\n'); // 개행도 가능
			
			// char[] 배열 전송가능
			char[] cArr = {'a', 'p', 'p', 'l', 'e'};
			fw.write(cArr);
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				// 3. 다 쓴 자원 반납
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		*/
		
		
		
		
		//테스트2 - try사용하면 자동으로 close()됨*****************************************************************
		// 해당 스트림 다 쓴 후 자동으로 close() 까지 자동으로 해주는 구문
		// try with resource 구문 - (버전7부터 제공)
		/*
		 * try(스트림 객체 생성하는 구문) {
		 * 
		 * }catch(예외클래스명 e) {
		 * 
		 * }
		 */
		try(FileWriter fw = new FileWriter("b_char.dat")) {  // 다른 객체를 추가하려면 세미콜론(;) 기술
			
			// 2. 통로로 데이터 출력 : write() 메소드 이용
			fw.write('A');
			fw.write(' '); // 공백도 출력가능
			fw.write("와!IO 재밌다..."); // 문자열도 출력가능 - 한 문자씩 전달됨
			fw.write('\n'); // 개행도 가능
			
			// char[] 배열 전송가능
			char[] cArr = {'a', 'p', 'p', 'l', 'e'};
			fw.write(cArr);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	// 프로그램 <-- 파일 (입력 : 파일로부터 프로그램으로 데이터 가져오기)
	public void fileRead() {
		
		// FileReader : 파일로부터 데이터를 2바이트 단위로 입력받기
		
		// 1.FileReader 객체 생성
		try(FileReader fr = new FileReader("b_char.dat")){
			
			// 2. 통로를 통해서 데이터 입력받아오기 : read() 메소드
			
			/*
			System.out.println(fr.read());
			System.out.println(fr.read());
			System.out.println(fr.read());
			System.out.println(fr.read());
			System.out.println(fr.read());
			*/
			// byte와 마찬가지로 파일의 끝을 만나면 -1을 반환
			
			int value = 0;
			while((value = fr.read()) != -1) {
				System.out.print((char)value);
			}
			
		} /*catch (FileNotFoundException e) {     //IOException이 부모 클래스이기 때문에 FileNotFoundException은 지워도 됨
			e.printStackTrace();
		} */catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
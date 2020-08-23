package com.method.hw1.run;
import java.util.Scanner;
import com.method.hw1.controller.*;

public class Run {

	public static void main(String[] args) {
		NonStaticSample nss = new NonStaticSample();
		
		// 메소드1
		nss.printLottoNumbers();
		System.out.println("==============================");
		
		// 메소드2
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자 입력 : ");
		char ch = sc.nextLine().charAt(0);
		
		System.out.print("갯수 입력 : ");
		int num = sc.nextInt();
		
		nss.outputChar(num, ch);
		System.out.println("==============================");
		
		// 메소드3
		System.out.println(nss.alphabette());
		System.out.println("==============================");	
		
		// 메소드4
		String Str = sc.nextLine();
		int index1 = sc.nextInt();
		int index2 = sc.nextInt();
		
		
		System.out.println(nss.mySubstring(Str, index1, index2));
		
		
		
		
	}
}

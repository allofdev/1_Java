package com.method.hw1.run;
import java.util.Scanner;
import com.method.hw1.controller.*;

public class Run {

	public static void main(String[] args) {
		NonStaticSample nss = new NonStaticSample();
		
		// �޼ҵ�1
		nss.printLottoNumbers();
		System.out.println("==============================");
		
		// �޼ҵ�2
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		char ch = sc.nextLine().charAt(0);
		
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		
		nss.outputChar(num, ch);
		System.out.println("==============================");
		
		// �޼ҵ�3
		System.out.println(nss.alphabette());
		System.out.println("==============================");	
		
		// �޼ҵ�4
		String Str = sc.nextLine();
		int index1 = sc.nextInt();
		int index2 = sc.nextInt();
		
		
		System.out.println(nss.mySubstring(Str, index1, index2));
		
		
		
		
	}
}

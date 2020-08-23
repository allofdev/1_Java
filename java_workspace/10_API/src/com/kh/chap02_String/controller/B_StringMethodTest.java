package com.kh.chap02_String.controller;

public class B_StringMethodTest {

	public void method() {
		
		String str1 = "Hell World";
		
		// 메소드명(매개변수) : 반환형
		
		// 1. 문자열.charAt(int index) : char
		//    문자열에서 전달받은 index 위치의 문자만을 추출해서 리턴
		char ch = str1.charAt(3);
		System.out.println("ch : " + ch);
		
		// 2. 문자열.concat(String str) : String
		//    문자열과 전달된 또다른 문자열을 하나로 합쳐서 새로운 문자열로 리턴
		String str2 = str1.concat("!!!");
		System.out.println("str2 : " + str2);
		
		String str3 = str1 + "!!!";
		System.out.println("str3 : " + str3);
		
		// 3. 문자열.toString() : String     -->  문자열.toString()은 안해도 됨
		System.out.println("str1 : " + str1/*.toString()*/);
		
		// 4. 문자열.equals(Object obj) : boolean
		System.out.println(str1.equals(str2));
		System.out.println(str2.equals(str3));
		
		// 5. 문자열.hashCode() : int
		System.out.println("str1의 해시코드 : " + str1.hashCode());
		System.out.println("str2의 해시코드 : " + str2.hashCode());
		System.out.println("str3의 해시코드 : " + str3.hashCode());
		
		// 6. 문자열.length() : int
		System.out.println(str1.length());
		
		// 7. 문자열.substring(int beginIndex) : String
		//    -> 문자열의 beginIndex 위치에서부터 끝까지 문자열을 추출해서 리턴
		//    문자열.substring(int beginIndex, int endIndex)		: String
		//    -> 문자열의 beginIndex 위치에서부터 endIndex-1 위치까지의 문자열을 추출해서 리턴
		System.out.println(str1.substring(1));
		System.out.println(str1.substring(0, 6)); // begin <=	< end
		
		// 8. 문자열.replace(char old, char new) : String
		//    문자열에서의 old 문자를 new 문자로 변환한 문자열 리턴
		//    
		String str4 = str1.replace('l', 'c');
		System.out.println("str4 : " + str4);
		
		// 9. 문자열.toUpperCase()	/	toLowerCase()
		//    문자열을 모두 대문자로 변경하거나 모두 소문자로 변경한 문자열 리턴
		String str5 = str1.toUpperCase();
		System.out.println("str5 : " + str5);
		System.out.println("lower : " + str5.toLowerCase());
		
		/*
		System.out.print("계속 하시겠습니까? (y/n) : ");
		char ch = sc.nextLine().toUpperCase().charAt(0); // 'Y'/'N'
					// 메소드 연이어서 호출 == 메소드 체이닝
						
		if(ch == 'Y') {
		}
		*/
		
		// 10. 문자열.trim() : String
		//     문자열의 앞 뒤 공백을 제거한 문자열 리턴 -- 사이X
		String str6 = "   JA VA   ";
		System.out.println("trim : " + str6.trim());
		
		// 11. 문자열.toCharArray() : char[]
		//     문자열의 각 문자들을 문자배열에 옮겨 담아 해당 배열의 주소값 리턴
		//     String --> char[]
		String str7 = "Hello";
		char[] arr = str7.toCharArray();
		for(char c : arr) {
			System.out.print(c + " ");
		}
		
		// 12.(11번과 반대) static valueOf(char[] data) : String
		//               char[] --> String
		System.out.println("\n" + String.valueOf(arr));
		
		
		
	}
}

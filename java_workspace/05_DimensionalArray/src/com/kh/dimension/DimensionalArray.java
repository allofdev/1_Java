package com.kh.dimension;
import java.util.Scanner;
import java.util.Arrays;

public class DimensionalArray {
	
	// 이차원 배열 : 일차원배열 여러개를 하나로  묶은 것이 2차원 배열
	
	public void method1() {
		
		// *****
		// *****
		// *****
		
		// 행 3번 반복			=> 바깥쪽 for문
		// 각 행별로 열 5번씩 반복    => 안쪽 for문
		
		for(int i=0; i<3; i++) {	// 0에서부터 2까지 1씩 증가하는 동안 반복 (총 3회)
			for(int j=0; j<5; j++) {	// 0에서부터 4까지 1씩 증가하는 동안 반복 (총 5회)
				System.out.print('*');
			}
			System.out.println();
		}
		
		/*
		 * 1. 이차원 배열 선언
		 *    자료형  배열명[][];
		 *    자료형[] 배열명[];
		 *    자료형[][] 배열명;
		 */
		int arr1[][];
		int[] arr2[];
		int[][] arr3;
		
		/*
		 * 2. 이차원 배열 할당(크기 지정)
		 * 
		 * 배열명 = new 자료형[행크기][열크기]
		 */
		//arr3 = new int[3][5];
		
		// 이차원배열 선언과 동시에 할당(크기지정)
		int[][] arr = new int[3][5];
		
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		System.out.println(arr[0][0]);
		System.out.println(arr[0][1]);
		
		// 행의 길이
		System.out.println("행의 길이 : " + arr.length);
		
		// 열의 길이
		System.out.println("0행의 열의 길이 : " + arr[0].length);
		System.out.println("1행의 열의 길이 : " + arr[1].length);
		System.out.println("2행의 열의 길이 : " + arr[2].length);
	
	
		// 행 : 바깥쪽 for문 (0~2) (0~행의길이-1)
		// 열 : 안쪽 for문 (0~4) (0~각행별 열의길이-1)
		
		// 행의 인덱스를 지정하는 바깥쪽 for문(i)
		for(int i=0; i<arr.length; i++) {
			// 열의 인덱스를 지정하는 안쪽 for문(j)
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public void method2() {
		
		int[][] arr = new int[3][5];
		
		// 1  2  3  4  5
		// 6  7  8  9  10
		// 11 12 13 14 15
		
		
		/*
		 * arr[0][0] = 1;
		 * arr[0][1] = 2;
		 * arr[0][2] = 3;
		 * arr[0][3] = 4;
		 * arr[1][0] = 5;
		 * 
		 * arr[1][0] = 6;
		 * arr[1][1] = 7;
		 * ...
		 * arr[1][4] = 10;
		 * 
		 * arr[2][0] = 11;
		 * arr[2][1] = 12;
		 * ...
		 * arr[2][4] = 15;
		 * 
		 */
		
		// 입력
		int value = 1;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = value++;
			}
		}
		
		// 출력
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				
				//System.out.print(arr[i][j] + " ");
				System.out.printf("%2d ", arr[i][j]);	
				// 2가의미하는 것은 2칸 공간확보(양수이기 때문에 숫자가 오른쪽에 붙음(-2면 왼쪽에 붙음))
			}
			System.out.println();
		}
		
	}
	
	public void method3() {
		
		//int[] arr = {1, 2, 3, 4, 5};
		
		// 이차원 배열 할당과 동시에 값 대입
		int[][] arr = {{1, 2, 3, 4, 5},
					   {6, 7, 8, 9, 10},
					   {11, 12, 13, 14, 15}};
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.printf("%-2d ", arr[i][j]);
				// 2가의미하는 것은 2칸 공간확보(음수이기 때문에 숫자가 왼쪽에 붙음)
			}
			System.out.println();
		}
	}
	
	public void method4() {
		// 가변 배열
		// 행은 정해졌으나 각 행별 열의 갯수가 정해지지 않은 상태
		
		int[][] arr = new int[3][]; // 가변 배열 할당
		
		// 0행은 2열
		arr[0] = new int[2];
		// 1행은 1열
		arr[1] = new int[1];
		// 2행은 3열
		arr[2] = new int[3];
		
		// 1 2
		// 3
		// 4 5 6
		
		/*
		 * arr[0][0] = 1;
		 * arr[0][1] = 2;
		 * 
		 * arr[1][0] = 3;
		 * 
		 * arr[2][0] = 4;
		 * arr[2][1] = 5;
		 * arr[2][2] = 6;
		 */
		
		// 행의 인덱스를 지정하는 바깥쪽 for문(0~2)
		// 열의 인덱스를 지정하는 안쪽 for문(0~1|0|2)
		int value = 1;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = value++;
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.printf("%-2d ", arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public void method5() {
		// 가변배열의 할당과 동시에 값 대입
		int[][] arr = {{1, 2}, {3, 4, 5, 6}, {7, 8, 9}};
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.printf("%-2d ", arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public void method6() {
		
		Scanner sc = new Scanner(System.in);
		
		double[][] arr = new double[2][4];
		
		// 행을 지정하는 for문(i==0 : 국어점수 기록 / i==1 : 영어점수 기록) 
		for(int i=0; i<arr.length; i++) {
			
			// 열을 지정하는 for문
			for(int j=0; j<arr[i].length-1; j++) {	// 마지막 열은 점수의 합계이기 때문에 접근할 필요없어 -1을 해줌
				
				if(i == 0) {
				System.out.print("국어점수 : ");
				} else {
				System.out.print("영어점수 : ");
				}

				arr[i][j] = sc.nextDouble();
				
				arr[i][3] += arr[i][j];	// 해당행의 열들의 값을 마지막 열(3열)에 저장하는 코드
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.printf("%.1f ", arr[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("국어점수 평균 : " + arr[0][3] / 3);
		System.out.println("영어점수 평균 : " + arr[1][3] / 3);
	}
	
	public void method7() {
		
		// 3행 3열 int이차원배열 생성 한 후
		// 각 공간에 1~10사이의 랜덤값 발생 후 기록
		
		int[][] arr = new int[3][3];
		
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				// 입력
				int random = (int)(Math.random() * 10 + 1);
				arr[i][j] = random;
				
				// 출력
				System.out.printf("%d ", arr[i][j]);	
			}
			System.out.println();
		}
	}
	
	public void method8() {
		
		// 3행 3열에 1~10사이에 랜덤값 담기(단, 중복값없이 담기)
		
		// 1. 크기 9짜리인 일차원 배열 만든 후 중복값없이 담은 후
		int[] temp = new int[9];
		
		for(int i=0; i<temp.length; i++) {
			
			temp[i] = (int)(Math.random() * 10 + 1);
			
			// 기존에 담겨있었던 값들이랑 비교하는 for문
			for(int j=0; j<i; j++) {
				if(temp[i] == temp[j]) {	// 중복값이 존재할 경우
					i--;
					break;
				}
			}
			
		}
		
		System.out.println(Arrays.toString(temp));
		
		// 2. 이차원 배열에 옮겨담기
		int[][] arr = new int[3][3];
		
		/*
		 * arr[0][0] = temp[0];
		 * arr[0][1] = temp[1];
		 * arr[0][2] = temp[2];
		 * 
		 * arr[1][0] = temp[4];
		 * arr[1][1] = temp[5];
		 * arr[1][2] = temp[6];
		 * 
		 * arr[2][0] = temp[7];
		 * arr[2][1] = temp[8];
		 * arr[2][2] = temp[9];
		 */
		
		int index = 0;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
					arr[i][j] = temp[index++];
					System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public void bingo() {
		
		Scanner sc = new Scanner(System.in);
		
		// 5행 5열 짜리 빙고판 만들기
		// 5행 5열 짜리에 1~25사이의 랜덤값 중복값 없이 담아내기
		int[] temp = new int[25];
		
		for(int i=0; i<temp.length; i++) {
			
			temp[i] = (int)(Math.random() * 25 + 1);
			
			for(int j=0; j<i; j++) {
				
				if(temp[i] == temp[j]) {
					i--;
					break;
				}
			}
		}
		
		//System.out.println(Arrays.toString(temp)); 	일차원배열에 중복없이 잘 담겨있는지 확인함
		
		int[][] bingo = new int[5][5];
		
		int index = 0;
		
		for(int i=0; i<bingo.length; i++) {
			
			for(int j=0; j<bingo[i].length; j++) {
				
				bingo[i][j] = temp[index++];
			}
		}
		
		// 나만의 빙고판 완성!
		//-----------------------------------------------
		// 내 랜덤 빙고판 출력!
		
		for(int i=0; i<bingo.length; i++) {
			
			for(int j=0; j<bingo[i].length; j++) {
				System.out.printf("%4d ", bingo[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("\n========== 빙고게임 시작 ==========");
		
		int count = 0;
		
		while(true) {
			
			System.out.print("\n정수 입력 : ");
			int num = sc.nextInt();
			sc.nextLine();
			count++;
			
			// 사용자가 입력한 정수값 찾아서 색칠한것처럼
			for(int i=0; i<bingo.length; i++) {
				for(int j=0; j<bingo[i].length; j++) {
					if(bingo[i][j] == num) {	
						bingo[i][j] = 0;
					}
					System.out.printf("%4d ", bingo[i][j]);
				}
				System.out.println();
			}
			System.out.print("게임을 끝내시겠습니까? (y/n) : ");
			char ch = sc.nextLine().charAt(0);
			
			if(ch == 'y' || ch == 'Y') {
				break;
			}
		}	
		System.out.println(count + "번 입력했습니다.");
	}
}
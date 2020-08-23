package com.kh.dimension;
import java.util.Scanner;
import java.util.Arrays;

public class DimensionalArray {
	
	// ������ �迭 : �������迭 �������� �ϳ���  ���� ���� 2���� �迭
	
	public void method1() {
		
		// *****
		// *****
		// *****
		
		// �� 3�� �ݺ�			=> �ٱ��� for��
		// �� �ະ�� �� 5���� �ݺ�    => ���� for��
		
		for(int i=0; i<3; i++) {	// 0�������� 2���� 1�� �����ϴ� ���� �ݺ� (�� 3ȸ)
			for(int j=0; j<5; j++) {	// 0�������� 4���� 1�� �����ϴ� ���� �ݺ� (�� 5ȸ)
				System.out.print('*');
			}
			System.out.println();
		}
		
		/*
		 * 1. ������ �迭 ����
		 *    �ڷ���  �迭��[][];
		 *    �ڷ���[] �迭��[];
		 *    �ڷ���[][] �迭��;
		 */
		int arr1[][];
		int[] arr2[];
		int[][] arr3;
		
		/*
		 * 2. ������ �迭 �Ҵ�(ũ�� ����)
		 * 
		 * �迭�� = new �ڷ���[��ũ��][��ũ��]
		 */
		//arr3 = new int[3][5];
		
		// �������迭 ����� ���ÿ� �Ҵ�(ũ������)
		int[][] arr = new int[3][5];
		
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		System.out.println(arr[0][0]);
		System.out.println(arr[0][1]);
		
		// ���� ����
		System.out.println("���� ���� : " + arr.length);
		
		// ���� ����
		System.out.println("0���� ���� ���� : " + arr[0].length);
		System.out.println("1���� ���� ���� : " + arr[1].length);
		System.out.println("2���� ���� ���� : " + arr[2].length);
	
	
		// �� : �ٱ��� for�� (0~2) (0~���Ǳ���-1)
		// �� : ���� for�� (0~4) (0~���ະ ���Ǳ���-1)
		
		// ���� �ε����� �����ϴ� �ٱ��� for��(i)
		for(int i=0; i<arr.length; i++) {
			// ���� �ε����� �����ϴ� ���� for��(j)
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
		
		// �Է�
		int value = 1;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = value++;
			}
		}
		
		// ���
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				
				//System.out.print(arr[i][j] + " ");
				System.out.printf("%2d ", arr[i][j]);	
				// 2���ǹ��ϴ� ���� 2ĭ ����Ȯ��(����̱� ������ ���ڰ� �����ʿ� ����(-2�� ���ʿ� ����))
			}
			System.out.println();
		}
		
	}
	
	public void method3() {
		
		//int[] arr = {1, 2, 3, 4, 5};
		
		// ������ �迭 �Ҵ�� ���ÿ� �� ����
		int[][] arr = {{1, 2, 3, 4, 5},
					   {6, 7, 8, 9, 10},
					   {11, 12, 13, 14, 15}};
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.printf("%-2d ", arr[i][j]);
				// 2���ǹ��ϴ� ���� 2ĭ ����Ȯ��(�����̱� ������ ���ڰ� ���ʿ� ����)
			}
			System.out.println();
		}
	}
	
	public void method4() {
		// ���� �迭
		// ���� ���������� �� �ະ ���� ������ �������� ���� ����
		
		int[][] arr = new int[3][]; // ���� �迭 �Ҵ�
		
		// 0���� 2��
		arr[0] = new int[2];
		// 1���� 1��
		arr[1] = new int[1];
		// 2���� 3��
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
		
		// ���� �ε����� �����ϴ� �ٱ��� for��(0~2)
		// ���� �ε����� �����ϴ� ���� for��(0~1|0|2)
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
		// �����迭�� �Ҵ�� ���ÿ� �� ����
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
		
		// ���� �����ϴ� for��(i==0 : �������� ��� / i==1 : �������� ���) 
		for(int i=0; i<arr.length; i++) {
			
			// ���� �����ϴ� for��
			for(int j=0; j<arr[i].length-1; j++) {	// ������ ���� ������ �հ��̱� ������ ������ �ʿ���� -1�� ����
				
				if(i == 0) {
				System.out.print("�������� : ");
				} else {
				System.out.print("�������� : ");
				}

				arr[i][j] = sc.nextDouble();
				
				arr[i][3] += arr[i][j];	// �ش����� ������ ���� ������ ��(3��)�� �����ϴ� �ڵ�
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.printf("%.1f ", arr[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("�������� ��� : " + arr[0][3] / 3);
		System.out.println("�������� ��� : " + arr[1][3] / 3);
	}
	
	public void method7() {
		
		// 3�� 3�� int�������迭 ���� �� ��
		// �� ������ 1~10������ ������ �߻� �� ���
		
		int[][] arr = new int[3][3];
		
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				// �Է�
				int random = (int)(Math.random() * 10 + 1);
				arr[i][j] = random;
				
				// ���
				System.out.printf("%d ", arr[i][j]);	
			}
			System.out.println();
		}
	}
	
	public void method8() {
		
		// 3�� 3���� 1~10���̿� ������ ���(��, �ߺ������� ���)
		
		// 1. ũ�� 9¥���� ������ �迭 ���� �� �ߺ������� ���� ��
		int[] temp = new int[9];
		
		for(int i=0; i<temp.length; i++) {
			
			temp[i] = (int)(Math.random() * 10 + 1);
			
			// ������ ����־��� �����̶� ���ϴ� for��
			for(int j=0; j<i; j++) {
				if(temp[i] == temp[j]) {	// �ߺ����� ������ ���
					i--;
					break;
				}
			}
			
		}
		
		System.out.println(Arrays.toString(temp));
		
		// 2. ������ �迭�� �Űܴ��
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
		
		// 5�� 5�� ¥�� ������ �����
		// 5�� 5�� ¥���� 1~25������ ������ �ߺ��� ���� ��Ƴ���
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
		
		//System.out.println(Arrays.toString(temp)); 	�������迭�� �ߺ����� �� ����ִ��� Ȯ����
		
		int[][] bingo = new int[5][5];
		
		int index = 0;
		
		for(int i=0; i<bingo.length; i++) {
			
			for(int j=0; j<bingo[i].length; j++) {
				
				bingo[i][j] = temp[index++];
			}
		}
		
		// ������ ������ �ϼ�!
		//-----------------------------------------------
		// �� ���� ������ ���!
		
		for(int i=0; i<bingo.length; i++) {
			
			for(int j=0; j<bingo[i].length; j++) {
				System.out.printf("%4d ", bingo[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("\n========== �������� ���� ==========");
		
		int count = 0;
		
		while(true) {
			
			System.out.print("\n���� �Է� : ");
			int num = sc.nextInt();
			sc.nextLine();
			count++;
			
			// ����ڰ� �Է��� ������ ã�Ƽ� ��ĥ�Ѱ�ó��
			for(int i=0; i<bingo.length; i++) {
				for(int j=0; j<bingo[i].length; j++) {
					if(bingo[i][j] == num) {	
						bingo[i][j] = 0;
					}
					System.out.printf("%4d ", bingo[i][j]);
				}
				System.out.println();
			}
			System.out.print("������ �����ðڽ��ϱ�? (y/n) : ");
			char ch = sc.nextLine().charAt(0);
			
			if(ch == 'y' || ch == 'Y') {
				break;
			}
		}	
		System.out.println(count + "�� �Է��߽��ϴ�.");
	}
}
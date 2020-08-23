package com.kh.part01_objectVSobjectArray.run;
import com.kh.part01_objectVSobjectArray.model.vo.Product;

public class ProductRun {
	
	public static void main(String[] args) {
		
		Product[] arr = new Product[3];
		
		// �� �ε����� ��ü �����ϱ⵵ ���� getter/setter ����Ұ�
		// System.out.println(arr[0].getName());
		
		// �� �ε������� ��ü �����ϱ�
		arr[0] = new Product("���ϼ�", "����", 1300000);
		arr[1] = new Product("���̻�", "���", 1500000);
		arr[2] = new Product();
		
		
		// for loop ��  <-- ���ݱ��� �ߴ� (�Ϲ�for��)
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i].information());
		}
		
		arr[2].setName("����");
		arr[2].setBrand("����");
		arr[2].setPrice(800000);
		
		System.out.println("========== ������ ==========");
		
		// for each�� (���� for��) -- 0��° ���� ���������� �ݺ��Ҷ� ���
//		int[] num = new int[3];
//		num[0] = 1;
//		num[1] = 2;
//		num[2] = 3;
//		
//		for(int i=0; i<num.length; i++) {
//			System.out.println(num[i]);
//		}
//		
//		// for(�������� ���� ���� ������ ���� : ���������� �����ϰ��� �ϴ� �迭��)	// �ڡڡڡڡڡڡڡڡڡ�
//		for(int n : num) {	
//			// int n = num[0];	--> ù��° �ݺ�
//			// int n = num[1];	--> �ι�° �ݺ�
//			// int n = num[2];	--> ����° �ݺ�
//			System.out.println(n);
//		}
		
		for(Product p : arr) {
			// Product p = arr[0];	--> ù��° �ݺ�
			// Product p = arr[1];	--> �ι�° �ݺ�
			// Product p = arr[2];	--> ����° �ݺ�
			System.out.println(p.information());
		}
	}
}
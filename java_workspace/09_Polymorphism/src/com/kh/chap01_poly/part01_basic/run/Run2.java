package com.kh.chap01_poly.part01_basic.run;
import java.util.ArrayList;
import java.util.Arrays;

import com.kh.chap01_poly.part01_basic.model.vo.*;

public class Run2 {

	public static void main(String[] args) {
		
		// ���� '=' ������		���� �������� �׻� ���� �ڷ���(Ÿ��)
		
		// 1. �θ�Ÿ�� ���۷����� �θ� ��ü�� �ٸ��� ���
		System.out.println("1. �θ�Ÿ�� ���۷����� �θ�ü �ٷ�� ���");
		Parent p1 = new Parent();
		p1.printParent();
		// p1���۷����� Parent���� ���� ����
		
		
		// 2. �ڽ�Ÿ�� ���۷����� �ڽ� ��ü �ٷ�� ��� 
		System.out.println("2. �ڽ�Ÿ�� ���۷����� �ڽİ�ü �ٷ�� ���");
		Child1 c1 = new Child1();
		c1.printParent(); // == ((Parent)c1).Parent();
		c1.printChild1(); 
		// �ڽ�Ŭ������ ������ �θ�Ŭ������ �޼ҵ� ȣ�� ����
		// c1 ���۷����� Parent,Child1 �Ѵ� ���� ����
		
		
		// ������ �ٷ� �������� ����� ���̽�
		// * ������ : �θ�Ÿ���� ���۷����� �ڽİ�ü�� �ٷ�� �ִ°�!!
		
		System.out.println("===== ������ =====");
		// 3. �θ�Ÿ�� ���۷����� �ڽİ�ü�� �ٷ�� ���
		System.out.println("3. �θ�Ÿ�� ���۷����� �ڽİ�ü�� �ٷ�� ���");
		Parent p2 = /*(Parent)*/ new Child1();
		p2.printParent();
		
		// 2p��� ���۷����� Parent���� ���ٰ���
		// ������ Child1�� �����ϰ��� �Ѵٸ� ��������ȯ�� �ϸ��!!
		((Child1)p2).printChild1(); // p2�� Parent ���� Child1�� ���� ����ȯ
		
		/*
		 * ��ӱ����� Ŭ���������� ����ȯ ����!!
		 * 
		 * 1. UpCasting
		 *    �ڽ�Ÿ�� --> �θ�Ÿ��
		 *    �ڵ�����ȯ(�θ�Ÿ�� ��������)
		 *    ex) �θ�Ÿ�� = (�θ�Ÿ��)�ڽİ�ü;
		 *        ((�θ�Ÿ��)�ڽ�).�θ�޼ҵ�();
		 * 
		 * 2. DownCasting
		 *    �θ�Ÿ�� --> �ڽ�Ÿ��
		 *    ��������ȯ(�θ�Ÿ�� �����Ұ�)
		 *    ex) ((�ڽ�Ÿ��)�θ�).�ڽĸ޼ҵ�();
		 *    
		 */
		
		//---------------------------------------------
		
		System.out.println("===== �������� �� ������ =====");
		
		// �������� �־�����, ���������� �˾ƺ���!!
		// ������ : �ϳ��� �θ�Ÿ������ ���������� �ڽİ�ü�� �ٷ� �� �ִ� ����
		
		// Child1��ü 2��, Child2��ü 2��
		
		// ������ ���� ��
		Child1[] arr1 = new Child1[2];
		arr1[0] = new Child1(1, 2, 4);
		arr1[1] = new Child1(2, 3, 5);
		
		Child2[] arr2 = new Child2[2];
		arr2[0] = new Child2(5, 7, 2);
		arr2[1] = new Child2(2, 1, 5);
		
		// ������ ��� ��
		Parent[] arr = new Parent[4];
		arr[0] = new Child1(1, 2, 4);
		arr[1] = new Child2(5, 7, 2);
		arr[2] = new Child2(2, 1, 5);
		arr[3] = new Child1(2, 3, 5);
		// �θ� = �ڽ�;
		
		// 13��° ������Ʈ -- �÷��� ArrayList�����
		ArrayList<Parent> list = new ArrayList<>();
		list.add(new Child1());
		list.add(new Child2());
		list.add(new Child1());
		list.add(new Parent());
		
		
		// ����1. �ϳ��� �θ�Ÿ������ �پ��� �ڽĵ��� ���� �� �ִ�.
		//       --> �ڽĵ��� ������ �� �ϳ��� Ÿ������ ������ �� ���� --> ����, �ڵ� ���̰� ����
		
		
		// ������ ����ִ� �ڽ�ũ������ �޼ҵ� ����
		// --> �ڽ�Ÿ������ ����ȯ�ؼ� �ڽ� �޼ҵ� ����(��, �� �ε������� ������ �����ϰ� �ִ� ���� �ڽ�Ÿ������ ����ȯ�ؾߵ�!!)
		((Child1)arr[0]).printChild1();
		
		//((Child1)arr[1]).printChild1();  --> ������ Child2�� ���� �Է��߱� ������ Chil1���� ȣ�� �ϸ� �ȵ�XXXXX
		((Child2)arr[1]).printChild2();
		
		((Child2)arr[2]).printChild2();
		
		((Child1)arr[3]).printChild1();
		
		System.out.println("===== �ݺ��� �̿� =====");
		
		for(int i=0; i<arr.length; i++) {
			
			
			/*
			 * if(i == 0 || i ==3) {
			 *  ((Child1)arr[i]).printChild1(); 
			 *  }else {
			 * ((Child2)arr[i]).printChild2();
			 *  }
			 *  ---------------> �����Ͱ� �������� �ſ� ��������
			 */ 
			
			
			/*
			 * instanceof ������
			 * 
			 * ���� ���۷����� � �ڽ� ��ü�� �����ϰ� �ִ��� Ȯ���� �� ���
			 * 
			 * [ǥ����] ���۷��� instanceof Ŭ������
			 * 
			 * �ش緹�۷����� ������ �����ϰ� �ִ� Ŭ����Ÿ���� �ش�Ŭ�������� ��ġ�ϸ� true, �װԾƴϸ� false
			 */
			
			/*
			if(arr[i] instanceof Child1) {	// �ش� �ε����� ������ Child1�� �����ϰ������� true, �װ� �ƴϸ� false
				((Child1)arr[i]).printChild1();
			}else if(arr[i] instanceof Child2) {
				((Child2)arr[i]).printChild2();
			}
			*/
			
			arr[i].print(); // �������̵��� ���ؼ� ���ϰ� ��� 	// �������ε� : �����Ͻÿ��� ���۷��� Ÿ���� Ŭ������ ����� �޼ҵ�� ���ε� ������
													//          ���� ����Ǵ°� ������ �����ϰ� �ִ� �ڽ�Ŭ������ ����� �������̵��� �޼ҵ尡 �����!!
		}
	}
}
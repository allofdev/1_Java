package com.kh.variable;

// �ٸ� ��Ű����� ���� Ŭ���������� ���� �� ����!! (com.kh.variable.A_Variable)
public class A_Variable {


/*
 *  *  �н���ǥ
 *  1. ������°� ����
 *  2. ������ �� ����ϴ���
 *  3. ������ ��� ���� �Ǵ���
 *  4. �������� ��� ������ �Ǵ���(����Ģ)
 */
	
	public void printValue() {
		
		System.out.println("=== ���� ��� �� ===");
		System.out.println(100 + 10);
		System.out.println((100 + 10) * 10);
		System.out.println(((100 + 10) * 10) - 10);
		// ������� �� ����� ������ ���� �ǵ���, ���� �ǹ����� �ľ��� �� ����
		
		
		// 1. ������? --> � ���� �޸𸮿� ����ϱ� ���� �����̴�. (�ڽ����� ����)
		int point = 100;      // ����Ʈ
		int bonus = 10;       // ���ʽ�
		int personCount = 10; // �����
		int fees = 10;        // ������
		
		System.out.println("\n=== ���� ��� �� ===");
		System.out.println(point + bonus);
		System.out.println((point + bonus) * personCount);
		System.out.println(((point + bonus) * personCount) - fees);
		
		/*
		 * 2. ������ ����ϴ� ����
		 * - ������ �켱������ ���� �ǹ̸� �ο��ϱ� ���� �������� ���! (�������� ������)
		 * - ������ �� �� ���� ������ �ΰ� ��� ����� �������� ���!
		 * - ���������� ������ �������� ���  ex) ������ ���� �� ������ ���ڸ� �ٲ�� ������ ������ ���� ���� ������ �ѹ� �����ϸ� ��
		 */
		
	}

	public void declareVariable() {
		
		// 3. ������ ��� ����Ǵ��� (������ ��� �����, ��� ���� �����)
		/*
		 * 3_1. ������ ���� (������ ���� ����ϱ� ���� ������ �޸𸮰����� Ȯ���� ���� ����) == ����(�ڽ�)����ڴ�!!
		 * 
		 * [ǥ����] �ڷ��� ������;
		 * 
		 * �ڷ��� : � ���� ��Ƴ���, � ũ���� ���� ��� ������ ���� ����(�ڽ�)�� ũ�� �� ������ ���ϴ� �κ�
		 * ������ : ������ �̸��� ���ϴ� �κ�(�ǹ̺ο�)
		 * 
		 * * ��������
		 * - �������� �ݵ�� ù ���ڰ� �ҹ��ڿ��ߵȴ�.
		 * - ���� �ܾ�� ���ս� ���z��� ��Ű��
		 * - ������ ���������� ���� �Ұ�  (�ߺ��Ұ�)
		 * - �ش� ����({})�� ������ ������ �ش� ���������� ���� �� �� �ִ�!! (�ٸ� �޼ҵ忡���� ��� �Ұ�)
		 * => �������� ����
		 * ex) ���� point������ ������ �޼ҵ尡 �ٸ��� ������ System.out.println(point);   --> ��� �Ұ�
		 */
		
		
		// ---- �⺻ �ڷ���(8��) ----
		
		// (1). ����
		boolean isTrue; // 1byte
		
		// (2). ������		
		// (2_1). ������ (4��)
		byte bNum;  	// 1byte (-128~127)
		short sNum; 	// 2byte
		int iNum;   	// 4byte --> ������ �߿� ���� ��ǥ���� �ڷ���(�⺻��) -21��xxx ~ 21��xxx 
		long lNum;  	// 8byte
		
		// (2_2). �Ǽ��� (2��)
		float fNum; // 4byte
		double dNum; // 8byte --> �Ǽ��� �߿� ���� ��ǥ���� �ڷ���(�⺻��) --> �Ҽ��� �Ʒ��� ������ �������� ������ �� ��Ȯ�� ���� ���� �� �ֱ� ����
		
		// (3). ����('�ѱ���')��
		char ch; // 2byte ���� �ϳ��� 
		
		
		// ---- ���� �ڷ��� ----
		// (4). ���ڿ�("��������") --> ��Ư
		String str; // ����� ����, String�� �빮�ڷ� ������
		
		
		/*
		 * 3_2. ������ �� ����(�ʱ�ȭ)
		 * 
		 * [ǥ����] �ڷ��� ������ = ��;
		 * 
		 */
		isTrue = true; //������������ ture, false ���� ���� ����
		
		bNum = 1;
		sNum = 2;
		iNum = 4;
		lNum = 8L;		// long�� �������� ���ڰ� ���� �� "l" �Ǵ� "L"�� �ٿ��� long�ڷ����̶�� �� ǥ�����ִ°� ����!! --> ����� ���ڰ��� ��
		
		fNum = 4.0f;	// float�� �������� �Ǽ��� ���� �� �ݵ�� "f"�� �ٿ��� ��!
		dNum = 8.0;
		
		ch = 'A';		// char�� ������ Ȧ����ǥ��('') �̿��Ͽ� �� ����
		ch = '��';		// 'A' ���� '��'�� �������� �ǹǷ� �ᱹ ����Ҷ��� '��'�� ����
		
		str = "ABC";	// String�� ������ �ֵ���ǥ��("") �̿��Ͽ� �� ���� 
		
		// ������ ���� �� ������ ���
		System.out.println(isTrue);
		System.out.println(bNum);
		System.out.println(sNum);
		System.out.println(iNum);
		System.out.println(lNum);
		System.out.println(fNum);
		System.out.println(dNum);
		System.out.println(ch);
		System.out.println(str);
		
	}
	
	public void initVariable() {
		
		// ��������, �� ���� ���ε��� �����ϴ� ��� �幰��!

		// ���ݺ��� ��������� ���ÿ� �ʱ�ȭ(�� ����)
		// [ǥ����] �ڷ��� ������ = ��;
		
		// 1byte == 8bit
		
		// ----�⺻�ڷ���----
		
		// (1). ����
		boolean isTrue = true;	//1byte
		
		// (2_1). ������
		byte bNum = 1;			//1byte
		short sNum = 2;			//2byte
		int iNum = 4; 			//4byte
		long lNum = 8L; 		//8byte
		
		// (2_2). �Ǽ���
		float fNum = 4.0f;		//4byte
		double dNum = 8.0;		//8byte
		
		// (3_1). ������
		char ch = '��';			//2byte
		
		//(4). ���ڿ�(�����ڷ���) ----String�� ��Ư
		String str = "I���Ĺ�";
		
		// ������ ����� �� ���
		System.out.println("isTrue : " + isTrue); //"inTrue : true"
		System.out.println("bNum : " + bNum); // "bNum : 1"
		System.out.println("iNum : " + iNum); // "iNum : 2"
		System.out.println("sNum : " + sNum); // "sNum : 4"
		System.out.println("lNum : " + lNum); // "lNum : 8"
		System.out.println("fNum : " + fNum); // "fNum : 4.0"
		System.out.println("dNum : " + dNum); // "dNum : 8.0"
		System.out.println("ch : " + ch); // "ch : ��"
		System.out.println("str : " + str); // "str : I���Ĺ�"
		
	
		// ���� 
		int result = iNum * 2;
		System.out.println(result);
		
		int etc = 9_999_999;	//����� '_'�� �̿��Ͽ� ����ڰ� ���� ���� �� ���� ����! ��, ���ڰ��� ����Ǳ� ��!!
		System.out.println("etc : " + etc);
		
		etc = 10;  // ������ ������ ���� ����
		
	}	
	
	public void namingRule() {
		// 4. ��������Ģ
		
		int number;
		
		// 1) �������� �ߺ��� �� ����!!
		//double number;
		
		// 2) ��ҹ��ڴ� ���� �ȴ�(�ٸ��̸��� ��)
		int numBer;
		
		// 3) �����(�̹� �ڹٿ��� ���ǰ� �ִ� Ű�����) ��� �Ұ�
		
		//int true;
		//int public;
		//int class;
		//int void;
		//int abstract; 
		
		// 4) ���� ���� (��, ���ڷ� �����ϴ� �� �ȵ�!)
		int age2;
		//int 2age;
		
		
		// 5) Ư������ ���� (��, _ & �̿��� Ư�����ڴ� ��� �Ұ�!)
		int number_1;
		int number$1;
		//int number!1;
		//int number#1;
		
		
		// ----- ���Ѿ��� ��Ģ�� �ƴ����� ������� -----
		
		// 1) ��Ÿǥ��� ��Ű�� + �ҹ��ڷ� �����ϱ�
		String username;
		String userName; // ���ʻ� �´� ǥ��
		
		// 2) �ѱ� ��� �����ϱ� ������ �ѱ��� ������� �ʴ� ȯ�濡���� ������ �߻���ų �� ����!!
		String �̸� = "��";
		
	}
	
	/*
	 *  **����**
	 *  - ���� : ��(���ͷ�)�� ����ϱ����� ���� (�޸𸮻� ���� ���)
	 *  - ���� ������
	 *    > �ǹ� �ο�
	 *    > �� �� �� ���� �Ŀ� ������ ����
	 *    > ���������� ����
	 *    
	 *  - ���� ����
	 *    > ���� ���� 	: �ڷ��� ������;
	 *    > �� ����	: ������ = ��;
	 *    > ���� ����� ���ÿ� �� ���� : �ڷ��� ������ = ��; 
	 *    
	 *  - ���� ��� ��Ģ 
	 */
	
}
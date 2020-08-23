package mvc.controller;
import javax.crypto.MacSpi;

import mvc.model.vo.Member;

public class MemberController {

	
	public static final int SIZE = 10;	// �ִ� ȸ�� �� = 10
	
	private int memberCount = 0;	// ���� ȸ�� ��
	
	private Member[] mem = new Member[SIZE];			// ȸ�� ��ü �迭
	
	// ȸ�� 5�� �ʱ�ȭ
	{
	mem[0] = new Member("user01", "pass01", "������", 20, 'M', "kim12@naver.com");
	mem[1] = new Member("user02", "pass02", "�̼���", 60, 'M', "lee2@naver.com");
	mem[2] = new Member("user03", "pass03", "������", 17, 'F', "yo5@naver.com");
	mem[3] = new Member("user04", "pass04", "�����ҹ�", 57, 'M', "yeon@naver.com");
	mem[4] = new Member("user05", "pass05", "�Ż��Ӵ�", 45, 'F', "shin@naver.com");
	memberCount = 5;
	}
	
	public int getMemberCount() {
		return memberCount;
	}
	
	public Member[] getMem() {
		return mem;
	}
	
	public Member checkId(String userId) {
		
		Member m = null;
		
		
		for(int i=0; i<memberCount; i++) {
			if(userId.equals(mem[i].getUserId())) {
				m = mem[i];
			}
		}
		
		 return m;
	}
	
	
	
	
	
	public void insertMember(String userId, String userPwd, String name, int age, char gender, String email) {
		
		mem[memberCount++] = new Member(userId, userPwd, name, age, gender, email);
		
	}
	
	public Member searchMember(int menu, String search) {
		
		Member searchMember = null; // �˻��� ȸ�� ������ ���� ���� �ʱ�ȭ
		
		
		
		switch(menu) {
		case 1: 
			for(int i=0; i<memberCount; i++) {
				if(mem[i].getUserId().equals(search)) {
					searchMember = mem[i];
				}
			}
			break;
			
		case 2:  
			for(int i=0; i<memberCount; i++) {
				if(mem[i].getName().equals(search)) {
					searchMember = mem[i];
				}
			}
			break;
		case 3:  
			for(int i=0; i<memberCount; i++) {
				if(mem[i].getEmail().equals(search)) {
					searchMember = mem[i];
				}
			}
			break;
		}
		
		return searchMember;
		
	}
	
	
	public void updateMember(Member m, int menu, String update) {
		
		switch(menu) {
		case 1: m.setuserPwd(update);	break; // 1�ϰ�� ��й�ȣ ����
		case 2: m.setName(update);		break; // 2�ϰ�� �̸� ����
		case 3: m.setEmail(update);		break; // 3�� ��� �̸��� ����
		}
		
	}
	
	
	
	
	
	
	public void deletMember() {
		
	}
	
	
	
	
	
}

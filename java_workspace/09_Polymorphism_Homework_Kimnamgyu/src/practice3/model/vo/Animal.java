package practice3.model.vo;

public abstract class Animal {

	// �ʵ�
	private String name;
	private String kinds;
	
	// �⺻ ������
	public Animal() {}
	
	// �Ű����� ������
	public Animal(String name, String kinds) {
		this.name = name;
		this.kinds = kinds;
	}
	
	// setter/getter �޼ҵ�
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setKinds(String kinds) {
		this.kinds = kinds;
	}
	public String getKinds() {
		return kinds;
	}
	
	// toString �޼ҵ�
	@Override
	public String toString() {
		return "���� �̸��� " + name + "�̰�, ������ " + kinds + "�Դϴ�.";
	}
	
	// �߻�޼ҵ�
	public abstract void speak();
	
	
	
	
	
	
}
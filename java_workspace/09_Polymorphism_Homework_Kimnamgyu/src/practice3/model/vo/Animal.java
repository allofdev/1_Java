package practice3.model.vo;

public abstract class Animal {

	// 필드
	private String name;
	private String kinds;
	
	// 기본 생성자
	public Animal() {}
	
	// 매개변수 생성자
	public Animal(String name, String kinds) {
		this.name = name;
		this.kinds = kinds;
	}
	
	// setter/getter 메소드
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
	
	// toString 메소드
	@Override
	public String toString() {
		return "저의 이름은 " + name + "이고, 종류는 " + kinds + "입니다.";
	}
	
	// 추상메소드
	public abstract void speak();
	
	
	
	
	
	
}
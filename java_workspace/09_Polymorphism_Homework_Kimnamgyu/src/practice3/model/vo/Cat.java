package practice3.model.vo;

public class Cat extends Animal{

	// 필드
	private String location;
	private String color;
	
	// 기본 생성자
	public Cat() {}
	
	// 매개변수 생성자
	public Cat(String name, String kinds, String location, String color) {
		super(name, kinds);
		this.location = location;
		this.color = color;
	}
	
	// setter/getter 메소드
	public void setLocation(String location) {
		this.location = location;
	}
	public String getLocation() {
		return location;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	
	@Override
	public void speak() {
		System.out.println(super.toString() + location + "에 서식하며, 색생은 " + color + "입니다.");
	}
	
	
	
	
}

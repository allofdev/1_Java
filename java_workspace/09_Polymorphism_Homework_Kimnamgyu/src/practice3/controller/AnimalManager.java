package practice3.controller;
import practice3.model.vo.Animal;
import practice3.model.vo.Dog;
import practice3.model.vo.Cat;

public class AnimalManager {

	public static void main(String[] args) {
		
		Animal[] arr = new Animal[5];
		
		arr[0] = new Dog("흰둥이", "푸들", 7);
		arr[1] = new Cat("냥냥이", "길고양이", "길", "고등어");
		arr[2] = new Dog("백구", "허스키", 12);
		arr[3] = new Dog("맹수", "풍산개", 11);
		arr[4] = new Cat("집사", "집고양이", "집", "흰색");
		
		for(Animal a : arr) {
			System.out.println(a);
		}
		
		
	}
}

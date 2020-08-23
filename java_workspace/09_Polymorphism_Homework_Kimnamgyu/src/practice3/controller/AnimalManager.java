package practice3.controller;
import practice3.model.vo.Animal;
import practice3.model.vo.Dog;
import practice3.model.vo.Cat;

public class AnimalManager {

	public static void main(String[] args) {
		
		Animal[] arr = new Animal[5];
		
		arr[0] = new Dog("�����", "Ǫ��", 7);
		arr[1] = new Cat("�ɳ���", "������", "��", "����");
		arr[2] = new Dog("�鱸", "�㽺Ű", 12);
		arr[3] = new Dog("�ͼ�", "ǳ�갳", 11);
		arr[4] = new Cat("����", "�������", "��", "���");
		
		for(Animal a : arr) {
			System.out.println(a);
		}
		
		
	}
}

package com.javaex.oop;

public class AnimalApp {

	public static void main(String[] args) {
		//	참조 타입의 설계도에 있는 내용만 사용 가능하다
		Dog d1 = new Dog("도기");	
		d1.eat();
		d1.walk();
		d1.bark();
		
		Animal d2 = new Dog("아지"); //	부모 클래스로 자식 인스턴스를 참조할 수 있다.(업캐스팅)
		d2.eat();
		d2.walk();
//		d2.bark();	//	설계도에 없다
		
		//	다운 캐스팅 : 부모 클래스로 참조되는 객체를 원래대로 돌리는 것(다운 캐스팅)
		((Dog)d2).bark();
		
		Animal pet = new Dog("멍멍이");
		pet.eat();
		pet.walk();
		
		pet = new Cat("야옹이");
		pet.eat();
		pet.walk();
		
		//	다운 캐스팅시 어떤 클래스의 인스턴스인지 확인
		if (pet instanceof Dog) {
			((Dog)pet).bark();
		} else if (pet instanceof Cat) {
			((Cat)pet).meow();
		}
	}
}

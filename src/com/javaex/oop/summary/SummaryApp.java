package com.javaex.oop.summary;

public class SummaryApp {
	
	private static Kungfu dojang[];	//	인터페이스 Kungfu의 배열
	
	public static void main(String[] args) {
		Human h1 = new Human("홍길동");
		Human h2 = new TheOne("네오");	//	부모 타입으로 자식을 참조
		Panda p1 = new Panda("핑");
		Panda p2 = new KungfuPanda("포");	//	부모 타입으로 자식을 참조
		
		//	쿵후를 시켜봅시다
		fight(h1);
		fight(h2);
		fight(p1);
		fight(p2);
		
		//	모든 객체를 하늘 날도록 
		fly(h1);
		fly(h2);
		fly(p1);
		fly(p2);
		
		//	쿵후 도장에 등록
		dojang = new Kungfu[] {
//				h1,
				(Kungfu)h2,
//				p1, 
				(Kungfu)p2
		};
		
		for (Kungfu actor:dojang) {
			actor.kungfu();
		}
	}
	
	private static void fly(Animal actor) {
		if (actor instanceof Flyable) {
			((Flyable)actor).fly();
		} else {
			System.out.println(actor.name + ": I can't fly");
		}
	}
	
	private static void fight(Animal actor) {
		//	actor 객체가 kungfu를 할 수 있는가?
		if (actor instanceof Kungfu) {
			//	다운 캐스팅 후 kungfu
			((Kungfu)actor).kungfu();
		} else {
			System.out.println(actor.name + ": 쿵후 못해요");
		}
	}

}

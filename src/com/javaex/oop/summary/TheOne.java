package com.javaex.oop.summary;

//	인터페이스는 여러 개를 implements 할 수 있다
public class TheOne extends Human implements Kungfu, Flyable {
	//	생성자
	public TheOne(String name) {
		super(name);
	}
	
	@Override
	public void fly() {
		System.out.println(name + ": I believe I can fly!");
	}

	@Override
	public void kungfu() {
		System.out.println(name + ": I know Kungfu!");
	}

}

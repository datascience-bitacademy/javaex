package com.javaex.oop.summary;

public class Panda extends Animal {

	//	생성자
	public Panda(String name) {
		super(name);
	}
	
	@Override
	public void say() {	//	반드시 오버라이드
		System.out.println(name + ": ...");
	}
}

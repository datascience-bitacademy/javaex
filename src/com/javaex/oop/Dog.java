package com.javaex.oop;

public class Dog extends Animal {
	//	생성자
	public Dog(String name) {
		super(name);
	}
	
	public void bark() {
		System.out.println(name + ": 멍멍~");
	}
}

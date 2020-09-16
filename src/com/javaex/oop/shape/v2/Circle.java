package com.javaex.oop.shape.v2;

public class Circle extends Shape implements Drawable {
	//	필드
	protected double radius;	//	반지름
	
	//	생성자
	public Circle(int x, int y, double radius) {
		super(x, y);	//	부모 생성자(초기화)
		this.radius = radius;
	}

	//	추상 클래스를 상속받은 실체 클래스는 추상 메서드를 반드시 구현해줘야 함
	@Override
	public double area() {
		return Math.PI * Math.pow(radius, 2);
	}

	@Override
	public void draw() {
		System.out.printf("원[x=%d, y=%d, area=%f]을 그렸어요%n", 
				x, y, area());
	}

}

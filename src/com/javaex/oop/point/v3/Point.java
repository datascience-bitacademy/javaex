package com.javaex.oop.point.v3;

//	v3. 메서드 오버로딩
//		같은 이름, 같은 리턴 타입을 가지지만, 인수의 갯수, 순서로 구별되는 메서드
public class Point {
	//	필드
	private int x;
	private int y;

	//	생성자
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//	Getter / Setter
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	//	메서드
	public void draw() {
		System.out.printf("점[x=%d, y=%d]을 그렸습니다.%n", x, y);
	}
	
	public void draw(boolean bDraw) {
		//	메서드 오버로딩
		String message = String.format("점[x=%d, y=%d]을", x, y);
		
//		if (bDraw) { //	true
//			message += "그렸습니다.";
//		} else {
//			message += "지웠습니다.";
//		}
		message += bDraw ? "그렸습니다.": "지웠습니다";
		
		System.out.println(message);
	}
}










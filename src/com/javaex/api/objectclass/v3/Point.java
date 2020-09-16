package com.javaex.api.objectclass.v3;

//	Object 클래스
//	v3. clone 오버라이드
public class Point implements Cloneable {
	//	복제 메서드를 활성화 하려면 Cloneable 인터페이스 구현
	//	필드
	protected int x;	//	자식 클래스에 접근 권한 허용
	protected int y;

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
		message += bDraw ? "그렸습니다.": "지웠습니다";
		
		System.out.println(message);
	}

	@Override
	public String toString() {
		//	문자열 형식 반환
		return String.format("Point(%d, %d)", x, y);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Point) {
			Point other = (Point)obj;
			
			return x == other.x && y == other.y;
		}
		return super.equals(obj);
	}
	
	//	복제 메서드 구현
	public Point getClone() {
		Point clone = null;
		
		try {
			clone = (Point)clone();	//	복제 객체 생성
		} catch (CloneNotSupportedException e) {
			System.err.println("복제 실패! " + e.getMessage());
		}
		
		return clone;
	}
	
	
}










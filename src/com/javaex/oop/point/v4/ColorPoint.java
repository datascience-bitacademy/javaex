package com.javaex.oop.point.v4;

//	v4. Point 클래스를 상속받은 자식 클래스
public class ColorPoint extends Point {
	private String color;
	
	//	생성자
	public ColorPoint(int x, int y) {
		//	명시하지 않으면 javac가 부모의 기본 생성자를 임의로 추가
		super(x, y);	//	명시적으로 부모 생성자 호출
		System.out.println(this.getClass().getSimpleName() + "의 생성자(x, y)");
	}
	
	public ColorPoint(int x, int y, String color) {
		this(x, y);
		this.color = color;
		System.out.println(this.getClass().getSimpleName() + "의 생성자(x, y, color)");
	}

	//	Getter 
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
	//	부모 Point는 draw 메서드를 가지고 있다
	@Override
	public void draw() {
		if (color != null) {
//			System.out.printf("색깔점[x=%d, y=%d, color=%s]을 그렸습니다.", 
//					x, y, color); // x, y는 Point 의 private
//			System.out.printf("색깔점[x=%d, y=%d, color=%s]을 그렸습니다.", 
//					super.getX(), super.getY(), color);	//	getter 이용접근
			//	부모의 필드를 protected로 변경
			System.out.printf("색깔점[x=%d, y=%d, color=%s]을 그렸습니다.", 
					x, y, color); 
		} else {
			super.draw();
		}
	}
	

	@Override
	public void draw(boolean bDraw) {
		//	연습 : Point 클래스의 draw(boolean) 메서드를 오버라이드 해 봅시다
		super.draw(bDraw);
	}
}

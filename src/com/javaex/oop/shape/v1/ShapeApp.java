package com.javaex.oop.shape.v1;

public class ShapeApp {

	public static void main(String[] args) {
		Shape[] objects = new Shape[3];
		
		Circle c1 = new Circle(10, 20, 10);
		Rectangle r1 = new Rectangle(20, 10, 20, 30);
		Rectangle r2 = new Rectangle(0, 0, 40, 50);
		
		objects[0] = c1;
		objects[1] = r1;
		objects[2] = r2;
		
		for (Shape obj: objects) {
			if (obj != null)
				obj.draw();
		}
	}

}

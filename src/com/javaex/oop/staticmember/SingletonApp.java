package com.javaex.oop.staticmember;

public class SingletonApp {

	public static void main(String[] args) {
//		Singleton s1 = new Singleton();	//	오류: 생성자 private
		Singleton s1 = Singleton.getInstance();
		s1.getScores()[5] = 80;
		
		Singleton s2 = Singleton.getInstance();
		
		System.out.println("s1 = " + s1);
		System.out.println("s2 = " + s2);
		
		System.out.println("s1 == s2 ? " + (s1 == s2)); // 두 객체는 동일 객체임

		System.out.println("s2[5] == " + s2.getScores()[5]);
	}

}

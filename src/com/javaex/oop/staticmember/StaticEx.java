package com.javaex.oop.staticmember;

public class StaticEx {
	public static int refCount;	//	클래스 변수 - 공용 영역
	public static String classVar;	//	클래스 변수
	public String instanceVar;	//	인스턴스 변수
	
	//	static 멤버는 instance 영역에 접근 불가
	//	instance 영역에서는 static 멤버에 접근 가능
	//	static 멤버는 인스턴스화 하지 않아도 접근 가능
	
	//	static 영역은 클래스가 로드될 때 초기화 수행
	static {
		//	static 영역 초기화
		classVar = "Static 멤버";
		refCount = 0;
		System.out.println("Static 초기화");
//		System.out.println(instanceVar); //	static -> instance 접근 불가
		//	static 영역에서는 static 멤버만 활용
	}
	
	//	생성자
	public StaticEx() {
		//	instance -> static 영역 접근 가능
		refCount ++;	//	static 멤버
		System.out.println("참조 갯수:" + refCount);
		System.out.println("인스턴스 생성");
	}
	
	//	소멸자
	//	없어질 예정
	@Override
	protected void finalize() throws Throwable {
		//	객체 해제시 자원 정리 용도
		refCount --;
		super.finalize();
		System.out.println("소멸자 호출");
	}
}

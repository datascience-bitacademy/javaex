package com.javaex.oop.staticmember;

public class StaticApp {

	public static void main(String[] args) {
		StaticEx s1 = new StaticEx();
		//	static 영역은 인스턴스화 하지 않아도 접근 가능
		System.out.println("참조 카운트:" + StaticEx.refCount);
		
		StaticEx s2 = new StaticEx();
		System.out.println("참조 카운트:" + StaticEx.refCount);
		
		s1 = null;	//	참조 해제
		System.out.println("s1 참조 해제");
		System.out.println("참조 카운트:" + StaticEx.refCount);
		
		//	가비지 컬렉터가 수집해준다
		System.gc(); // 가비지 컬렉터 강제 수행 -> 주의: 가급적 하지 말자
		try {
			Thread.sleep(3000); //	3초 대기
			System.out.println("참조 카운트:" + StaticEx.refCount);
		} catch (Exception e) {
			
		}
	}

}

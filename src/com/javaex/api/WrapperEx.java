package com.javaex.api;

public class WrapperEx {

	//	Wrapper 클래스
	//	기본 타입을 포장하여 객체화 시키는 클래스
	//	자바 클래스에서 객체만 처리하는 것이 많아서 Wrapper 클래스 필요
	//	변환 등 부가적인 유틸리티 메서드를 갖고 있다
	public static void main(String[] args) {
		//	생성
		Integer i = Integer.valueOf(2020);
		//	타 데이터 타입을 변환
		Integer i2 = Integer.valueOf("2020");	//	String -> Integer 객체로 변환
		//	주의 : 인수의 형태가 해당 타입으로 변환 가능 가능한 형태여야 한다
		
		//	자동 박싱 지원
		Integer i3 = 10;	//	Integer i3 = Integer.valueOf(10) 
		
		//	parse 계열 메서드 : 문자열을 이용해서 해당 타입으로 변환
		System.out.println(Integer.parseInt("-123"));
		System.out.println(Integer.parseInt("FF", 16));	//	진법 변환
		System.out.println(Integer.toBinaryString(2020));	//
		
		// 형변환
		System.out.println(i.doubleValue());	//	Integer -> double 형으로 추출
		
		//	포장된 값의 비교
		System.out.println(i == i2);	//	다른 객체		
		//	언박싱 비교
		System.out.println(i.intValue() == i2.intValue());
		System.out.println(i.equals(i2));

	}

}

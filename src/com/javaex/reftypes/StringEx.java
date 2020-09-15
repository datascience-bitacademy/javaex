package com.javaex.reftypes;

public class StringEx {

	public static void main(String[] args) {
//		stringEx();
		stringFormatEx();
	}
	
	public static void stringFormatEx() {
		//	%d(정수), %s(문자열), %n(개행), %f(실수), %%(%)
		//	OO개의 OO중에서 OO개를 먹었다
		String fmt = "%d개의 %s중에서 %d개를 먹었다.%n";
		String fruit = "사과";
		int total = 10;
		int eat = 3;
		
		String result = String.format(fmt, total, fruit, eat);
		System.out.println(result);
		
		//	printf 메서드
		System.out.printf(fmt, 10, "오렌지", 5);
		
		//	%f
		float rate = 1.234f;
		//	현재 이자율은 O.OO%입니다.
		System.out.printf("현재 이자율은 %f%%입니다%n", rate);
		System.out.printf("현재 이자율은 %.2f%%입니다.", rate); // 소수점 자리의 제한
		
	}
	
	public static void stringEx() {
		//	문자형 선언
		String str;	//	선언
		str = "Java";	//	할당 : Literal
		String str2 = "Java";	//	Literal
		String str3 = new String("Java");
		
		//	세 변수는 모두 같은 데이터
		System.out.println(str == str2);	//	Literal == Literal
		System.out.println(str2 == str3);	//	Literal == new 객체
		//	참조 변수는 주소 값을 저장하고 있다
		//	참조 변수의 데이터의 동일성을 비교 .equals() 메서드
		
		System.out.println(str.equals(str2));
		System.out.println(str2.equals(str3));
	}

}

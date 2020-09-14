package com.javaex.basic;

public class TypesEx {

	public static void main(String[] args) {
//		booleanEx();
//		integerEx();
//		floatDoubleEx();
//		charEx()
//		constantEx();
//		implicitCastingEx();
		explicitCastingEx();
	}
	
	public static void explicitCastingEx() {
		//	표현 범위가 넓은 데이터 -> 표현 범위가 좁은 데이터로의 변환
		//	데이터의 유실 발생 가능 -> 강제 변환 필요
		float f = 12345678.90123F;
		System.out.println(f);
		int i = (int)f;	//	강제 변환 -> 유실 발생
		System.out.println(i);
		short s = (short)i;
		System.out.println(s);
		byte b = (byte)s;
		System.out.println(b);
	}
	
	public static void implicitCastingEx() {
		//	byte(1) < short(2) < int(4) < long(8) < float(4) < double(8)
		//	표현 범위가 좁은 데이터 -> 표현 범위가 넓은 데이터로의 변환
		byte b = 25;
		System.out.println(b);
		short s = b;
		System.out.println(s);
		int i = s;
		System.out.println(i);
		long l = i;
		System.out.println(l);
		float f = l;	//	float가 long보다 표현 범위가 넓으므로 OK
		System.out.println(f);
	}
	
	public static void constantEx() {
		//	상수
		//	final은 한번 할당되면 재할당이 되지 않는다
		final double PI = 3.14159;	// 상수 식별자는 모두 대문자로
		final int SPEED_LIMIT = 110;	//	단어의 조합은 _로 구분
		
		System.out.println("현재 제한 속도는 " + SPEED_LIMIT + "입니다");
		//	상수사용의 이점
		//	코드 가독성을 높일 수 있다
		//	유지보수의 편이성
		
		//	Java는 내부적으로 상수를 많이 활용하는 언어
		System.out.println(Math.PI);
	}
	
	public static void charEx() {
		//	unicode 한글자(2byte)
		char ch1 = 'A';
		char ch2 = '한';
		
		System.out.println(ch1);
		System.out.println(ch2);
		
		System.out.println(ch1 + ch2);
		//	내부적으로는 수치화된 코드
	}
	
	public static void floatDoubleEx() {
		float fVar = 3.14159F;	//	뒤에 F
		double dVar = 3.14159;
		
		//	지수 표기법
		int intVar = 300000;
		dVar = 3E6;	//	3 * 10 ^ 6
		fVar = 3E-6F;	//	3 * 10 ^ -6
		
		System.out.println(fVar);
		System.out.println(dVar);
		
		//	float, double : 정밀도를 포기하고 표현범위를 넓힌 것
		//	정밀한 실수 처리를 위해서는 다른 방법을 사용
		System.out.println(0.1 * 3);
		
	}
	
	public static void integerEx() {
		//	int(4바이트)
		int intVar1;	//	선언
		int intVar2;	
		
		intVar1 = 2020;	//	초기화
//		intVar2 = 1234567890123;	//	범위 초과
		
		System.out.println(intVar1);
		
		//	long(8바이트)
		long longVar1 = 2020;
		long longVar2 = 1234567890123L;	//	뒤에 L
		
		System.out.println(longVar1);
		System.out.println(longVar2);
		
		//	2진수, 8진수, 16진수
		int bin, oct, hex;
		bin = 0b1100;	//	0b
		oct = 072;	//	0
		hex = 0xFF;	//	0x
		
		System.out.println(bin);
		System.out.println(oct);
		System.out.println(hex);
	}
	
	public static void booleanEx() {
		//	논리형 true or false
		boolean b1 = true;
		boolean b2 = false;
		
		System.out.println(b1);
		System.out.println(b2);
		
		boolean result;
		
		int var1 = 3;
		int var2 = 5;
		
		result = var1 < var2;
		//	비교연산 or 논리연산을 수행하면 논리 값 반환
		
		System.out.println("var1 < var2 ? " + result);
		
	}

}

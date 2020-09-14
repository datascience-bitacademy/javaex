package com.javaex.basic;

import java.util.Scanner;

public class ConditionalEx {

	public static void main(String[] args) {
//		ifElseEx();
//		ifElseEx2();
//		switchEx();
//		switchEx2();
		switchEx3();
	}
	
	public static void switchEx3() {
		//	java의 switch 문은 char, String 값의 비교도 가능
		//	-> Enum 타입에서 이 예제를 다시 변환해볼 예정
		String day = "FRIDAY";
		String act;
		
		switch (day) {
		case "SUNDAY":
			act = "휴식";
			break;
		case "MONDAY":
		case "TUESDAY":
		case "WEDNESDAY":
		case "THURSDAY":
			act = "열공";
			break;
		case "FRIDAY":
			act = "열공 후 불금";
			break;
		case "SATURDAY":
			act = "방전";
			break;
		default:
			act = "?";
		}
		System.out.println(day + "에는 " + act);
		
	}
	
	public static void switchEx2() {
		//	break문 없는 case는 권장하지 않지만
		//	없는 경우도 있다
		Scanner scanner = new Scanner(System.in);
		System.out.print("월을 입력하세요:");
		
		int month = scanner.nextInt();
		String days;
		
		switch(month) {
		case 2:
			days = "28일";
			break;
			
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			days = "31일";
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			days = "30일";
			break;
		default:
			days = "?";	
		}
		
		System.out.println(month + "월은 " + days);
		scanner.close();
		
	}
	
	public static void switchEx() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("과목을 선택하세요");
		System.out.println("1. 자바, 2. C, 3. C++, 4. 파이썬");
		
		int no = scanner.nextInt();
		String message;
		
		switch(no) {	//	값에 의한 조건 분기
		case 1:	//	if (no == 1)
			message = "R101";
			break;	//	잊지말자 break
		case 2:
			message = "R202";
			break;
		case 3:
			message = "R303";
			break;
		case 4:
			message = "R404";
			break;
		default:	//	else
			message = "상담원 문의";
		}
		
		System.out.println(message);
		scanner.close();
	}
	
	public static void ifElseEx2() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("과목을 선택하세요");
		System.out.println("1. 자바, 2. C, 3. C++, 4. 파이썬");
		
		int no = scanner.nextInt();
		String message;
		
		if (no == 1) {
			message = "R101";
		} else if (no == 2) {
			message = "R202";
		} else if (no == 3) {
			message = "R303";
		} else if (no == 4) {
			message = "R404";
		} else {
			message = "상담원 문의";
		}
		
		System.out.println(message);
		scanner.close();
	}
	
	public static void ifElseEx() {
		//	정수 입력
		//	양수일때
		//		짝수면 짝수입니다.
		//		홀수면 홀수입니다.
		//	음수면 음수입니다.
		//	0이면 0입니다.
		Scanner scanner = new Scanner(System.in);
		String message;
		
		System.out.print("정수를 입력하세요:");
		int num = scanner.nextInt();
		
		//	조건 판별
		if (num > 0) {
			//	양수
			//	중첩 if
			if (num % 2 == 0) {
				message = "짝수입니다.";
			} else {
				message = "홀수입니다.";
			}
		} else if (num < 0) {
			//	음수
			message = "음수입니다.";
		} else {
			//	0
			message = "0입니다.";
		}
		
		System.out.println(message);
		scanner.close();
	}

}

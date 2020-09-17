package com.javaex.api;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateCalendarEx {

	public static void main(String[] args) {
//		dateEx();
		calendarEx();
	}
	
	private static void calendarEx() {
		//	캘린더 불러오기
		Calendar now = Calendar.getInstance();
		Calendar custom = Calendar.getInstance();
		
		//	날짜 정보의 변경 : set(상수, 값)
		custom.set(1999, 12, 31);
		
		//	날짜 정보의 확인 : get(상수)
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1;	//	월 정보는 0부터 시작
		int date = now.get(Calendar.DATE);
		
		System.out.printf("오늘은 %d년 %d월 %d일입니다.%n", year, month, date);
		
		//	날짜의 연산
		//	100일 뒤로 이동
		Calendar future = Calendar.getInstance();	//	현재
		future.add(Calendar.DATE, 100); // 100일 추가
		System.out.printf("100일 뒤: %d년 %d월 %d일%n", 
				future.get(Calendar.YEAR),
				future.get(Calendar.MONTH) + 1,	//	주의
				future.get(Calendar.DATE)
				);
		
		//	이 날은 무슨 요일?
		//	1 : 일요일
		int dow = future.get(Calendar.DAY_OF_WEEK);
		System.out.println("100일뒤 요일:" + dow);
		
		System.out.println("이날은 토요일인가? " + (dow == Calendar.SATURDAY));
	}
	
	private static void dateEx() {
		//	날짜 얻어오기
		Date now = new Date();	//	현재 날짜와 시간
		
		System.out.println("현재:" + now);
		
		//	날짜 포맷팅
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println("FULL 포맷:" + df.format(now));
		//	FULL, LONG, MEDIUM, SHORT
		
		//	사용자 정의 포맷 : SimpleDateFormat 
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
		System.out.println("사용자 정의 포맷:" + sdf.format(now));
	}

}

package com.javaex.api;

import java.util.Arrays;
import java.util.Collections;

public class ArraysEx {

	public static void main(String[] args) {
//		basicSort();
//		basicReverseSort();
//		customSort();
//		searchEx();
		arrayCopyEx();
	}
	
	private static void arrayCopyEx() {
		//	복사
		char src[] = "Java Programming".toUpperCase().toCharArray();
		System.out.println("원본 배열:" + Arrays.toString(src));
		
		//	System을 이용한 복제
		char target[] = new char[src.length];
		System.arraycopy(src, 0,	//	원본 복사 시작 인덱스
				target, 0,			//	대상 배열 복사 시작 인덱스
				src.length);		//	복사할 길이
		
		System.out.println("System 카피:" + Arrays.toString(target));
		
		//	Arrays.copyOf
		target = Arrays.copyOf(src, src.length);
		System.out.println("Arrays.copyOf:" + Arrays.toString(target));
		
		//	Arrays.copyOfRange : 일부 복제
		target = Arrays.copyOfRange(src, 5, 12);	
		System.out.println("Arrays.copyOfRange:" + Arrays.toString(target));
	}
	
	private static void searchEx() {
		int nums[] = { 2, 7, 4, 2, 1, 9, 10, 15, 7 };
		
		//	검색
		//	binarySearch 전에 sort
		Arrays.sort(nums);
		
		int index = Arrays.binarySearch(nums, 4);	//	should be 2
		System.out.println("소트된 배열:" + Arrays.toString(nums));
		System.out.println("4의 인덱스: " + index);
		
		//	사용자 정의 객체의 검색: Comparable이 구현되어 있어야
		Member[] members = {
				new Member("홍길동"),
				new Member("고길동"),
				new Member("임꺽정")
		};
		
		//	소트
		Arrays.sort(members);
		System.out.println("소트된 배열:" + Arrays.toString(members));
		
		index = Arrays.binarySearch(members, new Member("홍길동"));	
		System.out.println("홍길동의 인덱스:" + index);
	}
	
	private static void customSort() {
		//	사용자 정의 객체의 배열
		Member[] members = {
				new Member("홍길동"),
				new Member("고길동"),
				new Member("임꺽정")
		};
		
		//	원본 배열 출력
		System.out.println("원본 배열:" + Arrays.toString(members));
//		Arrays.sort(members);	//	오름차순
		Arrays.sort(members, Collections.reverseOrder());	//	역순 정렬
		System.out.println("정렬 결과:" + Arrays.toString(members));
	}
	
	private static void basicReverseSort() {
		Integer[] scores = { 80, 50, 30, 90, 75, 88, 77 };
		System.out.println("배열 원본:" + Arrays.toString(scores));
		
		//	역순 정렬
		Arrays.sort(scores, Collections.reverseOrder());	//	역순 정렬
		System.out.println("정렬된 배열:" + Arrays.toString(scores));
	}
	
	private static void basicSort() {
		//	기본 타입 
		int[] scores = { 80, 50, 30, 90, 75, 88, 77 };
		//	Arrays.toString() -> 배열 요소를 출력
		System.out.println("배열 원본:" + Arrays.toString(scores));
//		System.out.println("배열 원본:" + scores);
		
		Arrays.sort(scores);	//	기본값은 오름차순
		System.out.println("정렬된 배열:" + Arrays.toString(scores));
	}

}

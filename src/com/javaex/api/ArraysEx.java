package com.javaex.api;

import java.util.Arrays;
import java.util.Collections;

public class ArraysEx {

	public static void main(String[] args) {
//		basicSort();
//		basicReverseSort();
		customSort();
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

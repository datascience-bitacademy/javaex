package com.javaex.reftypes;

public class ArrayEx {

	public static void main(String[] args) {
//		defineArray();
//		twoDimenEx();
//		arrayCopyEx();
		arrayCopySystem();
	}
	
	public static void arrayCopySystem() {
		//	System.arraycopy() 메서드를 이용한 배열의 복제
		int src[] = {1, 2, 3};
		int tgt[] = new int[10];
		
		System.arraycopy(src, 0,	//	원본 배열의 복사 시작 위치
				tgt, 0,	//	대상 배열의 복사 시작 위치 
				src.length);	//	복사할 길이
		
		//	Enhanced for
		for (int num: tgt) {
			System.out.printf("%d\t", num);
		}
		System.out.println();
	}
	
	public static void arrayCopyEx() {
		//	배열은 한번 생성되면 크기 변경 불가
		int src[] = {1, 2, 3};	//	7개의 공간이 추가로 필요
		int tgt[] = new int[10];
		
		//	복사
		for (int i = 0; i < src.length; i++) {
			tgt[i] = src[i];
		}
		
		for (int i = 0; i < tgt.length; i++) {
			System.out.printf("%d\t", tgt[i]);
		}
		
		System.out.println();
	}
	
	public static void twoDimenEx() {
		//	2차원 배열의 선언
		int [][] twoDimen = new int[5][10];	// 5행 10열의 배열
		//	다차원 배열은 배열의 배열
		
		//	기본 데이터가 있을 때
		int table[][] = {
			{1, 2, 3, 4, 5, 6, 7, 8, 9, 0},
			{2, 3, 4, 5, 6, 7, 8, 9, 0, 1},
			{3, 4, 5, 6, 7, 8, 9, 0, 1, 2},
			{4, 5, 6, 7, 8, 9, 0, 1, 2, 3},
			{5, 6, 7, 8, 9, 0, 1, 2, 3, 4}
		};
		
		System.out.println("table length:" + table.length);
		//	table[0] ~ table[table.length - 1]
		System.out.println("table[0] length:" + table[0].length); 
		
		//	배열 내 모든 요소의 값을 합산
		int sum = 0;
		for (int i = 0; i < table.length; i++) {	//	행 루프
			//	열 루프
			for (int j = 0; j <table[i].length; j++) {
				System.out.print(table[i][j] + "\t");
				sum += table[i][j];
			}
			System.out.println();
		}
		
		System.out.println("총합:" + sum);
	}
	
	public static void defineArray() {
		//	배열의 선언
		String[] name;	//	type[]
		int scores[];	//	식별자[]
		
		//	초기화
		name = new String[] {
			"김", "이", "박", "최"
		};
		
		scores = new int[4];	// 빈 배열
		
		//	인덱스 접근
		//	인덱스 범위 : 0 ~ length - 1 (주의)
		
		scores[0] = 80;
		scores[1] = 90;
		scores[2] = 85;
		scores[3] = 88;
//		scores[4] = 100;	//	Out of Index
		
		//	값 목록이 이미 있다면
		int age[] = {
			28, 30, 25, 32	
		};
		
		//	배열의 길이는 .length 속성으로 확인
		for (int i = 0; i < scores.length; i++) {
			System.out.printf("%s(%d세) - %d점%n",
					name[i], age[i], scores[i]);
		}
		
		//	참조형 자료형은 메모리 주소를 담고 있다
		int[] scores2 = scores;
		System.out.println(scores == scores2);	//	같은 주소 -> 같은 객체다
		System.out.println("scores[2] -> " + scores[2]);
		
		scores2[2] = 100;
		
		System.out.println("scores[2] -> " + scores[2]);
	}

}

package com.javaex.api;

public class StringEx {
	public static void main(String[] args) {
//		stringBasic();
//		usefulMethods();
		stringBufferEx();
	}
	
	private static void stringBufferEx() {
		//	String +, 변환 수행하면 새 String 객체 생성
		//	StringBuffer : 버퍼 기반 문자열 생성기
		StringBuffer sb = new StringBuffer("This"); //	버퍼 생성, 초기화
		
		//	문자열 추가 : append
		sb.append(" is pencil");
		
		//	문자열 삽입 : insert
		sb.insert(7, " my");
		
		//	문자열 치환 : replace
		sb.replace(7, 10, " your");
		
		System.out.println(sb);
		
		//	메서드 체이닝
		StringBuffer sb2 = new StringBuffer("This")
				.append(" is pencil")
				.insert(7, " my")
				.replace(7, 10, " your");
		
		String result = sb2.toString();
		System.out.println(result);
				
	}
	
	private static void usefulMethods() {
		//	중요 메서드 정리
		String str = "Java Programming JavaScript Programming";
		
		//	문자열은 char의 연속된 집합
		//	인덱스 접근, 길이를 잡을 수 있다
		
		System.out.println("str length:" + str.length());	
		System.out.println("가장 마지막 글자:" + str.charAt(str.length() - 1));
		
		//	변환 메서드
		System.out.println("모두 대문자로:" + str.toUpperCase());
		System.out.println("모두 소문자로:" + str.toLowerCase());
		
		//	String은 immutable(불변 자료)
		System.out.println("원본:" + str);
		
		//	중요: indexOf()
		//	문자열에서 Java의 인덱스
		int index = -1;
		index = str.indexOf("Java");	//	첫 번째 검색
		System.out.println("1번째 검색 위치:" + index);
		index = str.indexOf("Java", 4);	//	두 번째 검색
		System.out.println("2번째 검색 위치:" + index);
		index = str.indexOf("Java", index + 4);	//	세 번째 검색
		System.out.println("3번째 검색 위치:" + index);	//	-1 -> 찾을 수 없음
		
		//	역방향 검색 : lastIndexOf()
		index = str.lastIndexOf("Java");	//	역방향 검색
		System.out.println("역방향 검색:" + index);	
		
		//	치환
		str = str.replace("JavaScript", "Python");
		System.out.println("치환:" + str);
		
		//	문자열 추출
		index = str.indexOf("Programming");	//	Programming의 인덱스 확인
		if (index != -1) {
			System.out.println(str.substring(index, index + 11));
		}
		
		System.out.println(str.substring(16));	//	끝까지 추출
		
		String s2 = "         Hello, Java     ";	
		System.out.println(s2.trim());	//	좌우의 Whitespace 제거
		
		//	문자열 분리 : split - 구분 기호를 기준으로 문자열을 분리 -> 배열 반환
		String words[] = str.split(" ");
		
		for (String word: words) {
			System.out.println("단어:" + word);
		}
	}
	
	private static void stringBasic() {
		//	Literal vs new
		String s1 = "Java";	//	리터럴
		String s2 = "Java";	//	리터럴
		
		String s3 = new String("Java");	//	새 객체 생성
		
		System.out.println("s1 == s2 ? " + (s1 == s2));
		System.out.println("s2 == s3 ? " + (s2 == s3));
		
		//	char의 배열을 활용 String 생성
		char[] letters = { 'J', 'a', 'v', 'a' };
		String s4 = new String(letters);
		
		System.out.println(s4);
		
		//	다른 기본 타입을 -> 문자로 변환 
		String s5 = String.valueOf(Math.PI);
		System.out.println(s5);
	}
}

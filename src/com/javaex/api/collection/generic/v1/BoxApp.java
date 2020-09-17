package com.javaex.api.collection.generic.v1;

public class BoxApp {

	public static void main(String[] args) {
		//	Box 만들고, 데이터 세팅
		Box intBox = new Box();
		intBox.setContent(2020);
		
		//	값을 꺼내와 봅니다.
		int retVal = (int)intBox.getContent();	//	캐스팅 필요
		System.out.println("내용물:" + retVal);
		
		Box strBox = new Box();
		strBox.setContent("Java");
		
		//	강제 캐스팅 등은 위험 요소, 불편함
		String content = (String)strBox.getContent();
		System.out.println("strBox의 내용물:" + content);
	}

}
